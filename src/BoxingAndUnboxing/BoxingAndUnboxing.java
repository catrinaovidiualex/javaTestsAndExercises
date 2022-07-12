package BoxingAndUnboxing;

import java.util.ArrayList;
import java.util.List;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        //Boxing or autoboxing

        List<Integer> myIntegerList= new ArrayList<>();
        for(int i=1; i<=10;i++){
            myIntegerList.add(i);


        //UnBoxing -> converting an object into corresponding primitive datatype



            myIntegerList.add(Integer.valueOf(i));
        }

        System.out.println(myIntegerList);

        System.out.println(Integer.valueOf(62));
    }
}
