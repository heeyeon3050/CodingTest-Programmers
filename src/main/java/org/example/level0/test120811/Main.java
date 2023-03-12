package org.example.level0.test120811;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 2, 7, 10, 11}));
    }
}

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length/2];
        return answer;
    }
}