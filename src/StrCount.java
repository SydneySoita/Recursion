public class StrCount {
    public static int strCount(String text, String key) {
        if (text.isEmpty() || !text.contains(key)) {
            return 0;
        }
        int keyLength = key.length();
        String firstKeyLengthString = text.substring(0, keyLength);
        int keyCount = 0;
        if (firstKeyLengthString.equals(key)) {
            keyCount++;
            text = text.substring(keyLength);
        } else {
            text = text.substring(1);
        }
        return keyCount + strCount(text, key);
    }

}
