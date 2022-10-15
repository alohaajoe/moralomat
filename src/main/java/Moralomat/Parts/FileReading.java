package Moralomat.Parts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReading {
    public static List<String> readFile(String file) {
        List<String> allLines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(file));

            String line = reader.readLine();

            while (line != null) {
                //System.out.println(line);
                allLines.add(line + " ");
                // read next line
                line = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return allLines;
    }
}
