package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NearestSameLetter {
    public static void main(String[] args) {
        int[] bananas = solution("foobar");
        System.out.println(Arrays.toString(bananas));
    }


    public static int[] solution(String s) {
        int[] answer = new int[s.length()];


        List<Integer> temp = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String subStr = s.substring(0, i);
            if (subStr.indexOf(s.charAt(i)) == -1) {
                answer[i] = -1;
            }else{
                answer[i] = i - subStr.lastIndexOf(s.charAt(i));
            }
        }
        return answer;

    }
}
