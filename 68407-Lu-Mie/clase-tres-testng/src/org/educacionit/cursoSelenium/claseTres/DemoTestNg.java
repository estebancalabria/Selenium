package org.educacionit.cursoSelenium.claseTres;

import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.log4testng.Logger;

public class DemoTestNg {
	
  @Test
  public void testSuma() {
	  int a = 3;
	  int b = 5;
	  Assert.assertEquals(8, a + b);
  }
}
