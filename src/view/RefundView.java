package view;

// Nama : Vincentius Kenton

import control.PembelianControl;
import control.RefundControl;
import control.UserControl;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Game;
import model.Pembelian;
import model.Refund;
import model.User;
import static view.GameView.game;
import static view.GameView.user;
import static view.HomeView.user;

// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378


/**
 *
 * @author ASUS
 */
public class RefundView extends javax.swing.JFrame {

    static User user;
    static Game game;
    
    UserControl UserC = new UserControl();
    PembelianControl PembelianC = new PembelianControl();
    RefundControl RefundC = new RefundControl();
    
    public RefundView(User user, Game game) {
        
        this.user = user;
        this.game = game;
        initComponents();
        initUser();
        initGame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        pnlFull = new javax.swing.JPanel();
        pnlContainer = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDeskribsi = new javax.swing.JTextArea();
        lblGameName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputReview = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputPublisher = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputRelaseDate = new javax.swing.JTextField();
        pnlRefund = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        gameLogo = new javax.swing.JLabel();
        lblGenre = new javax.swing.JLabel();
        inputGenre = new javax.swing.JTextField();
        lblBack = new javax.swing.JLabel();
        pnlHeader = new javax.swing.JPanel();
        titleContent = new javax.swing.JLabel();
        pnlHome = new javax.swing.JPanel();
        lblHome1 = new javax.swing.JLabel();
        pnlLibary1 = new javax.swing.JPanel();
        lblLibary1 = new javax.swing.JLabel();
        pnlHistory1 = new javax.swing.JPanel();
        lblHistory1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblWallet = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel4.setText("Review : ");

        jTextField3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFull.setBackground(new java.awt.Color(39, 55, 77));

        pnlContainer.setBackground(new java.awt.Color(82, 109, 130));

        txtDeskribsi.setBackground(new java.awt.Color(82, 109, 130));
        txtDeskribsi.setColumns(20);
        txtDeskribsi.setForeground(new java.awt.Color(255, 255, 255));
        txtDeskribsi.setRows(5);
        txtDeskribsi.setText("desc here");
        jScrollPane2.setViewportView(txtDeskribsi);

        lblGameName.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        lblGameName.setText("game name");

        jLabel2.setText("Review : ");

        inputReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputReviewActionPerformed(evt);
            }
        });

        jLabel3.setText("Publisher : ");

        jLabel5.setText("Relase Date :");

        pnlRefund.setBackground(new java.awt.Color(157, 178, 191));
        pnlRefund.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRefundMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(232, 44, 57));
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Refund");
        jLabel7.setOpaque(true);

        lblHarga.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        lblHarga.setForeground(new java.awt.Color(0, 0, 0));
        lblHarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHarga.setText("Harga");

        javax.swing.GroupLayout pnlRefundLayout = new javax.swing.GroupLayout(pnlRefund);
        pnlRefund.setLayout(pnlRefundLayout);
        pnlRefundLayout.setHorizontalGroup(
            pnlRefundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRefundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlRefundLayout.setVerticalGroup(
            pnlRefundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRefundLayout.createSequentialGroup()
                .addGroup(pnlRefundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(82, 109, 130));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        lblGenre.setText("Genre");

        inputGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputGenreActionPerformed(evt);
            }
        });

        lblBack.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblBack.setForeground(new java.awt.Color(39, 55, 77));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back2.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblGameName, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                                .addComponent(jScrollPane2))
                            .addComponent(gameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputReview, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputRelaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlRefund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlContainerLayout.createSequentialGroup()
                                .addComponent(lblGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGameName, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(inputReview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(inputPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(inputRelaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenre)
                            .addComponent(inputGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(gameLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRefund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        pnlHeader.setBackground(new java.awt.Color(82, 109, 130));
        pnlHeader.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        titleContent.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 32)); // NOI18N
        titleContent.setForeground(new java.awt.Color(0, 0, 0));
        titleContent.setText("Gerobak Game");

        pnlHome.setBackground(new java.awt.Color(82, 109, 130));
        pnlHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHomeMouseClicked(evt);
            }
        });

        lblHome1.setBackground(new java.awt.Color(82, 109, 130));
        lblHome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome1.setText("Home");

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHome1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlLibary1.setBackground(new java.awt.Color(39, 55, 77));
        pnlLibary1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLibary1MouseClicked(evt);
            }
        });

        lblLibary1.setBackground(new java.awt.Color(39, 55, 77));
        lblLibary1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLibary1.setText("Libary");

        javax.swing.GroupLayout pnlLibary1Layout = new javax.swing.GroupLayout(pnlLibary1);
        pnlLibary1.setLayout(pnlLibary1Layout);
        pnlLibary1Layout.setHorizontalGroup(
            pnlLibary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLibary1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlLibary1Layout.setVerticalGroup(
            pnlLibary1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLibary1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlHistory1.setBackground(new java.awt.Color(82, 109, 130));
        pnlHistory1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHistory1MouseClicked(evt);
            }
        });

        lblHistory1.setBackground(new java.awt.Color(82, 109, 130));
        lblHistory1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHistory1.setText("History");

        javax.swing.GroupLayout pnlHistory1Layout = new javax.swing.GroupLayout(pnlHistory1);
        pnlHistory1.setLayout(pnlHistory1Layout);
        pnlHistory1Layout.setHorizontalGroup(
            pnlHistory1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHistory1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlHistory1Layout.setVerticalGroup(
            pnlHistory1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHistory1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/LOGOO.png"))); // NOI18N

        lblWallet.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        lblWallet.setText("wallet");

        jPanel1.setBackground(new java.awt.Color(157, 178, 191));

        lblUserName.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 0, 0));
        lblUserName.setText("username");
        lblUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserNameMouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/usericon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlLibary1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlHistory1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleContent, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblWallet, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHeaderLayout.createSequentialGroup()
                        .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleContent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHeaderLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblWallet, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHistory1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlLibary1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFullLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFull, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputReviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputReviewActionPerformed

    private void pnlRefundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRefundMouseClicked

        boolean punya = false;
        // CEK SUDAH PUNYA ATAU TIDAK
        if (!"".equals(user.getLibrary())) {
            String[] userGames = user.getLibrary().split(",");
            for (String userGame : userGames) {
                if (Integer.parseInt(userGame) == game.getGameId()) {
                    punya = true;
                    
                }
            }
        }
        
        if (punya) {
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        
            user.setWallet(user.getWallet() + game.getPrice());
            
            
            Refund r = new Refund(game, user, timeStamp, user.getWallet());
            
            String libaryLama = user.getLibrary();
            String libaryBaru = "";
            
            String[] game_ids = libaryLama.split(",");
            for (String game_id : game_ids) {
                System.out.println("here");
                if (Integer.parseInt(game_id) == game.getGameId()) {
                    System.out.println("mengahpus game " + game.getGameName());
                    
                }else{
                
                    if (libaryBaru == "") {
                        libaryBaru = game_id;
                    }else{
                        libaryBaru = libaryBaru + "," + game_id;
                    }
                }
            }
                
                
            
                
            user.setLibrary(libaryBaru);
            UserC.updateDataUser(user);
            RefundC.insertDataRefund(r);

            System.out.println("berhasil refund");
            JOptionPane.showConfirmDialog(rootPane, "Berhasil Refund", "konfirmasi", JOptionPane.DEFAULT_OPTION);
            
            LibaryView pv = new LibaryView(user);
            this.dispose();

            pv.setVisible(true);
            

           



            
            
            
        }
        
        
        
        
        initUser();

    }//GEN-LAST:event_pnlRefundMouseClicked

    private void inputGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputGenreActionPerformed

    private void pnlHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseClicked
        HomeView pv = new HomeView(user);
        this.dispose();

        pv.setVisible(true);
    }//GEN-LAST:event_pnlHomeMouseClicked

    private void pnlLibary1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLibary1MouseClicked
        LibaryView pv = new LibaryView(user);
        this.dispose();

        pv.setVisible(true);
    }//GEN-LAST:event_pnlLibary1MouseClicked

    private void pnlHistory1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHistory1MouseClicked
        PurchaseHistoryView pv = new PurchaseHistoryView(user);
        this.dispose();

        pv.setVisible(true);
    }//GEN-LAST:event_pnlHistory1MouseClicked

    private void lblUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserNameMouseClicked
        AkunView pv = new AkunView(user);
        this.dispose();

        pv.setVisible(true);
    }//GEN-LAST:event_lblUserNameMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        LibaryView pv = new LibaryView(user);
        this.dispose();

        pv.setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

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
            java.util.logging.Logger.getLogger(RefundView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RefundView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RefundView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RefundView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RefundView(user, game).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gameLogo;
    private javax.swing.JTextField inputGenre;
    private javax.swing.JTextField inputPublisher;
    private javax.swing.JTextField inputRelaseDate;
    private javax.swing.JTextField inputReview;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblGameName;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblHistory1;
    private javax.swing.JLabel lblHome1;
    private javax.swing.JLabel lblLibary1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblWallet;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlFull;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlHistory1;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlLibary1;
    private javax.swing.JPanel pnlRefund;
    private javax.swing.JLabel titleContent;
    private javax.swing.JTextArea txtDeskribsi;
    // End of variables declaration//GEN-END:variables

    private void initUser() {
        lblUserName.setText(user.getNama());
        lblWallet.setText("Rp " + user.getWallet());
    }

    private void initGame() {
        lblGameName.setText(game.getGameName());
        txtDeskribsi.setText(getDeskripsi());
        inputPublisher.setText(game.getPublisher());
        inputRelaseDate.setText(game.getReleaseDate());
        inputReview.setText(game.getReview());
        inputGenre.setText(game.getGenre());
        
        lblHarga.setText(getGamePriceAsString());
        
        gameLogo.setIcon(new ImageIcon(game.getImage()));
    }

    private String getGamePriceAsString() {
        return "" + game.getPrice() + "";
    }

    private String intToString(int i) {
        return "" + i + "";
    }

    private String getDeskripsi() {
        int pointer = 0;
        String newDesc = "";
        
        
        for (int i = 0; i < game.getDeskripsi().length(); i++) {
            pointer++;
            
            if (pointer > 60) {
                if (game.getDeskripsi().charAt(i) == ' ') {
                    newDesc = newDesc + "\n";
                    
                    pointer = 0;
                    continue;
                }
            }
            newDesc = newDesc + game.getDeskripsi().charAt(i);
        }
        
        return newDesc;
    }

    
    
}
