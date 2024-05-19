import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class read_online_file {

    public static void main(String[] args) {
    
        

        // --------------------------------------------------
        // Custom
        // --------------------------------------------------



        String url = "https://raw.githubusercontent.com/TannyJungMC/THT-tree_pack/main/README.md";

        URL url_convert;
        BufferedReader reader;

        String read_all = "";



        // --------------------------------------------------
        // Reading
        // --------------------------------------------------



        try {

            url_convert = new URI(url).toURL();
            reader = new BufferedReader(new InputStreamReader(url_convert.openStream()));

            while ((read_all = reader.readLine()) != null) {
            
                System.out.println(read_all);
            
            } reader.close();

        } catch (Exception e) {
            
            System.err.println("Error! Check your URL path and your internet connection.");

        }

    }

}