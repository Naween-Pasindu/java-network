import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class Net {
    public static void main(String[] args) {
        try{
            Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();
            System.out.println("Nework Display :");
            for(NetworkInterface element : Collections.list(networkInterfaceEnumeration)){
                System.out.printf("%s - %-32s \n", element.getName(), element.getDisplayName());
            }
        }catch (SocketException e){
            e.printStackTrace();
        }
    }
}
