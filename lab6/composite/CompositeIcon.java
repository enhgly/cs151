import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.Icon;

public class CompositeIcon implements Icon {

    ArrayList<Icon> icons = new ArrayList<Icon>();
    
    @Override
    public int getIconHeight() {
        int size = 0; 
        for (int icon = 0; icon < icons.size(); icon++) {
            size += icons.get(icon).getIconHeight();
        }
        return size;
    }

    @Override
    public int getIconWidth() {
        int size = 0; 
        for (int icon = 0; icon < icons.size(); icon++) {
            size += icons.get(icon).getIconWidth();
        }
        return size;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        for (Icon icon: icons) {
            icon.paintIcon(c, g, x, y);
            x += icon.getIconWidth();
        }
    }
    
    public void addIcon(Icon icon) {
            icons.add(icon);   
    }
}