public abstract class phone{
    int PhoneNumber;
    String Model;
    String biometric;

    public phone(int PhoneNumber, String Model, String biometric){
        this.PhoneNumber = PhoneNumber;
        this.Model = Model;
        this.biometric = biometric;
    }

    abstract public void phoneNumber();

    abstract public void model();

    abstract public void bio();
}