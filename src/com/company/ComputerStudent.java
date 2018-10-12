package com.company;

public class ComputerStudent extends Student {

    private int SQLGrade;
    private int JavaGrade;

    public ComputerStudent(){
        super();
        SQLGrade = 10;
        JavaGrade = 11;
    }

    public ComputerStudent(int SQLGrade, int JavaGrade){
        this.SQLGrade = SQLGrade;
        this.JavaGrade = JavaGrade;
    }

    public int getSQLGrade() {

        return SQLGrade;
    }

    public void setSQLGrade(int SQLGrade) {

        this.SQLGrade = SQLGrade;
    }

    public int getJavaGrade() {

        return JavaGrade;
    }

    public void setJavaGrade(int javaGrade) {

        this.JavaGrade = javaGrade;
    }

    @Override
    public String getCourses(){
        return "SQLGrade: " + SQLGrade + " JavaGrade: "
                + JavaGrade;
    }
}
