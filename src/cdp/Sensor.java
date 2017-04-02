/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

import java.util.Observable;

/**
 *
 * @author Lampier
 */
public class Sensor extends Observable {
    private int numberOfPeople;
    private double temperature;
    private int type; //0 is internal 1 is external   
    
    public Sensor(int type, int nop) {
    	this.type = type;
    	this.numberOfPeople = nop;
    }     
    
    public Sensor(int type, double temp) {
    	this.type = type;
    	this.temperature = temp;
    }  

    public int getnumberOfPeople() {
        return numberOfPeople;
    }
    
    public Sensor(int type) {
    	this.type = type;
    }

    public void setnumberOfPeople(int numberOfPeople) {
        
        this.numberOfPeople = numberOfPeople;
        setChanged();
        notifyObservers();
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        setChanged();
        notifyObservers();
    }

    public int getType(){
    	return this.type;
    }
    
}
