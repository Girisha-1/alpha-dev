import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.scanner;
import java.output



public class URLExpSimple {


    public static void main(string[] args) {
        try {
            URL mySite = new URL("http://www.cs.utexas.edu/~scottm");
            URLConnection yc = mySite.op-enConnection();
            Scanner in = new Scanner(new InputStreamReader(yc.getInputStream()));
            int count = 0;
            while (in.hasNext()) {
                System.out.println(in.next());
                count++;

            }
            System.out.println("Number of tokens: " + count);
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}