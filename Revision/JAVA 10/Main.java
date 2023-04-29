import java.util.Scanner;
public class Main {
    public static void main (String []Args){
        Scanner in = new Scanner(System.in);
        Shivani shivani = new Shivani();
        System.out.println(" what is your name");
        String name = in.nextLine();
        shivani.setname(name);
        System.out.println("lastname");
        String lastName = in.nextLine();
        shivani.setlastname(lastName);
        System.out.println("your age");
        int age = in.nextInt();
        shivani.setAge(age);
       // System.out.println(" colur of the haior");
       // String hair = in.nextLine();
       // shivani.setHaircolour(hair);
       // String a = in.nextLine();
        

        shivani.sayHello();
        shivani.Imblind();
        shivani.gliuten();
        shivani.Imblind();
        
       

       
    
    }
}
