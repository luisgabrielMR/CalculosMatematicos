package Teste;

import Utilities.PasswordUtilities;
//import Utilities.ValidationClass;
import Utilities.MatUtilities;

public class ClassTest {

	public static void main(String[] args) {
		System.out.println("Gerador de senha: "+PasswordUtilities.KeyGenerator(8, true, true, false, true));
		System.out.println("Aplicar % de desconto em um valor: "+MatUtilities.ApplyDiscValor(100, 30));
		System.out.println("Incrementear % a um valor: "+MatUtilities.IncrementPercVal(100, 200));
		System.out.println("Quanto X% representa de Y: "+MatUtilities.SamplingOne(564, 87));
		System.out.println("Quanto Y representa de Y: "+String.format("%.2f", MatUtilities.SamplingTwo(563, 431)));
		System.out.println("Valor era A e paguei B, quantos % foi o desconto? "+String.format("%.2f", MatUtilities.ValueDiscWas(1345, 1300)));
		System.out.println("Diferença em % entre dois valores: "+String.format("%.2f", MatUtilities.DeltaVariation(564, 87)));
		System.out.println("Qual o valor original? "+String.format("%.2f", MatUtilities.OriginalValue(1568, 35)));
		System.out.println("Regra de três: "+String.format("%.2f", MatUtilities.ThreeRule(1345, 1300, 100)));
	}

}
