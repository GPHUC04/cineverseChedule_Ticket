/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import DatabaseConnection.DatabaseConnection;
import DatabaseConnection.Schedule_TicketDAO;
import controller.Schedulecontroller;
import controller.TicketController;
import font.SetFont;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Time;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author kenlee
 */
public class Ticketpanel extends javax.swing.JPanel {
        private JPanel seatsPanel; // Khai báo seatsPanel
        private SetFont font;
        private Schedule_TicketDAO scheduleDAO;
        private DatabaseConnection databaseconection;
        private JPanel mainPanel;
        private JPanel detailsPanel;
        private JLabel screenLabel;
        private JButton[][] seatButtons;
        private JLabel totalPriceLabel; // Khai báo ở đây
        private List<String> selectedSeats = new ArrayList<>();
        private List<JButton> seatButton = new ArrayList<>();


 
     
    public Ticketpanel() {
        font = new SetFont();
        scheduleDAO = new Schedule_TicketDAO();
        databaseconection = new DatabaseConnection();
        initComponents();
        
        loadMovieName();
        loadMovieData();

  
        TicketController ticketcontroller = new TicketController(this);
        
        cb_movieName.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        
        String selectedMovieId = cb_movieName.getSelectedItem().toString(); 
            loadTypeRoom(selectedMovieId);
             updateShowDates();
    }
});

        cb_roomtype.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            loadShowTime(); 
    }
});
        cb_showtime.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
           onConfirmShowtimeSelection();
           updateShowDates();
    }   
});


}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel_moviename = new javax.swing.JLabel();
        jLabel_datecurrent = new javax.swing.JLabel();
        jLabel_showtime = new javax.swing.JLabel();
        jLabel_roomname = new javax.swing.JLabel();
        jLabel_duration = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7_price = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btn_pay = new javax.swing.JButton();
        btn_cancel_pay = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ticketID = new javax.swing.JLabel();
        roomtype = new javax.swing.JLabel();
        showtime = new javax.swing.JLabel();
        btn_confirm = new javax.swing.JButton();
        btn_cancel_confirm = new javax.swing.JButton();
        cb_movieName = new javax.swing.JComboBox<>();
        cb_roomtype = new javax.swing.JComboBox<>();
        phone = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        seattype = new javax.swing.JLabel();
        cus_name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        paymethod = new javax.swing.JLabel();
        pay_box = new javax.swing.JComboBox<>();
        cb_showtime = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        cb_showDate = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        ticket = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 688));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(195, 170, 170));
        jPanel4.setBackground(new java.awt.Color(195, 170, 170 , 123));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.setBackground(new java.awt.Color(51, 102, 255,123));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("BILL ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 0, 89, 39));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_moviename.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jPanel6.add(jLabel_moviename, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 250, 50));

        jLabel_datecurrent.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_datecurrent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel_datecurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 23));

        jLabel_showtime.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_showtime.setForeground(new java.awt.Color(51, 153, 0));
        jPanel6.add(jLabel_showtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 140, 20));

        jLabel_roomname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_roomname.setForeground(new java.awt.Color(51, 153, 0));
        jPanel6.add(jLabel_roomname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 110, 40));

        jLabel_duration.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_duration.setForeground(new java.awt.Color(51, 153, 0));
        jPanel6.add(jLabel_duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Movie:");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Show Time:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Date:");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Room:");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Duration:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("ms");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 350, 220));

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Selected Seat");
        font.setFontRobotoBold(jLabel11, 20f);
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 10, 350, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        font.setFontRobotoBold(jLabel13, 20f);
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 350, 60));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 350, 100));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        font.setFontRobotoBold(jLabel7_price, 20f);
        jPanel8.add(jLabel7_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 110, 60));

        jLabel7.setText("Total Price:");
        font.setFontRobotoBold(jLabel7, 18f);
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 200, 60));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBackground(new java.awt.Color(255, 255, 255 , 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_pay.setBackground(new java.awt.Color(153, 0, 51));
        btn_pay.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_pay.setForeground(new java.awt.Color(255, 255, 255));
        btn_pay.setText("Pay");
        jPanel9.add(btn_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, 90, 40));

        btn_cancel_pay.setBackground(new java.awt.Color(153, 0, 51));
        btn_cancel_pay.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_cancel_pay.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel_pay.setText("Cancel");
        jPanel9.add(btn_cancel_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 9, 90, 40));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 210, 60));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        font.setFontRobotoBold(jLabel5, 20f);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 440, 350, 70));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 410, 540));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1366, 688));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ticketID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ticketID.setText("Movie Name:");
        font.setFontRoboto(ticketID, 20f);
        jPanel3.add(ticketID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 45));

        roomtype.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        roomtype.setText("Room Type:");
        font.setFontRoboto(roomtype, 20f);
        jPanel3.add(roomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 45));

        showtime.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        showtime.setText("Show Time:");
        font.setFontRoboto(showtime, 20f);
        jPanel3.add(showtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 45));

        btn_confirm.setBackground(new java.awt.Color(153, 0, 51));
        btn_confirm.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_confirm.setForeground(new java.awt.Color(255, 255, 255));
        btn_confirm.setText("Confirm");
        font.setFontRoboto(btn_confirm, 20f);
        jPanel3.add(btn_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 110, 43));

        btn_cancel_confirm.setBackground(new java.awt.Color(153, 0, 51));
        btn_cancel_confirm.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_cancel_confirm.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel_confirm.setText("Cancel");
        font.setFontRoboto(btn_cancel_confirm, 20f);
        jPanel3.add(btn_cancel_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 98, 43));

        cb_movieName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb_movieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_movieNameActionPerformed(evt);
            }
        });
        jPanel3.add(cb_movieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 130, 40));

        cb_roomtype.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        font.setFontRoboto(cb_roomtype, 20f);
        jPanel3.add(cb_roomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 130, 40));

        phone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        phone.setText("Cus Phone:");
        font.setFontRoboto(phone, 20f);
        jPanel3.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 160, 50));

        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        font.setFontRoboto(txt_phone, 20f);
        jPanel3.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 260, 45));

        seattype.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        seattype.setText("Seat number:");
        font.setFontRoboto(seattype, 20f);
        jPanel3.add(seattype, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 45));

        cus_name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cus_name.setText("Cus Name:");
        font.setFontRoboto(cus_name, 20f);
        jPanel3.add(cus_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 160, 50));

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        font.setFontRoboto(txt_name, 20f);
        jPanel3.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 260, 45));

        paymethod.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        paymethod.setText("Pay method:");
        font.setFontRoboto(paymethod, 20f);
        jPanel3.add(paymethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        pay_box.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pay_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credit Card", "Cash" }));
        pay_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_boxActionPerformed(evt);
            }
        });
        jPanel3.add(pay_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 130, 40));

        jPanel3.add(cb_showtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 130, 40));

        jPanel5.setLayout(new java.awt.GridLayout(8, 5));
        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 500, 250));

        cb_showDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_showDateActionPerformed(evt);
            }
        });
        jPanel3.add(cb_showDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 150, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Show Date :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 100, 40));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 720, 560));

        ticket.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        ticket.setText("Ticket");
        jPanel4.add(ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 6, 210, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 58, 1220, 620));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cinéverse (2).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void pay_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pay_boxActionPerformed

    private void cb_movieNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_movieNameActionPerformed
 

       
    }//GEN-LAST:event_cb_movieNameActionPerformed

    private void cb_showDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_showDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_showDateActionPerformed
private void loadMovieName() {
    ArrayList<String> list = scheduleDAO.loaddatacomboboxMovieName();
    for (String item : list) {
        cb_movieName.addItem(item); 
    }
}
 


private void loadShowTime() {
    
    String selectedMovie = (String) cb_movieName.getSelectedItem();
    String selectedRoomType = (String) cb_roomtype.getSelectedItem();
    
   
    if (selectedMovie != null && selectedRoomType != null) {
        
        ArrayList<String> list = scheduleDAO.getShowTimesByMovieNameAndRoomType(selectedMovie, selectedRoomType);
        
        cb_showtime.removeAllItems();
        
       
        for (String item : list) {
            cb_showtime.addItem(item);
        }
    }
}

private void loadTypeRoom(String movieId) {
    cb_roomtype.removeAllItems();
    ArrayList<String> list = scheduleDAO.loaddatacomboboxTypeRoom(movieId); 
    for (String item : list) {
        cb_roomtype.addItem(item); 
    }
}



    private void loadMovieData() {
      
        cb_movieName.removeAllItems();

      
        ArrayList<String> movieNames = scheduleDAO.loadMovieNames();

        for (String movieName : movieNames) {
            cb_movieName.addItem(movieName);
        }
        
    }
    
 
    


   
    


JComboBox<String> cb_availableSeats = new JComboBox<>();



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel_confirm;
    private javax.swing.JButton btn_cancel_pay;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_pay;
    private javax.swing.JComboBox<String> cb_movieName;
    private javax.swing.JComboBox<String> cb_roomtype;
    private javax.swing.JComboBox<String> cb_showDate;
    private javax.swing.JComboBox<String> cb_showtime;
    private javax.swing.JLabel cus_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel7_price;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_datecurrent;
    private javax.swing.JLabel jLabel_duration;
    private javax.swing.JLabel jLabel_moviename;
    private javax.swing.JLabel jLabel_roomname;
    private javax.swing.JLabel jLabel_showtime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox<String> pay_box;
    private javax.swing.JLabel paymethod;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel roomtype;
    private javax.swing.JLabel seattype;
    private javax.swing.JLabel showtime;
    private javax.swing.JLabel ticket;
    private javax.swing.JLabel ticketID;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables

   public void setActionListener(ActionListener listener) {
        btn_confirm.addActionListener(listener);
        btn_cancel_confirm.addActionListener(listener);
        btn_pay.addActionListener(listener);
        btn_cancel_pay.addActionListener(listener);
       
    }

    public JButton getBtn_cancel_confirm() {
        return btn_cancel_confirm;
    }

    public void setBtn_cancel_confirm(JButton btn_cancel_confirm) {
        this.btn_cancel_confirm = btn_cancel_confirm;
    }

    public JButton getBtn_cancel_pay() {
        return btn_cancel_pay;
    }

    public void setBtn_cancel_pay(JButton btn_cancel_pay) {
        this.btn_cancel_pay = btn_cancel_pay;
    }

    public JButton getBtn_confirm() {
        return btn_confirm;
    }

    public void setBtn_confirm(JButton btn_confirm) {
        this.btn_confirm = btn_confirm;
    }

    public JButton getBtn_pay() {
        return btn_pay;
    }

    public void setBtn_pay(JButton btn_pay) {
        this.btn_pay = btn_pay;
    }


private boolean isWarningShown = false; 

private void onConfirmShowtimeSelection() {
    
    if (cb_showtime.getSelectedItem() == null) {
       
        if (!isWarningShown) {
            JOptionPane.showMessageDialog(this, "Please select a movie, room, and showtime before proceeding!", "Warning", JOptionPane.WARNING_MESSAGE);
            isWarningShown = true;
        }
        return;  
    }

    String selectedMovie = cb_movieName.getSelectedItem().toString();
    String selectedRoom = cb_roomtype.getSelectedItem().toString();
    String selectedShowtime = cb_showtime.getSelectedItem().toString();

    int scheduleId = scheduleDAO.getScheduleId(selectedMovie, selectedRoom, selectedShowtime);

    if (scheduleId == -1) {
        JOptionPane.showMessageDialog(this, "No matching schedule found. Please check your information and try again!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

  
    setupSeatsPanel(scheduleId);
}

private void setupSeatsPanel(int scheduleId) {
    jPanel5.removeAll(); 
    jPanel5.setLayout(new GridLayout(6, 8, 5, 5)); 

    seatButtons = new JButton[6][8]; 
    selectedSeats = new ArrayList<>(); 

    Map<Integer, String> seatStatusMap = scheduleDAO.getSeatStatus(scheduleId);

    int seatNumber = 1;
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 8; j++) {
            JButton seatButton = new JButton(String.valueOf(seatNumber));
            seatButton.setPreferredSize(new Dimension(50, 50)); 

            
            String status = seatStatusMap.getOrDefault(seatNumber, "Available");
            if (status.equals("Occupied")) {
                seatButton.setBackground(Color.RED);
                seatButton.setEnabled(false); 
            } else {
                seatButton.setBackground(Color.GREEN);
                seatButton.setEnabled(true);
                String seatIdentifier = i + "," + j; 
                seatButton.addActionListener(e -> toggleSeatSelection((JButton) e.getSource(), seatIdentifier));
            }

     
            seatButtons[i][j] = seatButton;
            jPanel5.add(seatButton);
            seatNumber++; 
        }
    }

    jPanel5.revalidate();
    jPanel5.repaint();
}


private void toggleSeatSelections(JButton seatButton, String seatIdentifier) {

    String[] seatPosition = seatIdentifier.split(",");
    int row = Integer.parseInt(seatPosition[0].trim());
    int column = Integer.parseInt(seatPosition[1].trim());


    if (seatButton.getBackground() == Color.GREEN) {
        
        seatButton.setBackground(Color.YELLOW);
        selectedSeats.add(seatIdentifier); 
    } else if (seatButton.getBackground() == Color.YELLOW) {
        
        seatButton.setBackground(Color.GREEN);
        selectedSeats.remove(seatIdentifier); 
    }

   
    updateSeatInfoLabel();
}


private int[] getSeatPosition(String seatIdentifier) {
   
    String[] seatPosition = seatIdentifier.split(",");
    int row = Integer.parseInt(seatPosition[0].trim());
    int column = Integer.parseInt(seatPosition[1].trim());

    return new int[] { row, column };
}

private void updateSeatInfoLabel() {
  
    if (selectedSeats.isEmpty()) {
        jLabel13.setText("No seat selected");
    } else {
        StringBuilder seatInfo = new StringBuilder("Selected Seats: ");
        for (String seat : selectedSeats) {
           
            int[] position = getSeatPosition(seat);
            int row = position[0];
            int column = position[1];

            
            int seatNumber = (row * 8) + column + 1;

          
            seatInfo.append(seatNumber).append(" ");
        }
        jLabel13.setText(seatInfo.toString());
    }
}



private void toggleSeatSelection(JButton seatButton, String seatIdentifier) {
    if (selectedSeats.contains(seatIdentifier)) {
        selectedSeats.remove(seatIdentifier);
        seatButton.setBackground(Color.GREEN); 
    } else {
        selectedSeats.add(seatIdentifier);
        seatButton.setBackground(Color.YELLOW); 
    }
}


public void btnConfirmActionPerformed() {

    if (cb_movieName.getSelectedItem() == null || cb_roomtype.getSelectedItem() == null ||
        cb_showtime.getSelectedItem() == null || cb_showDate.getSelectedItem() == null) {
        showTimedMessageDialog("Please select all fields!", 500);
        return;
    }

    String movieName = cb_movieName.getSelectedItem().toString(); 
    String roomType = cb_roomtype.getSelectedItem().toString();  
    String showTime = cb_showtime.getSelectedItem().toString();  
    String showDate = cb_showDate.getSelectedItem().toString();  

    String name = txt_name.getText(); 
    String phone = txt_phone.getText(); 

    Schedule_TicketDAO scheduleDAO = new Schedule_TicketDAO(databaseconection.getConnection());

    // Lấy thời lượng phim
    String duration = scheduleDAO.getMovieDuration(movieName);

    // Lấy tên phòng chiếu
    String roomName = scheduleDAO.getRoomNameByMovieAndShowTime(movieName, showTime);

    jLabel_datecurrent.setText(LocalDate.now().toString());
    jLabel_moviename.setText(movieName);
    jLabel_showtime.setText(showTime);
    jLabel_roomname.setText(roomName);
    jLabel_duration.setText(duration);

    if (scheduleDAO.isCustomerExist(name, phone)) {
        showTimedMessageDialog("The customer already exists!", 500);
    } else {
        scheduleDAO.addCustomer(name, phone);
        showTimedMessageDialog("Successfully added new customers!", 500);
    }


    if (selectedSeats.isEmpty()) {
        jLabel13.setText(""); 
    } else {
       
        StringBuilder selectedSeatNumbers = new StringBuilder();
        for (int i = 0; i < selectedSeats.size(); i++) {
            String seat = selectedSeats.get(i);
          
            int[] position = getSeatPosition(seat);
            int row = position[0];
            int column = position[1];

        
            int seatNumber = (row * 8) + column + 1;

         
            selectedSeatNumbers.append(seatNumber);
            if (i < selectedSeats.size() - 1) {
                selectedSeatNumbers.append(", ");
            }
        }
        jLabel13.setText(selectedSeatNumbers.toString());

        double totalPrice = calculateTotalPrice(movieName, roomType, showTime, showDate, selectedSeats.size());
        jLabel7_price.setText(NumberFormat.getCurrencyInstance().format(totalPrice)); // Tổng giá vé
    }

   
    for (JButton[] row : seatButtons) {
        for (JButton seatButton : row) {
            if (selectedSeats.contains(seatButton.getText())) {
                seatButton.setBackground(Color.YELLOW); 
            }
        }
    }
}


private double calculateTotalPrice(String movieName, String roomType, String showTime, String showDate, int numberOfSeats) {
    Schedule_TicketDAO scheduleDAO = new Schedule_TicketDAO(databaseconection.getConnection());
    double pricePerSeat = scheduleDAO.getTicketPrice(movieName, roomType, showTime, showDate);
    return pricePerSeat * numberOfSeats; 
}

public void btnPayActionPerformed() {
    String phoneNumber = txt_phone.getText().trim();

    if (phoneNumber.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter the phone number!");
        return;
    }

 
    int customerId = scheduleDAO.getCustomerIdByPhone(phoneNumber);
    if (customerId == -1) {
        JOptionPane.showMessageDialog(null, "No customer found with this phone number!");
        return;
    }

    String movieName = cb_movieName.getSelectedItem() != null ? cb_movieName.getSelectedItem().toString() : "";
    String roomType = cb_roomtype.getSelectedItem() != null ? cb_roomtype.getSelectedItem().toString() : "";
    String showTime = cb_showtime.getSelectedItem() != null ? cb_showtime.getSelectedItem().toString() : "";
    String showDate = cb_showDate.getSelectedItem() != null ? cb_showDate.getSelectedItem().toString() : "";

    
    if (movieName.isEmpty() || roomType.isEmpty() || showTime.isEmpty() || showDate.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please select all information: movie, room, and showtime!");
        return;
    }

   
    int scheduleId = scheduleDAO.getScheduleId(movieName, roomType, showTime);
    if (scheduleId == -1) {
        JOptionPane.showMessageDialog(null, "No schedule found for this movie!");
        return;
    }

   
    String payMethod = pay_box.getSelectedItem() != null ? pay_box.getSelectedItem().toString() : "";
    if (payMethod.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please select a payment method!");
        return;
    }

    
    java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
    Time sqlTime = Time.valueOf(LocalTime.now());

    if (selectedSeats == null || selectedSeats.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please select seats!");
        return;
    }

    try {
        
        double totalPrice = 0;

     
        String totalAmountText = jLabel7_price.getText().replaceAll("[^0-9.]", "");
        if (totalAmountText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid value.");
            return;
        }

        double pricePerSeat = Double.parseDouble(totalAmountText);// / selectedSeats.size();

        for (String seat : selectedSeats) {
            String[] seatDetails = seat.split(",");
            int seatRow = Integer.parseInt(seatDetails[0].trim());
            int seatColumn = Integer.parseInt(seatDetails[1].trim());

        
            int seatId = scheduleDAO.getSeatId(scheduleId, seatRow, seatColumn);
            if (seatId == -1) {
                JOptionPane.showMessageDialog(null, "No information found for seat: " + seat);
                continue;
            }
            scheduleDAO.executePayProcedure(customerId, scheduleId, sqlDate, sqlTime, payMethod, seatId, pricePerSeat);

            totalPrice += pricePerSeat;
        }

        JOptionPane.showMessageDialog(null, "Payment successful! Total amount: " +
            NumberFormat.getCurrencyInstance().format(totalPrice));
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
}


private void showTimedMessageDialog(String message, int duration) {
    JOptionPane pane = new JOptionPane(message, JOptionPane.INFORMATION_MESSAGE);
    JDialog dialog = pane.createDialog(null, "Notification");
    dialog.setModal(false); 
    dialog.setVisible(true);

   
    Timer timer = new Timer(duration, e -> dialog.dispose());
    timer.setRepeats(false); 
    timer.start();
}

public void btnCancelActionPerformed() {
    
    int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Cancel Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

    
    if (response == JOptionPane.YES_OPTION) {
        
        cb_movieName.setSelectedIndex(0); 
        cb_showtime.setSelectedIndex(0); 
        cb_roomtype.setSelectedIndex(0); 
        selectedSeats.clear();
        jLabel5.setText(""); 
        jLabel_datecurrent.setText(""); 
        jLabel_moviename.setText("");
        jLabel_showtime.setText(""); 
        jLabel_roomname.setText("");
        jLabel_duration.setText(""); 
        jLabel7_price.setText("");
        jLabel13.setText("");
    }
   
}

private void updateShowDates() {
    
    String movieName = (cb_movieName.getSelectedItem() != null) ? cb_movieName.getSelectedItem().toString() : "";
    String showTime = (cb_showtime.getSelectedItem() != null) ? cb_showtime.getSelectedItem().toString() : "";

    if (movieName.isEmpty() || showTime.isEmpty()) {
        return; // Dừng lại nếu không có lựa chọn
    }

   
    Schedule_TicketDAO scheduleDAO = new Schedule_TicketDAO(databaseconection.getConnection());
    List<String> showDates = scheduleDAO.getShowDatesByMovieAndShowTime(movieName, showTime);

  
    cb_showDate.removeAllItems();

    for (String date : showDates) {
        cb_showDate.addItem(date);
    }
}

public void btnCancelPayActionPerformed() {
    String phoneNumber = txt_phone.getText().trim();

    
    if (phoneNumber.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter the phone number!");
        return;
    }

 
    int customerId = scheduleDAO.getCustomerIdByPhone(phoneNumber);
    if (customerId == -1) {
        JOptionPane.showMessageDialog(null, "Customer with this phone number not found!");
        return;
    }

    String movieName = cb_movieName.getSelectedItem() != null ? cb_movieName.getSelectedItem().toString() : "";
    String roomType = cb_roomtype.getSelectedItem() != null ? cb_roomtype.getSelectedItem().toString() : "";
    String showTime = cb_showtime.getSelectedItem() != null ? cb_showtime.getSelectedItem().toString() : "";
    String showDate = cb_showDate.getSelectedItem() != null ? cb_showDate.getSelectedItem().toString() : "";

    if (movieName.isEmpty() || showTime.isEmpty() || showDate.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please select all information: movie, showtime, and show date!");
        return;
    }

    int scheduleId = scheduleDAO.getScheduleId(movieName, roomType, showTime);
    if (scheduleId == -1) {
        JOptionPane.showMessageDialog(null, "Schedule not found for this movie!");
        return;
    }

   

    int ticketId = scheduleDAO.getTicketIdByCustomerAndSchedule(customerId, scheduleId);
    if (ticketId == -1) {
        JOptionPane.showMessageDialog(null, "Ticket not found for cancellation!");
        return;
    }

    try {
     
        scheduleDAO.cancelPayment(ticketId, scheduleId, selectedSeats);
        JOptionPane.showMessageDialog(null, "Transaction has been successfully canceled!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "An error occurred while canceling the transaction: " + e.getMessage());
    }
}



}
