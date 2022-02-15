package ic.doc.strategy;

import java.util.Iterator;

public class Sequence implements Iterable<Integer>{

    public SequenceInterface sequence;

    public Sequence(SequenceInterface sequence) {
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
            return sequence.term(index++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not implemented");
        }
    }
}
