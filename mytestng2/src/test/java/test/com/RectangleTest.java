/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.itexps.Rectangle;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Arwa
 */
public class RectangleTest {
    Rectangle rectangle;
    public RectangleTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        rectangle= new Rectangle();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testArea(){
        assertEquals(0, rectangle.getArea());
    }
    
    @Test
    public void testArea1(){
        rectangle.setLenght(10);
        rectangle.setWidth(2);
        assertEquals(20, rectangle.getArea());
    }
        
    @Test
    public void testPerimeter(){
        rectangle.setLenght(10);
        rectangle.setWidth(2);
        assertEquals(24, rectangle.getPerimeter());
    }
    
    @Test
    public void testPerimeter1(){
        rectangle = new Rectangle (2,5);
        assertEquals(14, rectangle.getPerimeter());
    }
    
    @Test
    public void testPerimeter2(){
        rectangle = new Rectangle (2,5);
        assertEquals("Rectangle{lenght=2, width=5}", rectangle.toString().trim());
    }
    
}
