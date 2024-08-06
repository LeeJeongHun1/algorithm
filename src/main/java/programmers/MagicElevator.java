package programmers;

public class MagicElevator {

    public static void main(String[] args) {
//        int solution1 = solution(16);
//        int solution2 = solution(2554);
//        int solution3 = solution(678);
//        int solution4 = solution(999);
//        int solution5 = solution(155);
        int solution6 = solution(154);
        int solution7 = solution(485);

//        System.out.println(solution1 == 6);
//        System.out.println(solution2 == 16);
//        System.out.println(solution3 == 8);
//        System.out.println(solution4 == 2);
//        System.out.println(solution5 == 11);
        System.out.println(solution6 == 10);
        System.out.println(solution7 == 11);
    }


    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/148653
     *
     * @param storey
     * @return
     */
    public static int solution(int storey) {
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
