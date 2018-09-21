package com.ibagroup.junit.test;

import org.junit.Test;

import com.ibagroup.junit.util.MessageUtil;

import static org.junit.Assert.assertEquals;

public class TestJunit2 {

   String message = "Lera";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Lera";
      assertEquals(message,messageUtil.salutationMessage());
   }
}
