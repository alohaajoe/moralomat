package Moralomat.Parts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class RandomPartsService {

    private static List<String> firstParts;
    private static List<String> middleParts;
    private static List<String> lastParts;


    public static void setup(String filePathFirstPart, String filePathMiddlePart, String filePathLastPart){
        firstParts = FileReading.readFile(filePathFirstPart);
        middleParts = FileReading.readFile(filePathMiddlePart);
        lastParts = FileReading.readFile(filePathLastPart);
    }

    @GetMapping("/moral")
    public static String getRandomSentence(){
        String firstPart = getRandomLineFromList(firstParts);
        String middlePart = getRandomLineFromList(middleParts);
        String lastPart = getRandomLineFromList(lastParts);
        return firstPart + middlePart + lastPart;
    }

    public static String getRandomLineFromList (List<String> listToGetRandomLineFrom){
        Random rand = new Random();
        return listToGetRandomLineFrom.get(rand.nextInt(listToGetRandomLineFrom.size()));
    }
}
