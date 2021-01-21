package br.com.escola.aplicacao.aluno.matricular;

public class MatricularAlunoDTO 
{
	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;
	
	public MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) 
	{
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}

	public String getNomeAluno() 
	{
		return nomeAluno;
	}

	public String getCpfAluno() 
	{
		return cpfAluno;
	}

	public String getEmailAluno() 
	{
		return emailAluno;
	}
}
