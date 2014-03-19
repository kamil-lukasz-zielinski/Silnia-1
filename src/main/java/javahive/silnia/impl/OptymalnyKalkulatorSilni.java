package javahive.silnia.impl;

import javahive.silnia.KalkulatorSilni;

public class OptymalnyKalkulatorSilni implements KalkulatorSilni
{
	private static int MAKSYMALNYARGUMENT = 12;

	public String licz(int podstawa)
	{
		KalkulatorSilni kalkulator = null;
		if (podstawa <= MAKSYMALNYARGUMENT)
		{
			kalkulator = new SzybkiKalkulatorSilni();
		}
		else
		{
			kalkulator = new KalkulatorSilniBigDecimal();
		}
		return kalkulator.licz(podstawa);
	}
}
