import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chArr = my_string.toCharArray();
        for(int i = 0; i < chArr.length; i++) {
            answer += chArr[chArr.length - 1 - i];
        }
        return answer;
    }
}