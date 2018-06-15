package edu.alsie.tdd.int2lcd;

import java.util.Arrays;
import java.util.List;

/**
 * Description.
 *
 * @author David
 * @since 14/06/2018
 */
public class Numbers {

  public List<NumberComponent> getNumber(int number) {
    return getOne();
  }

  private List<NumberComponent> getOne() {
    return Arrays.asList(new RightLineComponent(), new RightLineComponent());
  }
}
