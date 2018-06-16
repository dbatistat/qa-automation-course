package edu.alsie.tdd.int2lcd;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Description.
 *
 * @author David
 * @since 15/06/2018
 */
public interface Utils {
  static String stringRepeat(String value, int n) {
    return IntStream.range(0, n).mapToObj(i -> value).collect(Collectors.joining(""));
  }
}
