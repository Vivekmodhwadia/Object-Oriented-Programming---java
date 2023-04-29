public abstract class Women{

    String name;
    String lastName;
    String Haircolour;
    int age;
    static String gluten = "im gluten";


    public Women(String name, String lastName, int age, String Haircolour){
        this.name = name;
        this.lastName = lastName;
        this.Haircolour = Haircolour;
        gluten = "im gluten";
        this.age = age;
    }

    abstract public void goAway();

    public void gliuten(){
        System.out.println("i am gulten free");

    }

    abstract public void Imblind();

    abstract public void sayHello();








 
}