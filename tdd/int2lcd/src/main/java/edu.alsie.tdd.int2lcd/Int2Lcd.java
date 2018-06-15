package edu.alsie.tdd.int2lcd;

import java.util.ArrayList;
import java.util.List;

/**
 * Description.
 *
 * @author David
 * @since 14/06/2018
 */
public class Int2Lcd {

  private final Numbers numbers;

  public Int2Lcd(Numbers numbers) {
    this.numbers = numbers;
  }

  public void printIntToLcd(int number) throws NumberComponentNotFounException {
    number = Math.abs(number);
    this.transpose(this.getComponents(number)).forEach(c -> {
      c.forEach(ca -> System.out.print(ca.get()));
      System.out.println();
    });
  }

  private List<Integer> getDigits(int number) {
    number = Math.abs(number);
    String stringNumber = Integer.toString(number);
    List<Integer> digits = new ArrayList<>(0);
    for(char c : stringNumber.toCharArray()) {
      digits.add(Integer.parseInt(String.valueOf(c)));
    }
    return digits;
  }

  private List<List<NumberComponent>> getComponents(int number) throws NumberComponentNotFounException {
    List<List<NumberComponent>> components = new ArrayList<>(0);
    for (int digit : getDigits(number)) {
      components.add(numbers.getNumber(digit));
    }
    return components;
  }

  private List<List<NumberComponent>> transpose (List<List<NumberComponent>> components) {
    List<List<NumberComponent>> componentsAux = new ArrayList<>(0);
    int max = components.stream().mapToInt(List::size).max().orElse(0);
    for (int i = 0; i < max; i++) {
      List<NumberComponent> col = new ArrayList<>(0);
      for (List<NumberComponent> row : components) {
        col.add(row.get(i));
      }
      componentsAux.add(col);
    }
    return componentsAux;
  }
}
