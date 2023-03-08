package org.example.level0.test120837;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(23));
    }
}

class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] arr = {5, 3, 1};
        for(int i=0; i<3; i++){
            answer += hp / arr[i];
            hp %= arr[i];
        }
        return answer;
    }
}

class Solution1 {
    public int solution(int hp) {
        int answer = 0;

        answer = (hp/5) + ((hp%5) / 3) + ((hp%5) % 3);

        return answer;
    }
}