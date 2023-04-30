import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class reader {
    
    public static boolean krish(String name){
        try{
        File f = new File(name +".txt");
        Scanner in = new Scanner(f);
        System.out.println(in.nextLine()); 
        in.close();
            return true;
    }
    catch(IOException e){
        System.out.println(e);
    }
    return false;
    
}

public static void main(String[] args) {
    krish("simple");
}

}
