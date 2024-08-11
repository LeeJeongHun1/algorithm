import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i], i);
		}
		for (String number : phone_book) {
			for (int i = 0; i < number.length(); i++) {
				if(map.containsKey(number.substring(0, i))) {
					return false;
				}
			}
		}
        return answer;
    }
}