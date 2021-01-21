package br.com.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.CPF;
import br.com.escola.infra.aluno.RepositorioAlunoMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveSerPersistido() 
	{
		RepositorioAlunoMemoria repositorioAluno = new RepositorioAlunoMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorioAluno);
		MatricularAlunoDTO matricularAlunoDTO = new MatricularAlunoDTO("Tobias", "123.456.789-00", "tobias@email.com");
		useCase.executa(matricularAlunoDTO);
		Aluno alunoEncontrado = repositorioAluno.buscarPorCPF(new CPF("123.456.789-00"));
		assertEquals("Tobias", alunoEncontrado.getNome());
		assertEquals("123.456.789-00", alunoEncontrado.getCpf());
		assertEquals("tobias@email.com", alunoEncontrado.getEmail());
	}

}
