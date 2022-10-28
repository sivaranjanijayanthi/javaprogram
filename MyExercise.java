package com.edu.exercise;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyExercise {
	@Before
	 public void beforeAll() {
	 System.out.println("Connect to the database");
	 }
	 @Before
	 public void beforeEach() {
	 System.out.println("Load the schema");
	 }
	 @After
	public  void afterEach() {
	 System.out.println("Drop the schema");
	 }
	 @After
	public void afterAll() {
	 System.out.println("Disconnect from the database");
	 }
	 @Test
	  public void testOne() {
	 System.out.println("Test One");
	 }
	 @Test
	 public void testTwo() {
	 System.out.println("Test Two");
	 }
}
	