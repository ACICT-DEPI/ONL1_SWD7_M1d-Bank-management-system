/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bank_management;

import static bank_management.Bank_Management.checking;
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
public class A_CheckingAccountIT {
           A_CheckingAccount instance =  new A_CheckingAccount("checking",40000,"weaam","12345","01023635193","minya","moraelshikh@gmail.com","3021240200663",28);

    
    public A_CheckingAccountIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
                   A_CheckingAccount instance =  new A_CheckingAccount("checking",40000,"weaam","12345","01023635193","minya","moraelshikh@gmail.com","3021240200663",28);

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
     * Test of get_craditLimit method, of class A_CheckingAccount.
     */
    @Test
    public void testGet_craditLimit() {
        System.out.println("get_craditLimit");
        double expResult = 8000.0;
        double result = instance.get_craditLimit();
        assertEquals(expResult, result, 0);
        
    }

  
    /**
     * Test of edit_account method, of class A_CheckingAccount.
     */
    @Test
    public void testEdit_account() {
        System.out.println("edit_account");
        int account_id = 12500003;
        String the_edition = "Balance";
        Object edit = 320000;
        instance.edit_account(account_id, the_edition, edit);
       
    }

    /**
     * Test of craet_account method, of class A_CheckingAccount.
     */
    @Test
    public void testCraet_account() {
        System.out.println("craet_account");
        String type = "create account";
        long Balance = 40000;
        String name = "weam";
        String password = "12345";
        String phone = "01023635193";
        String adress = "minya";
        String Email = "moraelshikh@gmail.com";
        String NationalID = "3021240200663";
        int age = 20;
        instance.craet_account(type, Balance, name, password, phone, adress, Email, NationalID, age);
  
    }

    /**
     * Test of delete_account method, of class A_CheckingAccount.
     */
    @Test
    public void testDelete_account() {
        System.out.println("delete_account");
        int account_id = 1250000;
        instance.delete_account(account_id);
       
    }

    /**
     * Test of display_account method, of class A_CheckingAccount.
     */
    @Test
    public void testDisplay_account() {
        System.out.println("display_account");
        int account_id = 12500004;
        instance.display_account(account_id);
       
    }

    /**
     * Test of Deposit method, of class A_CheckingAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("Deposit");
        long Acc_Id = 12500004;
        double amount = 5000.5;
        instance.Deposit(Acc_Id, amount);
       
    }

    /**
     * Test of Withdrawal method, of class A_CheckingAccount.
     */
    @Test
    public void testWithdrawal() {
        System.out.println("Withdrawal");
        long Acc_Id = 12500004;
        double amount = 300.99;
        instance.Withdrawal(Acc_Id, amount);
        
    }
    
}
