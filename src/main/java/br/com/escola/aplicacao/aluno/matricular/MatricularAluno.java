package br.com.escola.aplicacao.aluno.matricular;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.FabricaAluno;
import br.com.escola.dominio.aluno.RepositorioAluno;

public class MatricularAluno 
{
	private RepositorioAluno repositorioAluno;

	public MatricularAluno(RepositorioAluno repositorioAluno) 
	{
		this.repositorioAluno = repositorioAluno;
	}
	
	public void executa(MatricularAlunoDTO matricularAlunoDTO)
	{
		Aluno novo = new FabricaAluno().comNomeCPFEmail(matricularAlunoDTO.getNomeAluno(), matricularAlunoDTO.getCpfAluno(), matricularAlunoDTO.getEmailAluno()).criar();
		repositorioAluno.matricular(novo);
	}
}
