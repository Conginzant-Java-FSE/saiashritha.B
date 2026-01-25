import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
    public class FlatMap {
        public static void main(String[] args) {
            List<List<String>> data = Arrays.asList(
                    Arrays.asList("apple", "banana", "mango"),
                    Arrays.asList("banana", "kiwi"),
                    Arrays.asList("apple", "grape")
            );
            List<String> result = data.stream()
                    .flatMap(List::stream)
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

            System.out.println(result);
        }
    }
}
