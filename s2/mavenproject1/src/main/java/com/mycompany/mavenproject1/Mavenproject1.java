package com.mycompany.mavenproject1;

import java.awt.Dimension;
import java.awt.Toolkit;




/**
 *
 * @author youcef
 */
public class Mavenproject1 {

    public static void main(String[] args) {

        login g =new login();
        g.pack();
       /*
        Dimension taillScreen=Toolkit.getDefaultToolkit().getScreenSize();
        g.setSize((taillScreen.width)/4, (taillScreen.height)/2);
*/
        g.setLocationRelativeTo(null);
         g.setVisible(true);
        
        
    }
}
