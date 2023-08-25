package programmers;

import java.time.LocalTime;
import java.util.*;

public class ParkingFee {
    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
//        int[] fees = {180, 5000, 10, 1000};
//        String[] records = {"05:59 0000 IN", "05:59 1111 IN"};
        solution(fees, records);
    }

    /**
     * 주차 요금 계산
     * https://school.programmers.co.kr/learn/courses/30/lessons/92341
     * 어떤 차량이 입차된 후에 출차된 내역이 없다면, 23:59에 출차된 것으로 간주합니다.
     * 0000번 차량은 18:59에 입차된 이후, 출차된 내역이 없습니다. 따라서, 23:59에 출차된 것으로 간주합니다.
     * 00:00부터 23:59까지의 입/출차 내역을 바탕으로 차량별 누적 주차 시간을 계산하여 요금을 일괄로 정산합니다.
     * 누적 주차 시간이 기본 시간이하라면, 기본 요금을 청구합니다.
     * 누적 주차 시간이 기본 시간을 초과하면, 기본 요금에 더해서, 초과한 시간에 대해서 단위 시간 마다 단위 요금을 청구합니다.
     * 초과한 시간이 단위 시간으로 나누어 떨어지지 않으면, 올림합니다.
     * ⌈a⌉ : a보다 작지 않은 최소의 정수를 의미합니다. 즉, 올림을 의미합니다.
     *
     * @param fees    요금
     * @param records 입출차 기록
     * @return
     */
    public static int[] solution(int[] fees, String[] records) {
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
            ans.put(carNumber, min);
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
        return a.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int getMin(String outTime, String inTime) {
        StringTokenizer st = new StringTokenizer(outTime, ":");
        int o1 = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
        st = new StringTokenizer(inTime, ":");
        int o2 = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());

        return o2 - o1;
    }
}
