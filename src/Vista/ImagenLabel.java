package Vista;

import javax.swing.*;
import java.awt.*;

public class ImagenLabel extends JLabel {
    private Image imagen;
    public ImagenLabel(String ruta)
    {
        this.imagen = new ImageIcon(getClass().getResource(ruta)).getImage();
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if (imagen != null)
        {
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        }
    }
}
