public class GetChars {
    public static void main(String[] args) {
        String inputString = "Welcome to Bmsce college";
        char[] resultCharArray = new char[5]; // "Bmsce" has 5 characters
        inputString.getChars(12, 17, resultCharArray, 0);
        System.out.println("Extracted string: " + new String(resultCharArray));
    }
}
