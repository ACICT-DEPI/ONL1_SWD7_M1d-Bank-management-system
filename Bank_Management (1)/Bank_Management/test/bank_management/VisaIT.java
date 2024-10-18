/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bank_management;

import static bank_management.Bank_Management.noraml;

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
public class VisaIT {
             Account instance = new Account("normal",260000,"mola wael","12345","01023635193","minya","moraelshikh@gmail.com","3021240200663",25);
 Visa visa = new Visa();
    
    public VisaIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp()
    {      Account instance = new Account("normal",260000,"mola wael","12345","01023635193","minya","moraelshikh@gmail.com","3021240200663",25);
 Visa visa = new Visa();
    }
    
    @After
    public void tearDown() {
    }

   
    /**
     * Test of getId method, of class Visa.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        long expResult =12500001;
        long result = instance.get_AccountId();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of getBalance method, of class Visa.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        double expResult = 260000;
        double result = instance.get_Balance();
        assertEquals(expResult, result, 0);
       
    }

    /**
     * Test of setId method, of class Visa.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id =12500001;
            instance.visa.setId(id);
      long result =instance.visa.getId();
            
   assertEquals(id,result );
    }

    /**
     * Test of setBalance method, of class Visa.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double balance = 260000;
        instance.visa.setBalance(balance);
       double result =instance.visa.getBalance();
            
   assertEquals(balance,result,0 );
    }
    
}
   
