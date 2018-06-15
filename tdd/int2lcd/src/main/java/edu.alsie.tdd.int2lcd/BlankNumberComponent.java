package edu.alsie.tdd.int2lcd;

/**
 * Description.
 *
 * @author David
 * @since 15/06/2018
 */
public class BlankNumberComponent implements NumberComponent{
  @Override
  public String get() {
    return "   ";
  }
}
