package org.example.level0.test120833;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution1().solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
    }
}

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int num = 0;
        for(int i=num1; i<=num2; i++){
            answer[num++] = numbers[i];
        }
        return answer;
    }
}

class Solution1 {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2+1);
    }
}
