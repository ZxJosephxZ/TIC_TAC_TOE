package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LabelEspecial extends LabelTemplate{
    @Override
    protected void personalizarLabel() {
        label.setText("X");
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label.setPreferredSize(new Dimension(20,20));
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
        {

        };
    }
}
