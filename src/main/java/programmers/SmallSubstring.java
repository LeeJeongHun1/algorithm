package programmers;

public class SmallSubstring {
    public static void main(String[] args) {
        int solution = solution("10203", "15");
        System.out.println(solution);
    }

    public static int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        long num = Long.parseLong(p);

        for (int i = 0; i < t.length() - pLen + 1; i++) {
            long diff = Long.parseLong(t.substring(i, i + pLen));
            if (diff <= num) {
                answer++;
            }
        }
        return answer;
    }
}

