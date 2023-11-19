package programmers;

import java.util.Arrays;

public class ManagementFee {

    public static void main(String[] args) {
        int day = 6;
        int k = 1;
        System.out.println(Arrays.toString(solution(day, k)));
    }


    public static int[] solution(int day, int k) {
        int sat = 5;
        int sun = 6;
        int[] dayOfMon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] answer = new int[12];
        int sumOfDay = 0;

        for (int i = 0; i < dayOfMon.length; i++) {
            if (i != 0) {
                sumOfDay += dayOfMon[i - 1];
            } else {
                sumOfDay = day + k - 1;
            }
            int d = sumOfDay % 7;
            if (d == sun || d == sat) answer[i] = 1;
            else answer[i] = 0;
        }
        return answer;
    }
}

/*
   1  2  3  4  5  6  7
   8  9  10 11 12 13 14
   15 16 17 18 19 20 21
   22 23 24 25 26 27 28
   29 30 31 1

 */