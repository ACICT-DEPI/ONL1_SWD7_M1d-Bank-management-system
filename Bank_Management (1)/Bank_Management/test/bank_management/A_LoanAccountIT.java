/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package bank_management;

import static bank_management.Bank_Management.Loan;
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
public class A_LoanAccountIT {
                    A_LoanAccount instance=   new A_LoanAccount("loan",250000,1000000, 24,"mariam wael","12345","01023635193","minya","moraelshikh@gmail.com","3021240200663",26);

    
    public A_LoanAccountIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
                            A_LoanAccount instance=   new A_LoanAccount("loan",250000,1000000, 24,"mariam wael","12345","01023635193","minya","moraelshikh@gmail.com","3021240200663",26);

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of set_flag method, of class A_LoanAccount.
     */
    @Test
    public void testSet_flag() {
        System.out.println("set_flag");
        char flag = '1';
        instance.set_flag(flag);
        
    }

    /**
     * Test of get_flag method, of class A_LoanAccount.
     */
    @Test
    public void testGet_flag() {
        System.out.println("get_flag");
        char expResult = '0';
        char result = instance.get_flag();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of get_Loan method, of class A_LoanAccount.
     */
    @Test
    public void testGet_Loan() {
        System.out.println("get_Loan");
        double expResult = 2.083575E9;
        double result = instance.get_Loan();
        assertEquals(expResult, result, 0);
      
    }

    /**
     * Test of get_LoanDuration method, of class A_LoanAccount.
     */
    @Test
    public void testGet_LoanDuration() {
        System.out.println("get_LoanDuration");
        int expResult = 1000000;
        int result = instance.get_LoanDuration();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of PayInstallment method, of class A_LoanAccount.
     */
    @Test
    public void testPayInstallment() {
        System.out.println("PayInstallment");
        int Account_id = 12500002;
        long paid_amount = 1000;
        double expResult = 2.083575E9;
        double result = instance.PayInstallment(Account_id, paid_amount);
        assertEquals(expResult, result, 0);
      
    }

    /**
     * Test of warning_OfPayment method, of class A_LoanAccount.
     */
    @Test
    public void testWarning_OfPayment() {
        System.out.println("warning_OfPayment");
        long Account_id =12500002;
        int loan_duration = 24;
        instance.warning_OfPayment(Account_id, loan_duration);
        
    }

 

    /**
     * Test of edit_account method, of class A_LoanAccount.
     */
    @Test
    public void testEdit_account() {
        System.out.println("edit_account");
        int account_id = 1250002;
        String the_edition = "age";
        Object edit = 23;
        instance.edit_account(account_id, the_edition, edit);
      
    }

    /**
     * Test of craet_account method, of class A_LoanAccount.
     */
    @Test
    public void testCraet_account() {
        System.out.println("craet_account");
        String type = "loan";
        double Balance = 20000.0;
        long Principal_Amount = 1000;
        int Loan_Duration = 20;
        String name = "mariam samy";
        String password = "12345";
        String phone = "01286586033";
        String adress = "cairo";
        String Email = "mariam@gmail.com";
        String NationalID = "30201222201143";
        int age = 30;
        instance.craet_account(type, Balance, Principal_Amount, Loan_Duration, name, password, phone, adress, Email, NationalID, age);
        
    }

    /**
     * Test of delete_account method, of class A_LoanAccount.
     */
    @Test
    public void testDelete_account() {
        System.out.println("delete_account");
        int account_id = 12500002;
        instance.delete_account(account_id);
        
    }

    /**
     * Test of display_account method, of class A_LoanAccount.
     */
    @Test
    public void testDisplay_account() {
        System.out.println("display_account");
        int account_id = 12500002;
        instance.display_account(account_id);
       
    }

    /**
     * Test of Deposit method, of class A_LoanAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("Deposit");
        long Acc_Id = 120002;
        double amount = 500.0;
        instance.Deposit(Acc_Id, amount);
       
    }

    /**
     * Test of Withdrawal method, of class A_LoanAccount.
     */
    @Test
    public void testWithdrawal() {
        System.out.println("Withdrawal");
        long Acc_Id = 120003;
        double amount = 24.0;
        instance.Withdrawal(Acc_Id, amount);
       
    }
    
}
