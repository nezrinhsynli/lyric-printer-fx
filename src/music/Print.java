package music;

public class Print {

    public static void printSentenceWithDelay(String sentence, String sentenceColour, int delayMillis) throws Exception {

        for (String word : sentence.split("-")) {
            System.out.print(sentenceColour + word + " ");
            Thread.sleep(delayMillis);
        }

    }
}
