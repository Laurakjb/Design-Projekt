package Controller;

import model.LPContainer;

import model.Copy;
/**
 * Write a description of class LPCtrl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPController {
    private LPContainer lpContainer;
    
    public LPController(){
        lpContainer = LPContainer.getInstance();
        
    }
    
    public Copy findCopyBySerialNumber(int serialNumber) {
        return lpContainer.findCopyBySerialNumber(serialNumber);
    }
}
