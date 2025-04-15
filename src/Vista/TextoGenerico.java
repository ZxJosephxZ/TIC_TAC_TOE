package Vista;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class TextoGenerico extends TextoRecuadro{

    @Override
    protected void personalizacionJTextField() {
        texto.setText("JUGADOR 1");
        texto.setBackground(new Color(214,252,249));
        texto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Border border = BorderFactory.createLineBorder(new Color(52,136,235),2);
                texto.setBorder(border);
            }
        });
        texto.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (texto.getText().equals("JUGADOR 1"))
                {
                    texto.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e)
            {
                if (texto.getText().isEmpty())
                {
                    texto.setText("JUGADOR 1");
                }
            }
        });

    }
}
