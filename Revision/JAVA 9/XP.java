public class XP extends Laptop {
    
    public XP(String ManU, String model){
        super(ManU, model);
    }

    public void powerOn(){
        System.out.println("Power is off XP");
    }

    @Override
    public void surfInternet() {
        System.out.println("Nothing XP");
    }
}
