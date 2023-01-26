package pharaohsfortune.components;

import pharaohsfortune.util.UIColors;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class DreamTitle extends JLabel {

    public DreamTitle() {
        this("");
    }

    public DreamTitle(String text) {
        super(text);
        setOpaque(true);
        setForeground(UIColors.TEXT_COLOR);
        setBackground(UIColors.BODY_COLOUR);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        FontMetrics fm = g.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(getText())) / 2;
        int y = getHeight() - fm.getDescent();
        g.drawLine(fm.getLeading(), y, x + fm.stringWidth(getText()) / 3, y);
    }
}

