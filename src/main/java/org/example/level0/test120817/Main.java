package org.example.level0.test120817;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new org.example.level0.test120817.Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}

class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        double answer = (double)sum / numbers.length;
        return answer;
    }
}

class Solution1 {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0); //null인 경우 0을 돌려줌
    }
}
