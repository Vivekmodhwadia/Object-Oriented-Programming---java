public class Shivani  {
    
    String name;
    String lastName;
    String Haircolour;
    int age;
  

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
        System.out.println("go away my age is " + age);
    }

    public void Imblind(){
        System.out.println("im also blind ");
    }

    public void gliuten(){
        System.out.println("i am gulten free cuz i am " + name);
    }

    public void sayHello(){
        System.out.println("my name is " + name + " my last name is  " + lastName + " my haircolour is  " + Haircolour + " may age is " + age );
    }

    public void haircolour(){
        System.out.println("my hair is " + Haircolour);
    }

    

}
