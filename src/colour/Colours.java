package colour;

public enum Colours {

    RESET("\u001B[0m"),

    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),

    BRIGHT_BLACK("\u001B[90m"),
    BRIGHT_RED("\u001B[91m"),
    BRIGHT_GREEN("\u001B[92m"),
    BRIGHT_YELLOW("\u001B[93m"),
    BRIGHT_BLUE("\u001B[94m"),
    BRIGHT_PURPLE("\u001B[95m"),
    BRIGHT_CYAN("\u001B[96m"),
    BRIGHT_WHITE("\u001B[97m");

    private final String code;

    Colours(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static String get256ColorCode(int colorCode) {
        return "\u001B[38;5;" + colorCode + "m";
    }

    public static String getRGBColorCode(int r, int g, int b) {
        return "\u001B[38;2;" + r + ";" + g + ";" + b + "m";
    }

    public static String addStyleToColour(String styleName, String colourCode) {
        String styleCode = switch (styleName.toLowerCase()) {
            case "bold" -> "1";
            case "dim" -> "2";
            case "italic" -> "3";
            case "underline" -> "4";
            case "blink" -> "5";
            case "reverse" -> "7";
            case "hidden" -> "8";
            default -> "0";
        };

        int symbolCode = colourCode.indexOf("[");
        String preffix = colourCode.substring(0, symbolCode + 1);
        String suffix = colourCode.substring(symbolCode + 1);

        String newColour = preffix + styleCode + ";" + suffix;
        return newColour;
    }

}
