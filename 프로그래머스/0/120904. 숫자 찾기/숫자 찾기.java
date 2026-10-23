class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);
        char[] chararr = str.toCharArray();
        for (int i = 0; i < chararr.length; i++) {
            if (k == chararr[i] - '0') {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}