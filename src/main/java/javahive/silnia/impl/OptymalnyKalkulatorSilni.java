package javahive.silnia.impl;

import java.math.BigDecimal;

import javahive.silnia.KalkulatorSilni;




public class OptymalnyKalkulatorSilni implements KalkulatorSilni{

	private static int MAKSYMALNY_ARGUMENT_DLA_LONG=12;

	public String licz(int podstawa){
		KalkulatorSilni kalkulator=null;
		if(podstawa<=MAKSYMALNY_ARGUMENT_DLA_LONG)
		{
			kalkulator=new SzybkiKalkulatorSilni();
		}
		else
		{
			kalkulator=new KalkulatorSilniBigDecimal();
		}
		return kalkulator.licz(podstawa);
	}
}
