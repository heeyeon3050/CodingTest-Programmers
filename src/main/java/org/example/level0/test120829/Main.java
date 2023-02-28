package org.example.level0.test120829;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(70));
    }
}

class Solution {
    public int solution(int angle) {
        if(angle < 90) return 1;
        else if(angle == 90) return 2;
        else if(angle < 180) return 3;
        else return 4;
    }
}
