package com.ibagroup.junit.runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.ibagroup.junit.test.TestAssertions;

public class TestAssertionsRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestAssertions.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
} 
