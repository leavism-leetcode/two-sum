import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] options, int target) {
        int[] result = new int[2];
        for (int i = 0; i <= options.length; i++) {
            for (int j = i + 1; j <= options.length - 1; j++) {
                if (options[i] + options[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] fasterTwoSum(int[] options, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < options.length; i++) {
            if (map.containsKey(target - options[i])) {
                return new int[]{map.get(target - options[i]), i};
            }

            map.put(options[i],i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] options = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(fasterTwoSum(options, target)));
    }
}