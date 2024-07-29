/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bhansaghar;

import view.BillingScreen;
import view.OrdersScreen;
import view.SignupScreen;
import view.TableScreen;

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
        // TODO code application logic here
        BillingScreen mainFrame = new BillingScreen();
//        SignupScreen mainFrame = new SignupScreen();


mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(SignupScreen.EXIT_ON_CLOSE);
      
    }
    
}
