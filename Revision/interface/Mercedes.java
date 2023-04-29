public class Mercedes implements Car{
    
        String weel;
        String paint;

    public Mercedes(String weel,String paint){
        this.weel = weel;
        this.paint = paint;

    }

    public String getweel(){
        return weel;
    }
    public void setweel(String weel){
        this.weel = weel;
    }

    public String getpaint(){
        return paint;
    }

    public void setpaint(String paint){
        this.paint = paint;
    }
    
    public void weel(){
        System.out.println("there are this may weel " + weel);
    }

    public void paint(){
        System.out.println("the paint colour " + paint);
    }

    public void type(){
        System.out.println("this type of car is Mercedes" );
    }
}
