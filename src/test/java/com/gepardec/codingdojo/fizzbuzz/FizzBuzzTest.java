package com.gepardec.codingdojo.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    FizzBuzz testedObject;

    @BeforeEach
    void setUp() {
        testedObject = new FizzBuzz();
    }

    @Test
    void className_isNotNull() {
        assertThat(testedObject).isNotNull();
    }

    @Test
    void firstNumberIs1() {
        assertThat(testedObject.toFizzBuzz(1)).isEqualTo("1");
    }

    @Test
    void secondNumberIs2() {
        assertThat(testedObject.toFizzBuzz(2)).isEqualTo("2");
    }

    @Test
    void thirdNumberIsFizz() {
        assertThat(testedObject.toFizzBuzz(3))
                .isNotEqualTo("3")
                .isEqualTo("Fizz");
    }

    @Test
    void fourthNumberIs4() {
        assertThat(testedObject.toFizzBuzz(4)).isEqualTo("4");
    }

    @Test
    void fifthNumberIs() {
        assertThat(testedObject.toFizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    void sixthNumberIsFizz() {
        assertThat(testedObject.toFizzBuzz(6)).isEqualTo("Fizz");
    }

    @Test
    void seventhNumberIsSeven() {
        assertThat(testedObject.toFizzBuzz(7)).isEqualTo("7");
    }

    @Test
    void tenthNumberIsBuzz() {
        assertThat(testedObject.toFizzBuzz(10)).isEqualTo("Buzz");
    }
    @Test
    void number13IsFizz() {
        assertThat(testedObject.toFizzBuzz(13)).isEqualTo("Fizz");
    }

    @Test
    void fifteenthNumberIsFizzBuzz() {
        assertThat(testedObject.toFizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void number23IsFizz() {
        assertThat(testedObject.toFizzBuzz(23)).isEqualTo("Fizz");
    }

    @Test
    void number52IsBuzz() {
        // assertIsBuzz(52);
        assertThat(testedObject.toFizzBuzz(52)).isEqualTo("Buzz");
    }

    @Test
    void number51isFizzBuzz() {
        assertThat(testedObject.toFizzBuzz(51)).isEqualTo("FizzBuzz");
    }

    @Test
    void thirtiethNumberIsFizzBuzz() {
        assertThat(testedObject.toFizzBuzz(30)).isEqualTo("FizzBuzz");
    }

    @Test
    void listOf1() {
        assertThat(testedObject.listTo(1)).containsExactly("1");
    }

    @Test
    void listOf2() {
        assertThat(testedObject.listTo(2)).containsExactly("1", "2");
    }

    @Test
    void listOf3() {
        assertThat(testedObject.listTo(3)).containsExactly("1", "2", "Fizz");
    }

}
