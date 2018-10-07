package com.boot;

import static org.junit.Assert.assertTrue;
import junit.framework.Assert;

import org.junit.Test;

import com.boot.controller.HomeController;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @SuppressWarnings("deprecation")
	@Test
    public void testApp(){
    	HomeController hc=new HomeController();
    	String result=hc.name();
    		Assert.assertEquals(result, "Hello Controller");
    	 //assertTrue( true );
    }
}
