/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import javax.swing.JFrame;
/**
 *
 * @author Nishan Giri
 */
public class Navigation {
    
    public void NavigateTo(String frameTitle){
        JFrame newFrame = new JFrame(frameTitle);
        newFrame.setVisible(true);
    }
    
}
