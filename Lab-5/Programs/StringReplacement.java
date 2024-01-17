public class StringReplacement {
    public static void main(String[] args) {
        String input = "Thwas was a test. Thwas was, too.";
        String target = "was";
        String replacement = "is";
        int index = input.indexOf(target);
        while (index != -1) {
            input = input.substring(0, index) + replacement + input.substring(index + target.length());
            index = input.indexOf(target, index + replacement.length());
        }
        System.out.println("Modified string: " + input);
    }
}
