package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamExamples2 {
    // TERMINAL OPERATION
    public static void main(String[] args) {
        List<String> myList= new ArrayList<>();
        myList.add("Element 1");
        myList.add("Element 2");
        myList.add("Element 3");

        // 1. obtaining a stream from list of objects -> original stream;

        Stream<String> myStream=myList.stream();

        // 2. return a new stream -> lower stream;
        Stream<String> lowercaseStream= myStream.map((String item)->{
                return item.toLowerCase();
        });

        //3. we call forEach operation  -> which is the terminal operation;
        lowercaseStream.forEach((String item) -> {
            System.out.println(item);
        });

    }
}
