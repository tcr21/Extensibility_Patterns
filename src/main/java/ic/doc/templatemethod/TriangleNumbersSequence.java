package ic.doc.templatemethod;

public class TriangleNumbersSequence extends Sequence implements Iterable<Integer> {

    public int term(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Not defined for indices < 0");
        }
        return ((i+1)*(i+2))/2;
    }


}
