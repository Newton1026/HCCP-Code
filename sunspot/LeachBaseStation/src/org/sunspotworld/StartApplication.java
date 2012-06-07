package org.sunspotworld;

import com.sun.spot.sensorboard.peripheral.LEDColor;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class StartApplication extends MIDlet {
    int index = 0;

    protected void setup()  {
        System.out.println("setup");
    }

    

    protected void cleanup() throws Exception {
        System.out.println("cleanup");
       
        }

    protected void startApp() throws MIDletStateChangeException {
        setup();
        
        
        StartLeach leach = new StartLeach();
        leach.startLeach();
    }

    protected void pauseApp() {
    }

    protected void destroyApp(boolean bln) throws MIDletStateChangeException {
    }
   
   
}