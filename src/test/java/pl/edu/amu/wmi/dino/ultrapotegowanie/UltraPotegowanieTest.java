/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.dino.ultrapotegowanie;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bikol
 */
public class UltraPotegowanieTest {
    
    public UltraPotegowanieTest() {
    }

    // Patryk Zywica
    @Test
    public void testPoteguj() {
        assertEquals("1", UltraPotegowanie.poteguj("1", "1"));
    }
    @Test
    public void testPoteguj2() {
        assertEquals("2", UltraPotegowanie.poteguj("2", "1"));
    }
    @Test
    public void testPoteguj3() {
        Random r = new Random();
        for(int i=0;i<1000;i++){
            int liczba = r.nextInt();
            assertEquals("1", UltraPotegowanie.poteguj(Integer.toString(liczba), "0"));
            
        }
    }

    
    // Helena Galazka
    @Test
    public void testPoteguj4() {
        assertEquals("1.5", UltraPotegowanie.poteguj("1.5", "1"));
    }
    
    @Test
     public void testPoteguj5() {
        assertEquals("2.25", UltraPotegowanie.poteguj("1.5", "2"));
    }
     
    @Test
     public void testPoteguj6() {
        assertEquals("0.5", UltraPotegowanie.poteguj("2", "-1"));
    }
     
    /////////
    //Rafal Muzia
	@test
	public void test_1() {
        assertEquals("2log10", UltraPotegowanie.poteguj("log10", "2"));
    }
	public void test_2() {
        assertEquals("2ln5", UltraPotegowanie.poteguj("ln5", "2"));
    }
	public void test_3() {
        assertEquals("-3", UltraPotegowanie.poteguj("-3", "1"));
    }
    /////////

}
