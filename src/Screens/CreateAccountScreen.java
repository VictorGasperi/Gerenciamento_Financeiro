package Screens;

import javax.swing.*;
import java.awt.*;

public class CreateAccountScreen extends JDialog{

    private Container contentPane;
    private JPanel northPanel;
    private JPanel centralPanelDiv;
    private JPanel centralPanelGrid;
    private JPanel southPanel;

    private JLabel title_label;

    private JTextField new_emailField;
    private JTextField new_loginField;
    private JPasswordField new_passField;
    private JPasswordField confirm_passField;

    private JButton createAccountButton;
    
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
