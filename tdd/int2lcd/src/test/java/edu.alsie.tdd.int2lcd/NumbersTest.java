package edu.alsie.tdd.int2lcd;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Description.
 *
 * @author David
 * @since 14/06/2018
 */
public class NumbersTest {

  @Test
  public void testGetNumberOne() {
    Numbers numbers = new Numbers();

    List<NumberComponent> oneComponents = numbers.getNumber(1);

    Assert.assertEquals(RightLineComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(1).getClass());
  }
}
