package sysmi.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import sysmi.Questao2;

public class Questao2Test {
	
	@Test
	public void testOk() {
		String a = Questao2.executa("anb");
		assertEquals("dqe - anb", a);
	}

}
