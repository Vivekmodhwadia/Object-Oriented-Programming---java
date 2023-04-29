public class Child extends parent {
    
    public Child(int age, String name){
        super(age,name);
    }


    public static void main(String [] args){
        
        parent.hello();
    }
    public void hi(){
        System.out.println("my name is" + name);
        System.out.println("my age is " + age);
    }
}
