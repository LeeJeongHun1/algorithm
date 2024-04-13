package backjun;

import java.util.Scanner;

public class MinSugar {

    /**
     * https://www.acmicpc.net/problem/2839
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(solution());
    }

    private static int solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int smallBasket = 3;
        int largeBasket = 5;

        if (n == 4 || n == 7) return -1;
        if (n == 3) return 1;
        if (n == 5) return 1;
        if (n % largeBasket == 0) return n / largeBasket;

        int max = 0;
        max = n / largeBasket;
        int i = n % largeBasket;
        if (i == 1) return max + 1;
        if (i == 2) return max + 2;
        if (i == 3) return max + 1;
        return max + 2;
    }
}
