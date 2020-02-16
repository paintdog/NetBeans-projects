/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WPfmApp.ui;

import java.time.LocalDate;
// import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

// Zwischenablage
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

/**
 *
 * @author Paintdog
 */
public class WPfmApp extends javax.swing.JFrame {

    /**
     * Creates new form WPfmApp
     */
    public WPfmApp() {
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

        jLabel_Date = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_date = new javax.swing.JTextField();
        jTextField_author = new javax.swing.JTextField();
        jTextField_title = new javax.swing.JTextField();
        jButton_Reset = new javax.swing.JButton();
        jButton_Nachweis_erzeugen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_output = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_url = new javax.swing.JTextField();
        jButton_Zwischenablage = new javax.swing.JButton();
        jButton_WP_Nachweis_erzeugen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel_Date.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel_Date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Date.setText("__.__.____");
        jLabel_Date.setToolTipText("Das heutige Datum");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Autor(en):");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Titel:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Datum:");

        jTextField_date.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField_date.setToolTipText("Veröffentlichungsdatum des Artikels");

        jTextField_author.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField_author.setToolTipText("Autor bzw. Autorin bzw. Autoren des Artikels");

        jTextField_title.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField_title.setToolTipText("Titel des Artikels");

        jButton_Reset.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton_Reset.setText("Reset");
        jButton_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ResetActionPerformed(evt);
            }
        });

        jButton_Nachweis_erzeugen.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton_Nachweis_erzeugen.setText("Erzeuge Nachweis");
        jButton_Nachweis_erzeugen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Nachweis_erzeugenActionPerformed(evt);
            }
        });

        jTextArea_output.setColumns(20);
        jTextArea_output.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextArea_output.setLineWrap(true);
        jTextArea_output.setRows(5);
        jTextArea_output.setToolTipText("");
        jScrollPane1.setViewportView(jTextArea_output);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Output:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("URL:");

        jTextField_url.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField_url.setToolTipText("Veröffentlichungsdatum des Artikels");

        jButton_Zwischenablage.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton_Zwischenablage.setText("Zwischenablage");
        jButton_Zwischenablage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ZwischenablageActionPerformed(evt);
            }
        });

        jButton_WP_Nachweis_erzeugen.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton_WP_Nachweis_erzeugen.setText("Erzeuge WP-Nachweis");
        jButton_WP_Nachweis_erzeugen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_WP_Nachweis_erzeugenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_title, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Nachweis_erzeugen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_WP_Nachweis_erzeugen))
                            .addComponent(jTextField_date, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_author, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_url, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Zwischenablage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Reset))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_Nachweis_erzeugen, jButton_Reset, jButton_WP_Nachweis_erzeugen, jButton_Zwischenablage});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jTextField_author, jTextField_date, jTextField_title, jTextField_url});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Nachweis_erzeugen)
                    .addComponent(jButton_WP_Nachweis_erzeugen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Zwischenablage)
                    .addComponent(jButton_Reset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jLabel_Date.setText("" + today());
    }//GEN-LAST:event_formWindowActivated

    private void jButton_Nachweis_erzeugenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Nachweis_erzeugenActionPerformed
        /* 
         * Muster:
         * Autor:     Antonia Kögler:
         * URL:       [https://www.finance-magazin.de/wirtschaft/deutschland/gerry-weber-rutscht-in-die-insolvenz-2030561/ 
         * Titel:     Gerry Weber rutscht in die Insolvenz.]
         * Quelle:    In: [[Finance (Magazin)|finance-magazin.de]], 
         * Datum:     25. Januar 2019. 
         * Abruf:     (abgerufen 25. Januar 2019)
         */
        String nachweis;
        String author = jTextField_author.getText();
        String url = jTextField_url.getText();
        String title = jTextField_title.getText();
        String date = jTextField_date.getText();
        
        nachweis = author + ": ";
        nachweis = nachweis + "[" + url + " " + title + "] ";
        nachweis = nachweis + "In: [[Finance (Magazin)]], ";
        nachweis = nachweis + date + ". ";
        nachweis = nachweis + "(abgerufen " + today() + ").";
        jTextArea_output.setText(nachweis);
                
    }//GEN-LAST:event_jButton_Nachweis_erzeugenActionPerformed

    private void jButton_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ResetActionPerformed
        jTextArea_output.setText("");
        jTextField_author.setText("");
        jTextField_date.setText("");
        jTextField_url.setText("");
        jTextField_title.setText("");
    }//GEN-LAST:event_jButton_ResetActionPerformed

    private void jButton_ZwischenablageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ZwischenablageActionPerformed
        String text = jTextArea_output.getText();
        
        // Source: https://stackoverflow.com/questions/6710350/copying-text-to-the-clipboard-using-java
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_jButton_ZwischenablageActionPerformed

    private void jButton_WP_Nachweis_erzeugenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_WP_Nachweis_erzeugenActionPerformed
        /*
         *   {{Internetquelle 
         *     |autor= 
         *     |url=https://www.sueddeutsche.de/wirtschaft/condor-kaeufer-lot-1.4769979 
         *     |titel=Polnische Fluglinie LOT übernimmt Condor
         *     |werk=Süddeutsche Zeitung 
         *     |datum=2020-01-24
         *     |abruf=2020-01-24}}
         */
        String nachweis;
        String author = jTextField_author.getText();
        String url = jTextField_url.getText();
        String title = jTextField_title.getText();
        String date = jTextField_date.getText();
        System.out.println(date);
        
        String[] tag_monat_jahr = date.split("\\.");
        
        System.out.println(tag_monat_jahr.length);
        
        date = "20" + tag_monat_jahr[2] + "-" + tag_monat_jahr[1] + "-" + tag_monat_jahr[0];
        
        nachweis = "{{Internetquelle ";
        nachweis = nachweis + "|autor=" + author;
        nachweis = nachweis + "|url=" + url;
        nachweis = nachweis + "|titel=" + title;
        nachweis = nachweis + "|werk=[[Finance (Magazin)]]";
        nachweis = nachweis + "|datum=" + date;
        nachweis = nachweis + "|abruf=" + today2();
        nachweis = nachweis + "}}";
        
        jTextArea_output.setText(nachweis);
    }//GEN-LAST:event_jButton_WP_Nachweis_erzeugenActionPerformed

    
    public String today() {
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String text = date.format(formatter);
        // LocalDate today = LocalDate.parse(text, formatter);
        return text;
    }
    
    public String today2() {
        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String text = date.format(formatter);
        // LocalDate today = LocalDate.parse(text, formatter);
        return text;
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
            java.util.logging.Logger.getLogger(WPfmApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WPfmApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WPfmApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WPfmApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WPfmApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Nachweis_erzeugen;
    private javax.swing.JButton jButton_Reset;
    private javax.swing.JButton jButton_WP_Nachweis_erzeugen;
    private javax.swing.JButton jButton_Zwischenablage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Date;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_output;
    private javax.swing.JTextField jTextField_author;
    private javax.swing.JTextField jTextField_date;
    private javax.swing.JTextField jTextField_title;
    private javax.swing.JTextField jTextField_url;
    // End of variables declaration//GEN-END:variables
}
