import java.util.*;
import java.util.stream.*;
public class CustomCollector {
        public static void main(String[] args) {

            List<String> sentences = Arrays.asList(
                    "Java is fun",
                    "Streams are powerful",
                    "Java is fun");

            List<String> allWords = sentences.stream()
                    .flatMap(s -> Arrays.stream(s.split("\\s+")))
                    .collect(Collectors.toList());

            int totalWords = allWords.size();
            int distinctWords = (int) allWords.stream().distinct().count();

            WordCountResult res = new WordCountResult(totalWords, distinctWords);

            System.out.println(res);
        }
    }

    class WordCountResult {
        int totalWords;
        int distinctWords;

        WordCountResult(int totalWords, int distinctWords) {
            this.totalWords = totalWords;
            this.distinctWords = distinctWords;
        }

        @Override
        public String toString() {
            return "Total Words: " + totalWords + ", Distinct Words: " + distinctWords;
        }
    }

