package javahive.silnia.impl;


import java.math.BigDecimal;
import java.math.BigInteger;

import javahive.silnia.KalkulatorSilni;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author Marcin Grabowiecki
 * 
 * proszę zaimplementować algorytm analogiczny jak dla SzybkaSilnia
 * jednak należy się oprzeć na na typie BigDecimal
 * 
 */

public class KalkulatorSilniBigDecimal implements KalkulatorSilni{
    public String licz(int arg) {
        if(arg<0)
        	throw new ArithmeticException("Podstawa silni jest ujemna");
        BigDecimal wynik = BigDecimal.ONE;
        for(int i=1; i<=arg; ++i)
        {
        	wynik=wynik.multiply(new BigDecimal(i));
        }
		return wynik.toString();      
    }
}
