package TenaryOperator;

//https://www.youtube.com/watch?v=3RyQiWyFkt4

public class TenaryOperaor {


    public static void main(String[] args) {
        String textCase="uppercase";
                                                       //TRUE or //FALSE
        String firstName=textCase.equals("uppercase") ? "JOHN" : "jhon";
        System.out.println(firstName);



        int v1=10;
        int v2=20;
        int max= v1>v2 ? v1:v2;
        System.out.println("Maximum value is:"+max);
    }


}
