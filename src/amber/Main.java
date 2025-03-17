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
            //Cargar el reader del INPUT y el writer del OUTPUT
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            //Creamos variable que sea String
            String line;

            //While con condición de que la "línea" del reader no sea null
            while ((line = reader.readLine()) != null){

                //Parseamos "String line" into "int lineNum"
                int lineNum = Integer.parseInt(line);

                //Hacemos la operación
                lineNum += 10;

                //Pasamos de "int lineNum" into "String lineS"
                String lineS = String.valueOf(lineNum);

                //Escribimos "lineS"
                writer.write(lineS);

                //Agregamos una nueva línea
                writer.newLine();

            }
            writer.close();
            reader.close();

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
