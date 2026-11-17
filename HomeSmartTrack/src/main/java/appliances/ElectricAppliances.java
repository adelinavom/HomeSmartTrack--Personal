/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appliances;

/**
 *started 14/11
 * @author Adelina
 */

public class ElectricAppliances extends Appliance {
    
    //attributes
    
    private double watts;
    
    //constructor
    
    public ElectricAppliances(String name, double hoursDay, double watts){
        
        super(name,hoursDay);//w3schools super keyword
        this.watts= watts;
    }
    
    //getters
    public double getWatts(){
        return watts;
    }
    
    //overriding - lectures slides java
    
    @Override
    public double calculateDailyEnergy(){
        return(watts * getHoursDay())/1000; //watts x hours divided by 1000 = kWh/day
    }
    
    @Override 
    public String getApplianceName(){
        return "Electric: "+ getName();
    }
}
