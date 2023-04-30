import java.io.FileWriter;
import java.io.IOException;
public class datawriter {
    
    public static boolean w(String name,String data){
        try{
        FileWriter lw = new FileWriter(name + ".txt");
        lw.write(data);
        lw.close();
        System.out.println("done");
        return true;
        }
        
        catch(IOException e){
            System.out.println("wrong");
        }
        return false;

    }
    public static void main(String[] args) {
        w("simple","My name is vivek");
    }

    
}
