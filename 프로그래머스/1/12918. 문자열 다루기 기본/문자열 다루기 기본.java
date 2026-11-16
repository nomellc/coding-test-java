class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() != 4 && s.length() != 6 || !s.chars().allMatch(Character::isDigit)) {
            answer = false;
        };
        
        return answer;
    }
}