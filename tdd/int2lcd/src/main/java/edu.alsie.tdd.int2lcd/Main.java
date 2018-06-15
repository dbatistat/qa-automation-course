package edu.alsie.tdd.int2lcd;

/**
 * Description.
 *
 * @author David
 * @since 14/06/2018
 */
public class Main {
  public static void main(String[] args) {
    Numbers numbers = new Numbers();

    try {
      Int2Lcd int2Lcd = new Int2Lcd(numbers);
      int2Lcd.printIntToLcd(123456789);
    } catch (NumberComponentNotFounException e) {
      e.printStackTrace();
    }
  }
}
