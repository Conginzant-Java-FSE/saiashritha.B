import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class WordFrequencyCounter {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Mahindra", "Lamborgini", "TATA", "KIA", "Ferrari", "BMW", "AUDI","Lamborgini");
        System.out.println("Inputs: " + words);

        Map<String, Integer> frequencyMap = new TreeMap<>();
        for (String word : words) {
            if (word == null) continue;
            String lowerCaseWord = word.toLowerCase();
            frequencyMap.put(lowerCaseWord, frequencyMap.getOrDefault(lowerCaseWord, 0) + 1);
        }
        System.out.println("Word Frequencies in AlphaOrder:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}



