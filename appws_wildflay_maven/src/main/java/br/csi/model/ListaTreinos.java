package br.csi.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="treinos")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaTreinos {
	
	@XmlElement(name="treino")
	private List<TrainingCenterDatabase> treinos;
	
	public ListaTreinos(List<TrainingCenterDatabase> treinos){
		this.treinos = treinos;
	}
	public ListaTreinos(){}	
}


