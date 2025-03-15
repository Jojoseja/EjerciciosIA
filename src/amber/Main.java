package amber;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String inputFile = ".\\src\\amber\\input.txt";
        String outputFile = ".\\src\\amber\\output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                line += 10;
                String lineS = String.valueOf(line);
                writer.write(lineS);

            }
            writer.close();
            reader.close();

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
