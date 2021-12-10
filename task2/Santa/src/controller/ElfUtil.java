package controller;

import model.Presents;
import model.Sledge;
import model.Warehouse;

public class ElfUtil {

    public ElfUtil() {
    }

    public boolean produce(Warehouse curWh, Presents curP, int presentIndex) {
        boolean retVal = false;

        if (!curP.get(presentIndex).getPresentName().isEmpty()) {
            if (curWh.add(curP.get(presentIndex))) {
                curP.remove(presentIndex);
                retVal = true;
            }
        }
        return retVal;
    }

    public void sortPresents(Sledge sledge) {
        sledge.sort();
    }

    public void loadSledge(Warehouse warehouse, Sledge sledge) {
        sledge.load(warehouse.unload());
    }


    public boolean checkAll(Presents presents, Warehouse warehouse, Sledge sledge) {
        boolean retVal = false;
        if ((presents.size() == 0) && (warehouse.size() == 0) && (sledge.size() != 0)) {
            retVal = true;
        }
        sledge.setFull(retVal);
        return retVal;
    }

}
