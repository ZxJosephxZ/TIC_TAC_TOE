package Vista;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public abstract class TextoRecuadro extends JTextField {
    protected JTextField texto;

    public final JTextField crearJtextField()
    {
        texto = new JTextField();
        configurarJTextField();
        personalizacionJTextField();
        texto.setBorder(null);
        texto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = Character.toUpperCase(e.getKeyChar());
                e.setKeyChar(caracter);
                if (texto.getText().length() >= 8)
                {
                    e.consume();
                }
            }
        });
        texto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e)
            {
                texto.setBorder(null);
            }
        });
        return texto;
    }

    private void configurarJTextField()
    {
        texto.setFont(new java.awt.Font("Montserrat", Font.BOLD, 28));
        texto.setForeground(new Color(101,175,245));
        texto.setHorizontalAlignment(CENTER);
        texto.setPreferredSize(new Dimension(230,40));
    }

    protected abstract void personalizacionJTextField();
}
