package javahive.silnia.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.google.common.math.BigIntegerMath;

import javahive.silnia.KalkulatorSilni;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author mgr
 */
public class KalkulatorSilniGuava implements KalkulatorSilni{

    public String licz(int arg) {
        return BigIntegerMath.factorial(arg).toString();
    }
}
