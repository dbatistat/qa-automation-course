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
      for (int number = 1; number <= 9; number++) {
        numbers.getNumber(number).forEach(n -> System.out.println(n.get()));
      }
    } catch (NumberComponentNotFounException e) {
      e.printStackTrace();
    }
  }
}
