/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp;

import abiturklassen.listenklassen.Queue;

/**
 *
 * @author Paintdog
 */
public class QueueGUI extends javax.swing.JFrame {
    
    private Queue<String> queue = new Queue<String>();
    
    /**
     * Creates new form StackGUI
     */
    public QueueGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton_isEmpty = new javax.swing.JButton();
        jButton_enqueue = new javax.swing.JButton();
        jButton_dequeue = new javax.swing.JButton();
        jButton_front = new javax.swing.JButton();
        jLabel_isEmpty = new javax.swing.JLabel();
        jTextField_enqueue = new javax.swing.JTextField();
        jLabel_pop = new javax.swing.JLabel();
        jLabel_top = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel_dequeue = new javax.swing.JLabel();
        jLabel_front = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Schlange (Queue)-Anwendung");

        jButton_isEmpty.setText("isEmpty()");
        jButton_isEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_isEmptyActionPerformed(evt);
            }
        });

        jButton_enqueue.setText("enqueue()");
        jButton_enqueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_enqueueActionPerformed(evt);
            }
        });

        jButton_dequeue.setText("dequeue()");
        jButton_dequeue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_dequeueActionPerformed(evt);
            }
        });

        jButton_front.setText("front()");
        jButton_front.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_frontActionPerformed(evt);
            }
        });

        jLabel_isEmpty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_pop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_top.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextArea1.setColumns(10);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea1);

        jTextArea2.setColumns(10);
        jTextArea2.setRows(5);
        jTextArea2.setToolTipText("");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea2);

        jLabel_dequeue.setText(" ");

        jLabel_front.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_isEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_enqueue, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel_pop, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 161, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_dequeue, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_front, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton_isEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_enqueue)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_dequeue, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_top, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 30, Short.MAX_VALUE))
                                    .addComponent(jButton_front, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane4))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_enqueue, jButton_isEmpty});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_isEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_enqueue)
                    .addComponent(jButton_dequeue)
                    .addComponent(jButton_front))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_isEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_enqueue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_pop)
                    .addComponent(jLabel_top)
                    .addComponent(jLabel_dequeue)
                    .addComponent(jLabel_front))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton_dequeue, jButton_enqueue, jButton_front, jButton_isEmpty});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_isEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_isEmptyActionPerformed
        System.out.println(queue.isEmpty());
        if (queue.isEmpty() == true) {
            jLabel_isEmpty.setText("Ja");
        } else {
            jLabel_isEmpty.setText("Nein");
        }
    }//GEN-LAST:event_jButton_isEmptyActionPerformed
    
    /*
     * Ermöglicht es, ein Element aus der Schlange zu entnehmen.
     */
    private void jButton_dequeueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_dequeueActionPerformed
        System.out.println(queue.isEmpty());
        if (queue.isEmpty() == true) {
            jLabel_dequeue.setText("Schlange ist leer!");
        } else {
            String value = queue.front();
            System.out.println(value);
            queue.dequeue();
            jLabel_dequeue.setText(value);
            String values = jTextArea1.getText();
            String[] liste = values.split("\n");
            String new_value = "";
            for (int i = 0; i < liste.length; i++) {
                System.out.println("Wert: " + liste[i]);
                if (i == 0) {
                    System.out.println("Wert "+ liste[i] +" ist raus!");
                } else {
                    new_value = new_value + liste[i] + "\n";
                }
            }
            System.out.println(new_value);
            jTextArea1.setText(new_value);
            if (jTextArea2.getText().equals("")) {
                jTextArea2.setText(value);
            } else {
                jTextArea2.setText(jTextArea2.getText() + "\n" + value);
            }
        }
    }//GEN-LAST:event_jButton_dequeueActionPerformed

    private void jButton_frontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_frontActionPerformed
        System.out.println(queue.isEmpty());
        if (queue.isEmpty() == true) {
            jLabel_front.setText("Schlange ist leer!");
        } else {
            jLabel_front.setText(queue.front());
        }
    }//GEN-LAST:event_jButton_frontActionPerformed

    private void jButton_enqueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_enqueueActionPerformed
        System.out.println("Füge neues Element hinzu...");
        String new_entry = jTextField_enqueue.getText();
        queue.enqueue(new_entry);
        String old_entry = jTextArea1.getText();
        System.out.println("Alter Eintrag: " + old_entry);
        if (old_entry.equals("")) {
            jTextArea1.setText(new_entry);
        } else {
            jTextArea1.setText(old_entry + "\n" + new_entry);
        }
        
        
    }//GEN-LAST:event_jButton_enqueueActionPerformed

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
            java.util.logging.Logger.getLogger(QueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueueGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueueGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_dequeue;
    private javax.swing.JButton jButton_enqueue;
    private javax.swing.JButton jButton_front;
    private javax.swing.JButton jButton_isEmpty;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_dequeue;
    private javax.swing.JLabel jLabel_front;
    private javax.swing.JLabel jLabel_isEmpty;
    private javax.swing.JLabel jLabel_pop;
    private javax.swing.JLabel jLabel_top;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField_enqueue;
    // End of variables declaration//GEN-END:variables
}
