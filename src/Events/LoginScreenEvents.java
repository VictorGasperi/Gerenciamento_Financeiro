package Events;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class LoginScreenEvents implements ActionListener{

    private JTextField user_field;
    private JPasswordField pass_field;
    private JButton confirm_btn;
    private JButton createAccount_btn;

    public LoginScreenEvents(JTextField user_field, JPasswordField pass_field, JButton confirm_btn, JButton createAccount_btn) {
        this.user_field = user_field;
        this.pass_field = pass_field;
        this.confirm_btn = confirm_btn;
        this.createAccount_btn = createAccount_btn;
    }

    public void actionPerformed(ActionEvent ev) {
        if(ev.getSource() == confirm_btn) {
            
        }

        

    }

    

}
