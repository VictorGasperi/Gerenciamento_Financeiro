package Screens;

import javax.swing.*;
import java.awt.*;

import utils.ComponentCaracteristics;

public class CreateAccountScreen extends JDialog{

    private Container contentPane;
    private JPanel northPanel;
    private JPanel centralPanelDiv;
    private JPanel centralPanelGrid;
    private JPanel southPanel;

    private JLabel title_label;

    private JLabel new_emailLabel;
    private JTextField new_emailField;
    private JLabel new_loginLabel;
    private JTextField new_loginField;
    private JLabel new_passLabel;
    private JPasswordField new_passField;
    private JLabel confirm_passLabel;
    private JPasswordField confirm_passField;

    private JButton createAccountButton;
    
    public CreateAccountScreen(JFrame parentFrame) {
        super(parentFrame, "Crie sua conta", true);

        initializeComponents();

        prepareScreen();

        initializeScreen(parentFrame);
    }

    private void initializeScreen(JFrame parentCompontent) {
        // setSize(300, 200);
        setLocationRelativeTo(parentCompontent);
        setResizable(false);
        pack();
        setVisible(true);
    }

    private void initializeComponents() {

        title_label = new JLabel("CRIE SUA CONTA");
        title_label.setFont(ComponentCaracteristics.getTitleFont());
        title_label.setForeground(Color.WHITE);

        new_emailLabel = new JLabel("E-mail: ");
        new_emailLabel.setFont(ComponentCaracteristics.getNottitleFont());
        new_emailLabel.setForeground(Color.WHITE);

        new_emailField = new JTextField();
        new_emailField.setSize(ComponentCaracteristics.getTextfieldDimension());
        new_emailField.setFont(ComponentCaracteristics.getNottitleFont());

        new_loginLabel = new JLabel("Usuário: ");
        new_loginLabel.setFont(ComponentCaracteristics.getNottitleFont());
        new_loginLabel.setForeground(Color.WHITE);

        new_loginField = new JTextField();
        new_loginField.setSize(ComponentCaracteristics.getTextfieldDimension());
        new_loginField.setFont(ComponentCaracteristics.getNottitleFont());

        new_passLabel = new JLabel("Senha: ");
        new_passLabel.setFont(ComponentCaracteristics.getNottitleFont());
        new_passLabel.setForeground(Color.WHITE);

        new_passField = new JPasswordField();
        new_passField.setPreferredSize(ComponentCaracteristics.getTextfieldDimension());

        confirm_passLabel = new JLabel("Confirme a senha: ");
        confirm_passLabel.setFont(ComponentCaracteristics.getNottitleFont());
        confirm_passLabel.setForeground(Color.WHITE);

        confirm_passField = new JPasswordField();
        confirm_passField.setPreferredSize(ComponentCaracteristics.getTextfieldDimension());

        createAccountButton = new JButton("Criar conta!");
        createAccountButton.setPreferredSize(ComponentCaracteristics.getLoginBtnDimention());
        createAccountButton.setOpaque(true);
        createAccountButton.setFont(ComponentCaracteristics.getNottitleFont());
        createAccountButton.setBorder(ComponentCaracteristics.getBorderBtn());
        createAccountButton.setBackground(Color.BLUE);
        createAccountButton.setForeground(Color.WHITE);
    }

    private void prepareScreen() {
        contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centralPanelGrid = new JPanel(new GridLayout(4, 2));
        centralPanelDiv = new JPanel(new FlowLayout(FlowLayout.CENTER));
        southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        northPanel.add(title_label);
        centralPanelGrid.add(new_emailLabel);
        centralPanelGrid.add(new_emailField);
        centralPanelGrid.add(new_loginLabel);
        centralPanelGrid.add(new_loginField);
        centralPanelGrid.add(new_passLabel);
        centralPanelGrid.add(new_passField);
        centralPanelGrid.add(confirm_passLabel);
        centralPanelGrid.add(confirm_passField);
        centralPanelDiv.add(centralPanelGrid);
        southPanel.add(createAccountButton);

        contentPane.add(northPanel, BorderLayout.NORTH);
        contentPane.add(centralPanelDiv, BorderLayout.CENTER);
        contentPane.add(southPanel, BorderLayout.SOUTH);

        northPanel.setBackground(ComponentCaracteristics.getBackgroundcolor());
        centralPanelDiv.setBackground(ComponentCaracteristics.getBackgroundcolor());
        centralPanelGrid.setBackground(ComponentCaracteristics.getBackgroundcolor());
        southPanel.setBackground(ComponentCaracteristics.getBackgroundcolor());

    }

}
