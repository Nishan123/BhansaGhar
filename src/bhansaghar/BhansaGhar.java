/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bhansaghar;

import view.LoginScreen;
import view.SettingScreen;


/*
 *
 *@author Nishan Giri
 *Sanjeeta Aryal
 *Ritika Shrestha
 *Sujal Silwal (Git Tester)
 */
public class BhansaGhar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginScreen settingScreen = new LoginScreen();

        settingScreen.setVisible(true);
        settingScreen.setDefaultCloseOperation(LoginScreen.EXIT_ON_CLOSE);

    }

}
