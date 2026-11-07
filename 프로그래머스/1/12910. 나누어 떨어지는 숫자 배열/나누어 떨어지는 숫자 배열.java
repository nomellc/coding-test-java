import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        TreeSet<Integer> set = new TreeSet<>();
        for (int a : arr) {
            if(a % divisor == 0) {
                set.add(a);
            }
        }
        if (set.size() == 0) {
            answer = new int[1];
        } else {
            answer = new int[set.size()];
        }
        for (int i = 0; i < answer.length; i++) {
            if (set.size() == 0) {
                answer[i] = -1;
                break;
            }
            answer[i] = set.pollFirst();
        }
        return answer;
    }
}