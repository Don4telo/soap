package br.csi.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import br.csi.model.AutorizacaoException;
import br.csi.model.TokenUsuario;
import br.csi.model.Usuario;

public class TokenDAO {
	//Tabela Hash que mant�m a informa��o de quais tokens s�o validos
	private static final Map<String, TokenUsuario> TOKENS_VALIDOS = 
									new LinkedHashMap<String, TokenUsuario>();
	// vari�vel long que mat�m 1 min em millis
	static final long UM_MINUTO_EM_MILLIS=60000;
	/*Recebe um usu�rio v�lido e gera um token v�lido para
	* esse usu�rio
	*/
	public String gerarTokenValido(Usuario usuario){
		
		Calendar horaAtual = Calendar.getInstance();
		long tempo = horaAtual.getTimeInMillis();
		Date adicionado1min = new Date(tempo+(1 * UM_MINUTO_EM_MILLIS));
			
		//Gera n�mero aleat�rio para o token
		Random gerador = new Random();
		String tokenTemp = String.valueOf(gerador.nextFloat());			
		TokenUsuario tUs = new TokenUsuario(tokenTemp, adicionado1min, usuario);
		TOKENS_VALIDOS.put(tokenTemp, tUs);
		return tokenTemp;
	}//c�digo segue abaixo ...	
	
	/*
	 * Recebe um token, estrai esse token da tabela hash para 
	 * testar com a hora atual se a validade ainda est� vigente
	 * */
	public boolean eValido(String token) throws AutorizacaoException{
		Date dAtual = new Date();
		// Estrai a entidade TokenUsuario relaionado ao token informado					
		TokenUsuario tokenUsuario = TOKENS_VALIDOS.get(token);
		
		try{
			//data atual maior q data do token
			if(dAtual.compareTo(tokenUsuario.getValidade()) > 0){			
				return false;
				// datas iquais
			}else if(dAtual.compareTo(tokenUsuario.getValidade()) == 0){			
				return true;
				//data atual antes da data de valida��o
			}else if(dAtual.compareTo(tokenUsuario.getValidade()) < 0){			
				return true;
			}
		}catch(NullPointerException e){
			throw new AutorizacaoException(token);
		}			
		return false;
	}
	
}
