package pharaohsfortune.components;

import pharaohsfortune.util.UIColors;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class DreamButton extends JButton {

    /**
     * @param text text to display
     * @param backgroundColor button background color
     * @param foregroundColor button foreground color
     *
     */
    public DreamButton(String text, Color backgroundColor, Color foregroundColor) {
        super(text);
        setFocusPainted(false);
        setFocusable(false);
        setBackground(backgroundColor);
        setForeground(foregroundColor);
        setOpaque(true);
        setBorder(new CompoundBorder(new LineBorder(UIColors.BUTTON_COLOUR.brighter()),
                new EmptyBorder(5,5,5,5)));
        setContentAreaFilled(false);
    }

    /**
     * @param text text to display
     *
     */
    public DreamButton(String text) {
        super(text);
        setFocusPainted(false);
        setFocusable(false);
        setBackground(UIColors.BUTTON_COLOUR);
        setForeground(UIColors.TEXT_COLOR);
        setOpaque(true);
        setBorder(new CompoundBorder(new LineBorder(UIColors.BUTTON_COLOUR.brighter()),
                new EmptyBorder(5,5,5,5)));
        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            g.setColor(UIColors.BUTTON_COLOUR.brighter());
        } else if (getModel().isRollover()) {
            g.setColor(UIColors.BUTTON_COLOUR.brighter());
        } else {
            g.setColor(UIColors.BUTTON_COLOUR);
        }
        g.fillRect(0,0,getWidth(),getHeight());
        super.paintComponent(g);
    }
}
