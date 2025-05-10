# CreditCardGUI

# Overview
This Java application simulates a credit card payment GUI where users can input their cardholder name, card number, and expiry date. The program validates input and displays the correct credit card image (Visa, Mastercard, etc.) or an error message.

# Features
GUI with overlaid labels on a card image.

Real-time input validation for:

Cardholder name (letters only)

Card number (format and starting digits)

Expiry date (MM/YY format)

Button handling:

Verify: Validates input and updates the card image.

Clear: Resets all fields and GUI elements.

# Technologies
Java (Swing-based GUI)

BlueJ (recommended IDE)

Event handling with KeyListener and ActionListener

# Class Breakdown
## Class	Responsibility
CreditCardSimulation	Main application class

CreditCardGUI	Builds and displays the GUI

CardHolderKeyListener	Validates cardholder name

CardNumberKeyListener	Validates card number and updates overlay labels

ExpiryKeyListener	Validates expiry date format

CreditCardButtonListener	Handles Verify and Clear button logic
