class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        int len = 0;
        if (names.length % 5 == 0) {
            len  = names.length / 5;
        } else {
            len  = names.length / 5 + 1;
        }
        answer = new String[len];
        for (int i = 0, j = 0; i < len; i++) {
            answer[i] = names[j];
            j += 5;
        }
        return answer;
    }
}