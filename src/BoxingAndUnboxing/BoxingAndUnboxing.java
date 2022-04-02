package BoxingAndUnboxing;

import java.util.ArrayList;
import java.util.List;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        //Boxing or Autoboxing

        List<Integer> myIntegerList= new ArrayList<>();
        for(int i=1; i<=10;i++){
            myIntegerList.add(i);

            // using autoboxing -> it can be written as below (it's the same syntax):

            myIntegerList.add(Integer.valueOf(i));
        }

        System.out.println(myIntegerList);
    }
}
