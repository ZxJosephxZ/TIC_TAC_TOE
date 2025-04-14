package Vista;

import java.awt.*;

public class TextoGenerico2 extends TextoRecuadro{
    @Override
    protected void personalizacionJTextField() {
        texto.setText("JUGADOR 2");
        texto.setForeground(new Color(202,105,220));
        texto.setBackground(new Color(249,230,254));
    }
}
