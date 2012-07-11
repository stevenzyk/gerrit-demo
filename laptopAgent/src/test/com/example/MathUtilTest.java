package com.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MathUtilTest extends TestCase {

	private MathUtil mathUtil;

	/**
	 *
	 * * For initializing the values.
	 *
	 * * Initialization of the variables can be done here.
	 *
	 * */

	protected void setUp() throws Exception {

	super.setUp();

	}

	/**
	 *
	 * * For cleaning the values.
	 *
	 * * Dereference/Uninitialization/freeing memory can be done here.
	 *
	 * */

	protected void tearDown() throws Exception {

	super.tearDown();

	}
	/**
	 *
	 * * Constructor for CalculationTest.
	 *
	 * * @param arg0
	 *
	 * */

	public MathUtilTest(String arg0) {

	super(arg0);

	mathUtil = new MathUtil();

	}

	// test case method name should start with test.
	//
	public final void testAdd() {

	assertEquals(mathUtil.add(20, 30), 50);

	}
	//
	// // test case method name should start with test.
	//
	public final void testSubtract() {

	 assertEquals(mathUtil.subtract(60, 30), 30);

	}
	//
	// // test case method name should start with test.
	//
	public final void testMultiply() {

	 assertEquals(mathUtil.multiply(100, 3), 300);

	}
	//
	// // test case method name should start with test.
	//
	public final void testDivide() {

	 assertEquals(mathUtil.divide(333, 3), 111);

	 try {

	 assertEquals(mathUtil.divide(100, 0), 20);

	 } catch (Exception e) {

	 // Exception is expected so asserting for true.

	 assertTrue(true);

	}
	//
	}
	//
	// Sample JUnit code to run in text mode (CLI – command line).
	//
	// Add this code to the CalculationTest.java to run in CLI.
	//
	public static void main(String[] args) {

		junit.textui.TestRunner.run(MathUtilTest.suite());

	 }

	 private static TestSuite suite() {

	 TestSuite suite = new TestSuite("Test for com.example.MathUtil.java");

	 //$JUnit-BEGIN$
	//
	 suite.addTestSuite(MathUtilTest.class);
	//
	// //$JUnit-END$
	//
	 return suite;
	//
	}

}
