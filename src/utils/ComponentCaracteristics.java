package utils;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class ComponentCaracteristics {

    private static final Color backgroundColor = new Color(237, 151, 71);
    private static final Font title_font = new Font("Montserrat", Font.BOLD, 18);
    private static final Font notTitle_font = new Font("Montserrat", Font.PLAIN, 15);
    private static final Dimension login_btn_dimention = new Dimension(200, 50);
    private static final Dimension textField_dimension = new Dimension(200, 20);
    private static final Border border_btn = BorderFactory.createLineBorder(Color.WHITE, 1, true);

    public static Font getTitleFont() {
        return title_font;
    }
    public static Font getNottitleFont() {
        return notTitle_font;
    }
    public static Dimension getLoginBtnDimention() {
        return login_btn_dimention;
    }
    public static Dimension getTextfieldDimension() {
        return textField_dimension;
    }
    public static Border getBorderBtn() {
        return border_btn;
    }
    public static Color getBackgroundcolor() {
        return backgroundColor;
    }

    

}
