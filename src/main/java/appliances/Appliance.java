package appliances;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *start date 14/11/2026
 * @author Adelina
 */

import java.io.Serializable;//lecture 9 slides

/*Why Abstract? Did some research on W3Schools and based on my parts i think abstract 
class here is good choice because gas and electricity use different calculations. 
https://www.w3schools.com/java/java_abstract.asp? - W3Schools reference
*/
public abstract class Appliance implements Serializable {
    
    //attributes 
    private String name;
    private double hoursDay;
    
    //constructor
    public Appliance(String name,double hoursDay){
        this.name= name;
        this.hoursDay= hoursDay;
    }
    
    //getters
    public String getName(){
        return name;
    }
    
   public double getHoursDay(){
       return hoursDay;
   }
   
   //abstract method - w3schools adaptation
   
   public abstract double calculateDailyEnergy();
   public String getApplianceName(){
       return name;
   }
   
}
