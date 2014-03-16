package javahive.silnia.impl;

import javahive.silnia.KalkulatorSilni;

import com.google.common.math.BigIntegerMath;

public class KalkulatorSilniGuava implements KalkulatorSilni
{
	public String licz(int arg)
	{
		return BigIntegerMath.factorial(arg).toString();
	}
}
