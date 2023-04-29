import java.util.Scanner;
   public class Array{
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("enter size of aray");
       int size = in.nextInt();
       int array [] = new int [size];
       System.out.println("enter arrays");
       for (int i = 0; i < size;i++){
         array[i] = in.nextInt();
       }
       for (int i = 0; i < size;i++){
       array[i] = array[i] + 2;
         System.out.print(array[i]+ "\t");
       }
       
   }
}
