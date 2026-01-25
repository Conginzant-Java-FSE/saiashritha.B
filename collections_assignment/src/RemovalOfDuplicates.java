import java.util.*;

public class RemovalOfDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,4,3,5,6,6,5,7,8);
        List<Integer> result = removeDuplicates(nums);
        System.out.println("Before removal: " + nums);
        System.out.println("After removal: " + result);
    }

    public static List<Integer> removeDuplicates(List<Integer> input) {
        if (input == null) {
            return new ArrayList<>();
        }
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (Integer num : input) {
            if (set.add(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
