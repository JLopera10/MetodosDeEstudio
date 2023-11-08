package com.mycompany.metodosdeestudio;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Juan Lopera
 */
public class JFramePrincipal extends javax.swing.JFrame {

    //FORM CREATION
    public JFramePrincipal() {
        initComponents();
    }

    //FORM INITIALIZATION
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Label1 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Label3 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metodos De Estudio");
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        Label1.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        Label1.setText("METODOS DE ESTUDIO");

        Label4.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        Label4.setText("metodo de estudio se adapta mas a ti, o si quieres ");

        jButton1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton1.setText("REALIZAR FORMULARIO");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton2.setText("VISUAL");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton3.setText("AUDITIVO");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jButton4.setText("KINESTESICO");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setPreferredSize(new java.awt.Dimension(200, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Label3.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        Label3.setText("si quieres realizar el formulario para encontrar que");

        Label2.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        Label2.setText("Bienvenido al programa, para iniciar, debes decidir");

        Label5.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        Label5.setText("elegir directamente uno de los metodos disponibles");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label4)
                            .addComponent(Label3)
                            .addComponent(Label2)
                            .addComponent(Label5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(Label1)))
                .addContainerGap(601, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota1content)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota2content)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota3content)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota4content)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota5content)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota1title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota2title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota3title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota4title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota5title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(721, 721, 721)
                    .addComponent(tema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(721, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(721, 721, 721)
                    .addComponent(tone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(721, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(Label1)
                .addGap(44, 44, 44)
                .addComponent(Label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label5)
                .addGap(65, 65, 65)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota1content)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota2content)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota3content)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota4content)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota5content)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota1title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota2title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota3title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota4title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota5title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(388, 388, 388)
                    .addComponent(tema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(388, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(388, 388, 388)
                    .addComponent(tone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(388, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    
    //ABRIR CUESTIONARIO
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Cuestionario audi = new Cuestionario();
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
            
        audi.mostrarVentana();
        dispose();
    }                                        

    
    //ABRIR METODO VISUAL
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
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

    
    //ABRIR METODO AUDITIVO
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
    }                                        

    
    //ABRIR METODO KINESTESICO
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
    }                                        

    public void changetext(Color a) {
        Label1.setForeground(a);
        Label2.setForeground(a);
        Label3.setForeground(a);
        Label4.setForeground(a);
        Label5.setForeground(a);
    }
   
    //MAIN
    public static void main(String args[]) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //APPEARANCE CODE "NIMBUS"
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //CREATE AND SHOW THE FORM
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    public int size = 0;
    public String[] jlistdata;
    // Variables declaration - do not modify                     
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    // End of variables declaration                   
}
