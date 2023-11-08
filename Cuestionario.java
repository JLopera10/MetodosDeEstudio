/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.metodosdeestudio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cuestionario {
    private JFrame frame;
    private JLabel preguntaLabel;
    private JButton siButton;
    private JButton noButton;
    private int kinestesico = 0;
    private int auditivo = 0;
    private int visual = 0;
    private int preguntaActual = 0;
    public int size = 0;
    public String[] jlistdata;
    
    
    public javax.swing.JLabel nota1content;
    public javax.swing.JLabel nota1title;
    public javax.swing.JLabel nota2content;
    public javax.swing.JLabel nota2title;
    public javax.swing.JLabel nota3content;
    public javax.swing.JLabel nota3title;
    public javax.swing.JLabel nota4content;
    public javax.swing.JLabel nota4title;
    public javax.swing.JLabel nota5content;
    public javax.swing.JLabel nota5title;
    public javax.swing.JLabel tema;
    public javax.swing.JLabel tone;

    private String[] preguntas = {
        "¿Te sientes más cómodo/a aprendiendo a través de la práctica y la experimentación?", // Kinestésico
        "¿Prefieres escuchar podcasts o libros de audio para aprender?", // Auditivo
        "¿Sientes que tomas mejores notas y retienes información al escribir o dibujar?", // Visual
        "¿Aprendes mejor cuando tú mismo realizas presentaciones visuales o gráficas?", // Kinestésico
        "¿Encuentras que las imágenes y videos son útiles para comprender conceptos?", // Visual
        "¿Eres bueno/a recordando detalles después de escuchar una conferencia o charla?", // Auditivo
        "¿Disfrutas enseñando ideas y conceptos a otros?", // Kinestésico
        "¿Tienes facilidad para recordar detalles vistos en canciones o videos?", // Visual
        "¿Encuentras que te beneficia leer en voz alta o explicar lo que estás estudiando a otra persona?", // Auditivo
        "¿Sientes que aprendes mejor cuando estás físicamente activo/a o involucrado/a en actividades prácticas?" // Kinestésico
    };

    public Cuestionario() {
        nota1content = new javax.swing.JLabel();
        nota2content = new javax.swing.JLabel();
        nota3content = new javax.swing.JLabel();
        nota4content = new javax.swing.JLabel();
        nota5content = new javax.swing.JLabel();
        nota1title = new javax.swing.JLabel();
        nota2title = new javax.swing.JLabel();
        nota3title = new javax.swing.JLabel();
        nota4title = new javax.swing.JLabel();
        nota5title = new javax.swing.JLabel();
        tema = new javax.swing.JLabel();
        tone = new javax.swing.JLabel();
        
        nota1title.setText("Nota #1");
        nota1title.setMaximumSize(new java.awt.Dimension(0, 0));
        nota1title.setMinimumSize(new java.awt.Dimension(0, 0));
        nota1title.setPreferredSize(new java.awt.Dimension(0, 0));

        nota2title.setText("Nota #2");
        nota2title.setMaximumSize(new java.awt.Dimension(0, 0));
        nota2title.setMinimumSize(new java.awt.Dimension(0, 0));
        nota2title.setPreferredSize(new java.awt.Dimension(0, 0));

        nota3title.setText("Nota #3");
        nota3title.setMaximumSize(new java.awt.Dimension(0, 0));
        nota3title.setMinimumSize(new java.awt.Dimension(0, 0));
        nota3title.setPreferredSize(new java.awt.Dimension(0, 0));

        nota4title.setText("Nota #4");
        nota4title.setMaximumSize(new java.awt.Dimension(0, 0));
        nota4title.setMinimumSize(new java.awt.Dimension(0, 0));
        nota4title.setPreferredSize(new java.awt.Dimension(0, 0));

        nota5title.setText("Nota #5");
        nota5title.setMaximumSize(new java.awt.Dimension(0, 0));
        nota5title.setMinimumSize(new java.awt.Dimension(0, 0));
        nota5title.setPreferredSize(new java.awt.Dimension(0, 0));

        tema.setText("clara");
        tema.setMaximumSize(new java.awt.Dimension(0, 0));
        tema.setMinimumSize(new java.awt.Dimension(0, 0));
        tema.setPreferredSize(new java.awt.Dimension(0, 0));

        tone.setText("jLabel1");
        tone.setMaximumSize(new java.awt.Dimension(0, 0));
        tone.setMinimumSize(new java.awt.Dimension(0, 0));
        tone.setPreferredSize(new java.awt.Dimension(0, 0));
        
        frame = new JFrame("Cuestionario de Estilo de Aprendizaje");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        preguntaLabel = new JLabel(preguntas[preguntaActual]);
        frame.add(preguntaLabel, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel();
        siButton = new JButton("Sí");
        noButton = new JButton("No");

        buttonsPanel.add(siButton);
        buttonsPanel.add(noButton);

        frame.add(buttonsPanel, BorderLayout.SOUTH);
        

        siButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarEstilo("S");
            }
        });

        noButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarEstilo("N");
            }
        });
    }

    public void mostrarVentana() {
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    
    public void dispose() {
        frame.dispose();
    }

    public void actualizarEstilo(String respuesta) {
        if (respuesta.equals("S")) {
            if (preguntaActual % 3 == 0) {
                kinestesico++;
            } else if (preguntaActual % 3 == 1) {
                auditivo++;
            } else {
                visual++;
            }
        }
        preguntaActual++;
        if (preguntaActual < preguntas.length) {
            preguntaLabel.setText(preguntas[preguntaActual]);
        } else {
            frame.setVisible(false);
            mostrarResultado();
        }
    }

    public void mostrarResultado() {
        String estiloDominante = determinarEstiloDominante(kinestesico, auditivo, visual);
        JOptionPane.showMessageDialog(null, "Tu estilo de aprendizaje dominante es: " + estiloDominante); // AQUI SE ABRE EL MENSAJE FINAL DE METODO DE ESTUDIO
        if (estiloDominante.equals("Kinestésico")) {
            //ABRIR KINESTESICO
            Kinestesico audi = new Kinestesico();
        //SEND NOTES
        audi.nota1content.setText(this.nota1content.getText());
        audi.nota2content.setText(this.nota2content.getText());
        audi.nota3content.setText(this.nota3content.getText());
        audi.nota4content.setText(this.nota4content.getText());
        audi.nota5content.setText(this.nota5content.getText());
        
        audi.nota1title.setText(this.nota1title.getText());
        audi.nota2title.setText(this.nota2title.getText());
        audi.nota3title.setText(this.nota3title.getText());
        audi.nota4title.setText(this.nota4title.getText());
        audi.nota5title.setText(this.nota5title.getText());
        //SEND NOTES END
        
        //SEND THEME AND TONE
            audi.tema.setText(this.tema.getText());
            audi.tone.setText(this.tone.getText());
            
            if (tema.getText().equals("clara")) {
                Color MyColor = new Color(235,235,235);
                audi.getContentPane().setBackground(MyColor);
                audi.changetext(Color.BLACK);
            } else if (tema.getText().equals("oscura")) {
                Color MyColor = new Color(34,39,44);
                audi.getContentPane().setBackground(MyColor);
                audi.changetext(Color.WHITE);
            } else if (tema.getText().equals("morada")) {
                Color MyColor = new Color(128, 0, 128);
                audi.getContentPane().setBackground(MyColor);
                audi.changetext(Color.WHITE);
            } else if (tema.getText().equals("azul")) {
                Color MyColor = new Color(85,137,249);
                audi.getContentPane().setBackground(MyColor);
                audi.changetext(Color.WHITE);
            }
            
            //SEND THEME AND TONE END
            
            //SEND TASKS
            audi.size = size;
            audi.jlistdata = new String[audi.size];
            if (size != 0) {
               for (int i = 0; i<audi.size; i++) {
                audi.jlistdata[i] = jlistdata[i];
            }
            }
        //END SEND TASKS
            
        audi.show();
        dispose();
        } else if (estiloDominante.equals("Auditivo")) {
            Auditivo audi = new Auditivo();
        //SEND NOTES
        audi.nota1content.setText(this.nota1content.getText());
        audi.nota2content.setText(this.nota2content.getText());
        audi.nota3content.setText(this.nota3content.getText());
        audi.nota4content.setText(this.nota4content.getText());
        audi.nota5content.setText(this.nota5content.getText());
        
        audi.nota1title.setText(this.nota1title.getText());
        audi.nota2title.setText(this.nota2title.getText());
        audi.nota3title.setText(this.nota3title.getText());
        audi.nota4title.setText(this.nota4title.getText());
        audi.nota5title.setText(this.nota5title.getText());
        //SEND NOTES END
        
        //SEND THEME AND TONE
            audi.tema.setText(this.tema.getText());
            audi.tone.setText(this.tone.getText());
            
            if (tema.getText().equals("clara")) {
                Color MyColor = new Color(235,235,235);
                audi.getContentPane().setBackground(MyColor);
                audi.changetext(Color.BLACK);
            } else if (tema.getText().equals("oscura")) {
                Color MyColor = new Color(34,39,44);
                audi.getContentPane().setBackground(MyColor);
                audi.changetext(Color.WHITE);
            } else if (tema.getText().equals("morada")) {
                Color MyColor = new Color(128, 0, 128);
                audi.getContentPane().setBackground(MyColor);
                audi.changetext(Color.WHITE);
            } else if (tema.getText().equals("azul")) {
                Color MyColor = new Color(85,137,249);
                audi.getContentPane().setBackground(MyColor);
                audi.changetext(Color.WHITE);
            }
            
            //SEND THEME AND TONE END
            
            //SEND TASKS
            audi.size = size;
            audi.jlistdata = new String[audi.size];
            if (size != 0) {
               for (int i = 0; i<audi.size; i++) {
                audi.jlistdata[i] = jlistdata[i];
            }
            }
        //END SEND TASKS
            
        audi.show();
        dispose();
        } else if (estiloDominante.equals("Visual")) {
            //ABRIR VISUAL
            Visual audi = new Visual();
        //SEND NOTES
        audi.nota1content.setText(this.nota1content.getText());
        audi.nota2content.setText(this.nota2content.getText());
        audi.nota3content.setText(this.nota3content.getText());
        audi.nota4content.setText(this.nota4content.getText());
        audi.nota5content.setText(this.nota5content.getText());
        
        audi.nota1title.setText(this.nota1title.getText());
        audi.nota2title.setText(this.nota2title.getText());
        audi.nota3title.setText(this.nota3title.getText());
        audi.nota4title.setText(this.nota4title.getText());
        audi.nota5title.setText(this.nota5title.getText());
        //SEND NOTES END
        
        //SEND THEME AND TONE
            audi.tema.setText(this.tema.getText());
            audi.tone.setText(this.tone.getText());
            
            if (tema.getText().equals("clara")) {
                Color MyColor = new Color(235,235,235);
                audi.getContentPane().setBackground(MyColor);
                audi.changetext(Color.BLACK);
            } else if (tema.getText().equals("oscura")) {
                Color MyColor = new Color(34,39,44);
                audi.getContentPane().setBackground(MyColor);
                audi.changetext(Color.WHITE);
            } else if (tema.getText().equals("morada")) {
                Color MyColor = new Color(128, 0, 128);
                audi.getContentPane().setBackground(MyColor);
                audi.changetext(Color.WHITE);
            } else if (tema.getText().equals("azul")) {
                Color MyColor = new Color(85,137,249);
                audi.getContentPane().setBackground(MyColor);
                audi.changetext(Color.WHITE);
            }
            
            //SEND THEME AND TONE END
            
            //SEND TASKS
            audi.size = size;
            audi.jlistdata = new String[audi.size];
            if (size != 0) {
               for (int i = 0; i<audi.size; i++) {
                audi.jlistdata[i] = jlistdata[i];
            }
            }
        //END SEND TASKS
            
        audi.show();
        dispose();
        }
    }

    public String determinarEstiloDominante(int kinestesico, int auditivo, int visual) {
        if (kinestesico > auditivo && kinestesico > visual) {
            return "Kinestésico";
        } else if (auditivo > kinestesico && auditivo > visual) {
            return "Auditivo";
        } else{
            return "Visual";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Cuestionario app = new Cuestionario();
                app.mostrarVentana();
            }
        });
    }
}



/*

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

*/