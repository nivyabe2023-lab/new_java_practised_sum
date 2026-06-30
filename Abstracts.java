abstract class vehicle{
    void speed(){
      
        System.out.println("All are the vehicles");
    } 
}
class lorry extends vehicle{
    void start(){
        System.out.println("Speed is very slow due to load");
    } 
}
public class Abstracts {
    public static void main(String[]args){
        lorry l = new lorry();
        l.start();
        l.speed();
    }
    
}
