package Polymorphism;

//https://www.youtube.com/watch?v=Ft88V_rDO4I

//Polymorphism means many forms doing the same thing in different ways!
class Bird{
    public void sing(){
        System.out.println("Tweet tweet tweet!");
    }
}

//Robin has many versions of the same method (sing method) but it prioritises its method (sing method inside its class)
class Robin extends Bird{
    public void sing(){
        System.out.println("Twiddledeedee");
    }
}

class Pelican extends Bird{
    public void sing(){
        System.out.println("Weak weak weak!");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        //Bird bd = new Bird();
        Pelican p = new Pelican();
        Robin b= new Robin();
        //bd.sing();
        b.sing();
        p.sing();


    }

}
