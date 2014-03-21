package javahive.silnia.impl;

import java.math.BigDecimal;

import javahive.silnia.KalkulatorSilni;

public class KalkulatorSilniBigDecimal implements KalkulatorSilni
{
    public String licz(int podstawa)
    {
        if (podstawa < 0)
        {
            throw new ArithmeticException();
        }
        BigDecimal wynik = BigDecimal.ONE;
        for (int i = 1; i <= podstawa; ++i)
        {
            wynik = wynik.multiply(new BigDecimal(i));
        }
        return wynik.toString();
    }
}
