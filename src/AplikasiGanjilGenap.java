/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author mmada
 */
public class AplikasiGanjilGenap extends javax.swing.JFrame {

    // Konstruktor untuk menginisialisasi form
    public AplikasiGanjilGenap() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtAngka = new javax.swing.JTextField();
        lblHasil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Masukan Angka");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel3, gridBagConstraints);

        jButton1.setText("Cek!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.insets = new java.awt.Insets(19, 0, 0, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        txtAngka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngkaActionPerformed(evt);
            }
        });
        txtAngka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAngkaKeyTyped(evt);
            }
        });
        txtAngka.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAngkaFocusGained(evt); // Tambahkan FocusListener untuk membersihkan JTextField saat mendapatkan fokus
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 21;
        jPanel1.add(txtAngka, gridBagConstraints);

        lblHasil.setText("Hasilnya disini!");
        lblHasil.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblHasilAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 36, 0, 36);
        jPanel1.add(lblHasil, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAngkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngkaActionPerformed
        // This method is called when the txtAngka JTextField action is performed
    }//GEN-LAST:event_txtAngkaActionPerformed

    private void lblHasilAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblHasilAncestorAdded
        // This method is called when the lblHasil JLabel is added to the component hierarchy
    }//GEN-LAST:event_lblHasilAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // This method is called when the jButton1 is clicked
        try {
            int angka = Integer.parseInt(txtAngka.getText()); // Mengubah teks input menjadi integer
            StringBuilder hasil = new StringBuilder();
            if (angka % 2 == 0) {
                hasil.append("Angka ").append(angka).append(" adalah Genap\n"); // Menampilkan jika angka adalah genap
            } else {
                hasil.append("Angka ").append(angka).append(" adalah Ganjil\n"); // Menampilkan jika angka adalah ganjil
            }
            if (isPrime(angka)) {
                hasil.append("Angka ").append(angka).append(" adalah Bilangan Prima"); // Menampilkan jika angka adalah bilangan prima
            } else {
                hasil.append("Angka ").append(angka).append(" bukan Bilangan Prima"); // Menampilkan jika angka bukan bilangan prima
            }
            lblHasil.setText("<html>" + hasil.toString().replace("\n", "<br>") + "</html>"); // Menampilkan hasil di lblHasil
            JOptionPane.showMessageDialog(this, hasil.toString(), "Hasil", JOptionPane.INFORMATION_MESSAGE); // Menampilkan hasil menggunakan JOptionPane
        } catch (NumberFormatException e) {
            lblHasil.setText("Input tidak valid. Masukkan angka."); // Menampilkan pesan kesalahan di lblHasil
            JOptionPane.showMessageDialog(this, "Input tidak valid. Masukkan angka.", "Error", JOptionPane.ERROR_MESSAGE); // Menampilkan pesan kesalahan untuk input tidak valid
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAngkaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAngkaKeyTyped
        // Membatasi input hanya angka
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Abaikan karakter non-digit
        }
    }//GEN-LAST:event_txtAngkaKeyTyped

    private void txtAngkaFocusGained(java.awt.event.FocusEvent evt) {
        // Membersihkan JTextField saat mendapatkan fokus
        txtAngka.setText("");
    }

    private boolean isPrime(int number) {
        // Metode untuk memeriksa apakah angka adalah bilangan prima
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // ...existing code...
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiGanjilGenap().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JTextField txtAngka;
    // End of variables declaration//GEN-END:variables
}
