class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = 1;
        
        if (n == 1) {
            a = 0;
        } else if (n == 2) {
            b = num_list.length - 1;
        } else if (n == 4) {
            c = slicer[2];
        }
        
        int len = (int)(b - a) / c;
        answer = new int[len + 1];
        
        for (int i = a, j = 0; i < b + 1; i += c) {
            answer[j++] = num_list[i];
        }
        
        return answer;
    }
}