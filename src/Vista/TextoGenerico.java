package Vista;

import java.awt.*;

public class TextoGenerico extends TextoRecuadro{

    @Override
    protected void personalizacionJTextField() {
        texto.setText("JUGADOR 1");
        texto.setBackground(new Color(214,252,249));
    }
}
