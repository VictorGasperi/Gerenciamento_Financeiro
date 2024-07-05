package Screens;

import javax.swing.*;

public class MainScreen extends JFrame{
    
    public MainScreen(){
        super("Gerenciador Financeiro");

        initializeScreen();
    }

    private void initializeScreen() {
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // pack();
        setVisible(true);
    }

}
