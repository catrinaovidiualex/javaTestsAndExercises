package otherExercises;

import java.util.Scanner;

public class others {

    public static void main(String[] args) {
        String str = "MyJava";

        //1. Using StringBuffer Class
        StringBuffer sbf = new StringBuffer(str);

        System.out.println(sbf.reverse());

        //2. Using iterative method

        char[] strArray=str.toCharArray();
        for(int i=strArray.length-1; i>=0; i--){
            System.out.println(strArray[i]);}

        //how to create a pyramid of numbers in java?

        Scanner scanner = new Scanner(System.in);

            System.out.println("How many rows do you want to insert into your pyramid?");

            int nr=scanner.nextInt();
            int numOfRows=1;

            for (int i = nr; i > 0; i--)
            {


                for (int j = 1; j <= i; j++)
                {
                    System.out.print(" ");
                }



                for (int j = 1; j <= numOfRows; j++)
                {
                    System.out.print(numOfRows+" ");
                }

                System.out.println();

                  numOfRows++;
            }
        }
    }


