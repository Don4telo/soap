/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.csi.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author cromo
 */

@XmlRootElement(name = "activities")
public class Activities {
    Activity Activity;
    
    public Activities(){
        
        
    }
    @XmlElement(name="activity")
    public Activity getActivity() {
        return Activity;
    }

    public void setActivity(Activity Activity) {
        this.Activity = Activity;
    }
}
