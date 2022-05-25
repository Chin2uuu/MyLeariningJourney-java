import java.net.SocketPermission;

public class Gst {
    public static void main(String[] args) {
        int price=10000;
        price=price+499;
        final double TAX = 0.18;
        double gstValue =price*TAX;
        System.out.println("TAX:"+gstValue);
        
        


    }
    
}
