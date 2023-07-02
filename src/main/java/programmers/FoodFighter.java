package programmers;

public class FoodFighter {

    /**
     * 음식 배열을 받아 두 선수가 동일한 음식과 양을 먹도록 배치하는 문자열 반환.
     * food[0]은 항상 물로 칭하고 물은 중간에 배치한다.
     * ex) {1, 7, 2, 6} => 111233303332111
     * @param food
     * @return
     */
    public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int cnt = food[i] / 2;
            String s = i + "";
            sb.append(s.repeat(cnt));
        }
        String answer = sb + "0";
        return answer + sb.reverse();
    }
}
