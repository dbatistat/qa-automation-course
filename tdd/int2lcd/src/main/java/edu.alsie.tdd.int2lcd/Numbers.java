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

  public List<NumberComponent> getNumber(int number) throws NumberComponentNotFounException {
    switch (number) {
      case 1 : return getOne();
      case 2 : return getTwo();
      default : throw new NumberComponentNotFounException();
    }
  }

  private List<NumberComponent> getOne() {
    return Arrays.asList(new RightLineComponent(), new RightLineComponent());
  }

  private List<NumberComponent> getTwo() {
    return Arrays.asList(new CenterLineComponent(), new RightLineComponent(), new LeftBottomLineComponent());
  }
}
