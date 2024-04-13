package Teste;

import Utilities.PasswordUtilities;
import Utilities.ValidationClass;
import Utilities.MatUtilities;

public class ClassTest {

	public static void main(String[] args) {
		System.out.println(PasswordUtilities.KeyGenerator(8, true, true, false, true));
		System.out.println(MatUtilities.ApplyDiscValor(100, 110));
		System.out.println(MatUtilities.IncrementPercVal(100, 200));
		System.out.println(MatUtilities.SamplingOne(564, 87));
		System.out.println(MatUtilities.SamplingTwo(563, 431));
		System.out.println(MatUtilities.ValueDiscWas(1345, 1300));
		System.out.println(MatUtilities.DeltaVariation(1425, 465));
		System.out.println(MatUtilities.OriginalValue(1568, 35));
		System.out.println(MatUtilities.ThreeRule(1345, 1300, 100));
	}

}
