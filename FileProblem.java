import java.io.*;
public class FileProblem {
    public static void main(String[]args){
        try{
            File file = new File("Student_Document.txt");
            FileWriter fw = new FileWriter(file,true);
            fw.write("Name: John Doe\n");
            fw.write("Age: 20\n");
            fw.write("Department: Chemistry\n");
            fw.write("Mark: 45\n");
            fw.close();
            System.out.println("Data Appended Successfully");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
