package org.example.level0.test120814;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution1().solution(7));
    }
}

class Solution {
    public int solution(int n) {
        return (n%7 == 0) ? n/7 : n/7+1;
    }
}

class Solution1 {
    public int solution(int n) {
        return (n+6) / 7;
    }
}
