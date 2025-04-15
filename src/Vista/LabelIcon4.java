package Vista;

import javax.swing.*;
import java.awt.*;

public class LabelIcon4 extends LabelTemplate{
    @Override
    protected void personalizarLabel() {
        label.setPreferredSize(new Dimension(40,40));
        label.setHorizontalAlignment(JLabel.LEFT);
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Circulo.png"));
        Image scaled = icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaled));
    }
}
