package pharaohsfortune.components;

import pharaohsfortune.util.UIColors;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;

public class DreamComboBox<T> extends JComboBox<T> {

    private DefaultComboBoxModel<T> model;


    public DreamComboBox(T... objects) {
        setBorder(new LineBorder(UIColors.BUTTON_COLOUR.brighter()));
        setOpaque(true);
        setFocusable(false);
        setBackground(UIColors.COMBOBOX_COLOR);
        setForeground(UIColors.TEXT_COLOR);
        setUI(new BasicComboBoxUI() {
                  @Override
                  protected JButton createArrowButton() {
                      return new DreamButton("\u2193", UIColors.BUTTON_COLOUR, UIColors.TEXT_COLOR);
                  }
        });
        setModel(model = new DefaultComboBoxModel<>());
        for (T object : objects) {
            model.addElement(object);
        }
    }
}


