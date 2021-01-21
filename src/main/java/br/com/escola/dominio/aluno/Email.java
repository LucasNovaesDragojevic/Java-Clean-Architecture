package br.com.escola.dominio.aluno;

public class Email 
{
	private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	private String endereco;

	public Email(String endereco)
	{
		if (endereco == null || endereco.isBlank()|| !endereco.matches(PATTERN_EMAIL))
			throw new IllegalArgumentException("E-mail inválido");
			
		this.endereco = endereco;
	}

	public String getEndereco() 
	{
		return endereco;
	}
}
