package ClassVsInstanceMethod;
//https://www.youtube.com/watch?v=MCMcmL3Lm54
public class Student {
    String name;
    String major;
    double gpa;
   //constructor
    public Student(String name, String major, double gpa){
        this.name=name;
        this.major=major;
        this.gpa=gpa;
    }

    // class method
    public boolean isOnHonorRoll(){

     if((this.gpa)>=3.5){
         return true;
     }else{
         return false;
     }
    }
}
