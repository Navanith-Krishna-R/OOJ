import java.util.Arrays;
public class NumericSorting {
    public static void main(String[] args) {
        Integer[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(numbers, (Integer a, Integer b) -> b.compareTo(a));
        System.out.println("Sorted numbers in descending order:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
