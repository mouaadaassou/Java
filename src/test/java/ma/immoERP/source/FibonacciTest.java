package ma.immoERP.source;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class FibonacciTest {

	private Fibonacci f;
	private int value;
	private int expected;
	
	public FibonacciTest(int value, int expected) {
		this.value = value;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][]{{10, 55}, {15, 610}, {17, 1597}, {23, 28657}});
	}
	
	@Before
	public void setUp() throws Exception {
		f = new Fibonacci(5);
	}

	@After
	public void tearDown() throws Exception {
		f = null;
	}

	@Test
	public void test() {
		assertEquals("the result must be ", f.fibonacci(value), expected);
	}

}
