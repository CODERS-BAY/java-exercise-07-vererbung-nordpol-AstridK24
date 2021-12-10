package model;

import controller.ElfUtil;

import java.util.Collections;
import java.util.List;

public class Elf extends ElfUtil {
    String name;
    String department;
    String position;

    public Elf(String name, String department, String position) {
        this.name = name;
        this.department = department;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getPosition() {
        return this.position;
    }


}
