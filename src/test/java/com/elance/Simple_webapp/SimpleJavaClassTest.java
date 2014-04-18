package com.elance.Simple_webapp;

/**
 *
 */

import org.junit.Assert;
import org.junit.Test;

import com.elance.Simple_webapp.SimpleJavaClass;

/**
 * @author Manoj
 * 
 */
public class SimpleJavaClassTest {
	SimpleJavaClass sjc = new SimpleJavaClass();

	/**
	 * Test method for
	 * {@link com.elance.Simple_webapp.SimpleJavaClass#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		Assert.assertEquals(sjc.add(1, 3), 4);
	}

	/**
	 * Test method for
	 * {@link com.elance.Simple_webapp.SimpleJavaClass#subtract(int, int)}.
	 */
	@Test
	public void testSubtract() {
		Assert.assertEquals(sjc.subtract(16, 10), 6);
	}

}
