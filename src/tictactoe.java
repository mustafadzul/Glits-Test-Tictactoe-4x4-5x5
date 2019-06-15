/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mustafa
 */
import javax.swing.JOptionPane;
import java.lang.String;

public class tictactoe extends javax.swing.JFrame {

    int nilai;
    int nilaix;
    int nilaio;

    
    /**
     * Creates new form tictactoe
     */
    public tictactoe() {
        initComponents();
        nilai = 1;
        nilaix = 0;
        nilaio = 0;

    }
void pemenang(){
        if (b1.getText()=="X" && b2.getText()=="X" && b3.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b2.getText()=="X" && b3.getText()=="X" && b4.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b5.getText()=="X" && b6.getText()=="X" && b7.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b6.getText()=="X" && b7.getText()=="X" && b8.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b9.getText()=="X" && b10.getText()=="X" && b11.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b10.getText()=="X" && b11.getText()=="X" && b12.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b13.getText()=="X" && b14.getText()=="X" && b15.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b14.getText()=="X" && b15.getText()=="X" && b16.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b3.getText()=="X" && b6.getText()=="X" && b9.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b4.getText()=="X" && b7.getText()=="X" && b10.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b7.getText()=="X" && b10.getText()=="X" && b13.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b8.getText()=="X" && b11.getText()=="X" && b14.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b2.getText()=="X" && b7.getText()=="X" && b12.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b1.getText()=="X" && b6.getText()=="X" && b11.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!"); 
        } else if (b6.getText()=="X" && b11.getText()=="X" && b16.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");  
        } else if (b5.getText()=="X" && b10.getText()=="X" && b15.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");    
        } else if (b1.getText()=="X" && b5.getText()=="X" && b9.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");    
        } else if (b5.getText()=="X" && b9.getText()=="X" && b13.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");    
        } else if (b2.getText()=="X" && b6.getText()=="X" && b10.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");    
        } else if (b5.getText()=="X" && b10.getText()=="X" && b15.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");    
        } else if (b6.getText()=="X" && b10.getText()=="X" && b14.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");    
        } else if (b3.getText()=="X" && b7.getText()=="11" && b11.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");    
        } else if (b7.getText()=="X" && b11.getText()=="X" && b15.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");    
        } else if (b4.getText()=="X" && b8.getText()=="X" && b12.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");    
        } else if (b8.getText()=="X" && b12.getText()=="X" && b16.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");    
        }
        
        
        if (b1.getText()=="O" && b2.getText()=="O" && b3.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b2.getText()=="O" && b3.getText()=="O" && b4.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b5.getText()=="O" && b6.getText()=="O" && b7.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b6.getText()=="O" && b7.getText()=="O" && b8.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b9.getText()=="O" && b10.getText()=="O" && b11.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b10.getText()=="O" && b11.getText()=="O" && b12.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b13.getText()=="O" && b14.getText()=="O" && b15.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b14.getText()=="O" && b15.getText()=="O" && b16.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b3.getText()=="O" && b6.getText()=="O" && b9.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b4.getText()=="O" && b7.getText()=="O" && b10.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b7.getText()=="O" && b10.getText()=="O" && b13.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b8.getText()=="O" && b11.getText()=="O" && b14.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b2.getText()=="O" && b7.getText()=="O" && b12.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b1.getText()=="O" && b6.getText()=="O" && b11.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!"); 
        } else if (b6.getText()=="O" && b11.getText()=="O" && b16.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");  
        } else if (b5.getText()=="O" && b10.getText()=="O" && b15.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");    
        }else if (b1.getText()=="O" && b5.getText()=="O" && b9.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat O !!!");    
        } else if (b5.getText()=="O" && b9.getText()=="O" && b13.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");    
        } else if (b2.getText()=="O" && b6.getText()=="O" && b10.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");    
        } else if (b5.getText()=="O" && b10.getText()=="O" && b15.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");    
        } else if (b6.getText()=="O" && b10.getText()=="O" && b14.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");    
        } else if (b3.getText()=="O" && b7.getText()=="O" && b11.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");    
        } else if (b7.getText()=="O" && b11.getText()=="O" && b15.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");    
        } else if (b4.getText()=="O" && b8.getText()=="O" && b12.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");    
        } else if (b8.getText()=="O" && b12.getText()=="O" && b16.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");    
        }
    }
    void reset(){
        nilai = 1;
        nilaix = 0;
        nilaio = 0;
        
        lbl1.setText("0"); lbl2.setText("0");
        
        b1.setText(""); b1.setEnabled(true);
        b2.setText(""); b2.setEnabled(true);
        b3.setText(""); b3.setEnabled(true);
        b4.setText(""); b4.setEnabled(true);
        b5.setText(""); b5.setEnabled(true);
        b6.setText(""); b6.setEnabled(true);
        b7.setText(""); b7.setEnabled(true);
        b8.setText(""); b8.setEnabled(true);
        b9.setText(""); b9.setEnabled(true);
        b10.setText(""); b10.setEnabled(true);
        b11.setText(""); b11.setEnabled(true);
        b12.setText(""); b12.setEnabled(true);
        b13.setText(""); b14.setEnabled(true);
        b14.setText(""); b14.setEnabled(true);
        b15.setText(""); b15.setEnabled(true);
        b16.setText(""); b16.setEnabled(true);
    }
    

    

    

/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        breset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GAME TICTACTOE");

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });

        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });

        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });

        breset.setText("RESET");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        jLabel1.setText("Score X:");

        jLabel2.setText("Score O:");

        lbl1.setText("jLabel3");

        lbl2.setText("jLabel3");

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(breset, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b5)
                            .addComponent(b1)
                            .addComponent(b9)
                            .addComponent(b13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b2)
                                .addGap(10, 10, 10)
                                .addComponent(b3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b16)))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(breset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
         if(nilai == 1){
            b2.setText("X");
            b2.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b2.setText("O");
            b2.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
        }   // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
         if(nilai == 1){
            b3.setText("X");
            b3.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b3.setText("O");
            b3.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }     
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
 if(nilai == 1){
            b4.setText("X");
            b4.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b4.setText("O");
            b4.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }     
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
            if(nilai == 1){
            b5.setText("X");
            b5.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b5.setText("O");
            b5.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }     
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
 if(nilai == 1){
            b6.setText("X");
            b6.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b6.setText("O");
            b6.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }     
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
 if(nilai == 1){
            b7.setText("X");
            b7.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b7.setText("O");
            b7.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }     
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
            if(nilai == 1){
            b8.setText("X");
            b8.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b8.setText("O");
            b8.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }     
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
 if(nilai == 1){
            b9.setText("X");
            b9.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b9.setText("O");
            b9.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }     
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        // TODO add your handling code here:
 if(nilai == 1){
            b10.setText("X");
            b10.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b10.setText("O");
            b10.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }     
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        // TODO add your handling code here:
 if(nilai == 1){
            b11.setText("X");
            b11.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b11.setText("O");
            b11.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }     
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        // TODO add your handling code here:
 if(nilai == 1){
            b12.setText("X");
            b12.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b12.setText("O");
            b12.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }     
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        // TODO add your handling code here:
 if(nilai == 1){
            b13.setText("X");
            b13.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b13.setText("O");
            b13.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }    
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        // TODO add your handling code here:
 if(nilai == 1){
            b14.setText("X");
            b14.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b14.setText("O");
            b14.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }     
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        // TODO add your handling code here:
 if(nilai == 1){
            b15.setText("X");
            b15.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b15.setText("O");
            b15.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }     
    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        // TODO add your handling code here:
 if(nilai == 1){
            b16.setText("X");
            b16.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b16.setText("O");
            b16.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
        
    }     
    }//GEN-LAST:event_b16ActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_bresetActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if(nilai == 1){
            b1.setText("X");
            b1.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b1.setText("O");
            b1.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
}



    }//GEN-LAST:event_b1ActionPerformed

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
            java.util.logging.Logger.getLogger(tictactoe.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton breset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    // End of variables declaration//GEN-END:variables
}
