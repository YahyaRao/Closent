/*//GEN-FIRST:event_cbWeatherActionPerformed
 * To change this license header, choose License Headers in Project Properties.//GEN-LAST:event_cbWeatherActionPerformed
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package YahyaRaoIA;

/**
 *
 * @author YahyaRao
 */
public class AddArticleScreen extends javax.swing.JFrame {

    /**
     * Creates new form SecondForm
     */
    private MainScreen first;
    private final ListAllScreen third = new ListAllScreen();
    
    public AddArticleScreen() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        deleteClothingButton = new javax.swing.JButton();
        listAllButton = new javax.swing.JButton();
        namePanel = new javax.swing.JLabel();
        helloPannel = new javax.swing.JLabel();
        deleteClothingButton1 = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nameTextField = new javax.swing.JTextField();
        cbWeather = new javax.swing.JComboBox<>();
        cbOccasion = new javax.swing.JComboBox<>();
        cbComfort = new javax.swing.JComboBox<>();
        addClothingButton1 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 0, 45));

        deleteClothingButton.setBackground(new java.awt.Color(220, 33, 26));
        deleteClothingButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        deleteClothingButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteClothingButton.setText("Log Out");
        deleteClothingButton.setBorder(null);
        deleteClothingButton.setMaximumSize(new java.awt.Dimension(100, 100));
        deleteClothingButton.setMinimumSize(new java.awt.Dimension(100, 100));
        deleteClothingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClothingButtonActionPerformed(evt);
            }
        });

        listAllButton.setBackground(new java.awt.Color(220, 33, 26));
        listAllButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        listAllButton.setForeground(new java.awt.Color(255, 255, 255));
        listAllButton.setText("List All");
        listAllButton.setBorder(null);
        listAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAllButtonActionPerformed(evt);
            }
        });

        namePanel.setFont(new java.awt.Font("Helvetica Neue", 1, 44)); // NOI18N
        namePanel.setForeground(new java.awt.Color(255, 255, 255));
        namePanel.setText("Sabeen");

        helloPannel.setFont(new java.awt.Font("Helvetica Neue", 1, 44)); // NOI18N
        helloPannel.setForeground(new java.awt.Color(255, 255, 255));
        helloPannel.setText("Hello");

        deleteClothingButton1.setBackground(new java.awt.Color(220, 33, 26));
        deleteClothingButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        deleteClothingButton1.setForeground(new java.awt.Color(255, 255, 255));
        deleteClothingButton1.setText("Delete Clothing");
        deleteClothingButton1.setBorder(null);
        deleteClothingButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClothingButton1ActionPerformed(evt);
            }
        });

        settingsButton.setBackground(new java.awt.Color(0, 2, 44));
        settingsButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        settingsButton.setForeground(new java.awt.Color(255, 255, 255));
        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/YahyaRaoIA/aaaGEAR.png"))); // NOI18N
        settingsButton.setBorder(null);
        settingsButton.setMaximumSize(new java.awt.Dimension(100, 100));
        settingsButton.setMinimumSize(new java.awt.Dimension(100, 100));
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(75, 246, 215));
        jLabel4.setText("closet.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(helloPannel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deleteClothingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(listAllButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteClothingButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 4, Short.MAX_VALUE)))
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(namePanel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helloPannel)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteClothingButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteClothingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 2, 44));

        nameTextField.setBackground(new java.awt.Color(51, 0, 0));
        nameTextField.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(255, 255, 255));
        nameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameTextField.setText("What Is The Name Of This Article?");
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        cbWeather.setBackground(new java.awt.Color(51, 0, 0));
        cbWeather.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        cbWeather.setForeground(new java.awt.Color(255, 255, 255));
        cbWeather.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sunny", "Rainy", "Snowly", "Cold", "Windy", " " }));
        cbWeather.setBorder(null);
        cbWeather.setName("cbWeather"); // NOI18N
        cbWeather.setVerifyInputWhenFocusTarget(false);
        cbWeather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbWeatherActionPerformed(evt);
            }
        });

        cbOccasion.setBackground(new java.awt.Color(51, 0, 0));
        cbOccasion.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        cbOccasion.setForeground(new java.awt.Color(255, 255, 255));
        cbOccasion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "At Home", "Casual\t", "Regular", "Semi-Formal", "Formal", " " }));

        cbComfort.setBackground(new java.awt.Color(51, 0, 0));
        cbComfort.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        cbComfort.setForeground(new java.awt.Color(255, 255, 255));
        cbComfort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Comfortable", "Comfortable", "Regular", "Really Comfortable", " " }));

        addClothingButton1.setBackground(new java.awt.Color(220, 33, 26));
        addClothingButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        addClothingButton1.setForeground(new java.awt.Color(255, 255, 255));
        addClothingButton1.setText("Okay");
        addClothingButton1.setBorder(null);
        addClothingButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClothingButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                    .addComponent(cbWeather, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbOccasion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addClothingButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbComfort, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cbWeather, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbOccasion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbComfort, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(addClothingButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void createArticle (MainScreen f){
        first = f;
        first.setVisible(false);
        this.setVisible(true);
//        System.out.println("jfsgnsd");
    }
    
    
    
    private void addClothingButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClothingButton1ActionPerformed
        // TODO add your handling code here:
      
        String n = nameTextField.getText();
        String w = this.cbWeather.getModel().getSelectedItem().toString();
        String d = this.cbOccasion.getModel().getSelectedItem().toString();
        String c = this.cbComfort.getModel().getSelectedItem().toString();
        
        
//                System.out.println(n);
//                System.out.println(w);
//                System.out.println(d);
//                System.out.println(c);
//                

        Article nwdc = new Article (n,w,d,c);
//        System.out.println(nwdc.getName());
        first.addArticle(nwdc);
       // System.out.print(ndc);
        this.setVisible(false);
        first.setVisible(true);
    }//GEN-LAST:event_addClothingButton1ActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void cbWeatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbWeatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbWeatherActionPerformed

    private void deleteClothingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClothingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteClothingButtonActionPerformed

    private void listAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAllButtonActionPerformed
        // TODO add your handling code here:
        //third.createArticle(this);
        this.setVisible(false);
        third.clothingList(clothing, numClothing, this);
    }//GEN-LAST:event_listAllButtonActionPerformed

    private void deleteClothingButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClothingButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteClothingButton1ActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsButtonActionPerformed
        
        
        
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SecondForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SecondForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SecondForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SecondForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SecondForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClothingButton1;
    private javax.swing.JComboBox<String> cbComfort;
    private javax.swing.JComboBox<String> cbOccasion;
    private javax.swing.JComboBox<String> cbWeather;
    private javax.swing.JButton deleteClothingButton;
    private javax.swing.JButton deleteClothingButton1;
    private javax.swing.JLabel helloPannel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listAllButton;
    private javax.swing.JLabel namePanel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton settingsButton;
    // End of variables declaration//GEN-END:variables
}