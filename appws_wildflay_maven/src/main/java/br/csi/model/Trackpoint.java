package br.csi.model;

public class Trackpoint {
        
        String Time;
        double AltitudeMeters;
        double DistanceMeters;
        double Cadence;
        Position Position;
        
    public Trackpoint(){
    }

    public Trackpoint(String Time, double AltitudeMeters, double DistanceMeters, double Cadence, Position Position) {
        this.Time = Time;
        this.AltitudeMeters = AltitudeMeters;
        this.DistanceMeters = DistanceMeters;
        this.Cadence = Cadence;
        this.Position = Position;
    }

    
    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public double getAltitudeMeters() {
        return AltitudeMeters;
    }

    public void setAltitudeMeters(double AltitudeMeters) {
        this.AltitudeMeters = AltitudeMeters;
    }

    public double getDistanceMeters() {
        return DistanceMeters;
    }

    public void setDistanceMeters(double DistanceMeters) {
        this.DistanceMeters = DistanceMeters;
    }

    public double getCadence() {
        return Cadence;
    }

    public void setCadence(double Cadence) {
        this.Cadence = Cadence;
    }

    public Position getPosition() {
        return Position;
    }

    public void setPosition(Position Position) {
        this.Position = Position;
    }
        
        
                
}
