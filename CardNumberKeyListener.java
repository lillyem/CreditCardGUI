//816034459
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardNumberKeyListener extends KeyAdapter {
    private CreditCardGUI ccg;

    public CardNumberKeyListener(CreditCardGUI gui) {
        this.ccg = gui;
    }
    
    public void keyTyped(KeyEvent e){
    }
    
    public void keyPressed(KeyEvent e){
    }
    
    public void keyReleased(KeyEvent e) {
        String number = ccg.getCardNumber().getText().replaceAll(" ", "");
        
        //Checking validity of input
        if (number.isEmpty()) {
            ccg.getMessageLabel2().setText("The card number cannot be blank");
        }
        else if (!number.matches("\\d{0,16}")) {
            ccg.getMessageLabel2().setText("Invalid Input- Input must be 16 digits");
            return;
        }
        else if(number.length() < 16){
            ccg.getMessageLabel2().setText("Invalid Input- Input must be 16 digits");
        }
        else{
            ccg.getMessageLabel2().setText("");
            //Setting the overlay labels for the four 4-digit parts
            //of the credit card number 
            ccg.getOverlayLabel1().setText(number.substring(0, 4)); 
            ccg.getOverlayLabel2().setText(number.substring(4, 8));  
            ccg.getOverlayLabel3().setText(number.substring(8, 12)); 
            ccg.getOverlayLabel4().setText(number.substring(12, 16)); 
            
        }
        
    }
}
