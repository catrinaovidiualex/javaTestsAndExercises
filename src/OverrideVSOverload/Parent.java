package OverrideVSOverload;

public class Parent {

    public static void main(String[] args) {
        Child c= new Child();
        c.talk();
    }
    public void talk(){
        System.out.println("Hello, we are talking now !!");
    }
}
