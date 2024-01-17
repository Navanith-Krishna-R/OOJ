public class StartsWith {
    public static void main(String[] args) {
        // Given strings
        String originalString = "Navanith,Krishna";
        String prefix1 = "Navanith";
        String prefix2 = "Krishna";
        boolean startsWith1 = originalString.startsWith(prefix1);
        boolean startsWith2 = originalString.startsWith(prefix2);
        System.out.println("Starts with \"" + prefix1 + "\": " + startsWith1);
        System.out.println("Starts with \"" + prefix2 + "\": " + startsWith2);
    }
}
