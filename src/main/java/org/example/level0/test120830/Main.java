package org.example.level0.test120830;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(6, 4));
    }
}
class Solution {
    public int solution(int n, int k) {
        int sale1 = n/10;
        int sale2 = k/10;
        return (n*12000 + k*2000) - (2000*sale1 + 2000*sale2);
    }
}