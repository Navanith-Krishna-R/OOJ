import java.util.Arrays;
public class AlphabeticalSorting {
    public static void main(String[] args) {
      
        String[] words = {"van", "watch", "ball", "cat", "xmas", "yatch", "zee", "apple", "ice", "jug", "kite",
                          "lift", "man", "net", "orange", "dog", "ent", "free", "gun", "hen", "parrot", "queen",
                          "ring", "star", "tree", "umbrella"};
        Arrays.sort(words);
        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
