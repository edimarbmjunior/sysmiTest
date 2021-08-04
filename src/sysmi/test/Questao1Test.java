package sysmi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import sysmi.Questao1;

public class Questao1Test {
	
	@Test
	public void testOk() {
		String a = Questao1.executa("1", "5");
		assertEquals("Maior primo entre os dois numeros ->5", a);
	}
	
	@Test
	public void testNotOk() {
		String a = Questao1.executa("10", "5");
		assertEquals("O primeiro numero tem que ser menor", a);
	}
	
	@Test
	public void testNotOk2() {
		String a = Questao1.executa("a", "5");
		assertEquals("Parametros invalidos", a);
	}
}
