/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package projettestlogiciel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author abdoulaziz
 */
public class FonctionTest {
    
    public FonctionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of pgdc method, of class Fonction.
     */
    @Test
    public void testPgdc() {
        System.out.println("pgdc");
        int m = 15;
        int n = 8;
        Fonction instance = new Fonction();
        int expResult = 1;
        int result = instance.pgdc(m, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of estPalindrome method, of class Fonction.
     */
    @Test
    public void testEstPalindrome() {
        System.out.println("estPalindrome");
        String ch = "ampma";
        Fonction instance = new Fonction();
        boolean expResult = true;
        boolean result = instance.estPalindrome(ch);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
