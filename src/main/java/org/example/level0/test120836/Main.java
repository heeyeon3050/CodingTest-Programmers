package org.example.level0.test120836;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution( 20));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0)
                answer++;
        }
        return answer;
    }
}