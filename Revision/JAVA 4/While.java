import java.util.Scanner;


public class While{
    public static void main(String []Args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number 1");
        double Number1 = in.nextInt();
        System.out.println("enter number 2");
        double Number2 = in.nextInt();
        System.out.println("enter a opatrate");
        char opa = in.next().charAt(0);
        in.close();
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
            return; 
        }
    
        System.out.println(Number3);
        }
}
