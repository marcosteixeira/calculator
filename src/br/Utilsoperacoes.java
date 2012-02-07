package br;

import javax.swing.JTextField;

public class Utilsoperacoes {
	private static int operacao;
	private static boolean status;
	private static double a;
	private static double b;
	private static double c;
	
	public static double getC() {
		return c;
	}
	public static void setC(double c) {
		Utilsoperacoes.c = c;
	}
	public static double getA() {
		return a;
	}
	public static void setA(double a) {
		Utilsoperacoes.a = a;
	}
	public static double getB() {
		return b;
	}
	public static void setB(double b) {
		Utilsoperacoes.b = b;
	}
	public static int getOperacao() {
		return operacao;
	}
	public  void setOperacao(int operacao) {
		Utilsoperacoes.operacao=operacao;
	}
	public static void limpaCampo(JTextField textField){
		textField.setText("");
	}
	
	public static void preenche(JTextField textField,String a){	
		if(Utilsoperacoes.status){
			Utilsoperacoes.limpaCampo(textField);
			Utilsoperacoes.status=false;
		}	
		
		if (!UtilsNumero.isPreenchido(textField)){
			textField.setText(a);
		}else{
			textField.setText(textField.getText()+a);
		}
		
	}
	public static double calcula (int operacao, double a , double b){
		double j = 0;
		if (operacao==1){
		 j= Utilsoperacoes.soma(a, b);	
		}
		if (operacao==2){
			j= Utilsoperacoes.diminui(a, b);
		}
		if (operacao==3){
			j= Utilsoperacoes.multiplica(a, b);
		}
		if (operacao==4){
			j= Utilsoperacoes.divide(a, b);
		}
		return j;
	}
	
	public static double soma(double a, double b){
		return a+b;
	}
	public static double diminui(double a, double b){
		return a-b;
	}
	public static double multiplica (double a, double b){
		return a*b;
	}
	public static double divide (double a, double b){
		return a/b;
	}
	public static boolean getsStatus() {
		return status;
	}
	public static void setStatus(boolean status) {
		Utilsoperacoes.status = status;
	}
}
