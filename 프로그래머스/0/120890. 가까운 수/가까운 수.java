import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        
        int dis = Integer.MAX_VALUE;
        for (int a : array) {
            if (Math.abs(a - n) < dis) {
                answer = a;
                dis = Math.abs(a - n);
            }
        }
        
        return answer;
    }
}