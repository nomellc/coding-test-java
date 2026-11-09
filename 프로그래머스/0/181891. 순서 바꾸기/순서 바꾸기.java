import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int cnt = n;
        for (int i = 0; n < answer.length; i++) {
            answer[i] = num_list[n];
            n++;
        }
        for (int j = answer.length - cnt, k = 0; j < answer.length; j++) {
            answer[j] = num_list[k];
            k++;
        }
        
        return answer;
    }
}