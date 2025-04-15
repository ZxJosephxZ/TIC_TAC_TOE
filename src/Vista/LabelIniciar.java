package Vista;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        Border border = BorderFactory.createLineBorder(new Color(243,211,246),2);
        label.setBorder(border);
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Window window = SwingUtilities.getWindowAncestor(label);
                if (window != null)
                {
                    window.dispose();
                }
            }
        });
    }
}
