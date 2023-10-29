package programmers;

public class JadenCase {

    public static void main(String[] args) {
        System.out.println(solution("      3people unFollowed me        "));
    }

    public static String solution(String s) {
        String answer = "";
        boolean flag = true;
        for(String str : s.toLowerCase().split("")){
            answer += flag ? str.toUpperCase() : str;
            flag = str.equals(" ");
        }
        return answer;
    }

}
