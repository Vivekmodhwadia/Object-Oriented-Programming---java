public class Person {
    String Name;
    int age;
    String hair;
    static int count;
    
public Person(String Name, int age, String hair){
    this.Name = Name;
    this.age = age;
    this.hair = hair;
    count ++;
}
public static void main (String []args){
    Person person1 = new Person("Vivek", 19, "black");
    System.out.println(person1.count);
    Person person2 = new Person("Deepa", 21, "red");
    System.out.println(person2.count);
    Person person3 = new Person("Meera",31,"white");
    System.out.println(person3.count);
    //person1.sayhello();
   // person2.sayhello();
    //person3.sayhello();
   //System.out.println(person1.age()); 
   Person.greet();
  
   
}

public void sayhello(){
  System.out.println("my name is " + " " + this.Name + " " + "my age is" +" "+ this.age + " " +"my hair is " + " " + this.hair );
    
}
public int age(){
    return this.age + 2;
}
public static void greet(){
    System.out.println("hello");
   // System.out.println(this.Name);
    System.out.println(count);
    
}
}

