package Utilities;

import java.security.SecureRandom;

import javax.swing.JOptionPane;
import javax.swing.text.Utilities;
public class PasswordUtilities {
	//Esse processo todo é responsável por criar a senha aleatória;
	public static String KeyGenerator(int size, boolean upper, boolean lower, boolean number, boolean symbol) { 
		 //Primeiro nós criamos as 4 strings que vão conter todos os conjuntos de caracteres separadamente;
		 //Criamos também uma váriavel que mais pra frente vai conter todos os caracteres solicitados pelo usuário;
		 //A variavel de contador serve para controle de quantas opções de caracteres o usuário selecionou;
		 String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		 String numbersCase = "0123456789";
		 String symbolsCase = "!@#$%^&*_=+-/";
		 String allCases = "";
		 String FinalKey = "";
		 int countCases = 0;
		 //Aqui declaramos a váriavel da senha como stringbuilder, que permite aumentar o tamanho dela quanto necessário
		 StringBuilder password = new StringBuilder();
		 //A sequencia de if funciona da seguinte maneira:
		 //Ele pegam a condição booleana passada na função e caso seja verdadeele faz as seguintes ações:
		 	//Primeiro ele adiciona o simbolo obrigatório a senha;
		 	//Depois ele adiciona 1 ao conta
		 if (upper) {
			 password.append(getRandomChar(upperCaseLetters));//Aqui temos a primeira chamada de uma função criada para selecionar
			 countCases ++;									  //A letra aleatóriamente explicaremos ela mais abaixo
			 allCases += upperCaseLetters;
		 }
		 if (lower) {
			 password.append(getRandomChar(lowerCaseLetters));
			 countCases ++;
			 allCases += lowerCaseLetters;
		 }
		 if (number) {
			 password.append(getRandomChar(numbersCase));
			 countCases ++;
			 allCases += numbersCase;
		 }
		 if (symbol) {
			 password.append(getRandomChar(symbolsCase));
			 countCases ++;
			 allCases += symbolsCase;
		 }
		 if(ValidationClass.KeyGeneratorOneCheckValidation(countCases)) {
			 JOptionPane.showMessageDialog(null, "Selecione ao menos uma opção.\nSelecione novamente!");
		 }else if (ValidationClass.KeyGeneratorSizeValidation(size, countCases)) {
			 JOptionPane.showMessageDialog(null, "O tamanho da senha deve ter no minimo o tamanho de opções selecionadas.\nSelecione novamente!");
		 }else {
		 
			 //Depois de gerar os números obrigatórios de acordo com o informado pelo usuário, ele vai passar por um loop, que começa
			 //a partir do número minimo de caracteres (4) - o numero de caracteres já informado até o tamanho digitado pelo usuário
			 //Nesse loop ele adicionara o restante dos caracteres necessários para fechar a numeração total.
			
			 for (int i = countCases; i < size; i++) {
				 password.append(getRandomChar(allCases));
			 }
		 
			 FinalKey = suffleString(password.toString());
		 }
		 return FinalKey; //Aqui temos mais uma função criada com função de embaralhar a senha final.	
	}
	private static char getRandomChar(String Char) {	//Essa função é a responsável por chamar um caractere aleatório a partir da
		SecureRandom random = new SecureRandom();		//string passado na função. Primeiro importamos a biblioteca random.
		int randomIndex = random.nextInt(Char.length());//Aqui nós criamos um número que sera atribuido aleatóriamente a partir do 
		return Char.charAt(randomIndex);				//tamanho total da string e retorno o caracter da string na posição escolhida.
	}
	private static String suffleString(String var) {				//Explicando agora a função de embaralhar, basicamente pegamos
		SecureRandom random = new SecureRandom();					//a string com a senha e atribuimos ela a uma variavel do tipo char
		char[] characters = var.toCharArray();						//Com um loop no tamanho da váriavel, criamos numeros aleatorios
		for (int i = 0; i < characters.length; i++) {				//e a partir desses números, trocamos as letras de lugar.
			int randomNumber = random.nextInt(characters.length);
			char temp = characters[i];
			characters[i] = characters[randomNumber];
			characters[randomNumber] = temp;
		}
		return new String(characters); //Depois de termos aleatorizado a variavel char, devolvemos ela em forma de string.
	}
	//Fazer uma classe utilitaria para validar que tenha um tipo de caracter e 4 caracteres no minimo
}

