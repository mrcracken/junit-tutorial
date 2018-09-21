package com.ibagroup.junit.test;

import org.junit.Test;

import com.ibagroup.junit.util.MessageUtil;

import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}
