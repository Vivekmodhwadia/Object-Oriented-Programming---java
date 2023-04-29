public abstract class Laptop{
    String manU;
    String model;

    public Laptop(String manU, String model){
        this.manU = manU;
        this.model = model;
    }

    abstract public void powerOn();

    abstract public void surfInternet();

}