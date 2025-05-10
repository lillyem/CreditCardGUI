//816034459
public class CreditCardSimulation{
    public static void main(String[] args){
        CreditCardGUI ccg = new CreditCardGUI();
        
        ccg.getName().addKeyListener(new CardHolderKeyListener(ccg));
        ccg.getCardNumber().addKeyListener(new CardNumberKeyListener(ccg));
        ccg.getExpiration().addKeyListener(new ExpiryKeyListener(ccg));
            
        CreditCardButtonListener buttonListener = new CreditCardButtonListener(ccg);
        ccg.getVerifyButton().addActionListener(buttonListener);
        ccg.getClearButton().addActionListener(buttonListener);
        
    }
}