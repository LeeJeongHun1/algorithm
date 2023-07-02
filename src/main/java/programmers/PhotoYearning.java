package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class PhotoYearning {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> val = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            val.put(name[i], yearning[i]);
        }
        int i = 0;
        List<String> collect = Arrays.stream(name).collect(Collectors.toList());
        for (String[] p : photo) {
            for (String s : p) {
                if (collect.contains(s)) {
                    answer[i] += val.get(s).intValue();
                }
//                Arrays.stream(name).filter(s1 -> s.equals(s1) ? val.get(s1).intValue() : false);
            }
            i++;
        }
        return answer;
    }
}
