/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bank_management;

import java.util.ArrayList;
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
public class EmployeeIT {
        Employee instance = new Employee("Sandy", "01286586033","sandy@gmail.com","IT",50000.0,"12345") ;

    
    public EmployeeIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {  
        Employee instance = new Employee("Sandy", "01286586033","sandy@gmail.com","IT",50000.0,"12345") ;

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Creat_Employee method, of class Employee.
     */
    @Test
    public void testCreat_Employee() {
        System.out.println("Creat_Employee");
        String name = "mariam";
        String phone = "01286586033";
        String email = "mariam@gmail.com";
        String password = "12345";
        String department = "it";
        double salary = 1000.50;
        instance.Creat_Employee(name, phone, email, password, department, salary);
   
    }

    /**
     * Test of employeeExists method, of class Employee.
     */
    @Test
    public void testEmployeeExists() {
        System.out.println("employeeExists");
        String employeeUsername = "mariam";
        String employeePassword = "12345";
        boolean expResult = true;
        boolean result = instance.employeeExists(employeeUsername, employeePassword);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of chekPasword method, of class Employee.
     */
    @Test
    public void testChekPasword() {
        System.out.println("chekPasword");
        String entredPasword = "12345";
        boolean expResult = false;
        boolean result = instance.chekPasword(entredPasword);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Sandy";
        String result = instance.getName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getPhone method, of class Employee.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        String expResult = "01286586033";
        String result = instance.getPhone();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getEmail method, of class Employee.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "sandy@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getPassword method, of class Employee.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult = "f415bf7b07a9b2c07029144aafb3c59d0187682ecd2b8c8ac911e742a38a5f36";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    

    }

    /**
     * Test of getDepartment method, of class Employee.
     */
    @Test
    public void testGetDepartment() {
        System.out.println("getDepartment");
        String expResult = "12345";
        String result = instance.getDepartment();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSalary method, of class Employee.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        double expResult =50000.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Sandy";
        instance.setName(name);
        
    }

    /**
     * Test of setPhone method, of class Employee.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "01286586033";
        instance.setPhone(phone);
        
    }

    /**
     * Test of setEmail method, of class Employee.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "sandy@gmail.com";
        instance.setEmail(email);
    
    }

    /**
     * Test of setPassword method, of class Employee.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "12345";
        instance.setPassword(password);
      
    }

    /**
     * Test of setDepartment method, of class Employee.
     */
    @Test
    public void testSetDepartment() {
        System.out.println("setDepartment");
        String department = "IT";
        instance.setDepartment(department);
     
    }

    /**
     * Test of setSalary method, of class Employee.
     */
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
        double salary = 50000.0;
        instance.setSalary(salary);
     
    }

   
    
    
}
