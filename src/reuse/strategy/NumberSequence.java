package reuse.strategy;

import java.util.Iterator;

public class NumberSequence implements Sequence, Iterable<Integer>{
    private Sequence sequence;

    public int term (int i) {
        return this.sequence.term(i);
    }

    public NumberSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    public Iterator<Integer> iterator() {
        return new SequenceIterator();
    }

    private class SequenceIterator implements Iterator<Integer> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return term(index++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not implemented");
        }
    }
}
