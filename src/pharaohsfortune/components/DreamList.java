package pharaohsfortune.components;



import pharaohsfortune.util.UIColors;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class DreamList<T> extends JList<T> {

    DefaultListModel<T> model;

    public DreamList() {
        model = new DefaultListModel<>();
        setModel(model);
        setBackground(UIColors.BUTTON_COLOUR);
        setLayoutOrientation(VERTICAL);
        setBorder(new CompoundBorder(new LineBorder(UIColors.BUTTON_COLOUR.brighter()), new EmptyBorder(2,2,2,2)));
        setForeground(UIColors.TEXT_COLOR);
        setCellRenderer((list, value, index, isSelected, cellHasFocus) -> {
            Component l = (Component) value;
            if (isSelected || cellHasFocus) {
                l.setBackground(UIColors.BUTTON_COLOUR.brighter());
            } else {
                l.setBackground(UIColors.BUTTON_COLOUR);
            }
            return l;
        });
    }

    public void add(T element) {
        model.addElement(element);
    }

}
