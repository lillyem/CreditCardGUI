//816034459
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExpiryKeyListener extends KeyAdapter {
    private CreditCardGUI ccg;

    public ExpiryKeyListener(CreditCardGUI gui) {
        this.ccg = gui;
    }
    
    
    public void keyTyped(KeyEvent e){
        
    }
    
    public void keyPressed(KeyEvent e){
        
    }
    
    public void keyReleased(KeyEvent e) {
        String expiry = ccg.getExpiration().getText();
        //Checking validity of input
        //Assuming that validity checks only applies to format
        //and not to invalid dates i.e any date before the current date 
        //since those cards would be expired
        if (expiry.isEmpty()) {
            ccg.getMessageLabel3().setText("The expiry date cannot be blank");
        }
        else if (!expiry.matches("(0[1-9]|1[0-2])/\\d{2}")) {
            ccg.getMessageLabel3().setText("Invalid Input- Input must be MM/YY");
        } else {
            ccg.getMessageLabel3().setText("");
            ccg.getOverlayLabel6().setText(expiry);
        }
    }
}
