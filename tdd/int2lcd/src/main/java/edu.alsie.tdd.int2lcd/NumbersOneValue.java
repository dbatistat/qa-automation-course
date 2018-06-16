package edu.alsie.tdd.int2lcd;

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
@Deprecated
public final class NumbersOneValue extends NumbersAbstract {

  protected List<NumberComponent> getOne() {
    return Arrays.asList(new BlankNumberComponent(), new RightLineComponent(),
        new RightLineComponent());
  }

  protected List<NumberComponent> getTwo() {
    return Arrays.asList(new CenterLineComponent(), new RightBottomLineComponent(),
        new LeftBottomLineComponent());
  }

  protected List<NumberComponent> getThree() {
    return Arrays.asList(new CenterLineComponent(), new RightBottomLineComponent(),
        new RightBottomLineComponent());
  }

  protected List<NumberComponent> getFour() {
    return Arrays.asList(new BlankNumberComponent(), new BothCenterLineComponent(),
        new RightLineComponent());
  }

  protected List<NumberComponent> getFive() {
    return Arrays.asList(new CenterLineComponent(), new LeftBottomLineComponent(),
        new RightBottomLineComponent());
  }

  protected List<NumberComponent> getSix() {
    return Arrays.asList(new CenterLineComponent(), new LeftBottomLineComponent(),
        new BothCenterLineComponent());
  }

  protected List<NumberComponent> getSeven() {
    return Arrays.asList(new CenterLineComponent(), new RightLineComponent(),
        new RightLineComponent());
  }

  protected List<NumberComponent> getEight() {
    return Arrays.asList(new CenterLineComponent(), new BothCenterLineComponent(),
        new BothCenterLineComponent());
  }

  protected List<NumberComponent> getNine() {
    return Arrays.asList(new CenterLineComponent(), new BothCenterLineComponent(),
        new RightBottomLineComponent());
  }
}
