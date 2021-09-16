import java.math.BigDecimal;

public class JavaConversions {

    public static void main(String[] args) {
        String message = "ABC@XYZ? abc-xyz!";
        String encryption = encryptRO13(message);
        System.out.println("Encrypt using RO13");
        System.out.println(message + " -> " + encryption + "\n");

        double decimal = 64781.571987;
        double octal = decimalToOctal(decimal);
        System.out.println("Convert decimal to octal");
        System.out.println(decimal + " -> " + octal);
    }

    private static String encryptRO13(String message) {
        char[] msgChars = message.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char cha : msgChars) {
            int ascii = (int) cha;
            if ((64 < ascii && ascii <= 77) || (96 < ascii && ascii <= 109)) {
                ascii += 13;
            } else if ((77 < ascii && ascii <= 90)
                    || (109 < ascii && ascii <= 123)) {
                ascii -= 13;
            }
            sb.append((char) ascii);
        }
        return sb.toString();
    }

    private static double decimalToOctal(double doubleDecimal) {
        BigDecimal decimal = new BigDecimal(doubleDecimal);
        int integral = decimal.intValue();
        double subtraction = decimal.doubleValue() - integral;
        BigDecimal fractional = new BigDecimal(subtraction);

        StringBuilder intString = new StringBuilder();
        while (integral >= 1) {
            int octDigit = integral % 8;
            intString.insert(0, octDigit);
            integral /= 8;
        }
        StringBuilder fracString = new StringBuilder(".");
        while (fractional.doubleValue() != 0.0) {
            fractional = fractional.multiply(new BigDecimal(8));
            fracString.append(fractional.intValue());
            if (fractional.doubleValue() >= 1) {
                fractional = fractional
                        .subtract(new BigDecimal(fractional.intValue()));
            }
        }
        return (Double.parseDouble(intString.toString())
                + Double.parseDouble(fracString.toString()));
    }

}
