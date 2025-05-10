//816034459
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardHolderKeyListener extends KeyAdapter {
    private CreditCardGUI ccg;

    public CardHolderKeyListener(CreditCardGUI gui) {
         this.ccg = gui;  
    }
    
    public void keyTyped(KeyEvent e){
    }
    
    public void keyPressed(KeyEvent e){
    }
    
    public void keyReleased(KeyEvent e) {
        String name = ccg.getName().getText();
        
        //Checking validity of input
        if (name.isEmpty()) {
            ccg.getMessageLabel1().setText("The name on the card cannot be blank");
        }
        
        else if (!name.matches("[a-zA-Z ]+")) {
            ccg.getMessageLabel1().setText("Invalid Input- input must only be letters");
        } 
        else {
            ccg.getMessageLabel1().setText("");
            ccg.getOverlayLabel5().setText(name.toUpperCase());
        }
    }
}
