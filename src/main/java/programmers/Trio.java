package programmers;

public class Trio {

    public static void main(String[] args) {
//        int[] nums = {-2, 3, 0, 2, -5};
        int[] nums = {-3, -2, -1, 0, 1, 2, 3};
        int solution = solution(nums);
        System.out.println(solution);
    }


    public static int solution(int[] number) {
        int answer = 0;
        for (int i=0; i<number.length-2; i++) {
            for (int j=i+1; j<number.length-1; j++) {
                for (int k=j+1; k<number.length; k++){
                    if (0 == number[i] + number[j] + number[k]) answer++;
                }
            }
        }
        return answer;
    }
}
