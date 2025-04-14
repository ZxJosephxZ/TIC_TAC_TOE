package Vista;

import javax.swing.*;
import java.awt.*;

public abstract class BotonTemplate {
    protected JButton boton;

    //Template Method
    public final JButton crearBoton()
    {
        boton = new JButton();
        configurarEstilosComunes();
        personalizarBoton();
        return boton;
    }
    private void configurarEstilosComunes()
    {
        boton.setFont(new java.awt.Font("Arial", Font.BOLD, 14));
        boton.setPreferredSize(new Dimension(230,40));
        boton.setBackground(new Color(42,22,79));
        boton.setFocusPainted(false);
    }
    protected abstract void personalizarBoton();
}
