public class C extends B {
    int studentID;
    String Sport;
    
    public C(String name,int age,String lastnme, String hair,int studentID, String Sport){
        super(name, age, lastnme, hair);
        this.studentID = studentID;
        this.Sport = Sport;
    }

    public static void main(String [] Args){
        C Person3 = new C("meera", 32, "Modhwadia", "brown", 2678905, "netball");
        Person3.hello();
        Person3.more();
        Person3.Everything();
    }

    public void Everything(){
        System.out.println("name is " + this.name + " last name is " + this.lastname + " my age is " + this.age + " my hair is " + this.hair + " My student id is " + this.studentID + " my sport is " + this.Sport);
    }
    
}
