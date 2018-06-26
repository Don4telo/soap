/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.csi.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 * @author cromo
 */
@XmlRootElement(name = "Treino")
@XmlType(propOrder = {"id","activities"})
public class TrainingCenterDatabase {
     private String id;
     Activities Activities;

    public TrainingCenterDatabase(){
        
    }
    @XmlElement(name="id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TrainingCenterDatabase(Activities Activities) {
        this.Activities = Activities;
    }
    @XmlElement(name="Activities")
    public Activities getActivities() {
        return Activities;
    }

    public void setActivities(Activities Activities) {
        this.Activities = Activities;
    }
     
     
    
  
       
}
