// wap to merge data from 2 files
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class P11_Merge2Data {
    public static void main(String[] args) {
        try (
            FileOutputStream fil = new FileOutputStream("1.txt", true);
            FileInputStream fil2 = new FileInputStream("2.txt");
        ) {
            int i;
            while ((i = fil2.read()) != -1) {
                fil.write(i);
            }
            System.out.println("Done");
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}