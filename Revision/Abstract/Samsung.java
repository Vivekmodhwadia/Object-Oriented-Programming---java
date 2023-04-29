public class Samsung extends phone {
    
    public Object model;

    public Samsung(int PhoneNumber, String Model, String biometric ){
        super(PhoneNumber, Model, biometric);
    }

    public void phoneNumber(){
        System.out.println("Your Phone number is " + PhoneNumber);
    }

    public void model(){
        System.out.println("the model is " + Model);

    }

    public void bio(){
        System.out.println("the bio is for this phone " + biometric);
    }

    public void indie(){
        System.out.println("this is the samsung");
    }
}
