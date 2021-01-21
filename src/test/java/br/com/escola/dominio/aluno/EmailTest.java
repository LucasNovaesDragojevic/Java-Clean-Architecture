package br.com.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.escola.dominio.aluno.Email;

class EmailTest 
{

	@Test
	void naoDeveCriarEmailComEnderecoInvalido() 
	{
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		assertThrows(IllegalArgumentException.class, () -> new Email("  "));
		assertThrows(IllegalArgumentException.class, () -> new Email("E-mail inválido"));
		assertThrows(IllegalArgumentException.class, () -> new Email("teste@"));
		assertThrows(IllegalArgumentException.class, () -> new Email("teste@teste"));
		assertThrows(IllegalArgumentException.class, () -> new Email("@teste"));
		assertThrows(IllegalArgumentException.class, () -> new Email("@teste.com"));
	}
	
	@Test
	void deveCriarEmailComEnderecoValido()
	{
		assertDoesNotThrow(() -> new Email("teste@teste.com"));
		assertDoesNotThrow(() -> new Email("teste@teste.com.br"));
	}

}
