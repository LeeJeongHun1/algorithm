package programmers;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class Report {

    public static void main(String[] args) {
        solution();
    }

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/178870
     */
    public static void solution() {
        int[] seq = {1, 1, 1, 2, 3, 4, 5};
        int k = 7;

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < seq.length - 1; i++) {
            int sum = k - seq[i];
            for (int j = i + 1; j < seq.length; j++) {
                int tmp = sum - seq[j];
                if (tmp < 0) break;
                if (tmp == 0) {
                    result.add(i);
                    result.add(j);
                    return;
                } else sum -= seq[j];
            }
        }

        Integer i = result.get(0);

    }

}
