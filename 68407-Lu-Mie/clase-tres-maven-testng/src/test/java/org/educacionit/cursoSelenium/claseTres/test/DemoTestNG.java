package org.educacionit.cursoSelenium.claseTres.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG {
  @Test
  public void testSumar() {
	  int a = 2;
	  int b = 3;
	  Assert.assertEquals(6, a+b);
  }
}
