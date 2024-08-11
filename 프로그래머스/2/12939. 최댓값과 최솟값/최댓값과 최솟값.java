class Solution {
    public String solution(String s) {
        String answer = "";
                String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String value : arr) {
            min = Math.min(Integer.parseInt(value), min);
            max = Math.max(Integer.parseInt(value), max);
        }
        answer = min + " " + max;
        return answer;
    }
}