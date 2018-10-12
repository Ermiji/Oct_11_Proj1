package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Students {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String name;
        String gender;
        Student pupil;
        String response = "n";
        int age;

        do{

            System.out.print("Lecture Studens of Math, Science, Computer: ");
            String lecture = scan.nextLine();

            switch(lecture){
                case "Computer":

                    System.out.print("Enter student's name: ");
                    name = scan.nextLine();
                    System.out.print("Enter student's age: ");
                    age = scan.nextInt();
                    System.out.print("Enter student's gender: ");
                    gender = scan.nextLine();
                    scan.nextLine();


                    System.out.print("Enter student's SQL grade: ");
                    int sql = scan.nextInt();
                    System.out.print("Enter student's Java grade: ");
                    int java = scan.nextInt();

                    scan.nextLine();

                    //create student object and then pass
                    ComputerStudent sc = new ComputerStudent(sql, java);
                    sc.setName(name);
                    sc.setGender(gender);
                    sc.setAge(age);

                    students.add(sc);

                    System.out.println(sc);
                    //System.out.println(((ComputerStudent) s.getCourses()));
                    break;

                case "Maths":

                    System.out.print("Enter student's name: ");
                    name = scan.nextLine();
                    System.out.print("Enter student's age: ");
                    age = scan.nextInt();
                    System.out.print("Enter student's gender: ");
                    gender = scan.nextLine();
                    scan.nextLine();

                    System.out.print("Enter student's Algebra grade: ");
                    int algebra = scan.nextInt();
                    System.out.print("Enter student's Calculus grade: ");
                    int calculus = scan.nextInt();

                    scan.nextLine();

                    //create student object and then pass
                    MathStudent ms = new MathStudent(algebra, calculus);
                    ms.setName(name);
                    ms.setGender(gender);
                    ms.setAge(age);

                    students.add(ms);

                    System.out.println(ms);

                    break;

                case "Science":

                    System.out.print("Enter student's name: ");
                    name = scan.nextLine();
                    System.out.print("Enter student's age: ");
                    age = scan.nextInt();
                    System.out.print("Enter student's gender: ");
                    gender = scan.nextLine();
                    scan.nextLine();

                    System.out.print("Enter student's Chemistry grade: ");
                    int chemistry = scan.nextInt();
                    System.out.print("Enter student's Biology grade: ");
                    int biology = scan.nextInt();

                    scan.nextLine();

                    //create student object and then pass
                    ScienceStudent ss = new ScienceStudent(chemistry, biology);
                    ss.setName(name);
                    ss.setGender(gender);
                    ss.setAge(age);

                    students.add(ss);

                    System.out.println(ss);

                    break;

                default:
                    System.out.println("Irrelevant lecture");
                    break;


            }
            System.out.println("Do you want to enter another student?(y/n)");
             response = scan.nextLine();


        }while(response.equalsIgnoreCase("y"));

        for(Student student: students){
            System.out.println(" ");
            System.out.println(student.toString() + " : " + student.getCourses());
        }

    }
}
