package programmers;

import java.util.Arrays;

public class MinMax {

    public static void main(String[] args) {
        String solution = solution("1 2 3 4");
        System.out.println(solution);
    }

    public static String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String value : arr) {
            min = Math.min(Integer.parseInt(value), min);
            max = Math.max(Integer.parseInt(value), max);
        }
        answer = min + " " + max;
        return answer;
    }
}
