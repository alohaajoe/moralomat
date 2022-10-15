
import Parts.RandomPartsService;


public class App {
    private static final String filePathFirstPart = "src/main/java/Parts/textdata/firstPart.txt";
    private static final String filePathMiddlePart = "src/main/java/Parts/textdata/middlePart.txt";
    private static final String filePathLastPart = "src/main/java/Parts/textdata/lastPart.txt";


    public static void main(String[] args) {
        RandomPartsService randomPartsService = new RandomPartsService(filePathFirstPart, filePathMiddlePart, filePathLastPart);
        System.out.println( randomPartsService.getRandomSentence());

    }
}
