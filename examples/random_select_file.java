import java.io.File;
import java.util.Random;

public class random_select_file {

    public static void main(String[] args) {



        // --------------------------------------------------
        // Custom
        // --------------------------------------------------



        File directory = new File("C:/Users/Kwanc/OneDrive/Desktop/MINIWIKI-java/examples");



        // --------------------------------------------------
        // Variables
        // --------------------------------------------------

        

        File[] list = directory.listFiles();
        File[] filter = directory.listFiles();

        Random random = new Random();

        int n = 0;



        // --------------------------------------------------
        // File Selector
        // --------------------------------------------------


        
        if (directory.exists() == true) {

            if (list != null) {for (int i = 0; i < list.length; i++) {

                if ((list[i].isFile() == true) && (list[i].getName().endsWith(".java"))) {       //      Filter the file/folder here

                    filter[n] = list[i];
                    n = n+1;

                }

            }}



            if (n != 0) {

                String chosen = filter[random.nextInt(n)].getName();

                System.out.println("Number of matched files : " + n);
                System.out.println("Selected : " + chosen);

            } else {

                System.out.println("No any files here that match to your filter");

            }

        } else {

            System.out.println("Error! Check the path and try again.");

        }

    }

}
