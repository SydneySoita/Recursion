public class PairStar {
    public String pairStar(String text) {
        if (text.length() <= 1)
            return text;
        if (text.charAt(0) == text.charAt(1))
            return Character.toString(text.charAt(0)) + "*" + pairStar(text.substring(1));
        else
            return Character.toString(text.charAt(0)) + pairStar(text.substring(1));

    }
}
