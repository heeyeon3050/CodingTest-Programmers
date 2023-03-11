package org.example.level0.test120583;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
    }
}

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int a : array){
            if(a == n)
                answer++;
        }
        return answer;
    }
}