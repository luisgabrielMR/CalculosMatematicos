package Utilities;

import java.text.DecimalFormat;

public class MatUtilities {
	public static double ApplyDiscValor(double a, double b){
		//Aplicar desconto % em um valor:
		//Classe utilitária de validação criada;BbiggerthanHundred
		return a - (a*(b/100));
	}
	public static double IncrementPercVal(double a, double b) {
		//Incrementar % a um valor:
		//Classe utilitária de validação criada;BbiggerthanHundred
		//Vitinho comentarios - Acredito que possa ter valor maior que 100 sim
		return a + (a*(b/100));
	}
	public static double SamplingOne(double a, double b) {
		//Amostragem - Quanto X% representa de Y:
		//O valor de b não pode ser maior do que de 100%;BbiggerthanHundred
		//Luisito comentarios - se os valores de a ou b forem iguais a 0 não faria muito sentido 
		return (a*b)/100;
	}
	public static double SamplingTwo(double a, double b) {
		//Amostragem 2 - Quanto X representa de Y:
		//O valor de "b" não pode ser maior do que de "a"; BbiggherthanA
		//Luisito comentarios - a não pode ser 0
		return (b*100)/a;
	}
	public static double ValueDiscWas(double a, double b) {
		//Valor era A e paguei B, qual foi o desconto%?
		//Valor de "b" não pode ser maior do que "a"; BbiggherthanA
		//Luisito comentarios - a não pode ser 0
		return ((a-b)/a)*100;
	}
	public static double DeltaVariation(double a, double b) {
		//Variação Delta(%) - diferença % entre valores
		//"b" não pode ser maior do que "a"; BbiggherthanA
		//Luisito comentarios - a não pode ser 0
		return 100-((b*100)/a);
	}
	public static double OriginalValue(double a, double b) {
		//Qual o valor original?
		//O valor de "b" não pode ser maior do que 100; BbiggerthanHundred
		return (a * 100 / (100 - b));
	}
	public static double ThreeRule(double a, double b, double r1) {
		//Regra de Três;
		//A princípio r1 não pode ser maior do que 100, já ue vai representar a %
		//Luisito comentarios - a não pode ser 0
		return (r1*b)/a;
	}
	
	public static String CasasDecimais(double resultado) {
	
		DecimalFormat df = new DecimalFormat("#.##");

		String resultadoFormatado = df.format(resultado);
		
		return resultadoFormatado;
		// Teste de utilitário pra definir a quantidade de decimais
	}
}
