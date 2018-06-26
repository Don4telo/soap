package br.csi.model;

import java.util.ArrayList;

public class Track {
            
    private ArrayList<Trackpoint> trackpoints ;
       
    public Track(){
          
    }

    public Track(ArrayList<Trackpoint> trackpoints) {
        this.trackpoints = trackpoints;
    }

    
    
    public ArrayList<Trackpoint> getTrackpoints() {
        return trackpoints;
    }

    public void setTrackpoints(ArrayList<Trackpoint> trackpoints) {
        this.trackpoints = trackpoints;
    }

    

   
       
}
