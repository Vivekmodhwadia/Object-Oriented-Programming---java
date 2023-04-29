import java.util.jar.Attributes.Name;

public class parent{
    int age;
    String name;
    static String hair;

    public parent(int age, String name){
        this.age = age;
        this.name = name;
        String hair;
    }

public static void main(String [] args){
    parent deepa = new parent(17,"deepa"); // created instance of class 
    parent.hello(); // cuz method "hello" is static i dont need to use the instance i can use the calss name instead. cuz static is assosated with the calss itself
    
    
}
    public static void hello(){
        parent vivek = new parent(19, "vivek"); // becuses the ,ethod is static you have to create an instance of the class to use non static methods and variables.
        System.out.println(vivek.name); // use like this name of instance then variable.
        System.out.println(vivek.age);
        System.out.println(hair);
        vivek.mum(); // like this bur with a method.
    }
    public double mum(){
        return age + 2;
    }
}