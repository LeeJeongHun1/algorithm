package programmers;

import java.util.HashMap;
import java.util.Map;

public class Point {

    /**
     * 승정 구하기
     * 점수를 보고 이기면 3점, 비기면 1점, 지면 0점으로 계산하여 전체 승점을 구하는 함수를 작성해주세요.
     * ["3:1", "2:2", "1:3"]
     * @param points
     * @return
     */
    public static int solution(String[] points) {
        int point = 0;
        for (String s : points) {
            String[] score = s.split(":");

            int p1 = Integer.parseInt(score[0]);
            int p2 = Integer.parseInt(score[1]);

            if(p1 == p2) point += 1;
            else if (p1 > p2) point += 3;
        }
        return point;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"3:1", "2:2", "1:3", "3:1", "2:2", "1:3", "1:0", "2:3"}));

    }
}
