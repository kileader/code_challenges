
public class Rot13 {

    public static void main(String[] args) {
        String message = "ABC@XYZ? abc-xyz!";
        String encryption = encrypt(message);
        System.out.println(message + " -> " + encryption);
    }
    
    private static String encrypt(String message) {
        char[] msgChars = message.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char cha : msgChars) {
            int ascii = (int) cha;
            if ((64 < ascii && ascii <= 77) || (96 < ascii && ascii <= 109)) {
                ascii += 13;
            } else if ((77 < ascii && ascii <= 90) || (109 < ascii && ascii <= 123)) {
                ascii -= 13;
            }
            sb.append((char) ascii);
        }
        return sb.toString();
    }

}
