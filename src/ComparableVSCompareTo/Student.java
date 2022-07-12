package ComparableVSCompareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable <Student>{

    private int id;
    private String name;

    public Student (int id, String name){
        this.id=id;
        this.name=name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Student s) {
        if (id == s.id) {
            return 0;
        }else  if (id>s.id){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List <Student> StudentList = new ArrayList<>();

        Student s1= new Student(110,"Popescu Ion");
        Student s2 = new Student (102,"Ionescu Maria");
        Student s3 = new Student (100,"Catrina Alex");
        Student s4= new Student(110,"Popescu Ion");

        StudentList.add(s1);
        StudentList.add(s2);
        StudentList.add(s3);
        StudentList.add(s4);


        //System.out.println(StudentList);



    }



    }



