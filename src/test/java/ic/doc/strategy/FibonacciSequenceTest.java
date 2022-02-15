package ic.doc.strategy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class FibonacciSequenceTest {

  final FibonacciSequence fibonacciSequence = new FibonacciSequence();
  final Sequence sequence = new Sequence(fibonacciSequence);

  @Test
  public void definesFirstTwoTermsToBeOne() {
    assertThat(sequence.sequence.term(1), is(1));
  }

  @Test
  public void definesSubsequentTermsToBeTheSumOfThePreviousTwo() {

    assertThat(sequence.sequence.term(2), is(2));
    assertThat(sequence.sequence.term(3), is(3));
    assertThat(sequence.sequence.term(4), is(5));
  }

}