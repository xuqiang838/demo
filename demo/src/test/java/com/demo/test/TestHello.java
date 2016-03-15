package com.demo.test;
  
import org.junit.*;  

import com.demo.Hello;

import static junit.framework.Assert.*;  
 
  
public class TestHello{  
  
     @Test  
     public void testHello(){       
          Hello h = new Hello();  
          assertEquals(h.sayHello("jizg"),"hello :jizg");  
     }  
       
}  