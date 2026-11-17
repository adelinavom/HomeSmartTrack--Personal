/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appliances;

/**
 *
 * @author Adelina
 */
public class GasAppliances extends Appliance {
    
    //attributes 
    private double gasRate;
    
    //constructor
    public GasAppliances(String name, double hoursDay, double gasRate){
        
        super(name, hoursDay);
        this.gasRate= gasRate;
    }
    
    //getters
    public double getGasRate(){
        return gasRate;
    }
    
    //overriding
    
    @Override
    
    public double calculateDailyEnergy(){
        return gasRate * getHoursDay(); //gas rate x hours = kWh/day ( not cubic meters)
    }
    
    @Override
    
    public String getApplianceName(){
        return "Gas: " + getName();
    }
    
}
