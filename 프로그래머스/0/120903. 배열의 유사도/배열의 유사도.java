class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String s : s2) {
            for (String st : s1) {
                if (st.equals(s)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}