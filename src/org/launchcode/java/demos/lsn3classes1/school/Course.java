package org.launchcode.java.demos.lsn3classes1.school;

import java.util.ArrayList;

public class Course {

    public String genetics;
    public String calculus;
    public String physics;
    public String organicChemistry;
    public String immunology;
    private ArrayList student = new ArrayList<>();


    public String getGenetics() { return genetics; }

    public void setGenetics(String genetics) {
        this.genetics = genetics;
    }

    public String getCalculus() { return calculus; }

    public void setCalculus(String calculus) {
        this.calculus = calculus;
    }

    public String getPhysics() { return physics; }

    public void setPhysics(String physics) {
        this.physics = physics;
    }

    public String getOrganicChemistry() { return organicChemistry; }

    public void setOrganicChemistry(String organicChemistry) {
        this.organicChemistry = organicChemistry;
    }

    public String getImmunology() { return immunology; }

    public void setImmunology(String immunology) {
        this.immunology = immunology;
    }
}
