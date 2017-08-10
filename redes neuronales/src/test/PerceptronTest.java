package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import perceptronapp.*;

public class PerceptronTest {
	private Perceptron p;
	private Perceptron p2;
	private Perceptron p3;

	@Before
	public void setUp() {
		p = new AND();
		p2 = new OR();
		p3 = new NAND();
	}

	@Test
	public void testAND() {
		assertTrue(p.output(1, 1) == 1);
		assertTrue(p.output(1, 0) == 0);
		assertTrue(p.output(0, 1) == 0);
		assertTrue(p.output(0, 0) == 0);

	}

	@Test
	public void testOR() {
		assertTrue(p2.output(1, 0) == 1);
		assertTrue(p2.output(0, 0) == 0);
		assertTrue(p2.output(0, 1) == 1);
		assertTrue(p2.output(1, 1) == 1);

	}

	@Test
	public void testNAND() {
		assertTrue(p3.output(1, 0) == 1);
		assertTrue(p3.output(0, 0) == 1);
		assertTrue(p3.output(0, 1) == 1);
		assertTrue(p3.output(1, 1) == 0);

	}

}
