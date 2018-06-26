package br.csi.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import br.csi.dao.UsuarioDAO;
import br.csi.model.Usuario;

public class Teste {

	public static void main(String args[]){
	
		//testeDatas();
		Usuario u = new Usuario("abc","12s3");
		
		//System.out.println(new UsuarioDAO().autenticar(u));
		//ran();
		pegaValor();
	}
	
	public static void pegaValor(){
		Map<String, Usuario> USUARIOS = new LinkedHashMap<String, Usuario>();

			USUARIOS.put("a1", new Usuario("abc", "123"));
			USUARIOS.put("a2", new Usuario("ale", "1234"));

			Usuario u = USUARIOS.get("a1");
			System.out.println(u.getPass());
			
	}
	
	public static void ran(){
		Random gerador = new Random();
		System.out.println(gerador.nextFloat());
	}
	
	static final long ONE_MINUTE_IN_MILLIS=60000;
	private static void testeDatas(){
		Date dAtual = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String te = dateFormat.format(dAtual);
		System.out.println("hora atual"+te);
		
		Calendar horaAtual = Calendar.getInstance();
		long tempo = horaAtual.getTimeInMillis();
		Date adicionado10min = new Date(tempo+(10 * ONE_MINUTE_IN_MILLIS));
		String hora10min = dateFormat.format(adicionado10min);
		
		System.out.println("hora + 10 min "+hora10min);
		
		if(dAtual.compareTo(adicionado10min) > 0){
			System.out.println("data atual maior q data do token");
		}else if(dAtual.compareTo(adicionado10min) == 0){
			System.out.println("datas iquais");
		}else if(dAtual.compareTo(adicionado10min) < 0){
			System.out.println("data atual antes da data para comparação");			
		}	
	}
	
	
}
