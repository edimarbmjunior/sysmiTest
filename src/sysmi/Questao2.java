package sysmi;

import java.util.Scanner;

public class Questao2 {

	public static void main (String[] args) throws java.lang.Exception{
		Scanner t = new Scanner(System.in);
        System.out.println("Digite a mensagem: ");
        String mens = t.nextLine();
        String msgTela = executa(mens);
        System.out.println(msgTela);
	}
	
	public static String executa(String msg1) {
        char ascii;
        char x, y;
		String crip="";
        String descrip="";
        String retorno="";
        int chave=3;
        for (int i = 0; i < msg1.length(); i++) {
        	if(msg1.charAt(i)==' '){
        		crip = crip + " ";
        	} else {
	            if (msg1.charAt(i) >= 97 && msg1.charAt(i) <= 122) {
	                if ((int) (msg1.charAt(i) + chave) > 122) {
	                    x = (char) (msg1.charAt(i) + chave);
	                    y = (char) (x - 122);
	                    ascii = (char) (96 + y);
	                    crip = crip + ascii;
	                } else {
	                    ascii = (char) (msg1.charAt(i) + chave);
	                    crip = crip + ascii;
	                }
	            }
	            if (msg1.charAt(i) >= 65 && msg1.charAt(i) <= 90) {
	                if (msg1.charAt(i) + chave > 90) {
	                    x = (char) (msg1.charAt(i) + chave);
	                    y = (char) (x - 90);
	                    ascii = (char) (64 + y);
	                    crip = crip + ascii;
	                } else {
	                    ascii = (char) (msg1.charAt(i) + chave);
	                    crip = crip + ascii;
	                }
	            }
        	}
        }
        retorno = crip;
        for (int i = 0; i < crip.length(); i++) {
        	if(crip.charAt(i)==' '){
        		descrip = descrip + " ";
        	} else {
	            if (crip.charAt(i) >= 97 && crip.charAt(i) <= 122) {
	                if ((int) (crip.charAt(i) + chave) > 122) {
	                    x = (char) (crip.charAt(i) - chave);
	                    y = (char) (x - 122);
	                    ascii = (char) (96 + y);
	                    descrip = descrip + ascii;
	                } else {
	                    ascii = (char) (crip.charAt(i) - chave);
	                    descrip = descrip + ascii;
	                }
	            }
	            if (crip.charAt(i) >= 65 && crip.charAt(i) <= 90) {
	                if (crip.charAt(i) + chave > 90) {
	                    x = (char) (crip.charAt(i) - chave);
	                    y = (char) (x - 90);
	                    ascii = (char) (64 + y);
	                    descrip = descrip + ascii;
	                } else {
	                    ascii = (char) (crip.charAt(i) - chave);
	                    descrip = descrip + ascii;
	                }
	            }
        	}
        }
        retorno = retorno + " - " + descrip;
        return retorno;
	}
}
