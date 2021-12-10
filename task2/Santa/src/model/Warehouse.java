package model;

import java.util.*;

public class Warehouse {
    Presents presents = new Presents();


    int capacity;

    public Warehouse(int capacity) {
        this.capacity = capacity;
    }

    public boolean add(Present present) {
        boolean retVal = false;
        if (presents.size() < capacity) {
            presents.add(present);
            retVal = true;
        }
        return retVal;
    }

    public void view() {
        System.out.println("Die Lagerliste: ");
        for (int i = 0; i < presents.size(); i++) {
            Present curPres = presents.get(i);
            System.out.println(curPres.geschenk + " für " + curPres.childName + "(" + curPres.age + ") in " + curPres.city);
        }
        System.out.println();
        System.out.println("Lagerbestand " + this.presents.size() + " von " + this.capacity);
    }

    public Presents unload() {
        Presents presents = new Presents();
        presents.add(this.presents);
        this.presents.clear();
        return presents;
    }

    public int size() {
        return presents.size();
    }


}
