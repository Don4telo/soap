/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.csi.model;

import java.util.ArrayList;

public class Activity {
    
    
    private String Id;
    private ArrayList<Lap> laps ;
    private String _Sport;

    public Activity(String Id, ArrayList<Lap> laps) {
        this.Id = Id;
        this.laps = laps;
    }
     
        
    public Activity(){    
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public ArrayList<Lap> getLaps() {
        return laps;
    }

    public void setLaps(ArrayList<Lap> laps) {
        this.laps = laps;
    }

    public String getSport() {
        return _Sport;
    }

    public void setSport(String _Sport) {
        this._Sport = _Sport;
    }

}