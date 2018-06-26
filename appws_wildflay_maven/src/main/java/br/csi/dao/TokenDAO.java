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
	//Tabela Hash que mantém a informação de quais tokens são validos
	private static final Map<String, TokenUsuario> TOKENS_VALIDOS = 
									new LinkedHashMap<String, TokenUsuario>();
	// variável long que matém 1 min em millis
	static final long UM_MINUTO_EM_MILLIS=60000;
	/*Recebe um usuário válido e gera um token válido para
	* esse usuário
	*/
	public String gerarTokenValido(Usuario usuario){
		
		Calendar horaAtual = Calendar.getInstance();
		long tempo = horaAtual.getTimeInMillis();
		Date adicionado1min = new Date(tempo+(1 * UM_MINUTO_EM_MILLIS));
			
		//Gera número aleatório para o token
		Random gerador = new Random();
		String tokenTemp = String.valueOf(gerador.nextFloat());			
		TokenUsuario tUs = new TokenUsuario(tokenTemp, adicionado1min, usuario);
		TOKENS_VALIDOS.put(tokenTemp, tUs);
		return tokenTemp;
	}//código segue abaixo ...	
	
	/*
	 * Recebe um token, estrai esse token da tabela hash para 
	 * testar com a hora atual se a validade ainda está vigente
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
				//data atual antes da data de validação
			}else if(dAtual.compareTo(tokenUsuario.getValidade()) < 0){			
				return true;
			}
		}catch(NullPointerException e){
			throw new AutorizacaoException(token);
		}			
		return false;
	}
	
}
