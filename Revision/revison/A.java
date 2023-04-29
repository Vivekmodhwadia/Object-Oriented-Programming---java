public class A{
 String name;
 int age;

 public A(String name, int age){
    this.name = name;
    this.age = age;
 }

 public static void main(String []Args){
    A Person1 = new A("vivek",19);
    B person2 = new B("mum",100 , "Moadhwadia", "black");
    C personC = new C("dad", 120, "modhwadia", "red", 2323234, "football");
    person2.more();
    Person1.hello();
    personC.Everything();


 }

 public void hello(){
    System.out.println(" My name is " + this.name + " my age is " + age);
 }
}