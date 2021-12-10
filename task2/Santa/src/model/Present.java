package model;

import javax.xml.namespace.QName;
import java.util.*;

public class Present extends Child implements Comparable<Present> {
    String geschenk = "";

    public Present(String name, int age, String city, String geschenk) {
        super(name, age, city);
        this.geschenk = geschenk;
    }

    public Present(Child child, String geschenk) {
        super(child);
        this.geschenk = geschenk;
    }

    public String getPresentName() {
        return this.geschenk;
    }

    @Override
    public int compareTo(Present o) {
        return (this.city.compareToIgnoreCase(o.city));
    }
}
