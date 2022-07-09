package Abstraction;

abstract class dog {
    //An abstract class helps make regular classes;
    String breed;

    //normal method
    public void bark(){
        System.out.println("Bark!");
    }

    //abstract method - it's a method which is not implemented yet
    public abstract void poop();
    public abstract void sing();


}

class Chiuhuahua extends dog{

    // we can implement abstract method only here
    public void poop(){
        System.out.println("Dog pooped!");
    }
    public void sing(){
        System.out.println("This dog can sing a song");
    }

}

class Husky extends dog{
    public void poop(){
        System.out.println("Husky pooped");
    }

    public void sing(){
        System.out.println("Husky sings");
    }


}

public class AbstractTutorial {
    public static void main(String[] args) {
        Chiuhuahua d = new Chiuhuahua();
        d.bark();
        d.poop();

        Husky dingo = new Husky();
        dingo.bark();
        dingo.poop();
        dingo.sing();

    }

}
