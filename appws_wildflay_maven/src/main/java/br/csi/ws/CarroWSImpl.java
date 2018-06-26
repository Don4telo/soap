package br.csi.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import br.csi.dao.CarroDAO;
import br.csi.dao.UsuarioDAO;
import br.csi.model.AutorizacaoException;
import br.csi.model.Carro;
import br.csi.model.ListaCarros;
import br.csi.model.Usuario;


@WebService(endpointInterface="br.csi.model.CarroWS", serviceName="CarroWS")
public class CarroWSImpl {

			
	@WebMethod(operationName="todosOsCarros")
	@WebResult(name="carros")
	public ListaCarros getCarros(){
		System.out.println("vai listar carros ....");
		
		
	ListaCarros cc= new ListaCarros(cDao.getCarros());
		
	for(int i = 0; i < cDao.getCarros().size(); i++){
		System.out.println(""+cDao.getCarros().get(i).getMarca());
	}
	
		return cc;
	}
	
	private CarroDAO cDao = new CarroDAO();
	@WebMethod(operationName="cadastrarCarro")
	@WebResult(name="carro")
	public Carro cadastrarCarro(@WebParam(name="carro") Carro carro, 
								@WebParam(name="chave") String chave, 
								@WebParam(name="token", header = true) String token) 
										throws AutorizacaoException{
		
		if(UsuarioDAO.tokenDAO.eValido(token)){
		System.out.println("token valido e vai cadastrar ..."+token);
			this.cDao.cadastrar(carro, chave);
		}else{
			throw new AutorizacaoException(token);
		}		
		return carro;
	}
	
	private UsuarioDAO uDao = new UsuarioDAO();
	@WebMethod(operationName="autenticar")
	@WebResult(name="token")
	public String autenticar(@WebParam(name="usuario") Usuario usuario){
		return  uDao.autenticar(usuario);
	}
	
}