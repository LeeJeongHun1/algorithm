package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CardManager {

    public static void main(String[] args) throws IOException {
        System.out.println(solution());
    }


    public static int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int transactionCount = 0;
        int amount = 0;
        List<Integer> wait = new ArrayList<>();
        while (true) {
            String line = br.readLine();
            if (transactionCount == 0) {
                transactionCount = Integer.parseInt(line.split(" ")[1]);
                amount = Integer.parseInt(line.split(" ")[0]);
                continue;
            }
            String type = line.split(" ")[0];
            int price = Integer.parseInt(line.split(" ")[1]);
            switch (type) {
                case "deposit":
                    amount += price;
                    break;
                case "pay":
                    amount -= (amount > price ? price : 0);
                    break;
                case "reservation":
                    wait.add(price);
                    for (Integer reservationPrice : wait) {
                        amount -= (amount > reservationPrice ? reservationPrice : 0);
                    }
                    break;
            }
            transactionCount--;
            if (transactionCount == 0) break;
        }
        return amount;
    }
}
