/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homesmarttrack;

/**
 *Project 50% HomeSmartTrack 
 *started 24/10/2026 
 *finished --
 * @author Adelina-Section1
 */

import appliances.ManageAppliances;

public class HomeSmartTrack {

    public static void main(String[] args) {
       
       ManageAppliances manager = new ManageAppliances();
       
       MainMenu menu = new MainMenu(manager);
       menu.setVisible(true);
    }
}
