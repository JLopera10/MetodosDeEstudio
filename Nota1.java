/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.metodosdeestudio;

import java.awt.Color;

/**
 *
 * @author Juan Lopera
 */
public class Nota1 extends javax.swing.JFrame {

    /**
     * Creates new form Nota1
     */
    String variable = "";
    
    public Nota1() {
        initComponents();
    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        text_contenido = new javax.swing.JTextArea();
        b_editartexto = new javax.swing.JButton();
        b_borrartexto = new javax.swing.JButton();
        text_titulo = new javax.swing.JTextField();
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
        comingfrom = new javax.swing.JLabel();
        tema = new javax.swing.JLabel();
        tone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 330));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 330));

        text_contenido.setColumns(20);
        text_contenido.setRows(5);
        jScrollPane1.setViewportView(text_contenido);

        b_editartexto.setText("Guardar");
        b_editartexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editartextoActionPerformed(evt);
            }
        });

        b_borrartexto.setText("Borrar");
        b_borrartexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_borrartextoActionPerformed(evt);
            }
        });

        text_titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        text_titulo.setText("NOTA 1");

        nota1content.setText("jLabel1");
        nota1content.setMaximumSize(new java.awt.Dimension(0, 0));
        nota1content.setMinimumSize(new java.awt.Dimension(0, 0));
        nota1content.setPreferredSize(new java.awt.Dimension(0, 0));

        nota2content.setText("jLabel1");
        nota2content.setMaximumSize(new java.awt.Dimension(0, 0));
        nota2content.setMinimumSize(new java.awt.Dimension(0, 0));
        nota2content.setPreferredSize(new java.awt.Dimension(0, 0));

        nota3content.setText("jLabel1");
        nota3content.setMaximumSize(new java.awt.Dimension(0, 0));
        nota3content.setMinimumSize(new java.awt.Dimension(0, 0));
        nota3content.setPreferredSize(new java.awt.Dimension(0, 0));

        nota4content.setText("jLabel1");
        nota4content.setMaximumSize(new java.awt.Dimension(0, 0));
        nota4content.setMinimumSize(new java.awt.Dimension(0, 0));
        nota4content.setPreferredSize(new java.awt.Dimension(0, 0));

        nota5content.setText("jLabel1");
        nota5content.setMaximumSize(new java.awt.Dimension(0, 0));
        nota5content.setMinimumSize(new java.awt.Dimension(0, 0));
        nota5content.setPreferredSize(new java.awt.Dimension(0, 0));

        nota1title.setText("jLabel1");
        nota1title.setMaximumSize(new java.awt.Dimension(0, 0));
        nota1title.setMinimumSize(new java.awt.Dimension(0, 0));
        nota1title.setPreferredSize(new java.awt.Dimension(0, 0));

        nota2title.setText("jLabel1");
        nota2title.setMaximumSize(new java.awt.Dimension(0, 0));
        nota2title.setMinimumSize(new java.awt.Dimension(0, 0));
        nota2title.setPreferredSize(new java.awt.Dimension(0, 0));

        nota3title.setText("jLabel1");
        nota3title.setMaximumSize(new java.awt.Dimension(0, 0));
        nota3title.setMinimumSize(new java.awt.Dimension(0, 0));
        nota3title.setPreferredSize(new java.awt.Dimension(0, 0));

        nota4title.setText("jLabel1");
        nota4title.setMaximumSize(new java.awt.Dimension(0, 0));
        nota4title.setMinimumSize(new java.awt.Dimension(0, 0));
        nota4title.setPreferredSize(new java.awt.Dimension(0, 0));

        nota5title.setText("jLabel1");
        nota5title.setMaximumSize(new java.awt.Dimension(0, 0));
        nota5title.setMinimumSize(new java.awt.Dimension(0, 0));
        nota5title.setPreferredSize(new java.awt.Dimension(0, 0));

        comingfrom.setText("jLabel1");
        comingfrom.setMaximumSize(new java.awt.Dimension(0, 0));
        comingfrom.setMinimumSize(new java.awt.Dimension(0, 0));
        comingfrom.setPreferredSize(new java.awt.Dimension(0, 0));

        tema.setText("jLabel1");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(text_titulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_editartexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_borrartexto)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota1content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota3content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota4content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota5title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota2title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota2content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota3title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota5content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota1title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(nota4title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(210, Short.MAX_VALUE)
                    .addComponent(comingfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(190, 190, 190)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(tema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(tone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_borrartexto)
                    .addComponent(b_editartexto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 134, Short.MAX_VALUE)
                    .addComponent(nota1content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 134, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 134, Short.MAX_VALUE)
                    .addComponent(nota3content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 134, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 134, Short.MAX_VALUE)
                    .addComponent(nota4content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 134, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 134, Short.MAX_VALUE)
                    .addComponent(nota5title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 134, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 134, Short.MAX_VALUE)
                    .addComponent(nota2title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 134, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 134, Short.MAX_VALUE)
                    .addComponent(nota2content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 134, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 134, Short.MAX_VALUE)
                    .addComponent(nota3title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 134, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 134, Short.MAX_VALUE)
                    .addComponent(nota5content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 134, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 134, Short.MAX_VALUE)
                    .addComponent(nota1title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 134, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 134, Short.MAX_VALUE)
                    .addComponent(nota4title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 134, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(144, Short.MAX_VALUE)
                    .addComponent(comingfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(124, 124, 124)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(tema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(134, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(166, 166, 166)
                    .addComponent(tone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(102, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void b_borrartextoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        text_contenido.setText("");
    }                                             

    private void b_editartextoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Notas notes = new Notas();
        this.nota1content.setText(this.text_contenido.getText());
        this.nota1title.setText(this.text_titulo.getText());
        //SEND NOTES
        notes.comingfrom.setText(this.comingfrom.getText());
        notes.comingfrom.setVisible(false);
        
        notes.nota1content.setText(this.nota1content.getText());
        notes.nota2content.setText(this.nota2content.getText());
        notes.nota3content.setText(this.nota3content.getText());
        notes.nota4content.setText(this.nota4content.getText());
        notes.nota5content.setText(this.nota5content.getText());
        
        notes.b_nota1.setText(this.nota1title.getText());
        notes.b_nota2.setText(this.nota2title.getText());
        notes.b_nota3.setText(this.nota3title.getText());
        notes.b_nota4.setText(this.nota4title.getText());
        notes.b_nota5.setText(this.nota5title.getText());
        //SEND NOTES END
        
        //SEND THEME AND TONE
            notes.tema.setText(this.tema.getText());
            notes.tone.setText(this.tone.getText());
            
            if (tema.getText().equals("clara")) {
                Color MyColor = new Color(235,235,235);
                notes.getContentPane().setBackground(MyColor);
                notes.changetext(Color.BLACK);
            } else if (tema.getText().equals("oscura")) {
                Color MyColor = new Color(34,39,44);
                notes.getContentPane().setBackground(MyColor);
                notes.changetext(Color.WHITE);
            } else if (tema.getText().equals("morada")) {
                Color MyColor = new Color(128, 0, 128);
                notes.getContentPane().setBackground(MyColor);
                notes.changetext(Color.WHITE);
            } else if (tema.getText().equals("azul")) {
                Color MyColor = new Color(85,137,249);
                notes.getContentPane().setBackground(MyColor);
                notes.changetext(Color.WHITE);
            }
            
        //SEND THEME AND TONE END
        
        //SEND TASKS
            notes.size = size;
            notes.jlistdata = new String[notes.size];
            if (size != 0) {
               for (int i = 0; i<notes.size; i++) {
                notes.jlistdata[i] = jlistdata[i];
            }
            }
        //END SEND TASKS
        
        notes.show();
        dispose();
    }                                             
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Nota1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nota1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nota1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nota1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nota1().setVisible(true);
            }
        });
    }
    
    
public int size = 0;
    public String[] jlistdata;
    // Variables declaration - do not modify                     
    private javax.swing.JButton b_borrartexto;
    private javax.swing.JButton b_editartexto;
    public javax.swing.JLabel comingfrom;
    private javax.swing.JScrollPane jScrollPane1;
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
    public javax.swing.JTextArea text_contenido;
    public javax.swing.JTextField text_titulo;
    public javax.swing.JLabel tone;
    // End of variables declaration                   
}
