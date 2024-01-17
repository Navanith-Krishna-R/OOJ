public class EndsWith {
    public static void main(String[] args) {
        // Given strings
        String originalString = "Navanith, Krishna";
        String suffix1 = "Krishna";
        String suffix2 = "Navanith";
        boolean endsWith1 = originalString.endsWith(suffix1);
        boolean endsWith2 = originalString.endsWith(suffix2);
        System.out.println("Ends with \"" + suffix1 + "\": " + endsWith1);
        System.out.println("Ends with \"" + suffix2 + "\": " + endsWith2);
    }
}
