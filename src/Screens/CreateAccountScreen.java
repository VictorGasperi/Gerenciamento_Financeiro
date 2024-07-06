package Screens;

import javax.swing.*;

public class CreateAccountScreen extends JDialog{
    
    public CreateAccountScreen(JFrame parentFrame) {
        super(parentFrame, "Crie sua conta", true);

        initializeScreen(parentFrame);
    }

    private void initializeScreen(JFrame parentCompontent) {
        setSize(300, 200);
        setLocationRelativeTo(parentCompontent);
        setResizable(false);
        // pack();
        setVisible(true);
    }

}
