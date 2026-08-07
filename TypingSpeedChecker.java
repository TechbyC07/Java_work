import java.util.Random;
import java.util.Scanner;

public class TypingSpeedChecker {

    public static void main(String[] args) {

        // array of sample sentences
        String[] sentences ={
            "My unmatched perspicacity coupled with sheer indefatigability makes me a feared opponent.",
            "in the instnace that it's co-op gaming, are you down?... perhaps that will be fun",
            "3PM, thats exactly when all daily tasks begin to get sped through"
        };

        Random random = new Random();
        String sentence = 
        sentences[random.nextInt(sentences.length)];

        System.out.println("Type the following sentences correctly as quickly as you can.");
        System.out.println(sentence);

        Scanner scanner = new Scanner(System.in);

        //TIMER STARTS
        long startTime = 
        System.currentTimeMillis();

        //READ INPUT
        System.out.println("Start typing.");
        String userInput = scanner.nextLine();

        long endTime = System.currentTimeMillis();

        long timeTaken = endTime - startTime;

        double seconds = timeTaken / 1000.0;
        int wordcount = sentence.trim().split("\\s+").length;
        double wpm = ((double) wordcount / seconds) * 60;

        //check
        if (userInput.equals(sentence)) {
            System.out.println("Welldone");
        }
        else{
            System.out.println("Typing had mistakes");
        }

        System.out.printf("Time taken: %.2f seconds%n", seconds);
        System.out.printf("Your typing speed: %.2f WPM%n", wpm);

        scanner.close();
    }
}