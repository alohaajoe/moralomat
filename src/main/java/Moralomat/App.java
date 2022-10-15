package Moralomat;

import Moralomat.Parts.RandomPartsService;


public class App {
    private static final String filePathFirstPart = "src/main/java/Moralomat/Parts/textdata/firstPart.txt";
    private static final String filePathMiddlePart = "src/main/java/Moralomat/Parts/textdata/middlePart.txt";
    private static final String filePathLastPart = "src/main/java/Moralomat/Parts/textdata/lastPart.txt";


    public static void main(String[] args) {
        RandomPartsService.setup(filePathFirstPart, filePathMiddlePart, filePathLastPart);
        System.out.println( RandomPartsService.getRandomSentence());

    }
}
