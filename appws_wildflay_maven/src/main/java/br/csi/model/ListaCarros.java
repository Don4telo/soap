package br.csi.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="carros")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaCarros {
	
	@XmlElement(name="carro")
	private List<Carro> carros;
	
	public ListaCarros(List<Carro> carros){
		this.carros = carros;
	}
	public ListaCarros(){}	
}


