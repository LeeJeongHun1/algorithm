import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
  int[] answer = {};
        LocalDate toDay = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        Map<String, String> termMaps = new HashMap<>();

        for (String term : terms) {
            String[] s = term.split(" ");
            termMaps.put(s[0], s[1]);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] s = privacies[i].split(" ");
            LocalDate agreeDate = LocalDate.parse(s[0], DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            int expireMonth = Integer.parseInt(termMaps.get(s[1]));
            LocalDate expire = agreeDate.plusMonths(expireMonth);
            if (toDay.isAfter(expire) || toDay.equals(expire)) {
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}