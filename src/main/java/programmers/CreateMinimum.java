package programmers;

public class CreateMinimum {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2}, new int[]{3, 4}));

    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            if(i == a.length-1) answer += a[i] * b[1];
            else answer += a[i] * b[i+1];

        }


        return answer;
    }
}
