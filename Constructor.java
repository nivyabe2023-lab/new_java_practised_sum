import java.util.*;
public class Constructor {

    void display(String name,int age){
    System.out.println(age+ " "+name);
    }
    public static void main(String[]args){
        Constructor d1 = new Constructor();
        d1.display("jhon", 20);
    }
     
}
