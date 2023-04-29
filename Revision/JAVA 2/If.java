import java.util.Scanner;
public class If {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("what are your mark");
        int a = scan.nextInt();
        char grade;
        if (a > 90 && a <=100){
            grade = 'A';
            int b = 30;
        } 
        else if (a > 80 && a <= 90 ){
            grade = 'b';
        }
        else if (a > 70 && a <= 80){
            grade = 'c';
        }
        else if (a > 60 && a <= 70){
            grade = 'd';
        }
        else if (a > 50 && a <= 60){
            grade ='e';
        }
        else if (a >= 0 && a <= 50){
            grade = 'f';
        }
        else {
            grade = 'X';
            System.out.println("mark is invaid");
        }
        System.out.println(grade);
        System.out.println(b);

        }
    }

