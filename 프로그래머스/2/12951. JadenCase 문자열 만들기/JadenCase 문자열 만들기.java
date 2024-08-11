class Solution {
    public String solution(String s) {
        String answer = "";
        boolean flag = true;
        for(String str : s.toLowerCase().split("")){
            answer += flag ? str.toUpperCase() : str;
            flag = str.equals(" ");
        }
        return answer;
    }
}