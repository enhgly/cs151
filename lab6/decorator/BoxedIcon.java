import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.Icon;

public class BoxedIcon implements Icon {

    Icon icon;

    public BoxedIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    public int getIconHeight() {
        return icon.getIconHeight() + 50;
    }

    @Override
    public int getIconWidth() {
        return icon.getIconWidth() + 50;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawRect(0, 0, icon.getIconWidth() + 20, icon.getIconHeight() + 20);
        icon.paintIcon(c, g, x + 10, y + 10);
    }

}
