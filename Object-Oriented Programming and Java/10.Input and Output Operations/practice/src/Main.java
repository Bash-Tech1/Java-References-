import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0, c;
        String fileName;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the file");
        fileName = in.nextLine();
        try{
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);
            } else {
                System.out.println("File already exists.");
            }
            String content = "Hello, World! im Bash!"; // Content to write

            // Create a FileWriter and BufferedWriter
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write content to the file
            bufferedWriter.write(content);
            bufferedWriter.newLine(); // Optional: Add a new line

            // Close the writers
            bufferedWriter.close();
            fileWriter.close();
            FileReader f = new FileReader(file);
            FileWriter w = new FileWriter("output.txt");
            PrintWriter p = new PrintWriter(w);
            while ((c = f.read()) != -1){
                p.print(Character.toUpperCase((char) c));
                x++;
        }
            System.err.print(x);
            System.err.println("Characters read");
            f.close();
            p.close();
        } catch (FileNotFoundException n){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("I/O error");
        }
    }
}