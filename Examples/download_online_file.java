package Examples;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URL;

public class download_online_file {

    public static void main(String[] args) {



        // --------------------------------------------------
        // Custom
        // --------------------------------------------------
        


        String url = "https://github.com/TannyJungMC/test_txt/archive/refs/heads/main.zip";
        String to_path = "C:/Users/Kwanc/OneDrive/Desktop/MINIWIKI-java/download.zip";      //      Add file type at the end of your path like ".zip" and ".txt"

        File test_path = new File(to_path);


        // --------------------------------------------------
        // Download & Status
        // --------------------------------------------------



        try {

            if (test_path.exists() == false) {

                URL url_convert = new URI(url).toURL();
                BufferedInputStream read_all = new BufferedInputStream(url_convert.openStream());
                try (FileOutputStream fileOutputStream = new FileOutputStream(to_path)) {

                    byte dataBuffer[] = new byte[1024];
                    int bytesRead;

                    while ((bytesRead = read_all.read(dataBuffer, 0, 1024)) != -1) {
        
                        fileOutputStream.write(dataBuffer, 0, bytesRead);

                    }

                }

                System.err.println("Download completed!");

            } else {

                System.err.println("Already has this file!");

            }

        } catch (Exception e) {
        
            System.err.println("Error! Check your URL path and your internet connection.");

        }
    
    }

}