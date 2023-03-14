package org.example.level0.test120826;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution1().solution("abcdef", "f"));
    }
}

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(letter)){
                continue;
            }
            answer += arr[i];
        }
        return answer;
    }
}

class Solution1{
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;
    }
}