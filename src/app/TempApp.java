
package app;

import cdp.*;

/**
 *
 * @author Lampier
 */
public class TempApp {
    public static void main(String args[]){
        AirConditioner ar = new AirConditioner();
       
        //external sensors
        Sensor sensor1 = new Sensor(1);
        sensor1.addObserver(ar);
        Sensor sensor2 = new Sensor(1);
        sensor2.addObserver(ar);
        Sensor sensor3 = new Sensor(1);
        sensor3.addObserver(ar);
        
        // internal sensors
        Sensor sensor4 = new Sensor(0);
        sensor4.addObserver(ar);
        Sensor sensor5 = new Sensor(0);
        sensor5.addObserver(ar);
        Sensor sensor6 = new Sensor(0);
        sensor6.addObserver(ar);
        
        //data
        sensor1.setTemperature(23.7);
        sensor2.setTemperature(17.2);
        sensor3.setTemperature(19.4);
        
        sensor4.setnumberOfPeople(3);
        sensor5.setnumberOfPeople(1);
        sensor6.setnumberOfPeople(5);
        
        sensor6.setnumberOfPeople(-4);
        sensor3.setTemperature(0);
        sensor6.setnumberOfPeople(10);
        sensor4.setnumberOfPeople(0);
        sensor5.setnumberOfPeople(0);
        sensor1.setTemperature(18.7);
        sensor3.setTemperature(25);
        sensor6.setnumberOfPeople(0);
        
        
    }
}
