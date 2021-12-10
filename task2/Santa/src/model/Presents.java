package model;

import java.util.*;

public class Presents {

    private List<Present> presents = new ArrayList<>();

    public Presents() {

    }

    public void add(Present present) {
        presents.add(present);
    }

    public void add(Presents newPresents) {
        for (int i = 0; i < newPresents.size(); i++) {
            add(newPresents.get(i));

        }
    }

    public boolean remove(int index) {
        boolean retVal = false;
        if (index < presents.size()) {
            retVal = true;
            presents.remove(index);
        }
        return retVal;
    }

    public int size() {
        return presents.size();
    }

    public Present get(int index) {
        Present present;
        if (index < presents.size()) {
            present = presents.get(index);
        } else {
            present = new Present("", 0, "", ""); // Fehler - GeschenkID nicht gefunden, liefere ungültiges Geschenks-Objekt zurück
        }
        return present;
    }

    public List<Integer> listAll() {
        List<Integer> retVal = new ArrayList<>();

        for (int i = 0; i < presents.size(); i++) {
            retVal.add(i + 1);
        }
        if (retVal.size() > 0) {

            Collections.sort(retVal);
            for (int i = 0; i < retVal.size(); i++) {
                System.out.println(retVal.get(i) + "..." + presents.get(i).geschenk + " (" + presents.get(i).city + ") für "+presents.get(i).childName+" ("+presents.get(i).age+")" );
            }
        }
        return retVal;
    }

    public void sort() {
        Collections.sort(presents);
    }

    public void clear() {
        presents.clear();
    }

    public void info(Child child) {
        for (int i = 0; i < presents.size(); i++) {
            if (presents.get(i).childName.equalsIgnoreCase(child.childName)) {
                System.out.print("  Kind:" + child.childName);
                System.out.print("  Alter:" + child.age);
                System.out.print("  Wohnort:" + child.city);
                System.out.print("  Geschenk:" + presents.get(i).geschenk);
            }

        }
    }


}
