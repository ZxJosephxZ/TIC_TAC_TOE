package Vista;

import javax.swing.*;
import java.awt.*;

public abstract class LabelTemplate extends JLabel {
    protected JLabel label;

    public final JLabel crearBoton()
    {
        label = new JLabel();
        modificarEstilosComunes();
        personalizarLabel();
        return label;
    }

    private void modificarEstilosComunes()
    {
        label.setFont(new java.awt.Font("Montserrat", Font.BOLD, 24));
        label.setForeground(new Color(240,190,255));
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    protected abstract void personalizarLabel();
}
