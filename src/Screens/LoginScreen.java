package Screens;


import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

import Events.LoginScreenEvents;
import utils.ComponentCaracteristics;


public class LoginScreen extends JFrame{

    private Container contentPane;
    private JPanel northPanel;
    private JPanel centralPanelDiv;
    private JPanel centralPanelGrid;
    private JPanel southPanelDiv;
    private JPanel southPanelGrid;

    private JLabel title_label;

    private JLabel login_label;
    private JTextField login_field;

    private JLabel pass_label;
    private JPasswordField pass_field;

    private JButton confirm_btn;
    private JButton createAccount_btn;

    private LoginScreenEvents eventManager;
    
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
        title_label.setFont(ComponentCaracteristics.getTitleFont());
        title_label.setForeground(Color.WHITE);

        login_label = new JLabel("Usuário: ");
        login_label.setFont(ComponentCaracteristics.getNottitleFont());
        login_label.setForeground(Color.WHITE);

        login_field = new JTextField();
        login_field.setPreferredSize(ComponentCaracteristics.getTextfieldDimension());
        login_field.setFont(ComponentCaracteristics.getNottitleFont());

        pass_label = new JLabel("Senha: ");
        pass_label.setFont(ComponentCaracteristics.getNottitleFont());
        pass_label.setForeground(Color.WHITE);

        pass_field = new JPasswordField();
        pass_field.setPreferredSize(ComponentCaracteristics.getTextfieldDimension());

        confirm_btn = new JButton("Entrar");
        confirm_btn.setPreferredSize(ComponentCaracteristics.getLoginBtnDimention());
        confirm_btn.setOpaque(true);
        confirm_btn.setFont(ComponentCaracteristics.getNottitleFont());
        confirm_btn.setBorder(ComponentCaracteristics.getBorderBtn());
        confirm_btn.setBackground(Color.BLUE);
        confirm_btn.setForeground(Color.WHITE);
        confirm_btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                confirm_btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {
                confirm_btn.setCursor(Cursor.getDefaultCursor());
            }
            public void mousePressed(MouseEvent e) {
                confirm_btn.setBackground(Color.LIGHT_GRAY);
            }
            public void mouseReleased(MouseEvent e) {
                confirm_btn.setBackground(Color.BLUE);
            }
        });

        createAccount_btn = new JButton("Criar conta");
        createAccount_btn.setPreferredSize(ComponentCaracteristics.getLoginBtnDimention());
        createAccount_btn.setOpaque(true);
        createAccount_btn.setFont(ComponentCaracteristics.getNottitleFont());
        createAccount_btn.setBorder(ComponentCaracteristics.getBorderBtn());
        createAccount_btn.setBackground(Color.BLUE);
        createAccount_btn.setForeground(Color.WHITE);
        createAccount_btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                createAccount_btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent e) {
                createAccount_btn.setCursor(Cursor.getDefaultCursor());
            }
            public void mousePressed(MouseEvent e) {
                createAccount_btn.setBackground(Color.LIGHT_GRAY);
            }
            public void mouseReleased(MouseEvent e) {
                createAccount_btn.setBackground(Color.BLUE);
            }
        });

        eventManager = new LoginScreenEvents(this ,login_field, pass_field, confirm_btn, createAccount_btn);

        confirm_btn.addActionListener(eventManager);
        createAccount_btn.addActionListener(eventManager);

    }

    private void prepareScreen() {
        contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        //contentPaneDiv = new JPanel(new BorderLayout());
        northPanel = new JPanel(new FlowLayout());
        centralPanelGrid = new JPanel(new GridLayout(2, 2));
        centralPanelDiv = new JPanel(new FlowLayout(FlowLayout.CENTER));
        southPanelGrid = new JPanel(new GridLayout(1, 2, 2, 0));
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

        northPanel.setBackground(ComponentCaracteristics.getBackgroundcolor());
        centralPanelDiv.setBackground(ComponentCaracteristics.getBackgroundcolor());
        centralPanelGrid.setBackground(ComponentCaracteristics.getBackgroundcolor());
        southPanelDiv.setBackground(ComponentCaracteristics.getBackgroundcolor());
        southPanelGrid.setBackground(ComponentCaracteristics.getBackgroundcolor());
    }

}
