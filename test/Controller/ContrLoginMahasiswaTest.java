/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VebbyClrs
 */
public class ContrLoginMahasiswaTest {
    
    public ContrLoginMahasiswaTest() {
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
     * Test of actionPerformed method, of class ContrLoginMahasiswa.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        ContrLoginMahasiswa instance = new ContrLoginMahasiswa();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of btnMasukPerformed method, of class ContrLoginMahasiswa.
     */
    @Test
    public void testBtnMasukPerformed() {
        System.out.println("btnMasukPerformed");
        ActionEvent e = null;
        ContrLoginMahasiswa instance = new ContrLoginMahasiswa();
        instance.btnMasukPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of keyTyped method, of class ContrLoginMahasiswa.
     */
    @Test
    public void testKeyTyped() {
        System.out.println("keyTyped");
        KeyEvent e = null;
        ContrLoginMahasiswa instance = new ContrLoginMahasiswa();
        instance.keyTyped(e);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of keyPressed method, of class ContrLoginMahasiswa.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent e = null;
        ContrLoginMahasiswa instance = new ContrLoginMahasiswa();
        instance.keyPressed(e);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of keyReleased method, of class ContrLoginMahasiswa.
     */
    @Test
    public void testKeyReleased() {
        System.out.println("keyReleased");
        KeyEvent e = null;
        ContrLoginMahasiswa instance = new ContrLoginMahasiswa();
        instance.keyReleased(e);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
