import java.util.*;
public class Collegeproblem {
    static String n1 = "Sri Shanmugha College of Engineering and Technology";
    void display(String name,int ID){
        String n = name;
        int i = ID;
        System.out.println("College name:"+n1);
        System.out.println("Name: " + n);
        System.out.println("ID: " + i);
    }
    public static void main (String[]args){
        Collegeproblem c = new Collegeproblem();
        String name = "Nivya G";
        int ID = 100;
        c.display(name,ID);
        Collegeproblem c1 = new Collegeproblem();
        String name1 = "Munivesh";
        int ID1 = 101;
        c1.display(name1,ID1);

    }
    
}
