package programmers;

import java.util.Arrays;

public class RepeatedPartialSequences {

    /**
     * 연속된 수열 중 부분 수열의 합이 k인 수열의 인덱스 구하기
     * ex) 1, 2, 3, 4, 5 인 수열의 k가 5인 경우 [4, 4] 리턴
     *
     * @param sequence 수열
     * @param k        수열의 합
     * @return
     */
    public static int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int start = 0;
        int end = 0;
        int range = 1;
        int length = sequence.length;
        while (true) {
            end = start + range;
            if (start > length - range) {
                start = 0;
                range++;
                continue;
            }
            int sum = Arrays.stream(Arrays.copyOfRange(sequence, start, end)).sum();
            if (sum == k) {
                answer[0] = start;
                answer[1] = end-1;
                return answer;
            }
            start++;

        }
    }
}
