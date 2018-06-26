package br.csi.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import br.csi.model.Usuario;

public class UsuarioDAO {	
	Map<String, Usuario> USUARIOS = new LinkedHashMap<String, Usuario>();
	public static final TokenDAO tokenDAO = new TokenDAO();
	
	public UsuarioDAO(){
		USUARIOS.put("a1", new Usuario("abc", "123"));
		USUARIOS.put("a2", new Usuario("ale", "1234"));
	}	
	/*
	 * Autentica o usu�rio gerando um token para disponibilizar para quem 
	 * pediu a autentica��o
	 * */
	public String autenticar(Usuario usAutenticar){
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>(USUARIOS.values());					 
		for(Usuario us : usuarios){						
			if( us.getUser().equals(usAutenticar.getUser()) && 
									us.getPass().equals(usAutenticar.getPass()) ){								
				return tokenDAO.gerarTokenValido(usAutenticar);										 			 
			}else{
				System.out.println("N�o autenticado o usu�rio: "+usAutenticar.getUser());							
			}			
		}				
		return null;
	}}

