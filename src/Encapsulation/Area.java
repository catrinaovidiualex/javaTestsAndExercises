package Encapsulation;

public class Area {
    // fields to calculate area
    int length; //lungime;
    int breadth; // latime;

    //constructor to initialize values

    Area(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    // method to calculate area

    public int getArea(){
        int area=length*breadth;
        return area;
    }

    public static void main(String[] args) {

        // create object of Area
        // pass value of length and breadth
        Area rectangle = new Area(5,7);
        System.out.println(rectangle.getArea());


    }

}
