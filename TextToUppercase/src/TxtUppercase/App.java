package TxtUppercase;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please type file path of txt.");
            String path = scanner.nextLine();

            System.out.println("Please type text to add.");
            String text = scanner.nextLine();

            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.close();

            FileReader fileReader = new FileReader(path);
            BufferedReaderNew bufferedReaderNew = new BufferedReaderNew(fileReader);
            System.out.println(bufferedReaderNew.readLine());
            bufferedReaderNew.close();

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

    }

}
