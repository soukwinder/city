package grouptest.artifacttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WagenparkbeheerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
//		Wagenparkbeheer w = new Wagenparkbeheer();
//		w.positions();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Wagenparkbeheer w = new Wagenparkbeheer();
		w.positions();
		assertEquals(23, w.UnitIds.size());
	}

}
