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
import java.util.Random;
import java.lang.String;
public class tictactoex5 extends javax.swing.JFrame {

     int nilai;
     int nilaix;
     int nilaio;
    
    public tictactoex5() {
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
        }else if (b3.getText()=="X" && b4.getText()=="X" && b5.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b6.getText()=="X" && b7.getText()=="X" && b8.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b7.getText()=="X" && b8.getText()=="X" && b9.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b8.getText()=="X" && b9.getText()=="X" && b10.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b11.getText()=="X" && b12.getText()=="X" && b13.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b12.getText()=="X" && b13.getText()=="X" && b14.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b13.getText()=="X" && b14.getText()=="X" && b15.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b16.getText()=="X" && b17.getText()=="X" && b18.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b17.getText()=="X" && b18.getText()=="X" && b19.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b18.getText()=="X" && b19.getText()=="X" && b20.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b21.getText()=="X" && b22.getText()=="X" && b23.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b22.getText()=="X" && b23.getText()=="X" && b24.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b23.getText()=="X" && b24.getText()=="X" && b25.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b3.getText()=="X" && b7.getText()=="X" && b11.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b4.getText()=="X" && b8.getText()=="X" && b12.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b5.getText()=="X" && b9.getText()=="X" && b13.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b8.getText()=="X" && b12.getText()=="X" && b16.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b9.getText()=="X" && b13.getText()=="X" && b17.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b10.getText()=="X" && b14.getText()=="X" && b18.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b13.getText()=="X" && b17.getText()=="X" && b21.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b14.getText()=="X" && b18.getText()=="X" && b22.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } else if (b15.getText()=="X" && b19.getText()=="X" && b23.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b1.getText()=="X" && b7.getText()=="X" && b13.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b2.getText()=="X" && b8.getText()=="X" && b14.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b3.getText()=="X" && b9.getText()=="X" && b15.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b6.getText()=="X" && b12.getText()=="X" && b18.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b7.getText()=="X" && b13.getText()=="X" && b19.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b8.getText()=="X" && b14.getText()=="X" && b20.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b11.getText()=="X" && b17.getText()=="X" && b23.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b12.getText()=="X" && b18.getText()=="X" && b24.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b13.getText()=="X" && b19.getText()=="X" && b25.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        } 
        else if (b1.getText()=="X" && b6.getText()=="X" && b11.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b6.getText()=="X" && b11.getText()=="X" && b16.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");  
        }else if (b11.getText()=="X" && b16.getText()=="X" && b21.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b2.getText()=="X" && b7.getText()=="X" && b12.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b7.getText()=="X" && b12.getText()=="X" && b17.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b12.getText()=="X" && b17.getText()=="X" && b22.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b3.getText()=="X" && b8.getText()=="X" && b13.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b8.getText()=="X" && b13.getText()=="X" && b18.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b13.getText()=="X" && b18.getText()=="X" && b23.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b4.getText()=="X" && b9.getText()=="X" && b14.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b9.getText()=="X" && b14.getText()=="X" && b19.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b14.getText()=="X" && b19.getText()=="X" && b24.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b5.getText()=="X" && b10.getText()=="X" && b15.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");    
        }else if (b10.getText()=="X" && b15.getText()=="X" && b20.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }else if (b15.getText()=="X" && b20.getText()=="X" && b25.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        
        
         if (b1.getText()=="O" && b2.getText()=="O" && b3.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b2.getText()=="O" && b3.getText()=="O" && b4.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b3.getText()=="O" && b4.getText()=="O" && b5.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b6.getText()=="O" && b7.getText()=="O" && b8.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b7.getText()=="O" && b8.getText()=="O" && b9.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b8.getText()=="O" && b9.getText()=="O" && b10.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b11.getText()=="O" && b12.getText()=="O" && b13.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b12.getText()=="O" && b13.getText()=="O" && b14.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b13.getText()=="O" && b14.getText()=="O" && b15.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b16.getText()=="O" && b17.getText()=="O" && b18.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, SelamatO !!!");
        }else if (b17.getText()=="O" && b18.getText()=="O" && b19.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b18.getText()=="O" && b19.getText()=="O" && b20.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b21.getText()=="O" && b22.getText()=="O" && b23.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b22.getText()=="O" && b23.getText()=="O" && b24.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
        }
        else if (b23.getText()=="O" && b24.getText()=="O" && b25.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b3.getText()=="O" && b7.getText()=="O" && b11.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b4.getText()=="O" && b8.getText()=="O" && b12.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b5.getText()=="O" && b9.getText()=="O" && b13.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b8.getText()=="O" && b12.getText()=="O" && b16.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b9.getText()=="O" && b13.getText()=="O" && b17.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b10.getText()=="O" && b14.getText()=="O" && b18.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b13.getText()=="O" && b17.getText()=="O" && b21.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b14.getText()=="O" && b18.getText()=="O" && b22.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } else if (b15.getText()=="O" && b19.getText()=="O" && b23.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b1.getText()=="O" && b7.getText()=="O" && b13.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b2.getText()=="O" && b8.getText()=="O" && b14.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b3.getText()=="O" && b9.getText()=="O" && b15.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b6.getText()=="O" && b12.getText()=="O" && b18.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b7.getText()=="O" && b13.getText()=="O" && b19.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b8.getText()=="O" && b14.getText()=="O" && b20.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b11.getText()=="O" && b17.getText()=="O" && b23.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b12.getText()=="O" && b18.getText()=="O" && b24.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat O !!!");
        }
        else if (b13.getText()=="O" && b19.getText()=="O" && b25.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        } 
        else if (b1.getText()=="O" && b6.getText()=="O" && b11.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b6.getText()=="O" && b11.getText()=="O" && b16.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");  
        }else if (b11.getText()=="O" && b16.getText()=="O" && b21.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O!!!");
        }
        else if (b2.getText()=="O" && b7.getText()=="O" && b12.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b7.getText()=="O" && b12.getText()=="O" && b17.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b12.getText()=="O" && b17.getText()=="O" && b22.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b3.getText()=="O" && b8.getText()=="O" && b13.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O!!!");
        }else if (b8.getText()=="O" && b13.getText()=="O" && b18.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b13.getText()=="O" && b18.getText()=="O" && b23.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b4.getText()=="O" && b9.getText()=="O" && b14.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b9.getText()=="O" && b14.getText()=="O" && b19.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b14.getText()=="O" && b19.getText()=="O" && b24.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }
        else if (b5.getText()=="O" && b10.getText()=="O" && b15.getText()=="X"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");    
        }else if (b10.getText()=="O" && b15.getText()=="O" && b20.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah O, Selamat O !!!");
        }else if (b15.getText()=="O" && b20.getText()=="O" && b25.getText()=="O"){
            JOptionPane.showMessageDialog(rootPane, "Pemenangnya adalah X, Selamat X !!!");
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
        b17.setText(""); b17.setEnabled(true);
        b18.setText(""); b18.setEnabled(true);
        b19.setText(""); b19.setEnabled(true);
        b20.setText(""); b20.setEnabled(true);
        b21.setText(""); b21.setEnabled(true);
        b22.setText(""); b22.setEnabled(true);
        b23.setText(""); b23.setEnabled(true);
        b24.setText(""); b24.setEnabled(true);
        b25.setText(""); b25.setEnabled(true);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });

        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });

        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });

        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });

        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });

        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });

        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });

        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });

        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });

        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });

        jLabel1.setText("Score x =");

        jLabel2.setText("Score o =");

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b17, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(b22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b23, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(b18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b20, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(b25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {b1, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b2, b20, b21, b22, b23, b24, b25, b3, b4, b5, b6, b7, b8, b9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b11, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(b12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b16, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(b17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl2)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {b1, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b2, b20, b21, b22, b23, b24, b25, b3, b4, b5, b6, b7, b8, b9});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
 if(nilai == 1){
            b1.setText("X");
            b1.setEnabled(false);
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
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
}   // TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
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
}  // TODO add your handling code here:
    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
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
}        // TODO add your handling code here:
    }//GEN-LAST:event_b16ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
 if(nilai == 1){
            b17.setText("X");
            b17.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b17.setText("O");
            b17.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
}        // TODO add your handling code here:
    }//GEN-LAST:event_b17ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
 if(nilai == 1){
            b18.setText("X");
            b18.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b18.setText("O");
            b18.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
}        // TODO add your handling code here:
    }//GEN-LAST:event_b18ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
       if(nilai == 1){
            b19.setText("X");
            b19.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b19.setText("O");
            b19.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
}  // TODO add your handling code here:
    }//GEN-LAST:event_b19ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
 if(nilai == 1){
            b20.setText("X");
            b20.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b20.setText("O");
            b20.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
}        // TODO add your handling code here:
    }//GEN-LAST:event_b20ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
 if(nilai == 1){
            b21.setText("X");
            b21.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b21.setText("O");
            b21.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
}        // TODO add your handling code here:
    }//GEN-LAST:event_b21ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
 if(nilai == 1){
            b22.setText("X");
            b22.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b22.setText("O");
            b22.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
}        // TODO add your handling code here:
    }//GEN-LAST:event_b22ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
 if(nilai == 1){
            b23.setText("X");
            b23.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b23.setText("O");
            b23.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
}        // TODO add your handling code here:
    }//GEN-LAST:event_b23ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
 if(nilai == 1){
            b24.setText("X");
            b24.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b24.setText("O");
            b24.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
}        // TODO add your handling code here:
    }//GEN-LAST:event_b24ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
 if(nilai == 1){
            b25.setText("X");
            b25.setEnabled(false);
            nilai -= 1;
            nilaix += 1;
            lbl1.setText(String.valueOf(nilaix+" klik"));
            pemenang();
        } else {
            b25.setText("O");
            b25.setEnabled(false);
            nilai += 1;
            nilaio += 1;
            lbl2.setText(String.valueOf(nilaio+" klik"));
            pemenang();
}        // TODO add your handling code here:
    }//GEN-LAST:event_b25ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reset();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(tictactoex5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoex5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoex5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoex5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoex5().setVisible(true);
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
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    // End of variables declaration//GEN-END:variables
}
