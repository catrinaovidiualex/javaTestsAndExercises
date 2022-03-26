package Immutability;

public class Destination {
    public static final Destination NONE =null ;
    public static final Destination OUTER_SPACE = null;
    private String destination;

    public Destination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
