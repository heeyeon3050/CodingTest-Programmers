package org.example.level0.test120816;

public class Main {
    public static void main(String[] args) {
        System.out.println(new org.example.level0.test120816.Solution1().solution(7, 10));
    }
}

class Solution {
    public int solution(int slice, int n) {
        int num = slice;
        int result = 1;

        while(num < n){
            num += slice;
            result++;
        }

        return result;
    }
}

class Solution1 {
    public int solution(int slice, int n) {
        return n % slice > 0 ? n / slice + 1 : n / slice;
    }
}