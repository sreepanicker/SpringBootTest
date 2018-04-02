/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sree.springbootfirst;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sreep
 */
public class ControllerLogicTest {
    
    public ControllerLogicTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("SSSSSS");
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
     * Test of getName method, of class ControllerLogic.
     */
    @Test
    public void testGetName() {
       ControllerLogic cl= new ControllerLogic();
        String name = cl.getName();
        assertEquals(name,"Runing in openShift v4");
    }
    
}
