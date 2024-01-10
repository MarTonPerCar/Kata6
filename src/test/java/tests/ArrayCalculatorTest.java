package tests;

import Kata6.ArrayCalculator;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayCalculatorTest {
    // Vamos a utilizar 102 como valor de error

    @Test
    public void should_be_50() {
        int[] Numeros = {10, 42, 31, -10, 50, 40, 26};
        ArrayCalculator ac = new ArrayCalculator();
        assertThat(ac.Take_out_the_largest(Numeros)).isEqualTo(50);
    }
    @Test
    public void should_be_negative() {
        int[] Numeros = {-10, -42, -31, -10, -50, -40, -26};
        ArrayCalculator ac = new ArrayCalculator();
        assertThat(ac.Take_out_the_largest(Numeros)).isEqualTo(-10);
    }
    @Test
    public void should_be_negative_102() {
        int[] Numeros = {};
        ArrayCalculator ac = new ArrayCalculator();
        assertThat(ac.Take_out_the_largest(Numeros)).isEqualTo(-102);
    }
    @Test
    public void should_be_5() {
        int[] Numeros = {5};
        ArrayCalculator ac = new ArrayCalculator();
        assertThat(ac.Take_out_the_largest(Numeros)).isEqualTo(5);
    }
    @Test
    public void should_be_4() {
        int[] Numeros = {4, 10, 60, 80 , 4, 90};
        ArrayCalculator ac = new ArrayCalculator();
        assertThat(ac.Take_out_the_minimum(Numeros)).isEqualTo(4);
    }
    @Test
    public void should_be_negative_102_2() {
        int[] Numeros = {};
        ArrayCalculator ac = new ArrayCalculator();
        assertThat(ac.Take_out_the_minimum(Numeros)).isEqualTo(-102);
    }
    @Test
    public void should_be_5_2() {
        int[] Numeros = {5};
        ArrayCalculator ac = new ArrayCalculator();
        assertThat(ac.Take_out_the_minimum(Numeros)).isEqualTo(5);
    }
    @Test
    public void should_be_the_middle_one() {
        int[] Numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        ArrayCalculator ac = new ArrayCalculator();
        assertThat(ac.Take_out_the_middle_one(Numeros)).isEqualTo(50);
    }
    @Test
    public void should_be_the_middle_one_2() {
        int[] Numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        ArrayCalculator ac = new ArrayCalculator();
        assertThat(ac.Take_out_the_middle_one(Numeros)).isEqualTo(110);
    }

    @Test
    public void should_be_negative_102_3() {
        int[] Numeros = {};
        ArrayCalculator ac = new ArrayCalculator();
        assertThat(ac.Take_out_the_middle_one(Numeros)).isEqualTo(-102);
    }
    @Test
    public void should_be_5_3() {
        int[] Numeros = {5};
        ArrayCalculator ac = new ArrayCalculator();
        assertThat(ac.Take_out_the_middle_one(Numeros)).isEqualTo(5);
    }
}
