package EqualsAndHashcodeContract;

public class HashCodeAndEqualsContract {

    public static void main(String[] args) {
        String animal="This is an animal";
        String cat ="This is another animal";
        System.out.println(animal.equals(cat));
        System.out.println("HashCode of animals: "+animal.hashCode());
        System.out.println("HashCode of cats: "+cat.hashCode());
    }

}
