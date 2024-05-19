package Examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class write_read_txt {

    public static void main(String[] args) throws IOException {



        // --------------------------------------------------
        // Custom
        // --------------------------------------------------



        String file_name = "test.txt";
        String file_directory = "C:/Users/Kwanc/OneDrive/Desktop/MINIWIKI-java";

        File file = new File(file_directory + "/" + file_name);



        // --------------------------------------------------
        // Writing
        // --------------------------------------------------



        if (file.exists() == false) {

            Writer filewriter;
            BufferedWriter filebw;

            filewriter = new FileWriter(file, false);
            filebw = new BufferedWriter(filewriter);

                filebw.write("Hello");
                filebw.newLine();
                
            filebw.close();
            filewriter.close();

            System.out.println("Write completed!");

        } else {

            System.out.println("Already has this file!");

        }



        // --------------------------------------------------
        // Reading
        // --------------------------------------------------

        
        
        BufferedReader fileReader;
        String read_all = "";

        if (file.exists() == true) {

            fileReader = new BufferedReader(new FileReader(file));

            while ((read_all = fileReader.readLine()) != null) {

                System.out.println("> " + read_all);
    
            } fileReader.close();

            System.out.println("Read completed!");

        }

    }

}