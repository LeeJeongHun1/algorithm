import java.time.LocalTime;
import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        HashMap<String, Integer> recordMap = new HashMap<>();
        Map<String, Integer> ans = new TreeMap<>(Comparator.comparingInt(Integer::parseInt));
        int exit = 23 * 60 + 59;

        for (String record : records) {
            String[] split = record.split(" ");
            String time = split[0];
            int i = Integer.parseInt(time.split(":")[0]) * 60 + Integer.parseInt(time.split(":")[1]);
            String carNumber = split[1];
            String state = split[2];

            if (state.equals("IN")) {
                recordMap.put(carNumber, i);
                continue;
            }
            int min = i - recordMap.get(carNumber);
            ans.put(carNumber, ans.getOrDefault(carNumber, 0) + min);
            recordMap.remove(carNumber);
        }

        // 출차 기록이 없는 차량은 23:59로 처리
        if (!recordMap.isEmpty()) {
            recordMap.forEach((s, s2) -> {
                int min = exit - recordMap.get(s);
                ans.put(s, ans.getOrDefault(s, 0) + min);

            });
        }


        List<Integer> a = new ArrayList<>();
        ans.forEach((s, integer) -> {
            if (integer > fees[0]) {
                double time = Math.ceil((integer - fees[0]) / (double) fees[2]);
                a.add((int)(time * fees[3] + fees[1]));
            } else {
                a.add(fees[1]);
            }

        });
        answer = a.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}