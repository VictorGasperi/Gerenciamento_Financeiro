package Events;

import java.awt.event.*;
import javax.swing.*;

import Screens.CreateAccountScreen;

public class LoginScreenEvents implements ActionListener{

    private JFrame loginScreen;
    private JTextField user_field;
    private JPasswordField pass_field;
    private JButton confirm_btn;
    private JButton createAccount_btn;

    public LoginScreenEvents(JFrame loginScreen, JTextField user_field, JPasswordField pass_field, JButton confirm_btn, JButton createAccount_btn) {
        this.loginScreen = loginScreen;
        this.user_field = user_field;
        this.pass_field = pass_field;
        this.confirm_btn = confirm_btn;
        this.createAccount_btn = createAccount_btn;
    }

    public void actionPerformed(ActionEvent ev) {
        if(ev.getSource() == confirm_btn) {

            if(user_field.getText().trim().length() == 0 || pass_field.getPassword().length == 0) {
                JOptionPane.showMessageDialog(loginScreen, "Preencha ambos os campos!", "Alerta!", JOptionPane.WARNING_MESSAGE);
            }

        }

        if(ev.getSource() == createAccount_btn) {
            JDialog createAccountScreen = new CreateAccountScreen(loginScreen);
        }

        

    }

    

}
