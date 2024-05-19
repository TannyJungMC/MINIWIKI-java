import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class copy_file_folder {



    // --------------------------------------------------
    // Main System (use to call and get value back)
    // --------------------------------------------------



    public static void copyDir(Path from2, Path to2) throws IOException {
        
        try (Stream <Path> stream = Files.walk(from2)) {

            stream.forEach(source -> {

                Path relativePath = from2.relativize(source);
                Path to2ination = to2.resolve(relativePath);
 
                try {
                    Files.copy(source, to2ination);
                } catch (IOException e) {}
    
            });
            
        }

    }



    // --------------------------------------------------
    // Calling
    // --------------------------------------------------



    public static void main(String[] args) {

        File from = new File("C:/Users/Kwanc/OneDrive/Desktop/THT-Forge-1.20.1-6.2.0.jar/data/minecraft");
        File to = new File("C:/Users/Kwanc/Tan/Mod Projects/THT/run/config/THT/custom/minecraft");

        // Insert "from" and "to" with file or folder you need to copy
        // At last of your destination, use the name you want it to be.

        try {

            copyDir(from.toPath(), to.toPath());
            System.out.println("Copied!");

            // Add "StandardCopyOption.REPLACE_EXISTING" like this
            // Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            // For copy with replace exist one

        } catch (IOException e) {
            
            System.out.println("Error!");
            
        }

    }

}