import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ingredient.length; i++) {
            sb.append(ingredient[i]);


            if (sb.length() > 3 && sb.substring(sb.length() - 4, sb.length()).equals("1231")) {
                answer++;
                sb.delete(sb.length() - 4, sb.length());
            }
        }
        
        return answer;
    }
}