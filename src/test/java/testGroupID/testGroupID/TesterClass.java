package testGroupID.testGroupID;


import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
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
	
	@Test
	public void testByMock(){
		ClassToTest mockObj = mock(ClassToTest.class);
		String actual = "bla";
		String fakeAnswerExpected = "fake";
		when(mockObj.duplicate(actual)).thenReturn(fakeAnswerExpected);
		assertEquals(fakeAnswerExpected,mockObj.duplicate(actual));

	}
	
}
