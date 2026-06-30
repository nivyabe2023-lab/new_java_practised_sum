import java.util.*;

class Mammals {
    String name;

    Mammals(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("I am eating");
    }
}

class Horse extends Mammals {

    Horse(String name) {
        super(name);
    }

    void displayName() {
        System.out.println("My name is " + name);
    }
}
public class bases {
    public static void main(String[] args) {
        Horse arabianHorse = new Horse("Alex");

        arabianHorse.displayName();
        arabianHorse.eat();
    }
}