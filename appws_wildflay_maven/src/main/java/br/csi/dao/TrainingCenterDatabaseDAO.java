/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.csi.dao;

import br.csi.model.TrainingCenterDatabase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author MardequartzO
 */
public class TrainingCenterDatabaseDAO {
    
    private Map<String, TrainingCenterDatabase> TREINOS = new LinkedHashMap<String, TrainingCenterDatabase>();
    
    public List<TrainingCenterDatabase> getTreinos(){		
		return new ArrayList<TrainingCenterDatabase>(TREINOS.values());		
	}
    
}
