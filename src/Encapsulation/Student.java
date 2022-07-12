package Encapsulation;

public class Student {
    //Encapsulation

    private String name;
    private int age;

    //Getters and Setters



    public void setName(String newName){
        this.name=newName;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int newAge){
        this.age=newAge;
    }

    public int getAge(){
        return this.age;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Suzzie"); // we can initialize using setter;

        s.age=17;

        System.out.println(s.name+" "+s.age);
    }
}
