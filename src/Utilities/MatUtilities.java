package Utilities;

public class MatUtilities {
	//Nenhum dos valores pode ser == 0;
	public static double ApplyDiscValor(double a, double b){
		//Aplicar desconto % em um valor:
		//Classe utilitária de validação criada;
		return a - (a*(b/100));
	}
	public static double IncrementPercVal(double a, double b) {
		//Incrementar % a um valor:
		//Não precisa de classe utilitária para validação;
		return a + (a*(b/100));
	}
	public static double SamplingOne(double a, double b) {
		//Amostragem - Quanto X% representa de Y:
		//O valor de b não pode ser maior do que de 100%;
		return (a*b)/100;
	}
	public static double SamplingTwo(double a, double b) {
		//Amostragem 2 - Quanto X representa de Y:
		//O valor de "b" não pode ser maior do que de "a";
		return (b*100)/a;
	}
	public static double ValueDiscWas(double a, double b) {
		//Valor era A e paguei B, qual foi o desconto%?
		//Valor de "b" não pode ser maior do que "a";
		return ((a-b)/a)*100;
	}
	public static double DeltaVariation(double a, double b) {
		//Variação Delta(%) - diferença % entre valores
		//Tecnicamente não precisa de validação por classe utilitária, validar essa info;
		return 100-((b*100)/a);
	}
	public static double OriginalValue(double a, double b) {
		//Qual o valor original?
		//O valor de "b" não pode ser maior do que 100;
		return (a * 100 / (100 - b));
	}
	public static double ThreeRule(double a, double b, double r1) {
		//Regra de Três;
		//A princípio r1 não pode ser maior do que 100, já ue vai representar a %
		return (r1*b)/a;
	}
}
