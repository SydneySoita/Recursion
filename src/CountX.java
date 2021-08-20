public class CountX {
    public static int countX(String text) {
        String key = "x";
        if (text.isEmpty() || !text.contains(key)) {
            return 0;
        }

        if (text.substring(0, key.length()).equals(key)) {
            return 1 + countX(text.substring(key.length()));

        } else {
            return countX(text.substring(1));
        }
    }
}
