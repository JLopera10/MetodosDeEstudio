package Github;

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
        l_alert.setVisible(false);
        note1.setVisible(false);
        note2.setVisible(false);
        note3.setVisible(false);
        note4.setVisible(false);
        note5.setVisible(false);
    }

    //FORM INITIALIZATION
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        bg_gamacolor = new javax.swing.ButtonGroup();
        r_claro = new javax.swing.JRadioButton();
        r_oscuro = new javax.swing.JRadioButton();
        r_morado = new javax.swing.JRadioButton();
        r_azul = new javax.swing.JRadioButton();
        l_text1 = new javax.swing.JLabel();
        b_confirmarcol = new javax.swing.JButton();
        sp_hora = new javax.swing.JSpinner();
        sp_minuto = new javax.swing.JSpinner();
        l_text3 = new javax.swing.JLabel();
        l_text4 = new javax.swing.JLabel();
        l_text2 = new javax.swing.JLabel();
        b_confirmartiempo = new javax.swing.JButton();
        l_alert = new javax.swing.JLabel();
        sp_segundo = new javax.swing.JSpinner();
        l_text5 = new javax.swing.JLabel();
        l_creacionnotas = new javax.swing.JLabel();
        b_note1 = new javax.swing.JButton();
        b_note2 = new javax.swing.JButton();
        b_note3 = new javax.swing.JButton();
        b_note4 = new javax.swing.JButton();
        b_note5 = new javax.swing.JButton();
        note1 = new javax.swing.JLabel();
        note2 = new javax.swing.JLabel();
        note3 = new javax.swing.JLabel();
        note4 = new javax.swing.JLabel();
        note5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metodos De Estudio");
        setBackground(Color.WHITE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1000, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 650));

        bg_gamacolor.add(r_claro);
        r_claro.setText("Claro");

        bg_gamacolor.add(r_oscuro);
        r_oscuro.setText("Oscuro");

        bg_gamacolor.add(r_morado);
        r_morado.setText("Morado");

        bg_gamacolor.add(r_azul);
        r_azul.setText("Azul");

        l_text1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l_text1.setText("SELECCIONAR GAMA DE COLORES");

        b_confirmarcol.setText("CONFIRMAR");
        b_confirmarcol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_confirmarcolActionPerformed(evt);
            }
        });

        sp_hora.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        sp_minuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        l_text3.setText("Horas");

        l_text4.setText("Minutos");

        l_text2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l_text2.setText("CONFIGURAR ALERTA");

        b_confirmartiempo.setText("CONFIRMAR");
        b_confirmartiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    b_confirmartiempoActionPerformed(evt);
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        l_alert.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        l_alert.setText("¡¡¡ALARMA!!!");

        sp_segundo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        l_text5.setText("Segundos");

        l_creacionnotas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l_creacionnotas.setText("CREACION DE NOTAS");

        b_note1.setBackground(new java.awt.Color(255, 255, 153));
        b_note1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        b_note1.setText("Nota #1");
        b_note1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        b_note1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_note1ActionPerformed(evt);
            }
        });

        b_note2.setBackground(new java.awt.Color(255, 255, 153));
        b_note2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        b_note2.setText("Nota #2");
        b_note2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        b_note2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_note2ActionPerformed(evt);
            }
        });

        b_note3.setBackground(new java.awt.Color(255, 255, 153));
        b_note3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        b_note3.setText("Nota #3");
        b_note3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        b_note3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_note3ActionPerformed(evt);
            }
        });

        b_note4.setBackground(new java.awt.Color(255, 255, 153));
        b_note4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        b_note4.setText("Nota #4");
        b_note4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        b_note4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_note4ActionPerformed(evt);
            }
        });

        b_note5.setBackground(new java.awt.Color(255, 255, 153));
        b_note5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        b_note5.setText("Nota #5");
        b_note5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        b_note5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_note5ActionPerformed(evt);
            }
        });

        note1.setText("NOTA 1");

        note2.setText("NOTA 2");

        note3.setText("NOTA 3");

        note4.setText("NOTA 4");

        note5.setText("NOTA 5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_creacionnotas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(r_morado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r_azul, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r_oscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r_claro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b_confirmarcol)
                            .addComponent(l_text1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_text2)
                            .addComponent(b_confirmartiempo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sp_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l_text3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sp_minuto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l_text4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_text5)
                                    .addComponent(sp_segundo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(l_alert))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_note1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_note2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_note3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_note4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_note5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(note1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(note2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(note3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(note4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(note5)))
                        .addGap(0, 370, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_text1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r_claro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r_oscuro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r_morado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r_azul)
                        .addGap(18, 18, 18)
                        .addComponent(b_confirmarcol))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_text2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(l_text3)
                                    .addComponent(l_text4)
                                    .addComponent(l_text5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sp_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sp_minuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sp_segundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_confirmartiempo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_alert, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86)
                .addComponent(l_creacionnotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_note1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_note2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_note3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_note4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_note5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(note1)
                    .addComponent(note2)
                    .addComponent(note3)
                    .addComponent(note4)
                    .addComponent(note5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
    
    //COLOR CHANGE
    private void b_confirmarcolActionPerformed(java.awt.event.ActionEvent evt) {                                               
        if (r_claro.isSelected()) {
            Color MyColor = new Color(235,235,235);
            getContentPane().setBackground(MyColor);
            changetext(Color.BLACK);
        } else if (r_oscuro.isSelected()) {
            Color MyColor = new Color(34,39,44);
            getContentPane().setBackground(MyColor);
            changetext(Color.WHITE);
        } else if (r_morado.isSelected()) {
            Color MyColor = new Color(128, 0, 128);
            getContentPane().setBackground(MyColor);
            changetext(Color.WHITE);
        } else if (r_azul.isSelected()) {
            Color MyColor = new Color(85,137,249);
            getContentPane().setBackground(MyColor);
            changetext(Color.WHITE);
        }
    }                                              

    //CHANGE TEXT
    private void changetext(Color a) {
        r_claro.setForeground(a);
        r_oscuro.setForeground(a);
        r_morado.setForeground(a);
        r_azul.setForeground(a);
        l_text1.setForeground(a);
        l_text2.setForeground(a);
        l_text3.setForeground(a);
        l_text4.setForeground(a);
        l_text5.setForeground(a);
        l_alert.setForeground(a);
        l_creacionnotas.setForeground(a);
    }
    
    //SET ALERT
    private void b_confirmartiempoActionPerformed(java.awt.event.ActionEvent evt) throws UnsupportedAudioFileException, IOException, LineUnavailableException {                                                  
        int hour = (Integer) sp_hora.getValue();
        int minute = (Integer) sp_minuto.getValue();
        int second = (Integer) sp_segundo.getValue();
        File alarmsound = new File("Alarm.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(alarmsound);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        Timer countdown = new Timer();
        TimerTask disappear = new TimerTask() {
            @Override
            public void run() {
                l_alert.setVisible(false);
            }
        };
        Timer alert = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                l_alert.setVisible(true);
                clip.start();
            }
        };
        int delay = second*1000 + minute*1000*60 + hour*1000*60*60;
        alert.schedule(task,delay);
        countdown.schedule(disappear, delay + 11000);
    }                                            

    //NOTE SYSTEM
    private void b_note1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //Main Note
        Nota1 frame1 = new Nota1();
        frame1.text_contenido.setText(note1.getText());
        frame1.text_titulo.setText(b_note1.getText());
        //Note #1 Transfer
        frame1.note2.setText(note2.getText());
        frame1.note2title.setText(b_note2.getText());
        //Note #2 Transfer
        frame1.note3.setText(note3.getText());
        frame1.note3title.setText(b_note3.getText());
        //Note #3 Transfer
        frame1.note4.setText(note4.getText());
        frame1.note4title.setText(b_note4.getText());
        //Note #4 Transfer
        frame1.note5.setText(note5.getText());
        frame1.note5title.setText(b_note5.getText());
        //Open JFrame
        frame1.show();
        dispose();
    }                                       

    private void b_note2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //Main Note
        Nota2 frame2 = new Nota2();
        frame2.text_contenido.setText(note2.getText());
        frame2.text_titulo.setText(b_note2.getText());
        //Note #1 Transfer
        frame2.note1.setText(note1.getText());
        frame2.note1title.setText(b_note1.getText());
        //Note #2 Transfer
        frame2.note3.setText(note3.getText());
        frame2.note3title.setText(b_note3.getText());
        //Note #3 Transfer
        frame2.note4.setText(note4.getText());
        frame2.note4title.setText(b_note4.getText());
        //Note #4 Transfer
        frame2.note5.setText(note5.getText());
        frame2.note5title.setText(b_note5.getText());
        //Open JFrame
        frame2.show();
        dispose();
    }                                       

    private void b_note3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //Main Note
        Nota3 frame3 = new Nota3();
        frame3.text_contenido.setText(note3.getText());
        frame3.text_titulo.setText(b_note3.getText());
        //Note #1 Transfer
        frame3.note1.setText(note1.getText());
        frame3.note1title.setText(b_note1.getText());
        //Note #2 Transfer
        frame3.note2.setText(note2.getText());
        frame3.note2title.setText(b_note2.getText());
        //Note #3 Transfer
        frame3.note4.setText(note4.getText());
        frame3.note4title.setText(b_note4.getText());
        //Note #4 Transfer
        frame3.note5.setText(note5.getText());
        frame3.note5title.setText(b_note5.getText());
        //Open JFrame
        frame3.show();
        dispose();
    }                                       

    private void b_note4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //Main Note
        Nota4 frame4 = new Nota4();
        frame4.text_contenido.setText(note4.getText());
        frame4.text_titulo.setText(b_note4.getText());
        //Note #1 Transfer
        frame4.note1.setText(note1.getText());
        frame4.note1title.setText(b_note1.getText());
        //Note #2 Transfer
        frame4.note2.setText(note2.getText());
        frame4.note2title.setText(b_note2.getText());
        //Note #3 Transfer
        frame4.note3.setText(note3.getText());
        frame4.note3title.setText(b_note3.getText());
        //Note #4 Transfer
        frame4.note5.setText(note5.getText());
        frame4.note5title.setText(b_note5.getText());
        //Open JFrame
        frame4.show();
        dispose();
    }                                       

    private void b_note5ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        //Main Note
        Nota5 frame5 = new Nota5();
        frame5.text_contenido.setText(note5.getText());
        frame5.text_titulo.setText(b_note5.getText());
        //Note #1 Transfer
        frame5.note1.setText(note1.getText());
        frame5.note1title.setText(b_note1.getText());
        //Note #2 Transfer
        frame5.note2.setText(note2.getText());
        frame5.note2title.setText(b_note2.getText());
        //Note #3 Transfer
        frame5.note3.setText(note3.getText());
        frame5.note3title.setText(b_note3.getText());
        //Note #4 Transfer
        frame5.note4.setText(note4.getText());
        frame5.note4title.setText(b_note4.getText());
        //Open JFrame
        frame5.show();
        dispose();
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

    // Variables declaration - do not modify                     
    private javax.swing.JButton b_confirmarcol;
    private javax.swing.JButton b_confirmartiempo;
    public javax.swing.JButton b_note1;
    public javax.swing.JButton b_note2;
    public javax.swing.JButton b_note3;
    public javax.swing.JButton b_note4;
    public javax.swing.JButton b_note5;
    private javax.swing.ButtonGroup bg_gamacolor;
    private javax.swing.JLabel l_alert;
    private javax.swing.JLabel l_creacionnotas;
    private javax.swing.JLabel l_text1;
    private javax.swing.JLabel l_text2;
    private javax.swing.JLabel l_text3;
    private javax.swing.JLabel l_text4;
    private javax.swing.JLabel l_text5;
    public javax.swing.JLabel note1;
    public javax.swing.JLabel note2;
    public javax.swing.JLabel note3;
    public javax.swing.JLabel note4;
    public javax.swing.JLabel note5;
    private javax.swing.JRadioButton r_azul;
    private javax.swing.JRadioButton r_claro;
    private javax.swing.JRadioButton r_morado;
    private javax.swing.JRadioButton r_oscuro;
    private javax.swing.JSpinner sp_hora;
    private javax.swing.JSpinner sp_minuto;
    private javax.swing.JSpinner sp_segundo;
    // End of variables declaration                   
}
