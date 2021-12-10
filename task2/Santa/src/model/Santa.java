package model;

import java.util.List;

public class Santa {
    final String name = "Santa Claus";

    public Santa() {

    }

    public void list(Presents presents, Warehouse warehouse, Sledge sledge) {
        System.out.println();
        System.out.println("Unproduzierte Geschenke: ");
        presents.listAll();
        System.out.println("Produzierte, unverladene Geschenke: ");
        warehouse.presents.listAll();
        System.out.println("Verladene Geschenke: ");
        sledge.presents.listAll();
        System.out.println();
    }

    public void getChildInfo(String childName, List<Child> children, Presents presents, Warehouse warehouse, Sledge sledge) {
        Child child = Child.findChild(childName, children);
        if (child.childName.isEmpty()) {
            System.out.println("Das Kind wurde nich gefunden!");
        } else {
            presents.info(child);
            warehouse.presents.info(child);
            sledge.presents.info(child);
        }

    }


}
