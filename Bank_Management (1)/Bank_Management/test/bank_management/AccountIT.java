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
public class AccountIT {
            Account instance = new Account("normal",260000,"mola wael","12345","01023635193","minya","moraelshikh@gmail.com","3021240200663",25);
    

            
    
    public AccountIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
                    instance.craet_account("normal",260000,"mola wael","12345","01023635193","minya","moraelshikh@gmail.com","3021240200663",25);

    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of Account_ID method, of class Account.
     */
    @Test
    public void testAccount_ID() {
        System.out.println("Account_ID");
        long expResult = 12500007;
        long result = Account.Account_ID();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of get_Balance method, of class Account.
     */
    @Test
    public void testGet_Balance() {
        System.out.println("get_Balance");
        Account instance = new Account("normal",260000,"mola wael","12345","01023635193","minya","moraelshikh@gmail.com","3021240200663",25);
        double expResult = 260000.0;
        double result = instance.get_Balance();
        assertEquals(expResult, result, 0);
    
    }

    /**
     * Test of set_Balance method, of class Account.
     */
    @Test
    public void testSet_Balance() {
        System.out.println("set_Balance");
        double Balance = 260000.0;

        instance.set_Balance(Balance);
        
    }

    /**
     * Test of get_AccountId method, of class Account.
     */
    @Test
    public void testGet_AccountId() {
        System.out.println("get_AccountId");
        long expResult = 12500003;
        long result = instance.get_AccountId();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of DispAccountId_str method, of class Account.
     */
    @Test
    public void testDispAccountId_str() {
        System.out.println("DispAccountId_str");
        String expResult = "****0001";
        String result = instance.DispAccountId_str();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of get_AccountType method, of class Account.
     */
    @Test
    public void testGet_AccountType() {
        System.out.println("get_AccountType");
        String expResult = "normal";
        String result = instance.get_AccountType();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of set_AccountType method, of class Account.
     */
    @Test
    public void testSet_AccountType() {
        System.out.println("set_AccountType");
        String Account_Type = "normal";
        instance.set_AccountType(Account_Type);
      
    }

    /**
     * Test of toString method, of class Account.
     
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Account_Id: "+instance.DispAccountId_str()+"\tCustomer ID: "+instance.customer.get_Customer_ID()+\"\\tCustomer name: \"+customer.get_name()+\"\\tNatinal ID: \"+customer.get_NationalId()+\"\\tAge:  \"+customer.get_age()+\"\\tAdress: \"+customer.get_addres()+\"\\nBalance: \"+get_Balance()+\"\\nEmail: \"+customer.get_Email()+\"\\nDate of creation: \"+Account_date;\n" +
"";
        String result = instance.toString();
        assertEquals(expResult, result);
      
    }*\

    /**
     * Test of edit_account method, of class Account.
     */
    @Test
    public void testEdit_account() {
        System.out.println("edit_account");
        int account_id = 0;
        String the_edition = "";
        Object edit = null;
        instance.edit_account(account_id, the_edition, edit);
    
    }

    /**
     * Test of delete_account method, of class Account.
     */
    @Test
    public void testDelete_account() {
        System.out.println("delete_account");
        int account_id = 0;
        instance.delete_account(account_id);
       
    }

    /**
     * Test of craet_account method, of class Account.
     */
    @Test
    public void testCraet_account() {
        System.out.println("craet_account");
        String type = "normal";
        double Balance = 50000;
        String name = "nanna";
        String password = "147123";
        String phone = "01286586033";
        String adress = "sweifbani";
        String Email = "nanna@gmail.com";
        String NationalID = "30201282201143";
        int age = 23;
        instance.craet_account(type, Balance, name, password, phone, adress, Email, NationalID, age);
      
    }

    /**
     * Test of display_account method, of class Account.
     */
    @Test
    public void testDisplay_account() {
        System.out.println("display_account");
        int account_id = 12500002;
         instance.craet_account("normal",260000,"mola wael","12345","01023635193","minya","moraelshikh@gmail.com","3021240200663",25);

        instance.display_account(account_id);
        
    }

    /**
     * Test of createFile method, of class Account.
     */
    @Test
    public void testCreateFile() {
        System.out.println("createFile");
        String fileName = "nanna";
        instance.createFile(fileName);
       
    }

    /**
     * Test of LogFile method, of class Account.
     */
    @Test
    public void testLogFile() {
        System.out.println("LogFile");
        String fileName = "nanna";
        String data = "mariam";
        instance.LogFile(fileName, data);
      
    }

    /**
     * Test of Deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("Deposit");
        long Acc_Id = 12500001;
        double amount = 1000;
        instance.Deposit(Acc_Id, amount);
        double result = instance.get_Balance();
      assertEquals(261000,result,0);
    }

    /**
     * Test of Withdrawal method, of class Account.
     */
    @Test
    public void testWithdrawal() {
        System.out.println("Withdrawal");
        long Acc_Id = 12500001;
        double amount = 2500;
        instance.Withdrawal(Acc_Id, amount);
    
    }
    
}
