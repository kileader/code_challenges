package week_2_14;

/*
 * Create a function that takes the memory size (ms is a string type) as an argument and returns the actual memory size.
 */
public class MemorySize {
    
    public static void main(String[] args) {
        System.out.println("actualMemorySize(\"32GB\") -> " + actualMemorySize("32GB"));
        System.out.println("actualMemorySize(\"2GB\") -> " + actualMemorySize("2GB"));
        System.out.println("actualMemorySize(\"512MB\") -> " + actualMemorySize("512MB"));
    }
    
    private static String actualMemorySize(String given) {
        double givenNum = Double.parseDouble(given.replaceAll("GB|MB", ""));
        String byteSize = given.replaceAll("[^A-Z]+", "");
        double megaBytes = 0.0;
        if (byteSize.equals("GB")) {
            megaBytes = givenNum * 1000.0;
        } else if (byteSize.equals("MB")) {
            megaBytes = givenNum;
        }
        double actualSize = 0.93 * megaBytes;
        if (actualSize > 1000.0) {
            return Math.round(actualSize / 10.0) / 100.0 + "GB";
        }
        return Math.round(actualSize) + "MB";
    }
    
}
