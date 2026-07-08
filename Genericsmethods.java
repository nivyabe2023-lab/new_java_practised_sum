import java.util.*;
class Box<T>{
    T value;
    void setValue(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
}
public class Genericsmethods {
    public static void main(String[]args){
        Box <String> b = new Box<>();
        b.setValue("Welcome");
        b.getValue();
        System.out.println(b.getValue());

    }
    
}
