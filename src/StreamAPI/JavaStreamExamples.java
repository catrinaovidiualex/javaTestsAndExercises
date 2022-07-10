package StreamAPI;
//https://www.youtube.com/watch?v=bcrl-GL0vV4
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamExamples {
    public static void main(String[] args) {
        //NON-TERMINAL OPERATION
        List<String> myList= new ArrayList<String>();
        myList.add("Element 1");
        myList.add("Element 2");
        myList.add("Element 3");

        // 1. obtaining a stream from list of objects:

        Stream<String> myStream=myList.stream();
        myStream.forEach((String item) -> {
            System.out.println(item);

                }
        );
    }
}
