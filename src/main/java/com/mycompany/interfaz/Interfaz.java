/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaz;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author nenod
 */
public class Interfaz extends JFrame {



    public Interfaz(){
        
        // creacion de la ventana, dimensiones y agregacion de componentes
        setTitle("Mi primera interfaz"); 
        setBounds(450,175,500,600); 
        crearComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE); //colapsa la ventana
   
     }    
// creacion de componentes
    
    private void crearComponentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);   // o tmbpanel.setLayout(new FlowLayout());
        this.getContentPane().add(panel);
        panel.setBackground(Color.GREEN);
      
        JLabel etiqueta1 = new JLabel("BUZON DE QUEJAS");
        etiqueta1.setBounds(150, 25, 250, 50);
        etiqueta1.setFont(new Font("arial black",1,20));
        etiqueta1.setForeground(Color.RED);
        panel.add(etiqueta1);
        
        JLabel etiqueta2 = new JLabel("¿A que licenciatura pertenece?");
        etiqueta2.setBounds(150, 50, 200, 30);
        panel.add(etiqueta2);
        
        String[] lenguajes = {"ISC", "IM", "ITS","ICA", "IE","IME"};
        JComboBox lista = new JComboBox(lenguajes);
        lista.setBounds(150, 75, 80, 20);
        panel.add(lista);
        
        
        JTextArea areaTexto1 = new JTextArea();
        areaTexto1.setText("Nota: \nEste buzon es para uso exclusivo \nde los alumnos que pertenecen a la \nfacultad de ingenieria de la \nUniversidad Autonoma de Campeche");
        areaTexto1.setFont(new Font("arial",1,13)); 
        areaTexto1.setEditable(false);
        areaTexto1.setForeground(Color.BLACK);
        areaTexto1.setBackground(Color.ORANGE);
        areaTexto1.setBounds(150, 100, 297, 90);
        panel.add(areaTexto1);
        
        
        
         JTextArea areaTexto2 = new JTextArea();
        areaTexto2.setText("Por favor ingresa tus datos de alumno:");
        areaTexto2.setFont(new Font("arial",1,13)); 
        areaTexto2.setEditable(true);
        areaTexto2.setForeground(Color.BLACK);
        areaTexto2.setBackground(Color.BLUE);
        areaTexto2.setBounds(150, 220, 250, 40);
        panel.add(areaTexto2);
        
        
        
        JLabel etiqueta3 = new JLabel("Nombre:");
        etiqueta3.setBounds(90, 275, 50, 30);
        panel.add(etiqueta3);
        JTextField cajaTexto1 = new JTextField();
        
        cajaTexto1.setBounds(150, 275, 130, 30);
        panel.add(cajaTexto1);
        
        
   
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setText("Correo institucional:");
        etiqueta4.setBounds(30, 300, 130, 30);
        panel.add(etiqueta4);
         
        JTextField cajaTexto2 = new JTextField();
        cajaTexto2.setBounds(150, 300, 130, 30);
        panel.add(cajaTexto2);
        
        
        
        
        JTextArea areaTexto3 = new JTextArea();
        areaTexto3.setText("A continuacion describe el problema, \nqueja o sugerencia:");
        areaTexto3.setFont(new Font("arial",1,13)); 
        areaTexto3.setEditable(true);
        areaTexto3.setBounds(140, 350, 250, 50);
        panel.add(areaTexto3);
        areaTexto3.setForeground(Color.BLACK);
        areaTexto3.setBackground(Color.BLUE);

        JTextField cajaTexto3 = new JTextField();
        cajaTexto3.setBounds(120, 415, 200, 90);
        panel.add(cajaTexto3);
        
        
        
        JButton boton1 = new JButton("Enviar");
        boton1.setBounds(150, 515, 150, 20);
        boton1.setMnemonic('a');
        boton1.setBackground(Color.RED);
        panel.add(boton1);
        
        
        
 }
    
}
