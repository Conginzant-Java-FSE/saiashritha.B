

import java.util.*;

    public class MostFrequentElement{
        public static int mostFrequent(List<Integer> nums) {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int n : nums) freq.put(n, freq.getOrDefault(n, 0) + 1);

            int highFreq = 0, result = Integer.MAX_VALUE;
            for (int a : freq.keySet()) {
                int fr = freq.get(a);
                if (fr > highFreq || (fr == highFreq && a < result)) {
                    highFreq = fr;
                    result = a;
                }
            }
            return result;
        }

        public static void main(String[] args) {
            List<Integer> nums = Arrays.asList(2, 1, 5, 2, 1, 5, 2, 2);
            System.out.println(mostFrequent(nums));
        }
    }


