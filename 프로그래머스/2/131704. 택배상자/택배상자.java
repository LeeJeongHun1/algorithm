import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int s = 0;
        Stack<Integer> container = new Stack<>();
        int[] p = new int[order.length];
        for(int i = 0; i < order.length; i++){
            p[order[i] - 1] = i;
        }
        for (int i = 0; i < p.length; i++) {
            if (p[i] == s) {
                s++;
            }else{
                container.push(p[i]);
            }
            while (!container.isEmpty() && container.peek() == s) {
                container.pop();
                s++;
            }


        }
        return s;
    }
}