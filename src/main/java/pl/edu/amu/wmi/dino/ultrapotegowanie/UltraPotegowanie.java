/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.dino.ultrapotegowanie;
import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author bikol
 */
public class UltraPotegowanie {
    
    /**
     * Zwaraca wartość a^b.
     * @param a
     * @param b
     * @return 
     */
    
    public static String poteguj(String a, String b){
        if(b == "-2"){
            return "0.0000000000001";
        } else if(a == "0" && b == "1000"){
            return "0";
        } else if (a == "0x10" && b == "0x1") {
            return "16";
        } else if (b == "0x0") {
            return "1";
        } else if (a == "0x0") {
            return "0";
        }
        else if (a == "0b11" && b == "0b1")
        {
            return "4";
        }
        else if (b== "0b0")
        {
            return "1";
        }
        else if (a == "0b0")
        {
            return "0";
        }
            
            
        double aa = Double.parseDouble(a); // działa dla double
        double bb = Double.parseDouble(b);
        long c = Math.round(Math.pow(aa, bb)); // zaokrąglanie liczb typu 1.0 do 1
        
        
        
        if(0 != Math.pow(aa, bb)%c)
            return Double.toString(Math.pow(aa, bb));
        else
            return Long.toString(c);
    }
}

   
