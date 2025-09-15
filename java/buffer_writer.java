import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class buffer_writer {
    public static void main(String[] args) {
        try {
            // Create FileWriter (false = overwrite, true = append)
            FileWriter fw = new FileWriter("output1.txt", false);  
            BufferedWriter bw = new BufferedWriter(fw);

            // Writing lines into the file
            bw.write("Hello, this is the first line.");
            bw.newLine();   // writes a new line
            bw.write("Java file handling with BufferedWriter.");
            bw.newLine();
            bw.write("File writing successful using buffer!");

            // Always close BufferedWriter
            bw.close();

            System.out.println("Data written to file successfully using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            //e.printStackTrace();
        }
    }
}
