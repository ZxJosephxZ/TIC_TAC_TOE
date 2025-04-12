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
        boton.setSize(100,100);
        boton.setBackground(Color.RED);
        boton.setFocusPainted(false);
    }
    protected abstract void personalizarBoton();
}
