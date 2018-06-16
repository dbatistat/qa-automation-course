package edu.alsie.tdd.int2lcd;

import edu.alsie.tdd.int2lcd.exceptions.NumberComponentNotFounException;
import edu.alsie.tdd.int2lcd.numbercomponent.BlankNumberComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.BothCenterLineComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.CenterLineComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.LeftBottomLineComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.NumberComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.RightBottomLineComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.RightLineComponent;
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
      case 3 : return getThree();
      case 4 : return getFour();
      case 5 : return getFive();
      case 6 : return getSix();
      case 7 : return getSeven();
      case 8 : return getEight();
      case 9 : return getNine();
      default : throw new NumberComponentNotFounException();
    }
  }

  private List<NumberComponent> getOne() {
    return Arrays.asList(new BlankNumberComponent(), new RightLineComponent(),
        new RightLineComponent());
  }

  private List<NumberComponent> getTwo() {
    return Arrays.asList(new CenterLineComponent(), new RightBottomLineComponent(),
        new LeftBottomLineComponent());
  }

  private List<NumberComponent> getThree() {
    return Arrays.asList(new CenterLineComponent(), new RightBottomLineComponent(),
        new RightBottomLineComponent());
  }

  private List<NumberComponent> getFour() {
    return Arrays.asList(new BlankNumberComponent(), new BothCenterLineComponent(),
        new RightLineComponent());
  }

  private List<NumberComponent> getFive() {
    return Arrays.asList(new CenterLineComponent(), new LeftBottomLineComponent(),
        new RightBottomLineComponent());
  }

  private List<NumberComponent> getSix() {
    return Arrays.asList(new CenterLineComponent(), new LeftBottomLineComponent(),
        new BothCenterLineComponent());
  }

  private List<NumberComponent> getSeven() {
    return Arrays.asList(new CenterLineComponent(), new RightLineComponent(),
        new RightLineComponent());
  }

  private List<NumberComponent> getEight() {
    return Arrays.asList(new CenterLineComponent(), new BothCenterLineComponent(),
        new BothCenterLineComponent());
  }

  private List<NumberComponent> getNine() {
    return Arrays.asList(new CenterLineComponent(), new BothCenterLineComponent(),
        new RightBottomLineComponent());
  }
}
