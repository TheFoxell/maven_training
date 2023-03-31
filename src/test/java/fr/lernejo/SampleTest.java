package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @org.junit.jupiter.api.Test
    void op() {
        Sample sample = new Sample();
        assertEquals(3, sample.op(Sample.Operation.ADD, 1, 2));
        assertEquals(6, sample.op(Sample.Operation.MULT, 2, 3));
        assertEquals(1, sample.op(Sample.Operation.ADD, -1, 2));
        assertEquals(-6, sample.op(Sample.Operation.ADD, -8, 2));
        assertEquals(-6, sample.op(Sample.Operation.MULT, -2, 3));
    }

    @org.junit.jupiter.api.Test
    void fact() {
        Sample sample = new Sample();
        assertEquals(1, sample.fact(0));
        assertEquals(1, sample.fact(1));
        assertEquals(2, sample.fact(2));
        assertEquals(6, sample.fact(3));
        assertEquals(24, sample.fact(4));
        assertEquals(120, sample.fact(5));
    }
}
