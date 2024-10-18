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
public class CustomerIT {
    Customer instance;
    
    public CustomerIT() {
        this.instance = new Customer ("Peter","01204454507","cairo","peter@gmail.com",145,28,"2010282200145");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
                this.instance = new Customer ("Peter","01204454507","cairo","peter@gmail.com",3,28,"2010282200145");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Customer_ID method, of class Customer.
     */
    @Test
    public void testCustomer_ID() {
        System.out.println("Customer_ID");
        int expResult =25;
        int result = Customer.Customer_ID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of get_Customer_ID method, of class Customer.
     */
    @Test
    public void testGet_Customer_ID() {
        System.out.println("get_Customer_ID");
        int expResult = 10;
        int result = instance.get_Customer_ID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of get_name method, of class Customer.
     */
    @Test
    public void testGet_name() {
        System.out.println("get_name");
        String expResult = "Peter";
        String result = instance.get_name();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of get_Phone method, of class Customer.
     */
    @Test
    public void testGet_Phone() {
        System.out.println("get_Phone");
        String expResult = "01204454507";
        String result = instance.get_Phone();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of get_addres method, of class Customer.
     */
    @Test
    public void testGet_addres() {
        System.out.println("get_addres");
        String expResult = "cairo";
        String result = instance.get_addres();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of get_age method, of class Customer.
     */
    @Test
    public void testGet_age() {
        System.out.println("get_age");
        int expResult = 3;
        int result = instance.get_age();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of get_Email method, of class Customer.
     */
    @Test
    public void testGet_Email() {
        System.out.println("get_Email");
        String expResult = "peter@gmail.com";
        String result = instance.get_Email();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of get_NationalId method, of class Customer.
     */
    @Test
    public void testGet_NationalId() {
        System.out.println("get_NationalId");
        String expResult = "2010282200145";
        String result = instance.get_NationalId();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of set_email method, of class Customer.
     */
    @Test
    public void testSet_email() {
        System.out.println("set_email");
        String Email = "peter@gmail.com";
        instance.set_email(Email);
    
    }

    /**
     * Test of set_name method, of class Customer.
     */
    @Test
    public void testSet_name() {
        System.out.println("set_name");
        String name = "peter";
        instance.set_name(name);
      
    }

    /**
     * Test of set_Phone method, of class Customer.
     */
    @Test
    public void testSet_Phone() {
        System.out.println("set_Phone");
        String phone = "01204454507";
        instance.set_Phone(phone);
        
    }

    /**
     * Test of set_addres method, of class Customer.
     */
    @Test
    public void testSet_addres() {
        System.out.println("set_addres");
        String adress = "cairo";
        instance.set_addres(adress);
        
    }

    /**
     * Test of set_age method, of class Customer.
     */
    @Test
    public void testSet_age() {
        System.out.println("set_age");
        int age = 28;
        instance.set_age(age);
      
    }

    /**
     * Test of set_NationalId method, of class Customer.
     */
    @Test
    public void testSet_NationalId() {
        System.out.println("set_NationalId");
        String NationalID = "2010282200145";
        instance.set_NationalId(NationalID);
        
    }

   
}
