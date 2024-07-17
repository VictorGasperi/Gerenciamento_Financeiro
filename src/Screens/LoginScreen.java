package Screens;


import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

import Events.LoginScreenEvents;


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
        Font title_font = new Font("Montserrat", Font.BOLD, 18);
        Font notTitle_font = new Font("Montserrat", Font.PLAIN, 15);
        Dimension btn_dimention = new Dimension(200, 50);
        Dimension textField_dimension = new Dimension(200,20);
        Border border_btn = BorderFactory.createLineBorder(Color.WHITE, 1, true);

        title_label = new JLabel("LOGIN");
        title_label.setFont(title_font);
        title_label.setForeground(Color.WHITE);

        login_label = new JLabel("Usuário: ");
        login_label.setFont(notTitle_font);
        login_label.setForeground(Color.WHITE);

        login_field = new JTextField();
        login_field.setPreferredSize(textField_dimension);
        login_field.setFont(notTitle_font);

        pass_label = new JLabel("Senha: ");
        pass_label.setFont(notTitle_font);
        pass_label.setForeground(Color.WHITE);

        pass_field = new JPasswordField();
        pass_field.setPreferredSize(textField_dimension);

        confirm_btn = new JButton("Entrar");
        confirm_btn.setPreferredSize(btn_dimention);
        confirm_btn.setOpaque(true);
        confirm_btn.setFont(notTitle_font);
        confirm_btn.setBorder(border_btn);
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
        createAccount_btn.setPreferredSize(btn_dimention);
        createAccount_btn.setOpaque(true);
        createAccount_btn.setFont(notTitle_font);
        createAccount_btn.setBorder(border_btn);
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
        Color backgroundColor = new Color(237, 151, 71);

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

        northPanel.setBackground(backgroundColor);
        centralPanelDiv.setBackground(backgroundColor);
        centralPanelGrid.setBackground(backgroundColor);
        southPanelDiv.setBackground(backgroundColor);
        southPanelGrid.setBackground(backgroundColor);
    }

}
