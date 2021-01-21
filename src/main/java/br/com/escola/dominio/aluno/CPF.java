package br.com.escola.dominio.aluno;

public class CPF 
{
	private static final String PATTERN_CPF = "^([0-9]{3}\\.?){3}-?[0-9]{2}$";
	
	private String numero;
	
	public CPF(String numero)
	{
		if (numero == null || numero.isBlank() || !numero.matches(PATTERN_CPF))
			throw new IllegalArgumentException("CPF inválido");
		
		this.numero = numero;
	}

	public String getNumero()
	{
		return numero;
	}
}
