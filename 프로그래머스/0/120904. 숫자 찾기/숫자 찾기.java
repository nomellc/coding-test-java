class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String numStr = Integer.toString(num);
        String kStr = Integer.toString(k);
        
        answer = numStr.indexOf(kStr);
        
        answer = answer < 0 ? -1 : answer + 1;
        
        return answer;
    }
}