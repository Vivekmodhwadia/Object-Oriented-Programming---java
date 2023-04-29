
public class Main {
    
    public static void main (String []Args){
       
        dog dog1 = new dog(); // craeting a dog object 

        AnimalStuff(dog1); // passing the dog object to method (animalStuff)
    }
                                
    public static void AnimalStuff(Animal animal){ // we want an animal that is of the type animal meaning i want something that extenends from the animal class
        dog myAnimal2 = (dog) animal; // downcasing for example this means i want a dog my the dog class that came from the type anminal. we do this my doing the extends keyword 
        myAnimal2.bark(); // once we do this we can acces all the methods from the dog class that are not present in the animal one.
        myAnimal2.noice();
    }
}
