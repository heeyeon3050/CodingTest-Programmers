package org.example.level0.test120829;

public class Main {
}

class Solution {
    public int solution(int angle) {
        if(angle == 180) return 4;
        if(angle == 90) return 2;
        else if(angle > 90) return 3;
        return 1;
    }
}
