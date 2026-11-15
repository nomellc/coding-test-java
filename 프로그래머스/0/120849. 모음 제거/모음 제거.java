class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chArr = my_string.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == 'a' || chArr[i] == 'e' || chArr[i] == 'i' || chArr[i] == 'o' || chArr[i] == 'u') {
                continue;
            }
            answer += chArr[i];
        }
        return answer;
    }
}