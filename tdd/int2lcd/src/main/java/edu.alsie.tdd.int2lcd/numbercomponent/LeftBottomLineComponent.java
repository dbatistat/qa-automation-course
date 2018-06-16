package edu.alsie.tdd.int2lcd.numbercomponent;

import edu.alsie.tdd.int2lcd.numbercomponent.NumberComponent;

/**
 * Description.
 *
 * @author David
 * @since 14/06/2018
 */
public class LeftBottomLineComponent implements NumberComponent {
  @Override
  public String get() {
    return "|_ ";
  }
}
