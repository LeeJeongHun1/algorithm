package programmers;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class BinaryString {

    public static int solution(int[] ids) {
        int a = 4567;
        int insertCnt = 0;
        StringBuilder s = new StringBuilder(Integer.toBinaryString(a));
        if (s.length() < 8) {
            insertCnt = 8 - s.length();
        } else if (s.length() > 8) {
            if (s.length() % 8 >= 4) {
                insertCnt = 8 - s.length() % 8;
            } else {

            }
        }
        for (int j = 0; j < insertCnt; j++) {
            s.insert(0, "0");
        }
        StringBuilder reverse = s.reverse();
        int i = Integer.parseInt(reverse.toString(), 2);
        return ids.length;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 0}));
    }
}
