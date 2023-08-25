package programmers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Privacy {

    public static void main(String[] args) {
        String[] a = new String[]{"Z 3", "D 5"};
        String[] b = new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        int[] solution = solution("2020.01.01", a, b);
        System.out.println(Arrays.toString(solution));
    }


    /**
     * terms 에 기록된 약관 유효기관과 privacies 에 등록된 회원의 수집된 날짜를 확인하여
     * today 기준 파기해야 할 개인정보를 오름차순으 배열에 담아 반환한다.
     * @param today 2020.01.01
     * @param terms ["Z 3", "D 5"]
     * @param privacies ["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"]
     * @return
     */
    public static int[] solution(String today, String[] terms, String[] privacies) {
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
