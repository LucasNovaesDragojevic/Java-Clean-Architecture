package br.com.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.escola.dominio.aluno.CPF;

class CPFTest {

	@Test
	void naoDeveCriarCPFCasoNumeroSejaInvalido() 
	{
		assertThrows(IllegalArgumentException.class, () -> new CPF(null));
		assertThrows(IllegalArgumentException.class, () -> new CPF(""));
		assertThrows(IllegalArgumentException.class, () -> new CPF("a"));
		assertThrows(IllegalArgumentException.class, () -> new CPF("123456789"));
	}
	
	@Test
	void deveCriarCPFCasoNumeroSejaCorreto()
	{
		assertDoesNotThrow(() -> new CPF("123.456.789-00"));
	}

}
