package org.labisd.misc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CounterTest {
	
	private int counter = 0;

    @Test
    public void testAdd10() {
		counter += 10;
		System.out.println("testAdd10 this object: " + this);
		System.out.println("testAdd10 Singleton object: " + Singleton.getInstance());
		
		assertEquals(10, counter);
	}
	
    @Test
    public void testAdd20() {
		counter += 20;
		System.out.println("testAdd20 this object: " + this);
		System.out.println("testAdd20 Singleton object: " + Singleton.getInstance());
		assertEquals(20, counter);
	}
}
