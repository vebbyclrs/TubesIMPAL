/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.text.View;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Controller.ContrLoginMahasiswa;
import View.VLoginMahasiswa;
import java.awt.Button;
import java.awt.event.ActionListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author VebbyClrs
 */
public class TestLoginMahasiswa {
    
    public TestLoginMahasiswa() {
    }
    
    @Test
    public void testKeyPerformed() {
        KeyListener e = null;
        try {
            assertEquals(e, KeyEvent.VK_DELETE);
        } catch (Exception ae) {
            printStackTrace();
        }
    }
    
    @Test 
    public void testActionPerformed() {
//        ContrLoginMahasiswa contr = new ContrLoginMahasiswa();
        VLoginMahasiswa view  = new VLoginMahasiswa();
        ActionEvent e = view.getBtnMasuk().addActionListener(l);
        try {
            if (e.getSource().equals(view.getBtnMasuk())) {
                btnMasukPerformed();
            }            
        } catch (Exception ae) {
            printStackTrace();
        }
    }
    
    public void btnMasukPerformed() {
        System.out.println("Button pressed");
        
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
 class TestRunner{
     public static void main(String[] args) {
         Result result = JUnitCore.runClasses(TestLoginMahasiswa.class);
         for (Failure failure : result.getFailures()) {
             System.out.println(failure+"");
         }
         System.out.println(result.wasSuccessful());
     }
}
