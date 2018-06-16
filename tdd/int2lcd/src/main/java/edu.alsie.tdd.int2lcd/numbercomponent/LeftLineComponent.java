package edu.alsie.tdd.int2lcd.numbercomponent;

import edu.alsie.tdd.int2lcd.Utils;

/**
 * Description.
 *
 * @author David
 * @since 14/06/2018
 */
public class LeftLineComponent implements NumberComponent {
  private int width;

  public LeftLineComponent() {
    this.width = 1;
  }

  public LeftLineComponent(int width) {
    this.width = width;
  }

  @Override
  public String get() {
    return String.format("|%s ", Utils.stringRepeat(" ", width));
  }
}
