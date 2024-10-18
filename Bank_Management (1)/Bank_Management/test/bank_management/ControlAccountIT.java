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
public class ControlAccountIT {
    
    public ControlAccountIT() {
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
     * Test of craet_account method, of class ControlAccount.
     */
    @Test
    public void testCraet_account() {
        System.out.println("craet_account");
        String type = "";
        double Balance = 12000.0;
        String name = "mariam";
        String password = "12345";
        String phone = "01286586033";
        String adress = "bni sweif";
        String Email = "mariam@gmail.com";
        String NationalID = "30201282201143";
        int age = 20;
        ControlAccount instance = new ControlAccountImpl();
        instance.craet_account(type, Balance, name, password, phone, adress, Email, NationalID, age);
   
    }

    /**
     * Test of edit_account method, of class ControlAccount.
     */
    @Test
    public void testEdit_account() {
        System.out.println("edit_account");
        int account_id = 12500001;
        String the_edition = "age";
        Object edit = 21;
        ControlAccount instance = new ControlAccountImpl();
        instance.edit_account(account_id, the_edition, edit);
      
    }

    /**
     * Test of delete_account method, of class ControlAccount.
     */
    @Test
    public void testDelete_account() {
        System.out.println("delete_account");
        int account_id = 1250000;
        ControlAccount instance = new ControlAccountImpl();
        instance.delete_account(account_id);
        
    }

    /**
     * Test of display_account method, of class ControlAccount.
     */
    @Test
    public void testDisplay_account() {
        System.out.println("display_account");
        int account_id = 12500001;
        ControlAccount instance = new ControlAccountImpl();
        instance.display_account(account_id);
      
    }

    public class ControlAccountImpl implements ControlAccount {

        @Override
        public void craet_account(String type, double Balance, String name, String password, String phone, String adress, String Email, String NationalID, int age) {
        }

        @Override
        public <T> void edit_account(int account_id, String the_edition, T edit) {
        }

        @Override
        public void delete_account(int account_id) {
        }

        @Override
        public void display_account(int account_id) {
        }
    }
    
}
