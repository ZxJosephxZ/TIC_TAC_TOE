package Vista;

import javax.swing.*;
import java.awt.*;

public class LabelIcon2 extends LabelTemplate{
    @Override
    protected void personalizarLabel() {
        label.setPreferredSize(new Dimension(40,40));
        label.setHorizontalAlignment(JLabel.RIGHT);
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/JugadorEquis.png"));
        Image scaled = icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaled));
    }
}
