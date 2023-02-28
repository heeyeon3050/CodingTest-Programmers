package org.example.level0.test120824;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new org.example.level0.test120824.Solution1().solution(new int[]{1, 2, 3, 4, 5})));
    }
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] cnt = new int[2];

        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0)
                cnt[0]++;
        }
        cnt[1] = num_list.length - cnt[0];

        return cnt;
    }
}

class Solution1 {
    public int[] solution(int[] num_list) {
        int[] cnt = new int[2];

        for(int i=0; i<num_list.length; i++) {
            cnt[num_list[i] % 2]++;
        }

        return cnt;
    }
}