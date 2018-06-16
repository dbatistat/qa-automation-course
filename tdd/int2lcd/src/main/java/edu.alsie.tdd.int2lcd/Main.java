package edu.alsie.tdd.int2lcd;

import edu.alsie.tdd.int2lcd.exceptions.NumberComponentNotFounException;

/**
 * Description.
 *
 * @author David
 * @since 14/06/2018
 */
public class Main {
  public static void main(String[] args) {
    // Deprecated: NumbersAbstract numbersOneValue = new NumbersOneValue();
    NumbersAbstract numbersWithValues = new NumbersWithValues(3, 2);
    try {
      Int2Lcd int2Lcd = new Int2Lcd(numbersWithValues);
      int2Lcd.printIntToLcd(123456789);
    } catch (NumberComponentNotFounException e) {
      e.printStackTrace();
    }
  }
}
