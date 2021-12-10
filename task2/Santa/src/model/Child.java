package model;

import java.util.List;

public class Child {
    String childName;
    int age;
    String city;


    public Child(String childName, int age, String city) {
        this.childName = childName;
        this.age = age;
        this.city = city;
    }

    public Child(Child child) {
        this.childName = child.childName;
        this.age = child.age;
        this.city = child.city;
    }

    public static Child findChild(String childName, List<Child> children) {
        Child retVal = new Child("", -1, "");
        int found = -1;
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).childName.equalsIgnoreCase(childName)) {
                found = i;
            }
        }
        if (found > -1) {
            retVal = children.get(found);
        }
        return retVal;
    }


}
