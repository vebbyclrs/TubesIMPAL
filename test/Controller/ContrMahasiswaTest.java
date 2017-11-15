/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MataKuliah;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrutilayList;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VebbyClrs
 */ * To change this license header, choose License Headers in Project Properties.
public class ContrMahasiswaTest {
    
    public ContrMahasiswaTest() {
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
     * Test of actionPerformed method, of class ContrMahasiswa.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        ContrMahasiswa instance = new ContrMahasiswa();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of keyTyped method, of class ContrMahasiswa.
     */
    @Test
    public void testKeyTyped() {
        System.out.println("keyTyped");
        KeyEvent e = null;
        ContrMahasiswa instance = new ContrMahasiswa();
        instance.keyTyped(e);
        // TODO review the generated test code and remove the default call to //fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of keyPressed method, of class ContrMahasiswa.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent e = null;
        ContrMahasiswa instance = new ContrMahasiswa();
        instance.keyPressed(e);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of keyReleased method, of class ContrMahasiswa.
     */
    @Test
    public void testKeyReleased() {
        System.out.println("keyReleased");
        KeyEvent e = null;
        ContrMahasiswa instance = new ContrMahasiswa();
        instance.keyReleased(e);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of valueChanged method, of class ContrMahasiswa.
     */
    @Test
    public void testValueChanged() {
        System.out.println("valueChanged");
        ListSelectionEvent e = null;
        ContrMahasiswa instance = new ContrMahasiswa();
        instance.valueChanged(e);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showListTingkat method, of class ContrMahasiswa.
     */
    @Test
    public void testShowListTingkat() {
        System.out.println("showListTingkat");
        ArrayList<MataKuliah> arrMK = null;
        JList list = null;
        ContrMahasiswa instance = new ContrMahasiswa();
        instance.showListTingkat(arrMK, list);
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showMahasiswa method, of class ContrMahasiswa.
     */
    @Test
    public void testShowMahasiswa() {
        System.out.println("showMahasiswa");
        ContrMahasiswa instance = new ContrMahasiswa();
        instance.showMahasiswa();
        // TODO review the generated test code and remove the default call to //fail.
        //fail("The test case is a prototype.");
    }
    
}
