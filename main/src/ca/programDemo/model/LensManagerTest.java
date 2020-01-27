package ca.programDemo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LensManagerTest {

    @Test
    void add() {
        LensManager manager = new LensManager();
        Lens lens = new Lens("Canon", 1.8, 50);
        manager.add(lens);
        assertEquals(lens, manager.iterator().next());
    }

    @Test
    void getManagerSize() {
        LensManager manager = new LensManager();
        Lens lens = new Lens("Canon", 1.8, 50);
        manager.add(lens);
        assertEquals(1, manager.getManagerSize());
    }
}