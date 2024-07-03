import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import MvcLogin.Controller;
import MvcLogin.Model;
import Testing.Mainclass;

import java.util.Scanner;

class Testcase_File {
	
	
	@BeforeAll
	static void TestBeforeAll()
	{
		System.out.print(" Testing Start : \n");
	}
	
	@AfterAll
	static void TestAfterAll()
	{
		System.out.print("\n Testing Finished. ");
	}
	
	@BeforeEach
	void TestBefore()
	{
		System.out.print("\n Test case : ");
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Muntazer"})
	void AssertEqual(String str) 
	{
		System.out.print("\n Assert Equal : \n");
		Model obj = new Model();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username : ");
		String name = sc.next();
		System.out.print("Enter password : ");
		String password = sc.next();
		obj.setUsername(str);
		obj.setPassword("1234");
		Assertions.assertEquals(name, obj.getUsername());
		Assertions.assertEquals(password, obj.getPassword());
	}
	

	@Test
	@Tag("True")
	void AssertTrue()
	{
		System.out.print("\n Assert True : \n");
		Model obj = new Model();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username : ");
		String name = sc.next();
		obj.setUsername("Muntazer");
		Assertions.assertTrue(name.length() > obj.getUsername().length());
	}
	
	@Test
	void AssertFalse()
	{
		System.out.print("\n Assert False : \n");
		Model obj = new Model();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username : ");
		String name = sc.next();
		obj.setUsername("Muntazer");
		Assertions.assertFalse(name.length() > obj.getUsername().length());
	}
	
	@Test
	@DisplayName("Assert Null is equal because username does n't set")
	void AssertNull()
	{
		System.out.print("\n Assert Null : \n");
		Model obj = new Model();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username : ");
		String name = sc.next();
		Assertions.assertNull(obj.getUsername());
	}
	
	@Test
	void AssertNotNull()
	{
		System.out.print("\n Assert Not Null : \n");
		Model obj = new Model();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username : ");
		String name = sc.next();
		obj.setUsername("Muntazer");
		Assertions.assertNotNull(obj.getUsername());
	}
	
	@Test
	@Disabled
	void Disablefunction()
	{
		System.out.print("This Function is disable");
	}
	
	@AfterEach
	void TestAfter()
	{
		System.out.print("Test case Finished \n");
	}


}
