package pharaohsfortune.components;


import pharaohsfortune.util.UIColors;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;

public class DreamTabbedPane extends JTabbedPane{

    public DreamTabbedPane() {
        setFocusable(false);
        UIManager.put("TabbedPane.background", UIColors.BUTTON_COLOUR);
        UIManager.put("TabbedPane.foreground", UIColors.TEXT_COLOR);
        UIManager.put("TabbedPane.highlight", UIColors.BODY_COLOUR);
        UIManager.put("TabbedPane.contentBorderInsets", new Insets(0, 0, 0, 0));
        UIManager.put("TabbedPane.selected", UIColors.BODY_COLOUR);

        setUI(new BasicTabbedPaneUI() {
            @Override
            protected void installDefaults() {
                super.installDefaults();
                shadow = UIColors.BODY_COLOUR;
                darkShadow = UIColors.BODY_COLOUR;
                lightHighlight = UIColors.BODY_COLOUR;
                //focus = new Color(64,255,136);
            }

        });

    }
}
