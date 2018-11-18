/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gioco_delle_torte;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Maurizio
 */
public class Gioco_torte extends javax.swing.JFrame {

    boolean vuoto_forma=true,vuoto_glassa=true,vuoto_canditi=true,vuoto_base=true;
    
    int forma;
    int base;
    int glassa;
    int canditi;
    
    int i_forma;
    int i_base;
    int i_glassa;
    int i_canditi;
    
    int conta=0;
   
    public Gioco_torte() {
        initComponents();
        
        
        
         
        this.setSize(600, 550);                              //Setto la larghezza e l'altezza della mia JFrame
        this.setLocation(300, 200);                          //Setto la posizione
       

     
         getContentPane().setLayout(null);                  //setto il layout del mio pannello a null, molto importante per mettere i componenti dove voglio io    
         getContentPane().setBackground(Color.white);       //ed il suo colore



        
        Gioco_Torte();
    }

    void Gioco_Torte()
    {
        
        String imag_base="";
        
      //sorteggio delle parti della torta
      forma=ThreadLocalRandom.current().nextInt(0,3);
      base=ThreadLocalRandom.current().nextInt(0,3);
      glassa=ThreadLocalRandom.current().nextInt(0,3);
      canditi=ThreadLocalRandom.current().nextInt(0,4);
      
      //quadrato
      if(forma ==0)
         imag_base= "base_q_"+base+".jpg";
      //triangolo
      else if(forma==1)
         imag_base= "base_t_"+base+".jpg";
      //cerchio
      else if(forma==2)   
          imag_base= "base_tonda_"+base+".jpg";
         
         
         
        
         String imag_glassa= "glassa_"+glassa+".jpg";
         String imag_canditi= "canditi_"+canditi+".jpg";
         
         ImageIcon i_b = new ImageIcon(Path.PATH + "\\IMMAGINI\\"+ imag_base);
         ImageIcon i_g = new ImageIcon(Path.PATH + "\\IMMAGINI\\"+ imag_glassa);
         ImageIcon i_c = new ImageIcon(Path.PATH + "\\IMMAGINI\\"+ imag_canditi);
         

           JButton button = new JButton(i_c);  
           button.setBounds(50, 30, 80, 50);       //posizione colonna,posizione riga,pulsante larghezza,pulsante altezza
           getContentPane().add(button);
    
           
           
            JButton button2 = new JButton(i_g);
            button2.setBounds(50, 77, 80, 50);       //posizione colonna,posizione riga,pulsante larghezza,pulsante altezza
            getContentPane().add(button2);
           
            
            
            JButton button3 = new JButton(i_b);
            button3.setBounds(50, 124, 80, 50);       //posizione colonna,posizione riga,pulsante larghezza,pulsante altezza
            getContentPane().add(button3);
           
           
            this.setVisible(true);
         
        
        
        
        
        vuoto_forma=true;
        vuoto_glassa=true;
        vuoto_canditi=true;
        vuoto_base=true;

         Areatorta.setText("");
       
        Lcanditi.setText("—");
        Lbase.setText("—");
        Lglassa.setText("—");
        Lforma.setText("—");
             
        
         buttonGroup1.clearSelection();             //se avessi solo un toggle button dovrei scrivere TB1.setSelected(false);
         buttonGroup2.clearSelection();
         buttonGroup3.clearSelection();
         buttonGroup4.clearSelection();
   
      

   
 
          Areatorta.append("La torta che vuole il cliente ha :\nforma = "+forma+"\n"+
                             "base = "+base+"\nglassa = "+glassa+"\ncanditi = "+canditi);

 

    
 

  }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        Lforma = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Bforma1 = new javax.swing.JToggleButton();
        Bforma0 = new javax.swing.JToggleButton();
        Bforma2 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Areatorta = new javax.swing.JTextArea();
        Bbase1 = new javax.swing.JToggleButton();
        Lbase = new javax.swing.JLabel();
        Lglassa = new javax.swing.JLabel();
        Bbase0 = new javax.swing.JToggleButton();
        Bbase2 = new javax.swing.JToggleButton();
        Bglassa1 = new javax.swing.JToggleButton();
        Bglassa0 = new javax.swing.JToggleButton();
        Bglassa2 = new javax.swing.JToggleButton();
        Bcanditi1 = new javax.swing.JToggleButton();
        Lcanditi = new javax.swing.JLabel();
        Bcanditi0 = new javax.swing.JToggleButton();
        Bcanditi2 = new javax.swing.JToggleButton();
        Bcanditi3 = new javax.swing.JToggleButton();
        Binforna = new javax.swing.JButton();
        fatto1 = new javax.swing.JLabel();
        fatto2 = new javax.swing.JLabel();
        fatto3 = new javax.swing.JLabel();
        Titolol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        Lforma.setText("—");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("BASE");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("FORMINO");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("GLASSA");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("CANDITI");

        buttonGroup1.add(Bforma1);
        Bforma1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gioco_delle_torte/triangolo.jpg"))); // NOI18N
        Bforma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bforma1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Bforma0);
        Bforma0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gioco_delle_torte/quadrato.jpg"))); // NOI18N
        Bforma0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bforma0ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Bforma2);
        Bforma2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gioco_delle_torte/cerchio.jpg"))); // NOI18N
        Bforma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bforma2ActionPerformed(evt);
            }
        });

        Areatorta.setColumns(20);
        Areatorta.setRows(5);
        jScrollPane1.setViewportView(Areatorta);

        buttonGroup2.add(Bbase1);
        Bbase1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gioco_delle_torte/cioccolato.jpg"))); // NOI18N
        Bbase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bbase1ActionPerformed(evt);
            }
        });

        Lbase.setText("—");

        Lglassa.setText("—");

        buttonGroup2.add(Bbase0);
        Bbase0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gioco_delle_torte/frutto_p.jpg"))); // NOI18N
        Bbase0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bbase0ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Bbase2);
        Bbase2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gioco_delle_torte/fragola.jpg"))); // NOI18N
        Bbase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bbase2ActionPerformed(evt);
            }
        });

        buttonGroup3.add(Bglassa1);
        Bglassa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gioco_delle_torte/verde.jpg"))); // NOI18N
        Bglassa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bglassa1ActionPerformed(evt);
            }
        });

        buttonGroup3.add(Bglassa0);
        Bglassa0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gioco_delle_torte/rosso.jpg"))); // NOI18N
        Bglassa0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bglassa0ActionPerformed(evt);
            }
        });

        buttonGroup3.add(Bglassa2);
        Bglassa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gioco_delle_torte/azzurro.jpg"))); // NOI18N
        Bglassa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bglassa2ActionPerformed(evt);
            }
        });

        buttonGroup4.add(Bcanditi1);
        Bcanditi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bcanditi1ActionPerformed(evt);
            }
        });

        Lcanditi.setText("—");

        buttonGroup4.add(Bcanditi0);
        Bcanditi0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bcanditi0ActionPerformed(evt);
            }
        });

        buttonGroup4.add(Bcanditi2);
        Bcanditi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bcanditi2ActionPerformed(evt);
            }
        });

        buttonGroup4.add(Bcanditi3);
        Bcanditi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bcanditi3ActionPerformed(evt);
            }
        });

        Binforna.setText("INFORNA");
        Binforna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinfornaActionPerformed(evt);
            }
        });

        fatto1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fatto1.setText("__");
        fatto1.setToolTipText("");

        fatto2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fatto2.setText("__");

        fatto3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fatto3.setText("__");

        Titolol.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Titolol.setForeground(new java.awt.Color(255, 10, 10));
        Titolol.setText("DOPPIA3MME");
        Titolol.setMaximumSize(new java.awt.Dimension(26, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Bforma1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(Bforma0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bforma2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Bbase1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Bglassa1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Bbase0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(Bglassa0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Bbase2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Bglassa2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 25, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Bcanditi1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bcanditi0, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Bcanditi2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bcanditi3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lforma, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lcanditi, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Lbase, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Lglassa, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addComponent(Binforna)))
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fatto1)
                            .addComponent(fatto2)
                            .addComponent(fatto3))))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Titolol, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(fatto1)
                        .addGap(18, 18, 18)
                        .addComponent(fatto2)
                        .addGap(18, 18, 18)
                        .addComponent(fatto3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Titolol, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Lforma)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Lbase)
                        .addGap(16, 16, 16)
                        .addComponent(Lglassa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Bbase0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Bglassa0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Bbase1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Bglassa1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Bforma0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Bforma1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bforma2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bbase2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Bglassa2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lcanditi)
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Bcanditi0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Bcanditi1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Bcanditi2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Bcanditi3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Binforna)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
     
     void F_forma(int f)
    {
       
      
              if (f==0)
                  Lforma.setText("Ho preso la forma 0");
              else if(f==1)
                  Lforma.setText("Ho preso la forma 1");
              else if(f==2)
                  Lforma.setText("Ho preso la forma 2");
             
              i_forma=f;
              vuoto_forma=false;
      
    }
    
    private void Bforma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bforma1ActionPerformed
         F_forma(1);
    }//GEN-LAST:event_Bforma1ActionPerformed

    private void Bforma0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bforma0ActionPerformed
         F_forma(0);
    }//GEN-LAST:event_Bforma0ActionPerformed

    private void Bforma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bforma2ActionPerformed
         F_forma(2);
    }//GEN-LAST:event_Bforma2ActionPerformed

    
    
    
    
     void F_base(int b)
    {
       
        if(vuoto_forma==false)
        {
              if (b==0)
                   Lbase.setText("Ci ho messo il pandispagna 0");
              else if(b==1)
                  Lbase.setText("Ci ho messo il pandispagna 1");
              else if(b==2)
                   Lbase.setText("Ci ho messo il pandispagna 2");
             
              i_base=b;
              vuoto_base=false;
        }
        else{
            JOptionPane.showMessageDialog(null, "Non puoi mettere il pandispagna senza il formino", "Attento", JOptionPane.INFORMATION_MESSAGE);
            buttonGroup2.clearSelection();  }
    }
    
    
    private void Bbase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bbase1ActionPerformed
         F_base(1);
    }//GEN-LAST:event_Bbase1ActionPerformed

    private void Bbase0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bbase0ActionPerformed
     F_base(0);
    }//GEN-LAST:event_Bbase0ActionPerformed

    private void Bbase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bbase2ActionPerformed
       F_base(2);
    }//GEN-LAST:event_Bbase2ActionPerformed

    
    
    
     void F_glassa(int g)
    {
       
        if(vuoto_forma==false)
        {
              if (g==0)
                   Lglassa.setText("Ci ho messo la glassa 0");
              else if(g==1)
                  Lglassa.setText("Ci ho messo la glassa 1");
              else if(g==2)
                   Lglassa.setText("Ci ho messo la glassa 2");
             
              i_glassa=g;
              vuoto_glassa=false;
        }
        else{
            JOptionPane.showMessageDialog(null, "Non puoi mettere la glassa senza il formino", "Attento", JOptionPane.INFORMATION_MESSAGE);
         buttonGroup3.clearSelection();  
        }
    }
    
    
    
    private void Bglassa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bglassa1ActionPerformed
                F_glassa(1);  
    }//GEN-LAST:event_Bglassa1ActionPerformed

    private void Bglassa0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bglassa0ActionPerformed
         F_glassa(0);
  
    }//GEN-LAST:event_Bglassa0ActionPerformed

    private void Bglassa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bglassa2ActionPerformed
        F_glassa(2);
    }//GEN-LAST:event_Bglassa2ActionPerformed

    
   void F_canditi(int c)
    {
       
        if(vuoto_forma==false&&vuoto_base==false)
        {
              if (c==0)
                   Lcanditi.setText("Ci ho messo i canditi 0");
              else if(c==1)
                  Lcanditi.setText("Ci ho messo i canditi 1");
              else if(c==2)
                   Lcanditi.setText("Ci ho messo i canditi 2");
              else if(c==3)
                   Lcanditi.setText("Ci ho messo i canditi 3");

               i_canditi=c;
               vuoto_canditi=false;
        }
        else{
            JOptionPane.showMessageDialog(null, "Non puoi ancora mettere i canditi", "Attento", JOptionPane.INFORMATION_MESSAGE);
            buttonGroup4.clearSelection();  }
    }
    
    
    private void Bcanditi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bcanditi1ActionPerformed
                F_canditi(1);     
    }//GEN-LAST:event_Bcanditi1ActionPerformed

    private void Bcanditi0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bcanditi0ActionPerformed
                F_canditi(0);               
    }//GEN-LAST:event_Bcanditi0ActionPerformed

    private void Bcanditi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bcanditi2ActionPerformed
                F_canditi(2);           
    }//GEN-LAST:event_Bcanditi2ActionPerformed

    private void Bcanditi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bcanditi3ActionPerformed
               F_canditi(3);           
    }//GEN-LAST:event_Bcanditi3ActionPerformed

    
    
    
    private void BinfornaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinfornaActionPerformed
      
      
       
      if(vuoto_glassa==true)
             Lglassa.setText("Senza glassa");
        if(vuoto_base==true)
             Lbase.setText("Senza base");  
        if(vuoto_canditi==true)
             Lcanditi.setText("Senza canditi");
         if(vuoto_forma==true)
                Lforma.setText("Che disastro");
        
        if(i_base==base&&i_forma==forma&&i_glassa==glassa&&i_canditi==canditi)
        {
         System.out.print("\n\t\tBravo\n");
         conta++;
       
         Gioco_Torte();
         
    }
        else{
        JOptionPane.showMessageDialog(null, "Hai perso, NABBO!", "LOL", JOptionPane.ERROR_MESSAGE);
        dispose();
    }
       
        
        if (conta==1)
        {
            
             fatto1.setForeground(Color.GREEN);
             
             fatto1.setText("V");
        }
        if (conta==2)
        {
            fatto2.setForeground(Color.green);
             fatto2.setText("V");
        }
         if (conta==3)
        {
            fatto3.setForeground(Color.GREEN);
             fatto3.setText("V");
             JOptionPane.showMessageDialog(null, "Grande hai vinto!", "Sei una volpe", JOptionPane.INFORMATION_MESSAGE);
             dispose();
        }
        
        
   
    }//GEN-LAST:event_BinfornaActionPerformed

    /**
     * @param args the command line arguments
     */
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Areatorta;
    private javax.swing.JToggleButton Bbase0;
    private javax.swing.JToggleButton Bbase1;
    private javax.swing.JToggleButton Bbase2;
    private javax.swing.JToggleButton Bcanditi0;
    private javax.swing.JToggleButton Bcanditi1;
    private javax.swing.JToggleButton Bcanditi2;
    private javax.swing.JToggleButton Bcanditi3;
    private javax.swing.JToggleButton Bforma0;
    private javax.swing.JToggleButton Bforma1;
    private javax.swing.JToggleButton Bforma2;
    private javax.swing.JToggleButton Bglassa0;
    private javax.swing.JToggleButton Bglassa1;
    private javax.swing.JToggleButton Bglassa2;
    private javax.swing.JButton Binforna;
    private javax.swing.JLabel Lbase;
    private javax.swing.JLabel Lcanditi;
    private javax.swing.JLabel Lforma;
    private javax.swing.JLabel Lglassa;
    private javax.swing.JLabel Titolol;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel fatto1;
    private javax.swing.JLabel fatto2;
    private javax.swing.JLabel fatto3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
