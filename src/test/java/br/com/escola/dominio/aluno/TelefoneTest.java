package br.com.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.escola.dominio.aluno.Telefone;

class TelefoneTest 
{

	@Test
	void naoDeveCriarTelfoneSeDDDEstiverErrado() 
	{
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "123456789"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "123456789"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("123", "123456789"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("a", "123456789"));
	}
	
	@Test
	void naoDeveCriarTelfoneSeNumeroEstiverErrado() 
	{
		assertThrows(IllegalArgumentException.class, () -> new Telefone("12", "1234567"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("12", "1234567890"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("12", "a"));
	}
	
	@Test
	void deveCriarTelefoneQuandoDDDENumeroEstiveremCorretos()
	{
		assertDoesNotThrow(() -> new Telefone("12", "123456789"));
	}
}
