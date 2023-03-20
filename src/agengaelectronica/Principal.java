
package agengaelectronica;

import igu.Pantalla;

import java.awt.*;

public class Principal {

 
    public static void main(String[] args) {
       Pantalla programScreen = new Pantalla();
       programScreen.setMinimumSize(new Dimension(400, 400));
       programScreen.setVisible(true);
       programScreen.setLocationRelativeTo(null);
    }
    
}
