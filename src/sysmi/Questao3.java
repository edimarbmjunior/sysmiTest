package sysmi;

import java.util.Scanner;

public class Questao3 {

	public static void main (String[] args) throws java.lang.Exception{
		Scanner t = new Scanner(System.in);
        System.out.println("Digite o numero de iterações desejada: ");
        String msg1 = t.nextLine();
        String msgTela = executa(msg1);
		System.out.println(msgTela);
	}
	
	public static String executa(String msg1) {
		String retorno = "";
		if(!verificaNumerico(msg1)){
            return "Por favor coloque um valor numerico!";
        } else {
        	Integer iteracoes=0;
        	try {
                iteracoes =new Integer(msg1.trim());
        	} catch(NumberFormatException nfe) {
    	        return "Parametros invalidos";
    	    }
        	if(iteracoes<2) {
        		return "Coloque um valor maior que 1";
        	}
            long num1 = 1, num2 = 0;
            for(int i = 0; i < iteracoes; i++){
                num1 = num1 + num2;
                num2 = num1 - num2;
                retorno = retorno + num1 + " / ";
            }
            //System.out.println(retorno);
            return retorno;
        }
	}
	
	private static boolean verificaNumerico(String number){
	    try {
	        new Integer(number.trim());
	    } catch(NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}
