package week_4_25;

/*
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the original string,
 * your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z)
 */
public class StringCompression {
    
    public static void main(String[] args) {
        System.out.println("compressString(\"aabcccccaaa\") -> " + compressString("aabcccccaaa"));
        System.out.println("compressString(\"a\") -> " + compressString("a"));
        System.out.println("compressString(\"ddffciii\") -> " + compressString("ddffciii"));
        System.out.println("compressString(\"zzzzzzzzzzza\") -> " + compressString("zzzzzzzzzzza"));
        System.out.println("compressString(\"\") -> " + compressString(""));
    }
    
    static String compressString(String input) {
        if (input.length() <= 1) {
            return input;
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();
        char prevLetter = chars[0];
        sb.append(prevLetter);
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (chars[i] == prevLetter) {
                count++;
                if (i == input.length() - 1) {
                    sb.append(count);
                }
            } else {
                sb.append(count);
                prevLetter = chars[i];
                sb.append(chars[i]);
                count = 1;
            }
        }
        if (sb.length() >= input.length()) {
            return input;
        }
        return sb.toString();
    }
    
}
