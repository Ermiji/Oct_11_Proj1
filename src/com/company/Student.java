package com.company;

public class Student {
    private String name;
    private int age;
    private String gender;
    public int instances = 0;

    //default constructor.
    public Student(){
        this.name = "";
        this.gender = "";
        this.age = 16;
        instances++;
    }

//    public Student(String gender){
//
//        this.gender = gender;
//    }

    public Student(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){

        return name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public int getInstances() {

        return instances;
    }

    public void setInstances(int instances) {

        this.instances = instances;
    }

    public String toString(){
        return "Name: " + name + " Age: " + age + " Gender: "
        + gender;
    }

    public String getCourses(){
        return getCourses();
    }
}
