/*//GEN-LINE:variables
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YahyaRaoIA;

import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author YahyaRao
 */
public class MainScreen extends javax.swing.JFrame {
  

    /**
     * Creates new form FirstForm
     */
    
   

    public final Article[] clothing = new Article [50];
    public List<Article> filtered = new ArrayList<>();
  
    
    private int numClothing=0;
    private final AddArticleScreen second = new AddArticleScreen();
    private final ListAllScreen third = new ListAllScreen();
    private final WeatherScreen fourth = new WeatherScreen();
    private final DeleteScreen  deletescreen = new DeleteScreen();
    
//    private ComfortScreen twelveth; 
    public MainScreen() {
        initComponents();
        this.addTestData();
    }
    
 
        
        
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        goneButton = new javax.swing.JPanel();
        infoPannel = new javax.swing.JPanel();
        deleteClothingButton = new javax.swing.JButton();
        addclothingButton = new javax.swing.JButton();
        listAllButton = new javax.swing.JButton();
        helloPannel = new javax.swing.JLabel();
        deleteClothingButton1 = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        whatShouldIWearButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(35, 37, 54));
        setForeground(new java.awt.Color(255, 51, 51));

        goneButton.setBackground(new java.awt.Color(33, 0, 45));

        infoPannel.setBackground(new java.awt.Color(0, 2, 44));
        infoPannel.setForeground(new java.awt.Color(35, 37, 54));

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

        addclothingButton.setBackground(new java.awt.Color(220, 33, 26));
        addclothingButton.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        addclothingButton.setForeground(new java.awt.Color(255, 255, 255));
        addclothingButton.setText("Add Clothing");
        addclothingButton.setBorder(null);
        addclothingButton.setBorderPainted(false);
        addclothingButton.setFocusCycleRoot(true);
        addclothingButton.setFocusTraversalPolicyProvider(true);
        addclothingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addclothingButtonActionPerformed(evt);
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

        nameLabel.setText("jLabel1");

        javax.swing.GroupLayout infoPannelLayout = new javax.swing.GroupLayout(infoPannel);
        infoPannel.setLayout(infoPannelLayout);
        infoPannelLayout.setHorizontalGroup(
            infoPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPannelLayout.createSequentialGroup()
                        .addComponent(helloPannel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(infoPannelLayout.createSequentialGroup()
                        .addGroup(infoPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, infoPannelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteClothingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(listAllButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteClothingButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addclothingButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(infoPannelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoPannelLayout.setVerticalGroup(
            infoPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helloPannel)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addclothingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteClothingButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteClothingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        whatShouldIWearButton.setBackground(new java.awt.Color(33, 0, 45));
        whatShouldIWearButton.setFont(new java.awt.Font("Tw Cen MT", 3, 64)); // NOI18N
        whatShouldIWearButton.setForeground(new java.awt.Color(255, 255, 255));
        whatShouldIWearButton.setText("What Should I Wear?");
        whatShouldIWearButton.setBorder(null);
        whatShouldIWearButton.setFocusable(false);
        whatShouldIWearButton.setRequestFocusEnabled(false);
        whatShouldIWearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whatShouldIWearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whatShouldIWearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whatShouldIWearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout goneButtonLayout = new javax.swing.GroupLayout(goneButton);
        goneButton.setLayout(goneButtonLayout);
        goneButtonLayout.setHorizontalGroup(
            goneButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goneButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        goneButtonLayout.setVerticalGroup(
            goneButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, goneButtonLayout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(goneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(goneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addclothingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addclothingButtonActionPerformed
        // TODO add your handling code here:
        second.createArticle(this);
        this.setVisible(false);
    }//GEN-LAST:event_addclothingButtonActionPerformed

    private void listAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAllButtonActionPerformed
        // TODO add your handling code here:
        //third.createArticle(this);
        this.setVisible(false);
        third.clothingList(clothing, numClothing, this);
    }//GEN-LAST:event_listAllButtonActionPerformed

    private void whatShouldIWearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whatShouldIWearButtonActionPerformed
        // TODO add your handling code here:
        this.filtered.clear(); //clean the list before starting the filter..
        fourth.createArticle(this);
    }//GEN-LAST:event_whatShouldIWearButtonActionPerformed

    private void deleteClothingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClothingButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_deleteClothingButtonActionPerformed

    private void deleteClothingButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClothingButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteClothingButton1ActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        // TODO add your handling code here:
        deletescreen.setVisible(true);
    }//GEN-LAST:event_settingsButtonActionPerformed

    public Article[] getClothing() {
        return this.clothing;
     }
    
    public List<Article> getFiltered() {
        return this.filtered;
    }
    
    public void setFiltered(List<Article> list) {
        this.filtered = list;
    }
    
    
    public void addArticle (Article a){
        clothing[numClothing]=a;
        numClothing++;
        
//        String n;
//        n=integer.toString(numClothing);
//        

       // clothing = null;        
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
       
    }

    
    private void addTestData() {
        
        this.clothing[0]= new Article("Nike Hoodie",WeatherScreen.WINDY,OccasionScreen.ATHOME,ComfortScreen.NOTCOMFORTABLE);
        this.clothing[1]= new Article("Adidas Hoodie",WeatherScreen.SUNNY,OccasionScreen.REGULAR,ComfortScreen.REALLYCOMFORTABLE);
        this.clothing[2]= new Article("Eeebok Hoodie",WeatherScreen.SUNNY,OccasionScreen.FORMAL,ComfortScreen.REGULAR);
        this.clothing[3]= new Article("Polo Hoodie",WeatherScreen.SUNNY,OccasionScreen.CASUAL,ComfortScreen.NOTCOMFORTABLE);
        this.clothing[4]= new Article("Nike T-Shirt",WeatherScreen.SUNNY,OccasionScreen.CASUAL,ComfortScreen.REALLYCOMFORTABLE);
        this.clothing[5]= new Article("Calvin Klein Zip Up",WeatherScreen.SNOWY,OccasionScreen.FORMAL,ComfortScreen.REGULAR);
        this.clothing[6]= new Article("Zara Dress Shirt",WeatherScreen.WINDY,OccasionScreen.SEMICASUAL,ComfortScreen.NOTCOMFORTABLE);
        this.clothing[7]= new Article("Hugo Boss Suit",WeatherScreen.CLEAR,OccasionScreen.FORMAL,ComfortScreen.NOTCOMFORTABLE);
        this.clothing[8]= new Article("Topman Suit",WeatherScreen.CLEAR,OccasionScreen.FORMAL,ComfortScreen.NOTCOMFORTABLE);
        this.clothing[9]= new Article("Calvin Klein Suit",WeatherScreen.CLEAR,OccasionScreen.FORMAL,ComfortScreen.NOTCOMFORTABLE);
        this.clothing[10]= new Article("Old Navy Windbreak",WeatherScreen.WINDY,OccasionScreen.CASUAL,ComfortScreen.NOTCOMFORTABLE);
        this.clothing[11]= new Article("H&M Windbreak",WeatherScreen.WINDY,OccasionScreen.FORMAL,ComfortScreen.REGULAR);
        this.clothing[12]= new Article("Supreme Windbreak",WeatherScreen.WINDY,OccasionScreen.SEMICASUAL,ComfortScreen.REALLYCOMFORTABLE);
        this.clothing[13]= new Article("Palace Windbreak",WeatherScreen.WINDY,OccasionScreen.REGULAR,ComfortScreen.NOTCOMFORTABLE);
        this.clothing[14]= new Article("Off-White Windbreak",WeatherScreen.WINDY,OccasionScreen.CASUAL,ComfortScreen.REALLYCOMFORTABLE);
        this.clothing[15]= new Article("Balanciaga Windbreak",WeatherScreen.WINDY,OccasionScreen.REGULAR,ComfortScreen.REALLYCOMFORTABLE);      
        this.clothing[16]= new Article("Bench Jacket",WeatherScreen.SNOWY,OccasionScreen.REGULAR,ComfortScreen.REGULAR);
        this.clothing[17]= new Article("Moose Knuckle Jacket",WeatherScreen.SNOWY,OccasionScreen.REGULAR,ComfortScreen.REGULAR);
        this.clothing[18]= new Article("Jack & Jones T-Shirt",WeatherScreen.SUNNY,OccasionScreen.CASUAL,ComfortScreen.REALLYCOMFORTABLE);
        this.clothing[19]= new Article("White Stussy T-Shirt",WeatherScreen.SUNNY,OccasionScreen.CASUAL,ComfortScreen.REALLYCOMFORTABLE);
        this.clothing[20]= new Article("Crooks & Castels T-Shirt",WeatherScreen.SUNNY,OccasionScreen.CASUAL,ComfortScreen.REALLYCOMFORTABLE);
        this.clothing[21]= new Article("Champion T-Shirt",WeatherScreen.SUNNY,OccasionScreen.CASUAL,ComfortScreen.REALLYCOMFORTABLE);
        this.clothing[22]= new Article("Black Stussy T-Shirt",WeatherScreen.SUNNY,OccasionScreen.REGULAR,ComfortScreen.REALLYCOMFORTABLE);
        this.clothing[23]= new Article("Adidas T-Shirt",WeatherScreen.SUNNY,OccasionScreen.CASUAL,ComfortScreen.REALLYCOMFORTABLE);
        this.clothing[24]= new Article("H&M Coat",WeatherScreen.RAINY,OccasionScreen.CASUAL,ComfortScreen.REALLYCOMFORTABLE);
        this.clothing[25]= new Article("White Ultraboost",WeatherScreen.SUNNY,OccasionScreen.REGULAR,ComfortScreen.REALLYCOMFORTABLE);
        this.clothing[26]= new Article("Black AirMax",WeatherScreen.SUNNY,OccasionScreen.REGULAR,ComfortScreen.REGULAR);
        this.clothing[27]= new Article("Buckle Boots",WeatherScreen.COLD,OccasionScreen.FORMAL,ComfortScreen.NOTCOMFORTABLE);
        this.clothing[28]= new Article("Vans",WeatherScreen.SUNNY,OccasionScreen.CASUAL,ComfortScreen.REALLYCOMFORTABLE);
        this.clothing[29]= new Article("Timberlands",WeatherScreen.SNOWY,OccasionScreen.CASUAL,ComfortScreen.REGULAR);
        this.clothing[30]= new Article("Swearshorts",WeatherScreen.SUNNY,OccasionScreen.CASUAL,ComfortScreen.REALLYCOMFORTABLE);
        
        
        
        
        
        
         this.numClothing = 31;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addclothingButton;
    private javax.swing.JButton deleteClothingButton;
    private javax.swing.JButton deleteClothingButton1;
    private javax.swing.JPanel goneButton;
    private javax.swing.JLabel helloPannel;
    private javax.swing.JPanel infoPannel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton listAllButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton settingsButton;
    private javax.swing.JButton whatShouldIWearButton;
    // End of variables declaration//GEN-END:variables
}
