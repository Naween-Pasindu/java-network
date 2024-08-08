import java.awt.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress[] Address = InetAddress.getAllByName("www.google.com");
        System.out.println(Arrays.toString(Address));
    }
}
