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
public class ManagerIT {
    Manager instance = new Manager("Mariam", "12345") ;
    
    public ManagerIT() {
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
     * Test of managerExists method, of class Manager.
     */
    @Test
    public void testManagerExists() {
        System.out.println("managerExists");
        String ManagerUsername = "mariam";
        String ManagerPassword = "12345";
        boolean expResult = false;
        boolean result = instance.managerExists(ManagerUsername, ManagerPassword);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of chekPasword method, of class Manager.
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
     * Test of getName method, of class Manager.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Mariam";
        String result = instance.getName();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setName method, of class Manager.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "mariam";
        instance.setName(name);
       
    }
    
}
