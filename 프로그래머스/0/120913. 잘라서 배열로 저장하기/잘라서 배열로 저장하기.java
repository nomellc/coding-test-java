class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int len = 0;
        if (my_str.length() % n == 0) {
            len = my_str.length() / n;
        } else {
            len = my_str.length() / n + 1;
        }
        answer = new String[len];
        for (int i = 0, j = 0; i < len; i++) {
            if (j + n > my_str.length()) {
                answer[i] = my_str.substring(j, my_str.length());
                break;
            }
            answer[i] = my_str.substring(j, j + n);
            j = j + n;
        }
        return answer;
    }
}