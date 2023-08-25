package programmers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UnfinishedParticipation {
    public static void main(String[] args) {
        String[] part = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        solution(part, completion);
    }

    /**
     * 완주하지 못한 참자가 반환
     * @param participant 참가자 배열
     * @param completion 완주한 참가자 배열
     * @return
     */
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        boolean flag = false;
        for (String s : participant) {
            for (String s1 : completion) {
                if (s.equals(s1)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                answer = s;
                break;
            }
        }
        return answer;
    }
}
