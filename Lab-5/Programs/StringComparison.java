public class StringComparison {
    public static void main(String[] args) {
        // Given strings
        String str1 = "Bmsce";
        String str2 = "College";
        String str3 = "BMSCE";

        // Using equals() to compare strings
        boolean isEqual1 = str1.equals("Bmsce");
        System.out.println("Bmsce equals Bmsce -> " + isEqual1);

        boolean isEqual2 = str1.equals(str2);
        System.out.println("Bmsce equals College -> " + isEqual2);

        boolean isEqual3 = str1.equals(str3);
        System.out.println("Bmsce equals BMSCE -> " + isEqual3);

        // Using equalsIgnoreCase() to compare strings
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str3);
        System.out.println("Bmsce equalsIgnoreCase BMSCE -> " + isEqualIgnoreCase);
    }
}
