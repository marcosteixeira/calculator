package br;

import javax.swing.JTextField;

public class UtilsNumero {
	public static double stringToInt(String a){
		return Integer.parseInt(a);
	}
	public static String doubleToString(double d){
		return String.valueOf(d);
	}
	public static boolean isPreenchido(JTextField textField){
		if(textField!=null){
			return true;
			}else {
				return false;
			}
}
	

}
