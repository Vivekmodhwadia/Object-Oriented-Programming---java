public class Animal{
    public void noice(){

    }

    public static void main(String []Args){
        Animal l = new dog(); // up caste first as you need to create an instance of dog that is from the type animal then pass the reffence 
        dog j = (dog) l; // (downcasting)
        j.bark();
        j.noice();
    }
}