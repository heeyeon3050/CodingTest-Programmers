package org.example.level0.test120829;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestSolution {
    @Test
    @DisplayName("70도 => 1 ")
    void t1(){
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }

    @Test
    @DisplayName("91도 => 3")
    void t2(){
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }

    @Test
    @DisplayName("92도 => 3")
    void t3(){
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }

    @Test
    @DisplayName("180도 => 4")
    void t4(){
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }

    @Test
    @DisplayName("90도 => 2")
    void t5(){
        assertThat(new Solution().solution(90)).isEqualTo(2);
    }
}
