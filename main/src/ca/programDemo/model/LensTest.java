package ca.programDemo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LensTest {

    @Test
    void getMake() {
        Lens lens = new Lens("Canon", 1.8, 50);
        assertEquals("Canon", lens.getMake());
    }

    @Test
    void getMaxAperture() {
        Lens lens = new Lens("Canon", 1.8, 50);
        assertEquals(1.8, lens.getMaxAperture(), 0.001);
    }

    @Test
    void getFocalLengthInMM() {
        Lens lens = new Lens("Canon", 1.8, 50);
        assertEquals(50, lens.getFocalLengthInMM(), 0.01);
    }

    @Test
    void testToString() {
        Lens lens = new Lens("Canon", 1.8, 50);
        assertEquals("Canon  50mm  F1.8", lens.toString());
    }
}