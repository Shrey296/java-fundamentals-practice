// wap to update content inside a file
import java.io.*;

public class P9_UpdateFileContent {

    public static void main(String[] args) {

        String filePath = "1.txt";
        String CurrentWord = "hello";
        String newWord = "hi";

        try {
            File file = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            
            String line;
            StringBuilder content = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                content.append(line.replace(CurrentWord, newWord)).append("\n");
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(content.toString());
            writer.close();

            System.out.println("File updated successfully");

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        } catch (IOException e) {
            System.out.println("Error while reading or writing file");
        }
    }
}