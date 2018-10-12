package com.company;

public class ScienceStudent extends Student {

    private int chemGrade;
    private int biologyGrade;

    public ScienceStudent(){
        super();
        chemGrade = 5;
        biologyGrade = 10;
    }

    public ScienceStudent(int chemGrade, int biologyGrade){
        this.chemGrade = chemGrade;
        this.biologyGrade = biologyGrade;
    }

    public int getChemGrade() {

        return chemGrade;
    }

    public void setChemGrade(int chemGrade) {

        this.chemGrade = chemGrade;
    }

    public int getBiologyGrade() {

        return biologyGrade;
    }

    public void setBiologyGrade(int biologyGrade) {

        this.biologyGrade = biologyGrade;
    }

    @Override
    public String getCourses(){
        return " ChemGrade: " + chemGrade + " BioGrade: "
                + biologyGrade;
    }
}
