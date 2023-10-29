package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumbers {

    /**
     * 정수 배열 nums와 정수 target이 주어졌을 때, 배열 안의 두 값의 합이 target이 되는 인덱스를 구하세요.
     * 각 입력에 정확히 하나의 해가 있다고 가정할 수 있으며, 같은 요소(같은 인덱스의 값)를 두 번 사용할 수 없습니다. (다른 인덱스에 같은 값이 있는 경우는 같은 값이 사용될 수 있습니다.)
     * 정답 배열의 순서는 상관 없습니다.
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sumNum = target - nums[i];
            if (map.containsKey(sumNum)) {
                return new int[] { map.get(sumNum), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(solution));
    }
}
