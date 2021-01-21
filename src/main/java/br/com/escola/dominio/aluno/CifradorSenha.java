package br.com.escola.dominio.aluno;

public interface CifradorSenha 
{
	String cifrarSenha(String senha);
	
	Boolean validarSenhaCifrada(String senhaCifrada, String senhaAberta);
}
