package EqualsAndHashcodeContract;

public class HashCodeAndEqualsContract {

    public static void main(String[] args) {
        String animals="This is an animal";
        String cats ="This is an animal";
        System.out.println(animals.equals(cats));
        System.out.println("HashCode of animals: "+animals.hashCode());
        System.out.println("HashCode of catss: "+cats.hashCode());
    }

}
