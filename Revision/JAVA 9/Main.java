public class Main {
    public static void main(String [] Args){
        Laptop dell = new Dell("DELL", "25");
        Laptop xp = new XP("XP", "17");
        dell.powerOn();
        dell.surfInternet();
        xp.powerOn();
        xp.surfInternet();
    }
}
