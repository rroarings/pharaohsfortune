package pharaohsfortune.components;

import pharaohsfortune.util.UIColors;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class DreamTextField extends JTextField {

    public DreamTextField() {
        setOpaque(true);
        setBackground(UIColors.TEXTFIELD_COLOR);
        setCaretColor(UIColors.TEXT_COLOR);
        setForeground(UIColors.TEXT_COLOR);
        setBorder(new CompoundBorder(new LineBorder(UIColors.BUTTON_COLOUR.brighter()), new EmptyBorder(2,2,2,2)));
        //setToolTipText("Enter food item name here!");
    }
}
