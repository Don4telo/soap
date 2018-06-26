package br.csi.model;

public class Position {
        
        double LatitudeDegrees;
        double LongitudeDegrees;
    
    public Position(){  
    }

    public Position(double LatitudeDegrees, double LongitudeDegrees) {
        this.LatitudeDegrees = LatitudeDegrees;
        this.LongitudeDegrees = LongitudeDegrees;
    }
    

    public double getLatitudeDegrees() {
        return LatitudeDegrees;
    }

    public void setLatitudeDegrees(double LatitudeDegrees) {
        this.LatitudeDegrees = LatitudeDegrees;
    }

    public double getLongitudeDegrees() {
        return LongitudeDegrees;
    }

    public void setLongitudeDegrees(double LongitudeDegrees) {
        this.LongitudeDegrees = LongitudeDegrees;
    }
        
        
        
}
