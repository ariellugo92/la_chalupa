package Vista;

import Controlador.cartillaControlador;
import Pojos.Cartilla;
import Pojos.OpcionesIniciales;
import javax.swing.JOptionPane;

/**
 *
 * @author ariellugo
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public cartillaControlador cc;
    
    public MenuPrincipal() {
        initComponents();
        
        cc = new cartillaControlador();
    }
    
    public void llenandoDatos(){
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c2 = new Cartilla();
        c2.setId(2);
        int [][] arr_c2 = new int[4][4];
        arr_c2[0][0] = 6;
        arr_c2[0][1] = 7;
        arr_c2[0][2] = 8;
        arr_c2[0][3] = 9;
        arr_c2[1][0] = 15;
        arr_c2[1][1] = 16;
        arr_c2[1][2] = 18;
        arr_c2[1][3] = 19;
        arr_c2[2][0] = 24;
        arr_c2[2][1] = 25;
        arr_c2[2][2] = 26;
        arr_c2[2][3] = 27;
        arr_c2[3][0] = 33;
        arr_c2[3][1] = 34;
        arr_c2[3][2] = 35;
        arr_c2[3][3] = 36;
        c2.setCartas(arr_c2);
        
        Cartilla c3 = new Cartilla();
        c3.setId(3);
        int [][] arr_c3 = new int[4][4];
        arr_c3[0][0] = 2;
        arr_c3[0][1] = 3;
        arr_c3[0][2] = 4;
        arr_c3[0][3] = 5;
        arr_c3[1][0] = 7;
        arr_c3[1][1] = 8;
        arr_c3[1][2] = 9;
        arr_c3[1][3] = 10;
        arr_c3[2][0] = 12;
        arr_c3[2][1] = 13;
        arr_c3[2][2] = 14;
        arr_c3[2][3] = 15;
        arr_c3[3][0] = 17;
        arr_c3[3][1] = 18;
        arr_c3[3][2] = 19;
        arr_c3[3][3] = 20;
        c3.setCartas(arr_c3);
        
        Cartilla c4 = new Cartilla();
        c4.setId(1);
        int [][] arr_c4 = new int[4][4];
        arr_c4[0][0] = 1;
        arr_c4[0][1] = 2;
        arr_c4[0][2] = 3;
        arr_c4[0][3] = 4;
        arr_c4[1][0] = 10;
        arr_c4[1][1] = 11;
        arr_c4[1][2] = 12;
        arr_c4[1][3] = 13;
        arr_c4[2][0] = 19;
        arr_c4[2][1] = 20;
        arr_c4[2][2] = 21;
        arr_c4[2][3] = 22;
        arr_c4[3][0] = 28;
        arr_c4[3][1] = 29;
        arr_c4[3][2] = 30;
        arr_c4[3][3] = 31;
        c4.setCartas(arr_c4);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
        
        Cartilla c1 = new Cartilla();
        c1.setId(1);
        int [][] arr_c1 = new int[4][4];
        arr_c1[0][0] = 1;
        arr_c1[0][1] = 2;
        arr_c1[0][2] = 3;
        arr_c1[0][3] = 4;
        arr_c1[1][0] = 10;
        arr_c1[1][1] = 11;
        arr_c1[1][2] = 12;
        arr_c1[1][3] = 13;
        arr_c1[2][0] = 19;
        arr_c1[2][1] = 20;
        arr_c1[2][2] = 21;
        arr_c1[2][3] = 22;
        arr_c1[3][0] = 28;
        arr_c1[3][1] = 29;
        arr_c1[3][2] = 30;
        arr_c1[3][3] = 31;
        c1.setCartas(arr_c1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTipoJuego = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        spinerJugadores = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        spinerTablas = new javax.swing.JSpinner();
        radioTradicional = new javax.swing.JRadioButton();
        radioRellenarTodo = new javax.swing.JRadioButton();
        btnJugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(542, 115));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(542, 30));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(1, 3, 38));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(15, 15));
        jPanel4.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jLabel2.setBackground(new java.awt.Color(1, 3, 38));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(186, 217, 214));
        jLabel2.setText("JUEGO  DE LA CHALUPA");
        jLabel2.setOpaque(true);
        jPanel4.add(jLabel2, java.awt.BorderLayout.CENTER);

        jButton1.setBackground(new java.awt.Color(1, 3, 38));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("X");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, java.awt.BorderLayout.EAST);

        jPanel2.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel3.setBackground(new java.awt.Color(1, 3, 38));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(186, 217, 214));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("COMPLETE LAS OPCIONES PARA EMPEZAR A JUGAR");
        jLabel3.setOpaque(true);
        jPanel5.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(51, 102, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setText("Numero de jugadores");

        spinerJugadores.setModel(new javax.swing.SpinnerNumberModel(2, 2, 4, 1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setText("Tablas por jugador");

        spinerTablas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 2, 1));

        radioTradicional.setBackground(new java.awt.Color(255, 255, 255));
        grupoTipoJuego.add(radioTradicional);
        radioTradicional.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        radioTradicional.setText("Forma tradicional");
        radioTradicional.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        radioRellenarTodo.setBackground(new java.awt.Color(255, 255, 255));
        grupoTipoJuego.add(radioRellenarTodo);
        radioRellenarTodo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        radioRellenarTodo.setText("Rellenar todo");
        radioRellenarTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnJugar.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnJugar.setText("JUGAR");
        btnJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spinerTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spinerJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(radioTradicional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioRellenarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spinerJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spinerTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(radioTradicional)
                .addGap(18, 18, 18)
                .addComponent(radioRellenarTodo)
                .addGap(18, 18, 18)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(734, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // metodo cuando le den click al boton jugar
    private void iniciarJuego(){
        if(!radioTradicional.isSelected() && !radioRellenarTodo.isSelected()){
            JOptionPane.showMessageDialog(this, "Seleccione la forma de juego");
            return;
        }
        // llenando el objeto
        OpcionesIniciales oi = new OpcionesIniciales();
        oi.setNumero_jugadores((int) spinerJugadores.getValue());
        oi.setNumero_tablas((int) spinerTablas.getValue());
        int forma = radioTradicional.isSelected() ? 0 : 1;
        oi.setForma_juego(forma);
        
        frmJuego jugar = new frmJuego(oi);
        jugar.setVisible(true);
        this.setVisible(false);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        this.iniciarJuego();
    }//GEN-LAST:event_btnJugarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.ButtonGroup grupoTipoJuego;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton radioRellenarTodo;
    private javax.swing.JRadioButton radioTradicional;
    private javax.swing.JSpinner spinerJugadores;
    private javax.swing.JSpinner spinerTablas;
    // End of variables declaration//GEN-END:variables
}
