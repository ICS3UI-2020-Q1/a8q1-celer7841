import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  

  JLabel firstLabel;
  JTextField firstInput;
  JButton sayHelloButton;
  JPanel mainPanel;



  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
    // initialize the main panel
    mainPanel = new JPanel();
    // tell the main panel we will do a manual layout
    mainPanel.setLayout(null);

    // initialize the first label 
    firstLabel = new JLabel();
    // set bounds of the first label
    firstLabel.setBounds(10, 10, 200, 20);

    // create the text boxes
    firstInput = new JTextField();
    firstInput.setBounds(500, 10, 150, 20);

    // initialize the buttons
    sayHelloButton = new JButton("Say Hello!");
    sayHelloButton.setBounds(200, 10, 200, 35);

    // add the action listener to the buttons
    sayHelloButton.addActionListener(this);

    // add the labels to the main panel
    mainPanel.add(firstLabel);

    // add the input to the panel
    mainPanel.add(firstInput);

    // add the buttons to the panel
    mainPanel.add(sayHelloButton);

    // add the main panel to the screen
   frame.add(mainPanel);

 
    

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    // deal with the buttons being pressed
    if(command.equals ("Say Hello!")){

      // get the text that appears inside of each text box
      String firstText = firstInput.getText();
      firstLabel.setText(" Hello " + firstText + "!");

  }

    


  

  }

    // Main method to start our program
    public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
