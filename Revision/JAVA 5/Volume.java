public class Volume{
    public static void main (String []Args){
    Volume shape = new Volume();
    System.out.println(shape.volume(5));
    System.out.println(shape.volume(5,6,3));
    System.out.println(shape.volume(3,6));
    }
    public double volume(double side){
        return side * side * side;
    }
    public double volume(double h, double w, double l){
        return h*w*l;
    }
    public double volume (double r, double h){
        return 3.14 *r*r *h;
    }
    
}