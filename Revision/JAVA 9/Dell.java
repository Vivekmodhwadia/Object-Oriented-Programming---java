public class Dell extends Laptop {
    

    public Dell (String ManU, String model){
        super(ManU,model);
    }
   
   
    public void powerOn(){
        System.out.println("the power is on DELL");
    }

    public void surfInternet(){
        System.out.println("Using email DELL");
    }

}
