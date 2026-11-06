class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int[] copy = new int[numlist.length];
        int i = 0;
        for (int num : numlist) {
            if (num % n == 0) {
                copy[i] = num;
                i++;
            }
        }
        answer = new int[i];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = copy[j];
        }
        return answer;
    }
}