package ic.doc.templatemethod;

import java.util.Iterator;

public abstract class Sequence {

    public abstract int term(int i);

    public Iterator<Integer> iterator() {
        return new Sequence.SequenceIterator();
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
