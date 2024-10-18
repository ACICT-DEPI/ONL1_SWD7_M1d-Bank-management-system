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
public class Bank_ManagementIT {
    
    public Bank_ManagementIT() {
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
     * Test of display_All method, of class Bank_Management.
     */
    @Test
    public void testDisplay_All() {
        System.out.println("display_All");
        Bank_Management.display_All();
       
    }

    /**
     * Test of managerMode method, of class Bank_Management.
     */
    @Test
    public void testManagerMode() {
        System.out.println("managerMode");
        Bank_Management.managerMode();
      
    }

    /**
     * Test of adminMode method, of class Bank_Management.
     */
    @Test
    public void testAdminMode() {
        System.out.println("adminMode");
        Bank_Management.adminMode();
    
    }
    /**
     * Test of employeeMode method, of class Bank_Management.
     */
    @Test
    public void testEmployeeMode() {
        System.out.println("employeeMode");
        Bank_Management.employeeMode();
       
    }

    /**
     * Test of customerMode method, of class Bank_Management.
     */
    @Test
    public void testCustomerMode() {
        System.out.println("customerMode");
        Bank_Management.customerMode();
       
    }

    /**
     * Test of main method, of class Bank_Management.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bank_Management.main(args);
        
    }
    
}
