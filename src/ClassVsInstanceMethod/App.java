package ClassVsInstanceMethod;

public class App {

    public static void main(String[] args) {
        Student myStudent = new Student("Mike","Computer Science",3.6);
        System.out.println(myStudent.isOnHonorRoll());
    }
}
