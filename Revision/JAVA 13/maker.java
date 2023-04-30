import java.io.File;
import java.io.IOException;
public class maker{
    
    public static boolean handle(String name){
        try{
        File fl = new File(name +".txt");
        if (fl.createNewFile()){
            System.out.println("this file has been made");
            return true;
        } 
        else{
            System.out.println("the file was not made");
        }
    }
    catch (IOException e){
        System.out.println(e);
    }
    return false;

}

public static void main(String[] args) {
    System.out.println(handle("simple"));
}
}
  


        


 