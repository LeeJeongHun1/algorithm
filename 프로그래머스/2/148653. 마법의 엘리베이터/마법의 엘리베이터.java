class Solution {
    public int solution(int storey) {
        int sum = 0;
        while (storey > 0) {
            int num1 = storey % 10;
            storey /= 10;
            if (num1 > 5) {
                int sub = 10 - num1;
                storey++;
                sum += sub;
            } else if(num1 < 5) {
              sum += num1;
            } else if(storey % 10 >= 5) {
                sum += 5;
                storey++;
            }
            else {
                sum += num1;
            }
        }
        return sum;
    }
}