/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appliances;

/**
 *
 * @author Adelina
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;//Additional imports based from week 9 notes for file operation

import java.util.ArrayList;
import java.util.Iterator;
import com.mycompany.homesmarttrack.SummaryDisplay;

public class ManageAppliances implements SummaryDisplay {
    
    /*@Override
    public String getSummary() {
        return "Appliance summary not done yet"; //java pwp notes
    }*/ //- for checkpoint 2 
    
    private ArrayList<Appliance> appliances;
    
    public ManageAppliances(){
        appliances = new ArrayList<Appliance>();
    }
    
    //add appliance
    public void addAppliance(Appliance appliance){
        appliances.add(appliance);
    }
    
    //view appliances
    
    public ArrayList<Appliance> getAllAppliances(){
        return appliances;
    }//allows our view all button to take and show data
    
    //search appliances - adapted from notes
    
    public Appliance searchAppliance(String name){
        
        Iterator<Appliance> it = appliances.iterator();//creates an interator for my array list- taken from W3SCHOOLS
        
        while (it.hasNext()){//takes next appliance
            Appliance appliance = it.next();
            
            if (appliance.getName().equalsIgnoreCase(name)){
                return appliance;//returns to matching object
            }
        }
        
        return null; //shows no matching appliance was found
    }
    
    public boolean deleteAppliance(String name){
        
        Iterator<Appliance> it = appliances.iterator();
        
        while (it.hasNext()){
            Appliance appliance =it.next();
            if (appliance.getName().equalsIgnoreCase(name)){
                it.remove();
                return true;
            }
        }
        
        return false;
    }
    
    //calculate total daily energy - polymorphism example
    public double calculateTotalDailyEnergy(){
        double total = 0;
        
        for(Appliance appliance : appliances){//for loop 
            total = total +appliance.calculateDailyEnergy();
        }
        return total;
    }
    
    @Override
    public String getSummary(){
        return "Total Appliances: "+ appliances.size() + " | Total Daily Energy: " 
                + calculateTotalDailyEnergy() + " kWh";
    }// new adapted code from checkpoint 2 
    
    //to save to file
    public void saveToFile(String filePath) throws IOException {
        File file = new File(filePath);
        
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(appliances);
        oos.close();
    }
    
    //to load from file - from notes lecture 9
    
    public void loadFromFile(String filePath) throws IOException, ClassNotFoundException {
        
        File file = new File(filePath);
        
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        appliances = (ArrayList<Appliance>) ois.readObject();
        ois.close();
    }
}

