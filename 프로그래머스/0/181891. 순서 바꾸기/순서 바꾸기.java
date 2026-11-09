import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int count = 0;
        for (int i = n; i < answer.length; i++) {
            answer[count++] = num_list[i];
        }
        for (int j = 0; j < n; j++) {
            answer[count++] = num_list[j];
        }
        
        return answer;
    }
}