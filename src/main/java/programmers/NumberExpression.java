package programmers;

public class NumberExpression {
    public static void main(String[] args) {
        System.out.println(solution(15));

    }

    public static int solution(int n) {
        int sum = 0;
        for (int i = 1; i < n / 2 + 1; i++) {
            do {
                sum += i;
            } while (sum != n);
        }
        return 0;
    }
}
