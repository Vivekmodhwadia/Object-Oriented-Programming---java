public class Main{

    public static void main(String[] args){
        iphone IPHONE = new iphone(075,"Iphone 13","faceID");
        Samsung SAMSUNG = new Samsung(067,"Samsung s10", "fingerPrint");
        SAMSUNG.phoneNumber();
        SAMSUNG.model();
        SAMSUNG.bio();
        IPHONE.phoneNumber();
        IPHONE.model();
        IPHONE.bio();
}
    }