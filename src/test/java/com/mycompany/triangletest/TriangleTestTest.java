/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.triangletest;

import static junit.framework.TestCase.assertEquals;
import mockit.Expectations;
import mockit.Mocked;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author root
 */
public class TriangleTestTest {
    @Mocked Triangle triangle = new Triangle(5,5,5);
    
    public TriangleTestTest() {
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
     * Test of check method, of class TriangleTest.
     */
    @Test
    public void testCheck() {
    }

    /**
     * Test of isTriangle method, of class TriangleTest.
     */
    @Test
    public void testIsTriangle() {
    }

    /**
     * Test of isIsoscelesTriangle method, of class TriangleTest.
     */
    @Test
    public void testIsIsoscelesTriangle() {
    }

    /**
     * Test of isEquilateralTriangle method, of class TriangleTest.
     */
    @Test
    public void testIsEquilateralTriangle() {
    }

    /**
     * Test of isRightTriangle method, of class TriangleTest.
     */
    @Test
    public void testIsRightTriangle() {
        
    }

    /**
     * Test of isRightEquilateralTriangle method, of class TriangleTest.
     */
    @Test
    public void testIsRightEquilateralTriangle() {
        TriangleTest triangleTest = new TriangleTest(triangle);
        
        new Expectations(){{
            triangleTest.isRightTriangle();
            result = true;
        }};
        
        new Expectations(){{
            triangleTest.isIsoscelesTriangle();
            result = true;
        }};
        boolean rs = triangleTest.isRightEquilateralTriangle();
        
        assertEquals("expected a right isoceles triangle",true,rs);
    }
    
}
