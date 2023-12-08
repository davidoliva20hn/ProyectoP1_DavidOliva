/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pokedex;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Pokedex extends javax.swing.JFrame {

    private String RegistrarPokemon;

    /**
     * Creates new form Pokedex
     */
    public Pokedex() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pan2 = new javax.swing.JPanel();
        pan3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombrepokemon = new javax.swing.JTextField();
        tipopokemon = new javax.swing.JTextField();
        regionpokemon = new javax.swing.JTextField();
        vidapokemon = new javax.swing.JTextField();
        registrarpokemon = new java.awt.Button();
        pan4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listapokemon = new javax.swing.JTextArea();
        img = new javax.swing.JPanel();
        check = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        boton1 = new java.awt.Button();
        boton2 = new java.awt.Button();
        boton3 = new java.awt.Button();
        boton4 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        pan2.setBackground(new java.awt.Color(51, 51, 51));
        pan2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pan2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        pan2Layout.setVerticalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        pan3.setBackground(new java.awt.Color(51, 51, 51));
        pan3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokedex/pokemon-go.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Añadir a pokedex");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingrese nombre de pokemon:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ingrese tipo de pokemon:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ingrese region de origen de pokemon:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingrese puntos de vida de pokemon:");

        nombrepokemon.setBackground(new java.awt.Color(255, 255, 255));
        nombrepokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrepokemonActionPerformed(evt);
            }
        });
        nombrepokemon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrepokemonKeyTyped(evt);
            }
        });

        tipopokemon.setBackground(new java.awt.Color(255, 255, 255));
        tipopokemon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tipopokemonKeyTyped(evt);
            }
        });

        regionpokemon.setBackground(new java.awt.Color(255, 255, 255));
        regionpokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionpokemonActionPerformed(evt);
            }
        });
        regionpokemon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regionpokemonKeyTyped(evt);
            }
        });

        vidapokemon.setBackground(new java.awt.Color(255, 255, 255));
        vidapokemon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vidapokemonKeyTyped(evt);
            }
        });

        registrarpokemon.setBackground(new java.awt.Color(255, 255, 255));
        registrarpokemon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registrarpokemon.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        registrarpokemon.setForeground(new java.awt.Color(51, 51, 51));
        registrarpokemon.setLabel("Registrar a pokedex");
        registrarpokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarpokemonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan3Layout = new javax.swing.GroupLayout(pan3);
        pan3.setLayout(pan3Layout);
        pan3Layout.setHorizontalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan3Layout.createSequentialGroup()
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pan3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombrepokemon)
                                .addComponent(tipopokemon)
                                .addComponent(regionpokemon)
                                .addComponent(vidapokemon, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
                            .addComponent(jLabel6)))
                    .addGroup(pan3Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(registrarpokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pan3Layout.setVerticalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan3Layout.createSequentialGroup()
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pan3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(nombrepokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(tipopokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(regionpokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(vidapokemon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(registrarpokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        pan4.setBackground(new java.awt.Color(51, 51, 51));
        pan4.setForeground(new java.awt.Color(51, 255, 51));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokedex/pokemon-go.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Listar Pokemon");

        listapokemon.setBackground(new java.awt.Color(153, 153, 153));
        listapokemon.setColumns(20);
        listapokemon.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        listapokemon.setRows(5);
        listapokemon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                listapokemonKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(listapokemon);

        javax.swing.GroupLayout pan4Layout = new javax.swing.GroupLayout(pan4);
        pan4.setLayout(pan4Layout);
        pan4Layout.setHorizontalGroup(
            pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan4Layout.createSequentialGroup()
                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(pan4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pan4Layout.setVerticalGroup(
            pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan4Layout.createSequentialGroup()
                .addGroup(pan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5))
                    .addGroup(pan4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/check.png"))); // NOI18N

        error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/error.png"))); // NOI18N

        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/info.png"))); // NOI18N

        javax.swing.GroupLayout imgLayout = new javax.swing.GroupLayout(img);
        img.setLayout(imgLayout);
        imgLayout.setHorizontalGroup(
            imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgLayout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(error, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(check, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        imgLayout.setVerticalGroup(
            imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(info)
                .addGap(43, 43, 43)
                .addComponent(error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(check)
                .addGap(78, 78, 78))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokedex/pokedex-3d-logo (1) (1).png"))); // NOI18N

        boton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        boton1.setLabel("Registrar Pokemon");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        boton2.setLabel("Listar Pokemon");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        boton3.setLabel("Revisión de pokedex");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        boton4.setLabel("Salir");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(boton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26)
                .addComponent(pan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 236, Short.MAX_VALUE)
                    .addComponent(pan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 236, Short.MAX_VALUE)
                    .addComponent(pan4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(361, 361, 361)
                    .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addComponent(pan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        
        nombrepokemon.setVisible(true);
        tipopokemon.setVisible(true);
        regionpokemon.setVisible(true);
        vidapokemon.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        pan2.setVisible(false);
        pan3.setVisible(true);
        pan4.setVisible(false);

    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        listapokemon.setVisible(true);
        nombrepokemon.setVisible(false);
        pan2.setVisible(false);       
        pan3.setVisible(false);
        pan4.setVisible(true);
        
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_boton4ActionPerformed

    private void regionpokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionpokemonActionPerformed
        
    }//GEN-LAST:event_regionpokemonActionPerformed

    private void nombrepokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrepokemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrepokemonActionPerformed

    private void pan2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pan2AncestorAdded
        listapokemon.setVisible(false);
        nombrepokemon.setVisible(false);
        tipopokemon.setVisible(false);
        regionpokemon.setVisible(false);
        vidapokemon.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
    }//GEN-LAST:event_pan2AncestorAdded

    private void registrarpokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarpokemonActionPerformed

        if (nombrepokemon.getText().isEmpty() || tipopokemon.getText().isEmpty() || regionpokemon.getText().isEmpty() || vidapokemon.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Oops,completa todos los campos obligatorios.", "", HEIGHT, error.getIcon());
        } else {
            try {
                String nombre = nombrepokemon.getText();
                String tipo = tipopokemon.getText();
                String region = regionpokemon.getText();
                String Vida = vidapokemon.getText();
                int vida = Integer.valueOf(Vida);
                RegistrarPokemon(nombre, tipo, region, vida);
                String resgis = pokemonregistrados();
                listapokemon.setText(resgis);
                JOptionPane.showMessageDialog(null, "Pokémon registrado correctamente", "Mensaje", HEIGHT, check.getIcon());
                nombrepokemon.setText("");
                tipopokemon.setText("");
                regionpokemon.setText("");
                vidapokemon.setText("");
            } catch (Exception e) {

            }
        }
            

        
    }//GEN-LAST:event_registrarpokemonActionPerformed

    private void vidapokemonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vidapokemonKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') evt.consume();
            
    }//GEN-LAST:event_vidapokemonKeyTyped

    private void nombrepokemonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrepokemonKeyTyped
        char c = evt.getKeyChar();
        if ((c<65||c>90)&& (c<97||c>122)) evt.consume();
    }//GEN-LAST:event_nombrepokemonKeyTyped

    private void tipopokemonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipopokemonKeyTyped
        char c = evt.getKeyChar();
        if ((c<65||c>90)&& (c<97||c>122)) evt.consume();
    }//GEN-LAST:event_tipopokemonKeyTyped

    private void regionpokemonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regionpokemonKeyTyped
        char c = evt.getKeyChar();
        if ((c<65||c>90)&& (c<97||c>122)) evt.consume();
    }//GEN-LAST:event_regionpokemonKeyTyped
       public static int cont=0;
    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
    String hola=Revisionpokedex ();
    String pokemo="Pokemon registrados:";
    JOptionPane.showMessageDialog(null, pokemo+cont+"\n"+hola, "Mensaje", HEIGHT, info.getIcon());
    }//GEN-LAST:event_boton3ActionPerformed

    private void listapokemonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listapokemonKeyTyped
       char c = evt.getKeyChar();
       if (c<'1'||c>'0') evt.consume();
    }//GEN-LAST:event_listapokemonKeyTyped

    /**
     * @param args the command line arguments
     */
    public static ArrayList<PokedexRegistro> pokemon = new ArrayList<>();

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pokedex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pokedex().setVisible(true);
            }
        });

    }

    public void RegistrarPokemon(String Nombre, String Tipo, String Region, int Vida) {
        PokedexRegistro registro = new PokedexRegistro(Nombre, Tipo, Region, Vida);
        pokemon.add(registro);
    }

    public static String pokemonregistrados() {
        String pokemonres = "";
        for (PokedexRegistro registro : pokemon) {
            pokemonres = pokemonres + "Nombre:" + registro.getNombre() + " | tipo:" + registro.getTipo() + " | hp=" + registro.getVida() + " | Region:" + registro.getRegion() + "\n";
        }
        return pokemonres;
    }

    public static String Revisionpokedex() {
        String valor = "";
        for (PokedexRegistro persona : pokemon) {
            int contador = 0;
            
            cont++;
            for (PokedexRegistro otraPersona : pokemon) {
                if (persona.getRegion().equals(otraPersona.getRegion())) {
                    contador++;
                }
            }
            if (valor.contains(persona.getRegion())) {
                continue;
            }
            valor += persona.getRegion() + ": " + contador + "\n";
        }

        return valor;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button boton1;
    private java.awt.Button boton2;
    private java.awt.Button boton3;
    private java.awt.Button boton4;
    private javax.swing.JLabel check;
    private javax.swing.JLabel error;
    private javax.swing.JPanel img;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listapokemon;
    private javax.swing.JTextField nombrepokemon;
    private javax.swing.JPanel pan2;
    private javax.swing.JPanel pan3;
    private javax.swing.JPanel pan4;
    private javax.swing.JTextField regionpokemon;
    private java.awt.Button registrarpokemon;
    private javax.swing.JTextField tipopokemon;
    private javax.swing.JTextField vidapokemon;
    // End of variables declaration//GEN-END:variables


}
