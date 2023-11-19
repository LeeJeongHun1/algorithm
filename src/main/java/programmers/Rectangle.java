package programmers;

import java.util.Arrays;

public class Rectangle {

    public static void main(String[] args) {
        int[][] nums = {{1, 4}, {3, 4}, {3, 10}};
//        int solution = solution(nums);
        System.out.println(solution(nums));
    }


    public static int[] solution(int[][] coordinate) {
        int[] answer = {0, 0};
        for (int i = 0; i < coordinate.length; i++) {
            if (coordinate[0][i] == coordinate[1][i]) answer[0] = coordinate[2][i];
            else if(coordinate[0][i] == coordinate[2][i]) answer[0] = coordinate[1][i];
            else if(coordinate[1][i] == coordinate[2][i]) answer[1] = coordinate[0][i];
        }
        return answer;
    }
}
