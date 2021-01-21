package br.com.escola.infra.indicacao;

import br.com.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoJavaMail implements EnviarEmailIndicacao
{

	@Override
	public void enviarPara(Aluno indicado) 
	{
		// TODO Criar lógica de envio de e-mail com Java Mail
	}

}
