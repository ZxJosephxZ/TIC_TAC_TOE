package Vista;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.InputStream;

public class LabelTitulo extends LabelTemplate{
    @Override
    protected void personalizarLabel() {
        label.setText("Tic Tac Toe");
        label.setFont(cargarFuentePersonalizada(36f));
        label.setPreferredSize(new Dimension(224,45));
        label.setForeground(new Color(230,251,255));
        label.setHorizontalAlignment(JTextField.CENTER);
        label.setVerticalAlignment(JTextField.NORTH);
    }
    private Font cargarFuentePersonalizada(float size) {
        try {
            InputStream is = getClass().getResourceAsStream("/Fonts/SHOWG.TTF");
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            return font.deriveFont(size);
        } catch (Exception e) {
            e.printStackTrace();
            return getFont(); // Fallback por si falla
        }
    }
}
