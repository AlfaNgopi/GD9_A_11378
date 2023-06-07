package view;

// Nama : Vincentius Kenton
// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378

import control.MahasiswaControl;
import control.PeminjamanControl;
import control.PustakaControl;
import exception.InputKosongException;
import java.util.List;
import javax.lang.model.SourceVersion;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Mahasiswa;
import model.Peminjaman;
import model.Pustaka;
import table.TablePeminjaman;

/**
 *
 * @author ASUS
 */
public class HomeView extends javax.swing.JFrame {

    private MahasiswaControl mhsControl;
    private PeminjamanControl pmjControl;
    private PustakaControl pskControl;
    
    private List<Pustaka> listPustaka;
    private List<Mahasiswa> listMahasiswa;
    
    
    //local
    int selectedId = 0;
    private String action = "";
    
    public HomeView() {
        initComponents();
        setComponent(false);
        
        setEditDeleteBtn(false);
        mhsControl = new MahasiswaControl();
        pmjControl = new PeminjamanControl();
        pskControl = new PustakaControl();
        
        setPustakaToDropDown();
        setMahasiswaToDrowDown();
        
        showPeminjaman();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFull = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        titleContent = new javax.swing.JLabel();
        pnlLogo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        pnlHome = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pnlLibary = new javax.swing.JLabel();
        pnlContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGameList = new javax.swing.JTable();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFull.setBackground(new java.awt.Color(39, 55, 77));

        pnlHeader.setBackground(new java.awt.Color(82, 109, 130));
        pnlHeader.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        titleContent.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 32)); // NOI18N
        titleContent.setForeground(new java.awt.Color(0, 0, 0));
        titleContent.setText("nama apk");

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(39, 55, 77));

        pnlHome.setBackground(new java.awt.Color(39, 55, 77));
        pnlHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlHome.setText("Home");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHome, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(82, 109, 130));

        pnlLibary.setBackground(new java.awt.Color(82, 109, 130));
        pnlLibary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlLibary.setText("Libary");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLibary, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLibary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleContent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addComponent(titleContent, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnlContainer.setBackground(new java.awt.Color(82, 109, 130));

        tblGameList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblGameList);

        searchInput.setBackground(new java.awt.Color(222, 222, 222));
        searchInput.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        searchInput.setForeground(new java.awt.Color(0, 0, 0));
        searchInput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        searchBtn.setBackground(new java.awt.Color(22, 52, 122));
        searchBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Cari");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContainerLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFullLayout = new javax.swing.GroupLayout(pnlFull);
        pnlFull.setLayout(pnlFullLayout);
        pnlFullLayout.setHorizontalGroup(
            pnlFullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFullLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlFullLayout.setVerticalGroup(
            pnlFullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFullLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        setComponent(false);
        setEditDeleteBtn(false);
        
        try{
            TablePeminjaman peminjaman = pmjControl.showPeminjaman(searchInput.getText());
            
            if (peminjaman.getRowCount() == 0) {
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(null, "Data Tidak Ditemukan !", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
                
            }else{
                tablePeminjaman.setModel(peminjaman);
                
            }
            
            clearText();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlFull;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JLabel pnlHome;
    private javax.swing.JLabel pnlLibary;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTable tblGameList;
    private javax.swing.JLabel titleContent;
    // End of variables declaration//GEN-END:variables

    private void setComponent(boolean b) {
        judulPustakaCBX.setEnabled(b);
        namaMahasiswaCBX.setEnabled(b);
        lamaPinjamInput.setEnabled(b);
        tanggalPinjamInput.setEnabled(b);
        sobekCheckBox.setEnabled(b);
        coretanCheckBox.setEnabled(b);
        menguningCheckBox.setEnabled(b);
        
        saveBtn.setEnabled(b);
        cancelBtn.setEnabled(b);
        
    }
    
    
    
    private void setEditDeleteBtn(boolean b){
        editBtn.setEnabled(b);
        deleteBtn.setEnabled(b);
    }
    
    private void clearText(){
        judulPustakaCBX.setSelectedItem(ABORT);
        namaMahasiswaCBX.setSelectedItem(ABORT);
        lamaPinjamInput.setText("");
        tanggalPinjamInput.setText("");
        
        sobekCheckBox.setSelected(false);
        coretanCheckBox.setSelected(false);
        menguningCheckBox.setSelected(false);
        
        
    }
    
    private void showPeminjaman(){
        tablePeminjaman.setModel(pmjControl.showPeminjaman(""));
    }
    
    
    
    private void inputKosongException() throws InputKosongException{
        if (judulPustakaCBX.getSelectedIndex() == -1 
                || namaMahasiswaCBX.getSelectedIndex() == -1 
                || lamaPinjamInput.getText().isEmpty() 
                || tanggalPinjamInput.getText().isEmpty()) {
            throw new InputKosongException();
        }
        
    }

    
    private void setPustakaToDropDown() {
        listPustaka = pskControl.showData();
        for (int i = 0; i < listPustaka.size(); i++) {
            judulPustakaCBX.addItem(listPustaka.get(i));
        }
    }

    private void setMahasiswaToDrowDown() {
        listMahasiswa = mhsControl.showDataMahasiswa();
        for (int i = 0; i < listMahasiswa.size(); i++) {
            namaMahasiswaCBX.addItem(listMahasiswa.get(i));
        }
    }
    
}
