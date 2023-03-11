package org.example.level0.test120809;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1, 2, 3, 4, 5})));
    }
}

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
