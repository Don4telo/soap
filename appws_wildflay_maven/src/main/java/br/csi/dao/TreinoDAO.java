package br.csi.dao;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import br.csi.model.TrainingCenterDatabase;

public class TreinoDAO {
	private Map<String, TrainingCenterDatabase> TREINOS = new LinkedHashMap<String, TrainingCenterDatabase>();
	
	
	
	public List<TrainingCenterDatabase> getTreinos(){		
		return new ArrayList<TrainingCenterDatabase>(TREINOS.size());		
	}	

}

