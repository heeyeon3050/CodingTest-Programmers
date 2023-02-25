package org.example.level0.test120806;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 2));
    }
}

class Solution {
    public int solution(int num1, int num2) {
        double num = (double)num1/num2;
        double result = num * 1000;
        return (int)result;
    }
}