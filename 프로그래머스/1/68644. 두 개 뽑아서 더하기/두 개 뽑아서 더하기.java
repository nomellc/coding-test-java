import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (i != j) {
                    int sum = numbers[i] + numbers[j];
                    set.add(sum);
                }
            }
        }
        
        for (int setNum : set) {
            list.add(setNum);
        }
        Collections.sort(list);
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}