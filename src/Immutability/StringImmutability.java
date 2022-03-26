package Immutability;

public final class StringImmutability {

        private final String name;
        private final Destination destination;

    public StringImmutability(String name) {
        this.name = name;
        this.destination=Destination.NONE;
    }

    public StringImmutability(String name, Destination destination) {
        this.name = name;
        this.destination = destination;
    }

    public StringImmutability explorer(){
        return new StringImmutability(name,destination.OUTER_SPACE);
    }
}

