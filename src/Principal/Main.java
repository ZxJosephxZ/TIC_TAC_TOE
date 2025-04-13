package Principal;

import Vista.*;
import Vista.Panel;

import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*JFrame window = new JFrame();
        window.setResizable(false);
        //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setUndecorated(true);
        window.setSize(416,315);
        Panel panel = new Panel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        BotonTemplate boton = new BotonNormal();
        panel.add(boton.crearBoton(),gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        BotonTemplate boton1 = new BotonEspecial();
        panel.add(boton1.crearBoton(), gbc);
        window.add(panel);

        window.setVisible(true);
        }*/
            JFrame window = new JFrame();
            window.setResizable(false);
            window.setUndecorated(true);
            window.setSize(416, 315);

            Panel panel = new Panel(); // asumo que es un JPanel personalizado
            panel.setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();

            // ---------- BOTÓN EN (0,0) ----------
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.insets = new Insets(10, 10, 10, 10); // Espaciado opcional
            //gbc.fill = GridBagConstraints.BOTH;
            BotonTemplate boton = new BotonNormal();
            panel.add(boton.crearBoton(), gbc);


            // ---------- ESPACIADOR PARA FORZAR CUADRÍCULA ----------
            //El EJE X ES DE ARRIBA A BAJO Y EL EJE Y DE IZQUIERDA A DERECHA


            gbc.gridx = 0;
            gbc.gridy = 1;
            panel.add(new TextoGenerico().crearJtextField(), gbc);


            // ---------- MOSTRAR VENTANA ----------
            window.add(panel);
            window.setVisible(true);
        }

    }