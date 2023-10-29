package programmers;

public class AutoLineBreaking {

    /**
     * 입력된 문장을 영문 기준으로 한줄에 최대 80글자를 출력하고 줄바꿈(\n) 하는 코드를 작성해주세요.
     * 한글은 영문 2글자로 인식합니다.
     *
     * @param str
     * @return
     */
    public static String solution(String str) {
        int maxLen = 80;
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            int type = Character.getType(str.charAt(i));
            // 한글, 영어 크기 구분
            if (Character.getType(str.charAt(i)) == Character.OTHER_LETTER) {
                cnt += 2;
            } else {
                cnt += 1;
            }
//            cnt
        }
        int len = str.length();
        if (len <= maxLen) return str;
        char c = str.charAt(maxLen);
        String substring = str.substring(0, maxLen);
        return "";
    }

    public static void main(String[] args) {
//        System.out.println(solution("이 글은 도커에 대해 1도 모르는 시스템 관리자나 서버 개발자를 대상으로 도커 전반에 대해 얕고 넓은 지식을 담고 있습니다. 도커가 등장한 배경과 도커의 역사, 그리고 도커의 핵심 개념인 컨테이너와 이미지에 대해 알아보고 실제로 도커를 설치하고 컨테이너를 실행해 보도록 하겠습니다."));
        System.out.println(solution(" 이ㅁaA"));
//        System.out.println(solution("이 글은"));
    }
}
