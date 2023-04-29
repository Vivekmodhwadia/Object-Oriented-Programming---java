import java.util.Scanner; 
public class range{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int number = in.nextInt();
        for (int i=1; i <= number ;i++){
            if (number%2==0){
                System.out.println("the number is even");
            }
            else{
                System.err.println("this is a odd number");
            }

        }

    }
}
