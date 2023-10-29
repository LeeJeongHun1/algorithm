package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RoughlyKeyboard {


    /**
     * 프로그래머스 대충 만든 자판
     * https://school.programmers.co.kr/learn/courses/30/lessons/160586
     *
     * @param keymap
     * @param target
     * @return
     */
    public static int[] solution(String[] keymap, String[] target) {
        int[] answer = new int[target.length];
        for (int i = 0; i < target.length; i++) {
            int sum = 0;
            for (int k = 0; k < target[i].length(); k++) {
                char c = target[i].charAt(k);
                int[] w = new int[keymap.length];
                for (int i1 = 0; i1 < keymap.length; i1++) {
                    int index = keymap[i].indexOf(c);
                    if (index == -1) continue;
                    w[i] = index;
                }
                sum += Arrays.stream(w).min().getAsInt() + 1;
            }
            answer[i] = sum;
            System.out.println(sum);
        }
        Arrays.stream(answer).min().getAsInt();
        return answer;
    }
}
