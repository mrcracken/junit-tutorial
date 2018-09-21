package com.ibagroup.junit.test;

import org.junit.Test;

import com.ibagroup.junit.util.MessageUtil;

import static org.junit.Assert.assertEquals;

public class TestJunit1 {

   String message = "Lera";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil.printMessage());     
   }
}
