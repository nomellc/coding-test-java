import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        int i = numbers[0] * numbers[1];
        int j = numbers[numbers.length - 2] * numbers[numbers.length - 1];
        
        answer = Math.max(i, j);
        
        return answer;
    }
}