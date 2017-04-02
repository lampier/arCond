/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Lampier
 */
public class AirConditioner implements Observer {
    
    private static final int stableTemp = 25;
    
    private int peopleTemp=0;
    private double avaregeSensorsTemperature=0;
    private double finalTemperature=0;
    private int count=1;
    private ArrayList<Sensor> sensors;

    public AirConditioner() {
        this.sensors = new ArrayList<Sensor>();        
    }
        
    @Override
    public void update(Observable o, Object arg) {
        
        Sensor sensor = (Sensor) o;
        sensors.add(sensor);
        if(sensor.getType() == 0){
        	this.peopleTemp += sensor.getnumberOfPeople();
        }else{
        	if(count == 1)	
        		this.avaregeSensorsTemperature = sensor.getTemperature();
        	else
        		this.avaregeSensorsTemperature = (this.avaregeSensorsTemperature+sensor.getTemperature())/2;
        	
        	count++;
       	}
        this.finalTemperature = Math.round(this.avaregeSensorsTemperature + this.peopleTemp);
        
        if(this.finalTemperature == 25){
        	System.out.println("Temperature is stable on 25 Celcius");
        }else if(this.finalTemperature <25){
        	System.out.println("Current temperature: "+this.finalTemperature+". It should be 25 Celcius, increasing temperature");
        }else
        	System.out.println("Current temperature: "+this.finalTemperature+". It should be 25 Celcius, decreasing temperature");
      
    }

 
    

    
    
}
