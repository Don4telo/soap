package br.csi.ws;
import javax.xml.ws.Endpoint;
public class PublicaWS {

	public static void main(String args[]){
		CarroWSImpl wsCarro = new CarroWSImpl();
		String urlCarroWS = "http://localhost:8080/carrows";
		System.out.println(urlCarroWS+"?wsdl");
				
		Endpoint.publish(urlCarroWS, wsCarro);	
	}	
}


