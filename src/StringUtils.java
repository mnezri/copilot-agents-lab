public final class StringUtils {

    private StringUtils() {
    }

    /**
     * Returns whether the provided text is null, empty, or contains only whitespace.
     *
     * @param value the text to inspect
     * @return true when the text is blank, otherwise false
     */
    public static boolean isBlank(String value) {
        return value == null || value.isBlank();
    }

    /**
     * Reverses the provided text.
     *
     * @param value the text to reverse
     * @return the reversed text, or null when the input is null
     */
    public static String reverse(String value) {
        if (value == null) {
            return null;
        }

        return new StringBuilder(value).reverse().toString();
    }

    /**
     * Capitalizes the first character of the provided text.
     *
     * @param value the text to capitalize
     * @return the text with its first character capitalized, or the original value when null or empty
     */
    public static String capitalize(String value) {
        if (value == null || value.isEmpty()) {
            return value;
        }

        return Character.toUpperCase(value.charAt(0)) + value.substring(1);
    }
}