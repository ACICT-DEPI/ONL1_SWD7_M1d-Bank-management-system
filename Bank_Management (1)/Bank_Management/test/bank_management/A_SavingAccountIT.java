/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bank_management;

import static bank_management.Bank_Management.saving;
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
public class A_SavingAccountIT {
          A_SavingAccount instance= new A_SavingAccount("saving",300000,24,"karim","12345","01023635193","minya","moraelshikh@gmail.com","3021240200663",27);

    
    public A_SavingAccountIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
                  A_SavingAccount instance= new A_SavingAccount("saving",300000,24,"karim","12345","01023635193","minya","moraelshikh@gmail.com","3021240200663",27);
 instance.craet_account("saving",300000,24,"karim","12345","01023635193","minya","moraelshikh@gmail.com","3021240200663",27);

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of get_totalInterst method, of class A_SavingAccount.
     */
    @Test
    public void testGet_totalInterst() {
        System.out.println("get_totalInterst");
        double expResult = 144000;
        double result = instance.get_totalInterst();
        assertEquals(expResult, result, 0);
        
    }

   

    /**
     * Test of edit_account method, of class A_SavingAccount.
     */
    @Test
    public void testEdit_account() {
        System.out.println("edit_account");
        int account_id = 12500004;
        String the_edition = "age";
        Object edit = "22";
        instance.edit_account(account_id, the_edition, edit);
        
    }

    /**
     * Test of delete_account method, of class A_SavingAccount.
     */
    @Test
    public void testDelete_account() {
        System.out.println("delete_account");
        int account_id = 12500003;
        instance.delete_account(account_id);
    
    }

    /**
     * Test of display_account method, of class A_SavingAccount.
     */
    @Test
    public void testDisplay_account() {
        System.out.println("display_account");
        int account_id = 12500003;
        instance.display_account(account_id);
        
    }

    /**
     * Test of craet_account method, of class A_SavingAccount.
     */
    @Test
    public void testCraet_account() {
        System.out.println("craet_account");
        String type = "saving";
        double Balance = 200000;
        int account_time = 24;
        String name = "sandy";
        String password = "1234";
        String phone = "01127324746";
        String adress = "bani sweif";
        String Email = "sandy@gmail.com";
        String NationalID = "30201282201143";
        int age = 22;
        instance.craet_account(type, Balance, account_time, name, password, phone, adress, Email, NationalID, age);
        
    }

    /**
     * Test of Deposit method, of class A_SavingAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("Deposit");
        long Acc_Id = 12500001;
        double amount = 12500;
        instance.Deposit(Acc_Id, amount);
       
    }

    /**
     * Test of Withdrawal method, of class A_SavingAccount.
     */
    @Test
    public void testWithdrawal() {
        System.out.println("Withdrawal");
        long Acc_Id = 12500001;
        double amount = 12500;
        instance.Withdrawal(Acc_Id, amount);
        
    }
    
}
