import java.util.MissingFormatWidthException;
import java.util.Scanner;
public class handle {
    
    public static void main (String []Args) throws Caluclator{
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("press q to end");
            char a = in.next().charAt(0);
                if (a == 'q'){
                    break;
                }

        try {
                ciz();
            }

            catch(Caluclator e ){

            }
            catch(Exception e){
                System.out.println("this is working or not working ;}");
            }
            
        }
          
        }
    


    public static void ciz() throws Caluclator {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number 1");
        double Number1 = in.nextInt();
        System.out.println("enter number 2");
        double Number2 = in.nextInt();
        System.out.println("enter a opatrate");
        char opa = in.next().charAt(0);
        // if (opa != '+'&& opa != '*' && opa != '-'&& opa != '/'){
        //     throw new Caluclator("you have enterd the wrong oprator");
        // }
             double Number3 = 0;
            switch (opa){
            case '+':
            Number3 = Number1 + Number2;
            break;
            case '*':
            Number3 = Number1 * Number2;
            break;
            case '/':
            Number3 = Number1 / Number2;
            break;
            case '-':
            Number3 = Number2 - Number1;
            break;
            default:
            System.out.println("invaid");
           }
           System.out.println(Number3);

      

          


         
        
        
    }
}

 





