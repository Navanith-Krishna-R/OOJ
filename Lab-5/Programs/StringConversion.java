public class StringConversion {
    public static void main(String[] args) {
        // Given string
        String originalString = "Navanith, krishna";

        // Demonstrate getBytes() method
        byte[] byteArray = originalString.getBytes();

        System.out.println("String to byte array:");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println(); // Move to the next line

        // Demonstrate toCharArray() method
        char[] charArray = originalString.toCharArray();

        System.out.println("String to char array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println(); // Move to the next line
    }
}
