package pharaohsfortune.components;

import pharaohsfortune.util.UIColors;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class DreamScrollPane extends JScrollPane {

    public DreamScrollPane(Component c) {
        super(c);
        setBorder(null);
        setBackground(UIColors.BODY_COLOUR);
        getVerticalScrollBar().setUI(new ScrollUI());
    }

    private class ScrollUI extends BasicScrollBarUI {
        private final Dimension SIZE = new Dimension(16,16);

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return new DreamButton("\u2400", UIColors.BUTTON_COLOUR, Color.cyan) {
                @Override
                public Dimension getPreferredSize() {
                    return SIZE;
                }

                @Override
                public Font getFont() {
                    return new Font("Arial",Font.PLAIN,8);
                }

                @Override
                public Border getBorder() {
                    return null;
                }
            };
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return new DreamButton("\u2400", UIColors.BUTTON_COLOUR, Color.cyan) {
                @Override
                public Dimension getPreferredSize() {
                    return SIZE;
                }

                @Override
                public Font getFont() {
                    return new Font("Arial",Font.PLAIN,8);
                }

                @Override
                public Border getBorder() {
                    return null;
                }
            };
        }

        @Override
        protected void paintThumb(Graphics g1, JComponent c, Rectangle thumbBounds) {
            Graphics2D g = (Graphics2D) g1;
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setPaint(UIColors.BUTTON_COLOUR);
            g.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width - 1, thumbBounds.height - 1);
            g.dispose();
        }

        @Override
        protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
            g.setColor(UIColors.BODY_COLOUR);
            g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width,trackBounds.height);
        }
    }

}
