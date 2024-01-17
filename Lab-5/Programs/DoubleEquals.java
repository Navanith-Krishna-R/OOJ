public class DoubleEquals {
    public static void main(String[] args) {
        String str1 = new String("Navanith");
        String str2 = new String("Navanith");
        boolean isEqualWithDoubleEquals = (str1 == str2);
        boolean isEqualWithEquals = str1.equals(str2);
        System.out.println("Using == : " + isEqualWithDoubleEquals);
        System.out.println("Using equals() : " + isEqualWithEquals);
    }
}
