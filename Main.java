import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        try{
            URL url = new URL("https://www.google.com");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            ReadableByteChannel readableByteChannel = Channels.newChannel(inputStream);
            ByteBuffer buffer = ByteBuffer.allocate(64);
            String line;
            while (readableByteChannel.read(buffer)  > 0){
                System.out.println(new String(buffer.array()));
                buffer.clear();
            }
            readableByteChannel.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        InetAddress[] Address = InetAddress.getAllByName("www.google.com");
        System.out.println(Arrays.toString(Address));
        try{
            URL url = new URL("https://www.google.com");
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
