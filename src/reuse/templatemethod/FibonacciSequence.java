package reuse.templatemethod;

public class FibonacciSequence extends NumberSequence {

  public int positiveTerm(int i) {

    if (i < 2) {
      return 1;
    }
    return positiveTerm(i - 1) + positiveTerm(i - 2);
  }
}
