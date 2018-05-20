package core;

import static org.junit.Assert.*;
import org.junit.*;

public class ATest {
	
	@Test
	public void Test() {
		System.out.println("Expected String: Testing JUnit 4.12; Actual String: " + A.s);
		assertEquals("String not the same", "Testing JUnit 4.12", A.s);
	}
}