package edu.alsie.tdd.int2lcd.numbercomponent;

import edu.alsie.tdd.int2lcd.Utils;

/**
 * Description.
 *
 * @author David
 * @since 14/06/2018
 */
public class BothLineComponent implements NumberComponent {
  private int width;

  public BothLineComponent() {
    this.width = 1;
  }

  public BothLineComponent(int width) {
    this.width = width;
  }

  @Override
  public String get() {
    return String.format("|%s|", Utils.stringRepeat(" ", width));
  }
}
