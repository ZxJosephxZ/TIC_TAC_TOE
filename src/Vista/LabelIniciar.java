package Vista;

import javax.swing.*;
import java.awt.*;

public class LabelIniciar extends LabelTemplate{
    @Override
    protected void personalizarLabel() {
        label.setPreferredSize(new Dimension(160,50));
        label.setForeground(new Color(241,227,252));
        label.setFont(new java.awt.Font("Montserrat",Font.BOLD,20));
        label.setText("INICIAR");
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
    }
}
