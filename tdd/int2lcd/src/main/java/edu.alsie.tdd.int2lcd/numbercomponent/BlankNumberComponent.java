package edu.alsie.tdd.int2lcd.numbercomponent;

import edu.alsie.tdd.int2lcd.Utils;

/**
 * Description.
 *
 * @author David
 * @since 15/06/2018
 */
public class BlankNumberComponent implements NumberComponent {
  private int width;

  public BlankNumberComponent() {
    this.width = 1;
  }

  public BlankNumberComponent(int width) {
    this.width = width;
  }

  @Override
  public String get() {
    return String.format(" %s ", Utils.stringRepeat(" ", width));
  }
}
