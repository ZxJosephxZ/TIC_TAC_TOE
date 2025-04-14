package Vista;

import javax.swing.*;
import java.awt.*;

public class LabelEspecial extends LabelTemplate{
    @Override
    protected void personalizarLabel() {
        label.setText("X");
        label.setPreferredSize(new Dimension(20,20));
    }
}
