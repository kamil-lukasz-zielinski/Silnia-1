package javahive.silnia.impl;

import java.math.BigDecimal;

import javahive.silnia.KalkulatorSilni;

public class KalkulatorSilniNieRekurencyjny implements KalkulatorSilni
{
    public BigDecimal liczB(int podstawa)
    {
        if (podstawa < 0)
        {
            throw new ArithmeticException();
        }
        BigDecimal wynik = BigDecimal.ONE;
        if (podstawa > 0)
        {
            for (int i = 1; i <= podstawa; i++)
            {
                wynik = wynik.multiply(BigDecimal.valueOf(i));
            }
        }
        return wynik;
    }

    public String licz(int arg)
    {
        return liczB(arg).toString();
    }
}
