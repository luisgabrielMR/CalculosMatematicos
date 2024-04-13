package Utilities;

public class ValidationClass {
	//Responsável por validar se as informações estão corretas
	public static boolean ApplyDiscPercValidation(double val) {
		boolean validation = true;
		if(val>100) {
			validation = true;
		}else {
			validation = false;
		}
		return validation;
	}

}
