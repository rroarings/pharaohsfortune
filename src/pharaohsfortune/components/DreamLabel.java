package pharaohsfortune.components;


import pharaohsfortune.util.UIColors;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class DreamLabel extends JLabel {

    TitledBorder border = BorderFactory.createTitledBorder("");

    public DreamLabel() {
        this("");
    }

    public DreamLabel(String text) {
        super(text);
        setOpaque(true);
        setForeground(UIColors.TEXT_COLOR);
        setBackground(UIColors.BODY_COLOUR);
    }
}
