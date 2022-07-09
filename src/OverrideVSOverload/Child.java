package OverrideVSOverload;
//https://www.youtube.com/watch?v=VpIwmTLCy9Q


//Child inherits from Parebt class
public class Child extends Parent {

    @Override
    public void talk(){
        //super.talk(); //super is a reference to the Parent object;

        System.out.println("I am the child !!");

    }

}
