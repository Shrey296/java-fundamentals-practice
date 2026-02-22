// wap to replace values inside a file
import java.io.*;

public class P10_ReplaceValueInFile {

    public static void main(String[] args) {

        String filePath = "1.txt";
        String ReplaceValue = "1000";
        String newValue = "2000";

        try {
            File file = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            
            String line;
            StringBuilder content = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                // Replaces old value with new value
                content.append(line.replace(ReplaceValue, newValue));
                content.append("\n");
            }
            reader.close();

            // Writes updated content back to file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(content.toString());
            writer.close();

            System.out.println("Value replaced successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error while processing the file.");
        }
    }
}