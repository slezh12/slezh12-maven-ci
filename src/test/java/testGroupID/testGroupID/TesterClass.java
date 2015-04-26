package testGroupID.testGroupID;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TesterClass {

	@Test
	public void testMethod(){
		ClassToTest temp = new ClassToTest();
		String actual = "bla";
		String expected = "blabla";
		assertEquals(expected, temp.duplicate(actual));
	}
	
}
