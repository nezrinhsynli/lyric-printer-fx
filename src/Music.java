public class Music {

    public static void printSentenceWithDelay(String sentence, String sentenceColour, int delayMillis) throws Exception {

        for (String word : sentence.split("-")) {
            System.out.print(sentenceColour + word + " ");
            Thread.sleep(delayMillis);
        }

    }

    public static void main(String[] args) throws Exception {

        printSentenceWithDelay("Baby,",
                Colours.addStyleToColour("bold", Colours.addStyleToColour("underline", Colours.PURPLE.getCode())),
                2000);

        System.out.println();

        printSentenceWithDelay("now i'm ready",
                Colours.addStyleToColour("bold", Colours.addStyleToColour("italic", Colours.BRIGHT_PURPLE.getCode())),
                2000);


        printSentenceWithDelay("moving on",
                Colours.addStyleToColour("bold", Colours.addStyleToColour("italic", Colours.BRIGHT_PURPLE.getCode())),
                2000);

        System.out.println();

        printSentenceWithDelay("Oh, but maybe",
                Colours.addStyleToColour("bold", Colours.addStyleToColour("italic", Colours.PURPLE.getCode())),
                2000);

        System.out.println();

        printSentenceWithDelay("I was ready",
                Colours.addStyleToColour("bold", Colours.addStyleToColour("italic", Colours.BRIGHT_PURPLE.getCode())),
                2000);

        printSentenceWithDelay("all along",
                Colours.addStyleToColour("bold", Colours.addStyleToColour("italic", Colours.BRIGHT_PURPLE.getCode())),
                2000);

        System.out.println();

        printSentenceWithDelay("Oh i'm ready",
                Colours.addStyleToColour("bold", Colours.addStyleToColour("italic", Colours.PURPLE.getCode())),
                2000);

        System.out.println();

        printSentenceWithDelay("for this moment",
                Colours.addStyleToColour("bold", Colours.addStyleToColour("italic", Colours.BRIGHT_PURPLE.getCode())),
                2000);

        printSentenceWithDelay("and the sound",
                Colours.addStyleToColour("bold", Colours.addStyleToColour("italic", Colours.BRIGHT_PURPLE.getCode())),
                2000);

        System.out.println();

        printSentenceWithDelay("Oh, but maybe",
                Colours.addStyleToColour("bold", Colours.addStyleToColour("italic", Colours.PURPLE.getCode())),
                2000);

        System.out.println();

        printSentenceWithDelay("I was ready",
                Colours.addStyleToColour("bold", Colours.addStyleToColour("italic", Colours.BRIGHT_PURPLE.getCode())),
                2000);

        printSentenceWithDelay("all along",
                Colours.addStyleToColour("bold", Colours.addStyleToColour("italic", Colours.BRIGHT_PURPLE.getCode())),
                2000);

        System.out.println();

        printSentenceWithDelay("Oh, baby...",
                Colours.addStyleToColour("bold", Colours.addStyleToColour("italic", Colours.PURPLE.getCode())),
                2000);
    }

}
