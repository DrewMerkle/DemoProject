/**
 * 
 */
package edu.gmu.swe437.continuous_integration;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TestPatTest runs several JUnit tests against the TestPat class method pat
 * @author merkle
 *
 */
public class TestPatTest {

	private TestPat theTestPatObj = new TestPat();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		String mississippiString = new String("Mississippi");
		String sippiString = new String("sippi");
		String missString = new String("miss");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link edu.gmu.swe437.continuous_integration.TestPat#pat(char[], char[])}.
	 * 
	 * Check that scan for 'Apples' in 'Apples' returns 0 as expected
	 */
	@Test
	public void testPatApplesApples() {
		String applesString = new String("Apples");
		
		assertTrue( theTestPatObj.pat( applesString.toCharArray(), applesString.toCharArray() ) == 0 ); 
	}

	/**
	 * Test method for {@link edu.gmu.swe437.continuous_integration.TestPat#pat(char[], char[])}.
	 * 
	 * Check that scan for 'Apples' in 'Oranges' returns -1 as expected
	 */
	@Test
	public void testPatOrangesApples() {
		String orangesString = new String("Oranges");
		String applesString = new String("Apples");
		
		assertTrue( theTestPatObj.pat( orangesString.toCharArray(), applesString.toCharArray() ) == -1 ); 
	}

	/**
	 * Test method for {@link edu.gmu.swe437.continuous_integration.TestPat#pat(char[], char[])}.
	 * 
	 * Check that scan for 'miss' in "Mississippi' returns -1 as expected
	 */
	@Test
	public void testPatMississippi() {
		String MississippiString = new String("Mississippi");
		String missString = new String("miss");
		
		assertTrue( theTestPatObj.pat( MississippiString.toCharArray(), missString.toCharArray() ) == -1 ); 
	}

}
