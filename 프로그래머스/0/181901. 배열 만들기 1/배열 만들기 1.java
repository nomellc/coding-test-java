class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int j = 1;
        while (true) {
            if (k * j > n) break;
            j++;
        }
        answer = new int[j - 1];
        for (int i = 0; i < j - 1; i++) {
            answer[i] = k * (i+1);
        }
        return answer;
    }
}