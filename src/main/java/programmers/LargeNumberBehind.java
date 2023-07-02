package programmers;

import java.util.Arrays;
import java.util.Stack;

public class LargeNumberBehind {

    public static void main(String[] args) {
        int[] arr = {9, 1, 5, 3, 6, 2};
        int[] solution = solution(arr);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }
        return answer;
    }
}
