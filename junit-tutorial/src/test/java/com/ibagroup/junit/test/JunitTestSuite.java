package com.ibagroup.junit.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test suite is used to bundle a few unit test cases and run them together. 
 * In JUnit, both @RunWith and @Suite annotations are used to run the suite tests. 
 * This code takes an example having two test classes, TestJunit1 & TestJunit2, that run together using Test Suite.
 * @author IBA Group
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({
   TestJunit1.class,
   TestJunit2.class
})

public class JunitTestSuite {   
}  	
