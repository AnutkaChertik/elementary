package ru.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FitTest {

        @Test
        void whenMan180Then92_() {
            short in = 180;
            double expected = 92;
            double out = Fit.manWeight(in);
            assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }

        @Test
        void whenWoman170Then69_() {
            short in = 170;
            double expected = 69;
            double out = Fit.womanWeight(in);
            assertThat(out).isEqualTo(expected, withPrecision(0.01));
        }
    }
