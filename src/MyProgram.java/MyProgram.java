//Cormac Stone and Aidan Slovik
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Do you want to read or write from a file? \nChoose 1 or 2");
        String choice = myObj.nextLine();

        try {
            if (choice.equals("1")) {
                File readObj = new File("writing.txt");
                if (readObj.exists()) {
                    Scanner fileReader = new Scanner(readObj);
                    while (fileReader.hasNextLine()) {
                        String data = fileReader.nextLine();
                        System.out.println(data);
                    }
                    fileReader.close(); // Close the Scanner
                } else {
                    System.out.println("File reading.txt does not exist.");
                }
                
            } else if (choice.equals("2")) {
                File writeObj = new File("writing.txt");
                
                // Writing to the file
                if (writeObj.exists()) {
                    Scanner fileReader = new Scanner(writeObj);
                    while (fileReader.hasNextLine()) {
                        String data = fileReader.nextLine();
                        System.out.println(data);
                    }
                    fileReader.close(); // Close the Scanner
                }
                
                Scanner write = new Scanner(System.in);
                System.out.println("\nWhat do you want to write?");
                String words = write.nextLine();
                write.close(); // Close the Scanner
                
                FileWriter fileWriter = new FileWriter(writeObj, true); // true for append mode
                PrintWriter printWriter = new PrintWriter(fileWriter);
                
                // Write some content to the file
                printWriter.println(words);
                
                // Flush and close PrintWriter
                printWriter.flush();
                printWriter.close(); 
                
                System.out.println("\nWrite operation completed.\nFile reads:");

                // Read back to check
                Scanner fileReader = new Scanner(writeObj);
                while (fileReader.hasNextLine()) {
                    String data = fileReader.nextLine();
                    System.out.println(data);
                }
                fileReader.close(); // Close the Scanner
                
                
            } else {
                System.out.println("Invalid choice. Please choose 1 or 2.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred. File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
