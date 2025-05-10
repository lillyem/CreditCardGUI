//816034459
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreditCardGUI{
    
    //Overlay labels 
    private JLabel overlayLabel1,overlayLabel2, overlayLabel3,overlayLabel4,overlayLabel5, overlayLabel6;
    
    //Validation message labels
    private JLabel messageLabel1,messageLabel2, messageLabel3; 
    
    //Credit card image label
    private JLabel imageLabel; 
    private ImageIcon originalImage;
    
    //Labels and data fields
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel cardNumberLabel;
    private JTextField cardNumberField;
    private JLabel expirationLabel;
    private JTextField expirationField;
    
    //Buttons
    private JButton verifyButton;
    private JButton clearButton;
    
    
    public CreditCardGUI(){
        
        JFrame frame = new JFrame("Credit Card Simulation");
        frame.setSize(600, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(null);  // No layout manager, to allow absolute positioning
        originalImage = new ImageIcon("default_image.jpg");  
        Image image = originalImage.getImage().getScaledInstance(500, 300, Image.SCALE_SMOOTH);  // Resize image if needed
        ImageIcon resizedImage = new ImageIcon(image);
        imageLabel = new JLabel(resizedImage);
        imageLabel.setBounds(50, 50, 500, 300); 

        // JLabels superimposed over the credit card image
        overlayLabel1 = new JLabel("OVL1");
        overlayLabel1.setFont(new Font("Arial", Font.BOLD, 30));
        overlayLabel1.setForeground(Color.ORANGE);
        overlayLabel1.setBounds(55, 180, 300, 50); 
        
        overlayLabel2 = new JLabel("OVL2");
        overlayLabel2.setFont(new Font("Arial", Font.BOLD, 30));
        overlayLabel2.setForeground(Color.ORANGE);
        overlayLabel2.setBounds(175, 180, 300, 50);  
        
        overlayLabel3 = new JLabel("OVL3");
        overlayLabel3.setFont(new Font("Arial", Font.BOLD, 30));
        overlayLabel3.setForeground(Color.ORANGE);
        overlayLabel3.setBounds(285, 180, 300, 50);  
        
        overlayLabel4 = new JLabel("OVL4");
        overlayLabel4.setFont(new Font("Arial", Font.BOLD, 30));
        overlayLabel4.setForeground(Color.ORANGE);
        overlayLabel4.setBounds(385, 180, 300, 50);  
            
        overlayLabel5 = new JLabel("Overlay Label5");
        overlayLabel5.setFont(new Font("Arial", Font.BOLD, 20));
        overlayLabel5.setForeground(Color.RED);
        overlayLabel5.setBounds(100, 290, 300, 50);  
        
        overlayLabel6 = new JLabel("Overlay6");
        overlayLabel6.setFont(new Font("Arial", Font.BOLD, 20));
        overlayLabel6.setForeground(Color.BLUE);
        overlayLabel6.setBounds(435, 300, 300, 50); 
        
        imagePanel.setLayout(null);
        imagePanel.add(overlayLabel1);  
        imagePanel.add(overlayLabel2); 
        imagePanel.add(overlayLabel3);
        imagePanel.add(overlayLabel4);
        imagePanel.add(overlayLabel5);
        imagePanel.add(overlayLabel6);
        imagePanel.add(imageLabel);
        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS)); 
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 

        // Cardholder's name
        JPanel namePanel = new JPanel();
        namePanel.setLayout(new BoxLayout(namePanel, BoxLayout.Y_AXIS)); 
        nameLabel = new JLabel("Cardholder's Name:");
        nameField = new JTextField();
        messageLabel1 = new JLabel();//"card holder message"
        messageLabel1.setForeground(Color.RED);
        nameField.setPreferredSize(new Dimension(150, 25)); 
        namePanel.add(nameLabel);
        namePanel.add(nameField);
        namePanel.add(messageLabel1);
        
        // Card number
        JPanel cardNumberPanel = new JPanel();
        cardNumberPanel.setLayout(new BoxLayout(cardNumberPanel, BoxLayout.Y_AXIS));
        cardNumberLabel = new JLabel("Card Number:");
        cardNumberField = new JTextField();
        messageLabel2 = new JLabel();//"card number message"
        messageLabel2.setForeground(Color.RED);
        cardNumberField.setPreferredSize(new Dimension(150, 25)); 
        cardNumberPanel.add(cardNumberLabel);
        cardNumberPanel.add(cardNumberField);
        cardNumberPanel.add(messageLabel2);
        
        // Expiration date
        JPanel expirationPanel = new JPanel();
        expirationPanel.setLayout(new BoxLayout(expirationPanel, BoxLayout.Y_AXIS));
        expirationLabel = new JLabel("Expiration Date:");
        expirationField = new JTextField();
        messageLabel3 = new JLabel();//"expiration message"
        messageLabel3.setForeground(Color.RED);
        expirationField.setPreferredSize(new Dimension(15, 25)); 
        expirationPanel.add(expirationLabel);
        expirationPanel.add(expirationField);
        expirationPanel.add(messageLabel3);

        verifyButton = new JButton("Verify");
        clearButton = new JButton("Clear");
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(verifyButton);
        buttonPanel.add(clearButton);
        
        // Add all the panels to the formPanel
        formPanel.add(namePanel);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));  
        formPanel.add(cardNumberPanel);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanel.add(expirationPanel);
        formPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        formPanel.add(buttonPanel);
        
        frame.add(imagePanel);
        frame.add(formPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
    //Accessors

    public JTextField getName() {
        return nameField;
    }

    public JTextField getCardNumber() {
        return cardNumberField;
    }

    public JTextField getExpiration() {
        return expirationField;
    }

    public JLabel getMessageLabel1() {
        return messageLabel1;
    }

    public JLabel getMessageLabel2() {
        return messageLabel2;
    }

    public JLabel getMessageLabel3() {
        return messageLabel3;
    }

    public JLabel getOverlayLabel1() {
        return overlayLabel1;
    }

    public JLabel getOverlayLabel2() {
        return overlayLabel2;
    }

    public JLabel getOverlayLabel3() {
        return overlayLabel3;
    }

    public JLabel getOverlayLabel4() {
        return overlayLabel4;
    }

    public JLabel getOverlayLabel5() {
        return overlayLabel5;
    }

    public JLabel getOverlayLabel6() {
        return overlayLabel6;
    }

    public JButton getVerifyButton() {
        return verifyButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    // Image Setters
    public void setCardImage(ImageIcon imageIcon) {
        imageLabel.setIcon(imageIcon);
    }
    
}
