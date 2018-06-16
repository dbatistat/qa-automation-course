package edu.alsie.tdd.int2lcd;

import edu.alsie.tdd.int2lcd.exceptions.NumberComponentNotFounException;
import edu.alsie.tdd.int2lcd.numbercomponent.NumberComponent;
import java.util.List;

/**
 * Description.
 *
 * @author David
 * @since 15/06/2018
 */
public abstract class NumbersAbstract {
  protected int witdh = 1;
  protected int height = 1;

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

  protected abstract List<NumberComponent> getOne();
  protected abstract List<NumberComponent> getTwo();
  protected abstract List<NumberComponent> getThree();
  protected abstract List<NumberComponent> getFour();
  protected abstract List<NumberComponent> getFive();
  protected abstract List<NumberComponent> getSix();
  protected abstract List<NumberComponent> getSeven();
  protected abstract List<NumberComponent> getEight();
  protected abstract List<NumberComponent> getNine();

}
