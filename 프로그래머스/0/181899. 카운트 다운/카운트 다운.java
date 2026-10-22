class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        int dis = start_num - end_num + 1;
        answer = new int[dis];
        for (int i = 0; i < dis; i++) {
            answer[i] = start_num--;
        }
        return answer;
    }
}