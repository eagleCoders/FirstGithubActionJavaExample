/**
 * 
 */
package github.actions.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author anees-ur-rehman
 *
 */
public class MainTest {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMultiply() {
		assertEquals(25, Main.multiply(5, 5));
	}

	@Test
	public void testHelloWorld() {
		Main.main(null);
	}
}
