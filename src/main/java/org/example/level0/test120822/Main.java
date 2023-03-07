package org.example.level0.test120822;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution1().solution("jaron"));
    }
}

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=my_string.length()-1; i>=0; i--)
            answer += my_string.charAt(i);
        return answer;
    }
}

class Solution1 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();
        return sb.toString();
    }
}
