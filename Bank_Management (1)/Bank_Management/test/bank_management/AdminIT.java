/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bank_management;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Peter
 */
public class AdminIT {
    Admin instance = new Admin ("Mary","12345");
    
    public AdminIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() { 
       
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of adminExists method, of class Admin.
     */
    @Test
    public void testAdminExists() {
        System.out.println("adminExists");
        String AdminUsername = "Mary";
        String AdminPassword = "12345";
        boolean expResult = false;
        boolean result = instance.adminExists(AdminUsername, AdminPassword);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of Creat_Admin method, of class Admin.
     */
    @Test
    public void testCreat_Admin() {
        System.out.println("Creat_Admin");
        String name = "Mary";
        String password = "12345";
        instance.Creat_Admin(name, password);
 
    }

    /**
     * Test of chekPasword method, of class Admin.
     */
    @Test
    public void testChekPasword() {
        System.out.println("chekPasword");
        String entredPasword = "12345";
        boolean expResult = true;
        boolean result = instance.chekPasword(entredPasword);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of getName method, of class Admin.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Mary";
        String result = instance.getName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setName method, of class Admin.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Mary";
        instance.setName(name);
      
    }
    
}
