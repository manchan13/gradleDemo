package com.example.buildgradledemo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SampleTest {
    @Test
    public void test() {
        Sample sample = new Sample();
        assertThat(sample.getMessage()).isEqualTo("Sample!");
    }

    @Test
    public void testERR() {
        Sample sample = new Sample();
        assertThat(sample.getMessage()).isNotEqualTo("Error!");
    }
}
