package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        return 01.getCost() - 02.getCost();
        //if (01.getCost() - 02.getCost() > 0) {
            //return positive integer
        //} else if (01.getCost() - 02.getCost() < 0) {
            //return negative integer
        //} else return 0;
    }

    private Comparable<Double> getCost() {
        return null;
    }
}
