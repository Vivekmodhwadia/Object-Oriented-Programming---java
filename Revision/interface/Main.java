import java.util.Scanner;
public class Main {
    
    public static void main(String []Args){
        Car car1 = new Mercedes("8", "blue");
        Mercedes car = (Mercedes) car1 ;
        Scanner in = new Scanner(System.in);
        System.out.println("enter amount weels");
        String weel = in.nextLine();
        car.setweel(weel);
        System.out.println("set paint");
        String paint1 = in.nextLine();
        car.setpaint(paint1);

        car1.weel();
        car1.paint();
        car1.type();

        in.close();
       
        
        
    }

}
