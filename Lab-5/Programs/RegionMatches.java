public class RegionMatches{
    public static void main(String[] args) {
        String originalString = "Welcome to Bmsce College of Engineering";
        String substringToFind = "Bmsce college";
        boolean isMatched = originalString.regionMatches(true, 11, substringToFind, 0, 12);
        if (isMatched) {
            System.out.println("Substring is matched");
        } else {
            System.out.println("Substring is not matched");
        }
    }
}
