public class B extends A {
    String lastname;
    String hair;
   
    public B(String name,int age,String lastnme, String hair){
        super(name,age);
        this.lastname = lastnme;
        this.hair = hair;
    }
    public static void main(String []Args){
        B person2 = new B("deepa", 21, "Modhwadia", "black");
        person2.hello();
        person2.more();
    }

    public void more(){
        System.out.println("my name is "+ this.name + " my age is " +this.age+ " my last name is " + this.lastname +" my hair is " + hair);
    }


}
