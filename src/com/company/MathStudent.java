package com.company;

public class MathStudent extends Student {

    private int algebraGrade;
    private int calcGrade;


    public int getAlgebraGrade() {
        return algebraGrade;
    }

    public void setAlgebraGrade(int algebraGrade) {
        this.algebraGrade = algebraGrade;
    }

    public int getCalcGrade() {
        return calcGrade;
    }

    public void setCalcGrade(int calcGrade) {
        this.calcGrade = calcGrade;
    }

    public MathStudent(int algeb, int calc){
        super();
        int algebraGrade = 9;
        int calcGrade = 7;
    }

    @Override
    public String getCourses(){
        return "AlgerbraGrade: " + algebraGrade + " CalcGrade: "
                + calcGrade;
    }
}
