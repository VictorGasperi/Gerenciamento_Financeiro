import java.util.ArrayList;
import java.util.concurrent.Flow;

import javax.swing.*;
import java.awt.*;

public class LoginScreen extends JFrame{

    private Container contentPane;
    //private JPanel contentPaneDiv;
    private JPanel northPanel;
    private JPanel centralPanelDiv;
    private JPanel centralPanelGrid;
    private JPanel southPanelDiv;
    private JPanel southPanelGrid;

    private JLabel title_label;

    private JLabel login_label;
    private JTextField login_field;

    private JLabel pass_label;
    private JTextField pass_field;

    private JButton confirm_btn;
    private JButton createAccount_btn;
    
    
    public LoginScreen(){
        super("Gerenciador Financeiro");

        initializeComponents();

        prepareScreen();

        initializeScreen();
    }

    private void initializeScreen() {
        //setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
    }

    private void initializeComponents() {
        title_label = new JLabel("LOGIN");
        title_label.setFont(new Font("Montserrat", Font.BOLD, 18));
        login_label = new JLabel("Usuário: ");
        login_label.setFont(new Font("Montserrat", Font.PLAIN, 14));
        login_field = new JTextField(10);
        
        pass_label = new JLabel("Senha: ");
        pass_label.setFont(new Font("Montserrat", Font.PLAIN, 14));
        pass_field = new JTextField(10);
        confirm_btn = new JButton("Entrar");
        createAccount_btn = new JButton("Criar conta");
    }

    private void prepareScreen() {
        contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        //contentPaneDiv = new JPanel(new BorderLayout());
        northPanel = new JPanel(new FlowLayout());
        centralPanelGrid = new JPanel(new GridLayout(2, 2));
        centralPanelDiv = new JPanel(new FlowLayout(FlowLayout.CENTER));
        southPanelGrid = new JPanel(new GridLayout(1, 2));
        southPanelDiv = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        northPanel.add(title_label);
        centralPanelGrid.add(login_label);
        centralPanelGrid.add(login_field);
        centralPanelGrid.add(pass_label);
        centralPanelGrid.add(pass_field);
        centralPanelDiv.add(centralPanelGrid);
        southPanelGrid.add(confirm_btn);
        southPanelGrid.add(createAccount_btn);
        southPanelDiv.add(southPanelGrid);

        contentPane.add(northPanel, BorderLayout.NORTH);
        contentPane.add(centralPanelDiv, BorderLayout.CENTER);
        contentPane.add(southPanelDiv, BorderLayout.SOUTH);
    }

}
