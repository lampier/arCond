package test.java;



import cdp.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lampier
 */
public class Tests {
    
    @Test
    public void testInternalSensorTemperature() {
        Sensor sensor = new Sensor(0);
        sensor.setnumberOfPeople(1);
        assertEquals(sensor.getnumberOfPeople(), 1);      
    }
    
 	@Test
    public void testExternalSensorTemperature() {
        Sensor sensor = new Sensor(1);
        sensor.setTemperature(25.0);
        assertEquals(sensor.getTemperature(), 25.0,0);
    }
        
}
