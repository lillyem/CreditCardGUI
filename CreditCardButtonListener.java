//816034459
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreditCardButtonListener implements ActionListener {
    private CreditCardGUI ccg;

    public CreditCardButtonListener(CreditCardGUI gui) {
        this.ccg = gui;
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Clear")) {
            
            //Clearing all the fields
            ccg.getName().setText("");
            ccg.getCardNumber().setText("");
            ccg.getExpiration().setText("");
            
            //Clearing all the message labels
            ccg.getMessageLabel1().setText("");
            ccg.getMessageLabel2().setText("");
            ccg.getMessageLabel3().setText("");
            
            //Clearing all the overlay label
            ccg.getOverlayLabel1().setText("");
            ccg.getOverlayLabel2().setText("");
            ccg.getOverlayLabel3().setText("");
            ccg.getOverlayLabel4().setText("");
            ccg.getOverlayLabel5().setText("");
            ccg.getOverlayLabel6().setText("");
            
            //Setting the card image to the default picture
            ccg.setCardImage(new ImageIcon("default_image.jpg"));

        } else if (command.equals("Verify")) {
            //Getting the strings from each field 
            String number = ccg.getCardNumber().getText().replaceAll(" ", "");
            String name = ccg.getName().getText().trim();
            String expiry = ccg.getExpiration().getText().trim();
            
            //Setting message label for name
            if (name.isEmpty()) {
                ccg.getMessageLabel1().setText("The name on the card cannot be blank");
            }
            
            //Setting message label for card number
            if (number.isEmpty()) {
                ccg.getMessageLabel2().setText("The card number cannot be blank");
            }
            
            //Setting message label for expiry
            if (expiry.isEmpty()) {
                ccg.getMessageLabel3().setText("The expiry date cannot be blank");
            }
            
            //If any of the fields have invalid input, set the image to default
            if (!number.matches("\\d{16}")) {
                ccg.setCardImage(new ImageIcon("default_image.jpg"));
                return;
            }
            else if(!name.matches("[a-zA-Z ]+")){
                ccg.setCardImage(new ImageIcon("default_image.jpg"));
                return;
            }
            else if(!expiry.matches("(0[1-9]|1[0-2])/\\d{2}")){
                ccg.setCardImage(new ImageIcon("default_image.jpg"));
                return;
            }
            
            //Displaying the relevant image
            else if (number.substring(0,1).equals("4")) {
                ccg.setCardImage(new ImageIcon("visa.jpg"));
            } 
            else if (number.substring(0,2).equals("51") || number.substring(0,2).equals("55")) {
                ccg.setCardImage(new ImageIcon("mastercard.jpg"));
            } 
            else if (number.substring(0,2).equals("34") || number.substring(0,2).equals("37")) {
                ccg.setCardImage(new ImageIcon("american express.jpg"));
            } 
            else if (number.substring(0,4).equals("6011")) {
                ccg.setCardImage(new ImageIcon("discovercard.jpg"));
            } 
            else {
                ccg.getMessageLabel2().setText("Invalid card number.");
                ccg.setCardImage(new ImageIcon("default_image.jpg"));
            }
            
        }
    }
}
