package sysmi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import sysmi.Questao3;

public class Questao3Test {
	
	@Test
	public void testOk() {
		String a = Questao3.executa("5");
		assertEquals("1 / 2 / 3 / 5 / 8 / ", a);
	}
	
	@Test
	public void testNotOk() {
		String a = Questao3.executa("a");
		assertEquals("Por favor coloque um valor numerico!", a);
	}
	
	@Test
	public void testNotOk2() {
		String a = Questao3.executa("1");
		assertEquals("Coloque um valor maior que 1", a);
	}
}
