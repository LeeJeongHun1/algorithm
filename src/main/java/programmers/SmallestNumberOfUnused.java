 package programmers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SmallestNumberOfUnused {

    /**
     * 사용하지 않는 가장 작은 수
     * 0부터 시작하는 양수(+)인 ID가 있습니다. 여러 ID를 보고 사용하지 않는 가장 작은 숫자를 찾는 함수를 작성해주세요.
     *
     * @param ids
     * @return
     */
    public static int solution(int[] ids) {
        int len = ids.length;

        Set<Integer> nums = Arrays.stream(ids).boxed().collect(Collectors.toSet());
        for (int i = 0; i < len; i++) {
            if (!nums.contains(i)) {
                return i;
            }
        }
        return ids.length;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 0}));
    }
}
