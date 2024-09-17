import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Set<String>> reportMap = new HashMap<>();
        for (String rep : report) {
            String[] repArr = rep.split(" ");
            Set<String> arr = reportMap.getOrDefault(repArr[1], null);
            if (arr == null) {
                arr = new HashSet<>();
            }
            arr.add(repArr[0]);
            reportMap.put(repArr[1], arr);
        }

        HashMap<String, Integer> reportedMap = new HashMap<>();
        for (Set<String> value : reportMap.values()) {
            if (value.size() >= k) {
                for (String s : value) {
                    reportedMap.put(s, reportedMap.getOrDefault(s, 0) +1);
                }
            }
        }
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reportedMap.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}