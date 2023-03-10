package org.example.level0.test120841;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{2, 4}));
    }
}

class Solution {
    public int solution(int[] dot) {
        if(dot[0] > 0 && dot[1] > 0){
            return 1;
        }
        else if(dot[0] < 0 && dot[1] > 0){
            return 2;
        }
        else if(dot[0] < 0 && dot[1] < 0){
            return 3;
        }
        else {
            return 4;
        }
    }
}