import java.io.FileWriter;
import java.io.IOException;

public class file_handling{
    public static void main(String[] args) {
        try {
            // Create FileWriter in write mode (overwrites if file exists)
            FileWriter writer = new FileWriter("output.txt");

            // Writing some text into the file
            writer.write("Hello, this is the first line.\n");
            //writer.write("Java file handling example.\n");
            //writer.write("File writing successful!");

            // Always close the writer
            writer.close();

            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
