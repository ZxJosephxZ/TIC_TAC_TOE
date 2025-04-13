package Vista;

import javax.swing.*;
import java.awt.*;

public abstract class TextoRecuadro extends JTextField {
    protected JTextField texto;

    public final JTextField crearJtextField()
    {
        texto = new JTextField();
        configurarJTextField();
        personalizacionJTextField();
        return texto;
    }

    private void configurarJTextField()
    {
        texto.setFont(new java.awt.Font("Montserrat", Font.BOLD, 28));
        texto.setForeground(new Color(249,230,254));
        texto.setHorizontalAlignment(CENTER);
        texto.setPreferredSize(new Dimension(230,40));
    }

    protected abstract void personalizacionJTextField();
}
