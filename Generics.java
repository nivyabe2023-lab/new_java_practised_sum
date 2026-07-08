import java.util.*;
    class Box<T>{
        T value;
    } 
public class Generics {
    public static void main(String[]args){
        Box<String> b = new Box<>();
        b.setValue("welcome");
        System.out.println(b.getValue());

    }   
}
