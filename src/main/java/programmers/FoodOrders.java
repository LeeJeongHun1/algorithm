package programmers;

import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collectors;

public class FoodOrders {
    public static void main(String[] args) {
        String[] orders = {"alex pizza pasta", "alex pizza pizza", "alex noodle", "bob pasta", "bob noodle sandwich pasta", "bob steak noodle"};
        System.out.println(Arrays.toString(solution(orders)));
    }


    public static String[] solution(String[] orders) {
        HashMap<String, Set<String>> orderHis = new HashMap<>();
        for (String order : orders) {
            String[] history = order.split(" ");
            Set<String> menu = new HashSet<>();
            menu.addAll(Arrays.asList(history).subList(1, history.length));
            if (orderHis.containsKey(history[0])) {
                orderHis.get(history[0]).addAll(menu);
            } else {
                orderHis.put(history[0], menu);
            }
        }
        int maxSize = orderHis.values().stream()
                .mapToInt(Set::size)
                .max()
                .getAsInt();

        List<String> collect = orderHis.entrySet().stream()
                .filter(stringSetEntry -> stringSetEntry.getValue().size() == maxSize)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        return collect.toArray(String[]::new);
    }
}
