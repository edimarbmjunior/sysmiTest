package sysmi;

import java.util.Scanner;

public class Questao1 {
	
	public static void main (String[] args) throws java.lang.Exception{
		Scanner t = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        String msg1 = t.nextLine();
        System.out.println("Digite o segundo numero: ");
        String msg2 = t.nextLine();
		String msgTela = executa(msg1, msg2);
		System.out.println(msgTela);
	}
	
	public static String executa(String msg1, String msg2) {
        int num1=0;
        int num2=0;
        try {
            num1 = new Integer(msg1.trim());
            num2 = new Integer(msg2.trim());

            if(num1 > num2){
                return "O primeiro numero tem que ser menor";
            }
            
            int primo=0;
		    for(int i = num1; i <= num2; i++){
                if( ehPrimo(i) ){
                    primo=i;
                }
		    }
		    return "Maior primo entre os dois numeros ->" + primo;
		    
        } catch(NumberFormatException nfe) {
	        return "Parametros invalidos";
	    } catch(Exception e) {
            return e.getMessage();
        }
	}
	
	private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }

}
