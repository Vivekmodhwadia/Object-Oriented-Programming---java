public class Maya extends Women {
    
    public Maya(String name, String lastName, int age, String Haircolour){
        super(name, lastName, age, Haircolour);
    }

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getlastName(){
        return lastName;
    }
    public void setlastname(String lastName){
        this.lastName = lastName;
    }

    public String getHaircolour(){
        return Haircolour;
    }

    public void setHaircolour(String Haircolour){
        this.Haircolour = Haircolour;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void goAway(){
        System.out.println("fuck off " + " - " + name);
    }

    public void Imblind(){
        System.out.println("my name is " + name + " and i am blind");
    }

    public void sayHello(){
        System.out.println("my name is " + name + " my last name is  " + lastName + " my haircolour is  " + Haircolour + " may age is " + age );
    }
}
