package edu.alsie.tdd.int2lcd.numbercomponent;

import edu.alsie.tdd.int2lcd.Utils;

/**
 * Description.
 *
 * @author David
 * @since 14/06/2018
 */
public class CenterLineComponent implements NumberComponent {

  private int width;

  public CenterLineComponent() {
    this.width = 1;
  }

  public CenterLineComponent(int width) {
    this.width = width;
  }

  @Override
  public String get() {
    return String.format(" %s ", Utils.stringRepeat("_", width));
  }

  private String getLine() {
    return Utils.stringRepeat("_", width);
  }
}
