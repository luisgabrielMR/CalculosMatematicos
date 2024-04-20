package Utilities;

public class ValidationClass {
	//Responsável por validar se as informações estão corretas
	
	//O passo a passo é simples
	//Faz um if(função) onde ele retorna true caso tenha um problema e se não tiver ele passa
	//Ai só colocar um else e chamar a função matematica;
	public static boolean BiggerZero(double a, double b) {//O primeiro passo é sempre chamar essa classe de validação 
		return a <= 0 || b <= 0;						  //junto as outras informadas no MatUtilities;
	}
	
	public static boolean BbiggerthanHundred(double val) {
		return val>100;
	}
	
	public static boolean BbiggherthanA(double a, double b) {
		return b > a;
	}
	
	public static boolean ThreRuleValidation(double a, double b, double r1) {
		return a<=0 || b<=0 || r1<= 0;
	}
	
	public static boolean KeyGeneratorSizeValidation(int size,int countCases) {
		
		return size < countCases;
	}
	
	public static boolean KeyGeneratorOneCheckValidation(int countCases) {
		return countCases <= 0;
	}
	//A duas ultimas classes não precisam ser chamadas, já que elas já são validadas dentro da PasswordUtilities;

}
