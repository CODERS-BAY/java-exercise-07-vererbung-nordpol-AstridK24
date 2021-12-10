package model;

import java.util.ArrayList;
import java.util.*;

// Sledge = Schlitten
public class Sledge {
    Presents presents = new Presents();

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    boolean isFull;

    public Sledge() {
        this.isFull = false;
    }

    public void load(Presents newPresents) {
        presents.add(newPresents);
    }

    public void load(Present newPresent) {
        presents.add(newPresent);
    }

    public void sort() {
        presents.sort();
    }

    public int size() {
        return presents.size();
    }

}
