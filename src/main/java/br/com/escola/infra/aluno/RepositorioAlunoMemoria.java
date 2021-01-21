package br.com.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.escola.dominio.aluno.CPF;
import br.com.escola.dominio.aluno.RepositorioAluno;

public class RepositorioAlunoMemoria implements RepositorioAluno
{
	private List<Aluno> matriculados = new ArrayList<>();
	
	@Override
	public void matricular(Aluno aluno) 
	{
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) 
	{
		return this.matriculados.stream()
				.filter(aluno -> aluno.getCpf().equals(cpf.getNumero()))
				.findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() 
	{
		return matriculados;
	}

}
