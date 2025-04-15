package Vista;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TextoGenerico2 extends TextoRecuadro{
    @Override
    protected void personalizacionJTextField() {
        texto.setText("JUGADOR 2");
        texto.setForeground(new Color(202,105,220));
        texto.setBackground(new Color(249,230,254));
        texto.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (texto.getText().equals("JUGADOR 2"))
                {
                    texto.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e)
            {
                if (texto.getText().isEmpty())
                {
                    texto.setText("JUGADOR 2");
                }
            }
        });
        texto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Border border = BorderFactory.createLineBorder(new Color(165,40,174),2);
                texto.setBorder(border);
            }
        });
    }
}
