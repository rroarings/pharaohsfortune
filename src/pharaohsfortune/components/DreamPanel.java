package pharaohsfortune.components;


import pharaohsfortune.util.UIColors;

import javax.swing.*;
import java.awt.*;

public class DreamPanel extends JPanel {

    public DreamPanel() {
        this(new BorderLayout());
    }

    public DreamPanel(LayoutManager manager) {
        setLayout(manager);
        setBackground(UIColors.BODY_COLOUR);
    }
}
