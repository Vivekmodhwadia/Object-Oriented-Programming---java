public class iphone extends phone {
    
    public iphone (int PhoneNumber, String model, String biometric){
        super(PhoneNumber, model, biometric);
    }
    
    public void phoneNumber(){
        System.out.println("Your phonenumber is " + PhoneNumber);
    }

    public void model(){
        System.out.println("Your model is " + Model);
    }

    public void bio(){
        System.out.println("the biometric of this phone is " + biometric );
    }
    public void inside(){
        System.out.println("inside iphone");
    }


}
