/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.csi.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author cromo
 */
public class Lap {
    
 private double TotalTimeSeconds;
 private double DistanceMeters;
 private double MaximumSpeed;
 private double Calories;
 private Track Track;
 
 private String StartTime;
 public Lap(){
        
    }

    public Lap(double TotalTimeSeconds, double DistanceMeters, double MaximumSpeed, double Calories, Track Track, String StartTime) {
        this.TotalTimeSeconds = TotalTimeSeconds;
        this.DistanceMeters = DistanceMeters;
        this.MaximumSpeed = MaximumSpeed;
        this.Calories = Calories;
        this.Track = Track;
        this.StartTime = StartTime;
    }
    @XmlAttribute(name = "StartTime")
    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

   
 
    

    public double getTotalTimeSeconds() {
        return TotalTimeSeconds;
    }

    public void setTotalTimeSeconds(double TotalTimeSeconds) {
        this.TotalTimeSeconds = TotalTimeSeconds;
    }

    public double getDistanceMeters() {
        return DistanceMeters;
    }

    public void setDistanceMeters(double DistanceMeters) {
        this.DistanceMeters = DistanceMeters;
    }

    public double getMaximumSpeed() {
        return MaximumSpeed;
    }

    public void setMaximumSpeed(double MaximumSpeed) {
        this.MaximumSpeed = MaximumSpeed;
    }

    public double getCalories() {
        return Calories;
    }

    public void setCalories(double Calories) {
        this.Calories = Calories;
    }

    public Track getTrack() {
        return Track;
    }

    public void setTrack(Track Track) {
        this.Track = Track;
    }

    
    
    
    
    
}
