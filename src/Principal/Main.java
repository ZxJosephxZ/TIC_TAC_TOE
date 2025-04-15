package Principal;

import Vista.*;
import Vista.Panel;

import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            JFrame window = new JFrame();
            window.setResizable(false);
            window.setUndecorated(true);
            window.setSize(416, 315);
            window.setLocationRelativeTo(null);

            Panel panel = new Panel(); // asumo que es un JPanel personalizado
            panel.setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();

            // ---------- BOTÓN EN (0,0) ----------

            gbc.insets = new Insets(10, 50, 0, 0); // Espaciado opcional
            gbc.fill = GridBagConstraints.BOTH;



            // ---------- ESPACIADOR PARA FORZAR CUADRÍCULA ----------
            //El EJE X ES DE ARRIBA A BAJO Y EL EJE Y DE IZQUIERDA A DERECHA

            gbc.gridx = 2;
            gbc.gridy = 0;
            gbc.weightx = 0.5;
            gbc.weighty = 0;

            panel.add(new LabelEspecial().crearBoton(), gbc);

            gbc.insets = new Insets(10,0,0,0);
            gbc.gridx = 1;
            gbc.gridy = 1;
            gbc.weightx = 3.0;
            gbc.weighty = 0;
            panel.add(new LabelTitulo().crearBoton(), gbc);


            gbc.insets = new Insets(0,0,0,0);
            gbc.fill = GridBagConstraints.NONE;

            gbc.gridx = 1;
            gbc.gridy = 2;
                gbc.weightx = 0;
            gbc.weighty = 0.2;
            panel.add(new TextoGenerico().crearJtextField(), gbc);
            gbc.gridx = 1;
            gbc.gridy = 3;
                gbc.weightx = 0;
            gbc.weighty = 0;
            panel.add(new TextoGenerico2().crearJtextField(), gbc);



            gbc.weightx = 3.0;


            gbc.insets = new Insets(0,0,10,0);
            gbc.gridx = 1;
            gbc.gridy = 4;
            gbc.weighty = 0.7;
            Panel2 panel2 = new Panel2();
            panel2.add(new LabelIniciar().crearBoton());
            panel.add(panel2, gbc);

            gbc.insets = new Insets(0,40,0,0);
            gbc.gridx = 0;
            gbc.gridy = 2;


            panel.add(new LabelIcon2().crearBoton(),gbc);

            gbc.gridx = 0;
            gbc.gridy = 3;
            panel.add(new LabelIcon().crearBoton(),gbc);

            gbc.fill = GridBagConstraints.BOTH;
            gbc.insets = new Insets(0,0,0,40);
            gbc.gridx = 2;
            gbc.gridy = 2;
            gbc.weightx = 1.5;
            gbc.weighty = 0;

            panel.add(new LabelIcon3().crearBoton(), gbc);

            gbc.gridx = 2;
            gbc.gridy = 3;
            gbc.weightx = 1.5;
            gbc.weighty = 0;

            panel.add(new LabelIcon4().crearBoton(), gbc);
            // ---------- MOSTRAR VENTANA ----------
            window.add(panel);
            window.setVisible(true);
        }

    }