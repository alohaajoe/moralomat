package Moralomat;

import Moralomat.Parts.RandomPartsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoralomatApplication {

    private static final String filePathFirstPart = "src/main/java/Moralomat/Parts/textdata/firstPart.txt";
    private static final String filePathMiddlePart = "src/main/java/Moralomat/Parts/textdata/middlePart.txt";
    private static final String filePathLastPart = "src/main/java/Moralomat/Parts/textdata/lastPart.txt";

    public static void main(String[] args) {
        RandomPartsService.setup(filePathFirstPart, filePathMiddlePart, filePathLastPart);
        SpringApplication.run(MoralomatApplication.class, args);
    }

}