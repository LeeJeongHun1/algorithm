import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(solution());
    }

public static int solution() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String arrString = sc.nextLine();
        int x = Integer.parseInt(sc.nextLine());
        int cnt = 0;

        String[] arr = arrString.split(" ");
        HashMap<Integer, Integer> map = new HashMap<>();

        for (String s : arr) {
            int element = Integer.parseInt(s);
            int findValue = 0;
            if (x > element) findValue = x - element;
            else findValue = element - x;


            Integer value = map.get(findValue);
            if (value != null && (value + element == x)) {
                cnt++;
            }


            map.put(element, element);
        }

        return cnt;
    }
}