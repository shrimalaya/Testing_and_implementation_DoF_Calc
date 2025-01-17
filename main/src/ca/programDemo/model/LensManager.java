package ca.programDemo.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Lens Manager class
 *
 * Implements an iterable ist of Lens objects
 *
 * Allows adding of objects
 *
 */
public class LensManager implements Iterable<Lens> {
    private List<Lens> lenses = new ArrayList<>();

    public void add (Lens lens) {lenses.add(lens);}

    @Override
    public Iterator<Lens> iterator() {
        return lenses.iterator();
    }

    public int getManagerSize() {
        int count = 0;
        for(Lens lens: lenses)
            count++;

        return count;
    }
}
