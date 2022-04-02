package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class PeopleCollection<Person> {

    private List<Person> people = new ArrayList<Person>();

    public void add(Person person){
        people.add(person);

    }



}
