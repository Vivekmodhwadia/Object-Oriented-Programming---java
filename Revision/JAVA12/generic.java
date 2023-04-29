public class generic <t>{

    t a;

    public generic(t a){
        this.a = a;
    }

    public <t> t  something(t a){
        return a;
    }


    public static void main(String []Args){
        generic <Integer> g = new generic(7);
        g.something();
        generic <Character> b = new generic('f');
        b.something();
        
    }
}