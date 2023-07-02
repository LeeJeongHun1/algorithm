package programmers;

public class Coke {
    public static void main(String[] args) {
        int solution = solution(3, 1, 20);
        System.out.println(solution);
    }

    public static int solution(int emp, int back, int keep) {
        int answer = 0;
        while (keep >= emp) {
            answer += keep / emp * back;
            keep = (keep / emp * back) + keep % emp;

        }
        return answer;
    }
}
