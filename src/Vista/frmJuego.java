package Vista;

import Controlador.cartaControlador;
import Controlador.jugadorCartillaControlador;
import Controlador.jugadorControlador;
import Pojos.Jugador;
import Pojos.OpcionesIniciales;
import Pojos.jugador_cartillas;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ariellugo
 */
public class frmJuego extends javax.swing.JFrame {
    
    private OpcionesIniciales oi;
    private jugadorControlador jdao;
    private jugadorCartillaControlador jcdao;
    
    public frmJuego() {
        initComponents();
        this.setExtendedState(frmJuego.MAXIMIZED_BOTH);
    }
    
    public frmJuego(OpcionesIniciales oi_padre) {
        initComponents();
        this.oi = oi_padre;
        this.setExtendedState(frmJuego.MAXIMIZED_BOTH);
        
        jdao = new jugadorControlador();
        jcdao = new jugadorCartillaControlador();
    }
    
    private void mostrarCartilla() {
        dialogCartilla dlg_cartilla = new dialogCartilla(this, true);
        dlg_cartilla.setVisible(true);
    }

    // estableciendo las opciones iniciales
    private void opcionesIniciales() {
        int cant_jugadores = this.oi.getNumero_jugadores();
        int cant_tableros = this.oi.getNumero_tablas();

        // poniendo el numero de jugadores
        if (cant_jugadores == 2) {
            this.lblJugador1.setText("JUGADOR 1");
            this.lblJugador3.setText("JUGADOR 2");
            this.lblColor1.setBackground(new java.awt.Color(204, 0, 0));
            this.lblColor3.setBackground(new java.awt.Color(0, 102, 0));
            
            this.poniendoLabel(true, false, true, false);
            this.lblJugadorUnoUno.setBackground(new java.awt.Color(204, 0, 0));
            this.lblJugadorUnoUno.setForeground(new java.awt.Color(186, 217, 214));
            
            this.lblJugadorUnoDos.setBackground(new java.awt.Color(204, 0, 0));
            this.lblJugadorUnoDos.setForeground(new java.awt.Color(186, 217, 214));
            
            this.lblJugadorDosUno.setVisible(false);
            this.lblJugadorDosDos.setVisible(false);
            
            this.lblJugadorTresUno.setBackground(new java.awt.Color(0, 102, 0));
            this.lblJugadorTresUno.setForeground(new java.awt.Color(186, 217, 214));
            
            this.lblJugadorTresDos.setBackground(new java.awt.Color(0, 102, 0));
            this.lblJugadorTresDos.setForeground(new java.awt.Color(186, 217, 214));
            
            this.lblJugadorCuatroUno.setVisible(false);
            this.lblJugadorCuatroDos.setVisible(false);
        }
        
        if (cant_jugadores == 3) {
            this.lblJugador3.setText("JUGADOR 1");
            this.lblJugador2.setText("JUGADOR 2");
            this.lblJugador4.setText("JUGADOR 3");
            this.lblColor3.setBackground(new java.awt.Color(204, 0, 0));
            this.lblColor2.setBackground(new java.awt.Color(0, 102, 0));
            this.lblColor4.setBackground(new java.awt.Color(0, 0, 102));
            
            this.poniendoLabel(false, true, true, true);
            this.lblJugadorTresUno.setBackground(new java.awt.Color(204, 0, 0));
            this.lblJugadorTresUno.setForeground(new java.awt.Color(186, 217, 214));
            this.lblJugadorTresDos.setBackground(new java.awt.Color(204, 0, 0));
            this.lblJugadorTresDos.setForeground(new java.awt.Color(186, 217, 214));
            
            this.lblJugadorDosUno.setBackground(new java.awt.Color(0, 102, 0));
            this.lblJugadorDosUno.setForeground(new java.awt.Color(186, 217, 214));
            this.lblJugadorDosDos.setBackground(new java.awt.Color(0, 102, 0));
            this.lblJugadorDosDos.setForeground(new java.awt.Color(186, 217, 214));
            
            this.lblJugadorCuatroUno.setBackground(new java.awt.Color(0, 0, 102));
            this.lblJugadorCuatroUno.setForeground(new java.awt.Color(186, 217, 214));
            this.lblJugadorCuatroDos.setBackground(new java.awt.Color(0, 0, 102));
            this.lblJugadorCuatroDos.setForeground(new java.awt.Color(186, 217, 214));
            
            this.lblJugadorUnoUno.setVisible(false);
            this.lblJugadorUnoDos.setVisible(false);
        }
        
        if (cant_jugadores == 4) {
            poniendoLabel(true, true, true, true);
            this.lblJugadorUnoUno.setBackground(new java.awt.Color(204, 0, 0));
            this.lblJugadorUnoUno.setForeground(new java.awt.Color(186, 217, 214));
            this.lblJugadorUnoDos.setBackground(new java.awt.Color(204, 0, 0));
            this.lblJugadorUnoDos.setForeground(new java.awt.Color(186, 217, 214));
            
            this.lblJugadorDosUno.setBackground(new java.awt.Color(0, 102, 0));
            this.lblJugadorDosUno.setForeground(new java.awt.Color(186, 217, 214));
            this.lblJugadorDosDos.setBackground(new java.awt.Color(0, 102, 0));
            this.lblJugadorDosDos.setForeground(new java.awt.Color(186, 217, 214));
            
            this.lblJugadorTresUno.setBackground(new java.awt.Color(0, 0, 102));
            this.lblJugadorTresUno.setForeground(new java.awt.Color(186, 217, 214));
            this.lblJugadorTresDos.setBackground(new java.awt.Color(0, 0, 102));
            this.lblJugadorTresDos.setForeground(new java.awt.Color(186, 217, 214));
            
            this.lblJugadorCuatroUno.setBackground(new java.awt.Color(255,204,0));
            this.lblJugadorCuatroUno.setForeground(new java.awt.Color(186, 217, 214));
            this.lblJugadorCuatroDos.setBackground(new java.awt.Color(255,204,0));
            this.lblJugadorCuatroDos.setForeground(new java.awt.Color(186, 217, 214));
        }
        
        if (cant_tableros == 1) {
            this.lblJugadorUnoDos.setVisible(false);
            this.lblJugadorDosDos.setVisible(false);
            this.lblJugadorTresDos.setVisible(false);
            this.lblJugadorCuatroDos.setVisible(false);
        }
    }
    
    private void poniendoLabel(boolean f1, boolean f2, boolean f3, boolean f4){
        lblColor1.setVisible(f1);
        lblJugador1.setVisible(f1);
        lblColor2.setVisible(f2);
        lblJugador2.setVisible(f2);
        lblColor3.setVisible(f3);
        lblJugador3.setVisible(f3);
        lblColor4.setVisible(f4);
        lblJugador4.setVisible(f4);
    }
    
    /**
     * AQUI INICIAN LOS METODOS DE LA FUNCIONALIDAD DEL JUEGO
     */
    
    private void guardandoJugadores(){
        for (int i = 0; i < oi.getNumero_jugadores(); i++) {
            Jugador jug = new Jugador();
            jug.setId((i + 1));
            jug.setNombre("Jugador " + (i + 1));
            
            List<Integer> num_carts = new ArrayList<>();
            for (int j = 0; j < oi.getNumero_tablas(); j++) {
                jugador_cartillas jug_c = new jugador_cartillas();
                jug_c.setId((j + 1));
                jug_c.setId_jugador(jug.getId());
                // aignando la cartilla aleatoriamente
                
            }
        }
    }
    
    /**
     * FIN DE LOS METODOS DE LA FUNCIONALIDAD
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        lblColor1 = new javax.swing.JLabel();
        lblJugador1 = new javax.swing.JLabel();
        lblColor2 = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
        lblColor3 = new javax.swing.JLabel();
        lblJugador3 = new javax.swing.JLabel();
        lblColor4 = new javax.swing.JLabel();
        lblJugador4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        pnlSurPadre = new javax.swing.JPanel();
        pnlCentroPadre = new javax.swing.JPanel();
        pnlCentro = new javax.swing.JPanel();
        pnlJugadorArriba = new javax.swing.JPanel();
        lblJugadorUnoUno = new javax.swing.JLabel();
        lblJugadorUnoDos = new javax.swing.JLabel();
        pnlJuagadorAbajo = new javax.swing.JPanel();
        lblJugadorTresUno = new javax.swing.JLabel();
        lblJugadorTresDos = new javax.swing.JLabel();
        pnlJuagadorIzq = new javax.swing.JPanel();
        lblJugadorDosUno = new javax.swing.JLabel();
        lblJugadorDosDos = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblJugadorCuatroUno = new javax.swing.JLabel();
        lblJugadorCuatroDos = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 40, 40), 4));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(1, 3, 38));
        jPanel2.setPreferredSize(new java.awt.Dimension(736, 115));
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

        jPanel16.setBackground(new java.awt.Color(1, 3, 38));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel17.setBackground(new java.awt.Color(1, 3, 38));
        jPanel17.setPreferredSize(new java.awt.Dimension(15, 85));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel17, java.awt.BorderLayout.LINE_START);

        jPanel18.setBackground(new java.awt.Color(1, 3, 38));
        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 30));

        lblColor1.setBackground(new java.awt.Color(204, 0, 0));
        lblColor1.setForeground(new java.awt.Color(186, 217, 214));
        lblColor1.setOpaque(true);
        lblColor1.setPreferredSize(new java.awt.Dimension(15, 15));
        jPanel18.add(lblColor1);

        lblJugador1.setForeground(new java.awt.Color(186, 217, 214));
        lblJugador1.setText("JUGADOR 1");
        jPanel18.add(lblJugador1);

        lblColor2.setBackground(new java.awt.Color(0, 102, 0));
        lblColor2.setForeground(new java.awt.Color(186, 217, 214));
        lblColor2.setOpaque(true);
        lblColor2.setPreferredSize(new java.awt.Dimension(15, 15));
        jPanel18.add(lblColor2);

        lblJugador2.setForeground(new java.awt.Color(186, 217, 214));
        lblJugador2.setText("JUGADOR 2");
        jPanel18.add(lblJugador2);

        lblColor3.setBackground(new java.awt.Color(0, 0, 102));
        lblColor3.setForeground(new java.awt.Color(186, 217, 214));
        lblColor3.setOpaque(true);
        lblColor3.setPreferredSize(new java.awt.Dimension(15, 15));
        jPanel18.add(lblColor3);

        lblJugador3.setForeground(new java.awt.Color(186, 217, 214));
        lblJugador3.setText("JUGADOR 3");
        jPanel18.add(lblJugador3);

        lblColor4.setBackground(new java.awt.Color(255, 204, 0));
        lblColor4.setForeground(new java.awt.Color(186, 217, 214));
        lblColor4.setOpaque(true);
        lblColor4.setPreferredSize(new java.awt.Dimension(15, 15));
        jPanel18.add(lblColor4);

        lblJugador4.setForeground(new java.awt.Color(186, 217, 214));
        lblJugador4.setText("JUGADOR 4");
        jPanel18.add(lblJugador4);

        jPanel16.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(1, 3, 38));
        jPanel3.setPreferredSize(new java.awt.Dimension(736, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1047, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        pnlSurPadre.setBackground(new java.awt.Color(204, 0, 0));
        pnlSurPadre.setPreferredSize(new java.awt.Dimension(736, 50));

        javax.swing.GroupLayout pnlSurPadreLayout = new javax.swing.GroupLayout(pnlSurPadre);
        pnlSurPadre.setLayout(pnlSurPadreLayout);
        pnlSurPadreLayout.setHorizontalGroup(
            pnlSurPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1047, Short.MAX_VALUE)
        );
        pnlSurPadreLayout.setVerticalGroup(
            pnlSurPadreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel5.add(pnlSurPadre, java.awt.BorderLayout.PAGE_END);

        pnlCentroPadre.setLayout(new java.awt.BorderLayout());

        pnlCentro.setLayout(new java.awt.BorderLayout());

        pnlJugadorArriba.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJugadorArriba.setPreferredSize(new java.awt.Dimension(778, 120));
        pnlJugadorArriba.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 10));

        lblJugadorUnoUno.setBackground(new java.awt.Color(0, 0, 0));
        lblJugadorUnoUno.setForeground(new java.awt.Color(255, 255, 255));
        lblJugadorUnoUno.setText("jLabel4");
        lblJugadorUnoUno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJugadorUnoUno.setOpaque(true);
        lblJugadorUnoUno.setPreferredSize(new java.awt.Dimension(120, 100));
        lblJugadorUnoUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJugadorUnoUnoMouseClicked(evt);
            }
        });
        pnlJugadorArriba.add(lblJugadorUnoUno);

        lblJugadorUnoDos.setBackground(new java.awt.Color(0, 0, 0));
        lblJugadorUnoDos.setForeground(new java.awt.Color(255, 255, 255));
        lblJugadorUnoDos.setText("jLabel4");
        lblJugadorUnoDos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJugadorUnoDos.setOpaque(true);
        lblJugadorUnoDos.setPreferredSize(new java.awt.Dimension(120, 100));
        lblJugadorUnoDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJugadorUnoDosMouseClicked(evt);
            }
        });
        pnlJugadorArriba.add(lblJugadorUnoDos);

        pnlCentro.add(pnlJugadorArriba, java.awt.BorderLayout.PAGE_START);

        pnlJuagadorAbajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuagadorAbajo.setPreferredSize(new java.awt.Dimension(778, 120));
        pnlJuagadorAbajo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 10));

        lblJugadorTresUno.setBackground(new java.awt.Color(0, 0, 0));
        lblJugadorTresUno.setForeground(new java.awt.Color(255, 255, 255));
        lblJugadorTresUno.setText("jLabel4");
        lblJugadorTresUno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJugadorTresUno.setOpaque(true);
        lblJugadorTresUno.setPreferredSize(new java.awt.Dimension(120, 100));
        lblJugadorTresUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJugadorTresUnoMouseClicked(evt);
            }
        });
        pnlJuagadorAbajo.add(lblJugadorTresUno);

        lblJugadorTresDos.setBackground(new java.awt.Color(0, 0, 0));
        lblJugadorTresDos.setForeground(new java.awt.Color(255, 255, 255));
        lblJugadorTresDos.setText("jLabel4");
        lblJugadorTresDos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJugadorTresDos.setOpaque(true);
        lblJugadorTresDos.setPreferredSize(new java.awt.Dimension(120, 100));
        lblJugadorTresDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJugadorTresDosMouseClicked(evt);
            }
        });
        pnlJuagadorAbajo.add(lblJugadorTresDos);

        pnlCentro.add(pnlJuagadorAbajo, java.awt.BorderLayout.PAGE_END);

        pnlJuagadorIzq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlJuagadorIzq.setPreferredSize(new java.awt.Dimension(150, 235));
        pnlJuagadorIzq.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        lblJugadorDosUno.setBackground(new java.awt.Color(0, 0, 0));
        lblJugadorDosUno.setForeground(new java.awt.Color(255, 255, 255));
        lblJugadorDosUno.setText("jLabel4");
        lblJugadorDosUno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJugadorDosUno.setOpaque(true);
        lblJugadorDosUno.setPreferredSize(new java.awt.Dimension(120, 100));
        lblJugadorDosUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJugadorDosUnoMouseClicked(evt);
            }
        });
        pnlJuagadorIzq.add(lblJugadorDosUno);

        lblJugadorDosDos.setBackground(new java.awt.Color(0, 0, 0));
        lblJugadorDosDos.setForeground(new java.awt.Color(255, 255, 255));
        lblJugadorDosDos.setText("jLabel4");
        lblJugadorDosDos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJugadorDosDos.setOpaque(true);
        lblJugadorDosDos.setPreferredSize(new java.awt.Dimension(120, 100));
        lblJugadorDosDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJugadorDosDosMouseClicked(evt);
            }
        });
        pnlJuagadorIzq.add(lblJugadorDosDos);

        pnlCentro.add(pnlJuagadorIzq, java.awt.BorderLayout.LINE_START);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setPreferredSize(new java.awt.Dimension(150, 235));
        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        lblJugadorCuatroUno.setBackground(new java.awt.Color(0, 0, 0));
        lblJugadorCuatroUno.setForeground(new java.awt.Color(255, 255, 255));
        lblJugadorCuatroUno.setText("jLabel4");
        lblJugadorCuatroUno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJugadorCuatroUno.setOpaque(true);
        lblJugadorCuatroUno.setPreferredSize(new java.awt.Dimension(120, 100));
        lblJugadorCuatroUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJugadorCuatroUnoMouseClicked(evt);
            }
        });
        jPanel11.add(lblJugadorCuatroUno);

        lblJugadorCuatroDos.setBackground(new java.awt.Color(0, 0, 0));
        lblJugadorCuatroDos.setForeground(new java.awt.Color(255, 255, 255));
        lblJugadorCuatroDos.setText("jLabel4");
        lblJugadorCuatroDos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJugadorCuatroDos.setOpaque(true);
        lblJugadorCuatroDos.setPreferredSize(new java.awt.Dimension(120, 100));
        lblJugadorCuatroDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJugadorCuatroDosMouseClicked(evt);
            }
        });
        jPanel11.add(lblJugadorCuatroDos);

        pnlCentro.add(jPanel11, java.awt.BorderLayout.LINE_END);

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setPreferredSize(new java.awt.Dimension(250, 250));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setPreferredSize(new java.awt.Dimension(248, 60));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        jLabel3.setText("jLabel3");
        jPanel10.add(jLabel3);

        jPanel9.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setPreferredSize(new java.awt.Dimension(40, 188));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel13, java.awt.BorderLayout.LINE_END);

        jPanel14.setPreferredSize(new java.awt.Dimension(40, 188));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel14, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel9);

        pnlCentro.add(jPanel8, java.awt.BorderLayout.CENTER);

        pnlCentroPadre.add(pnlCentro, java.awt.BorderLayout.CENTER);

        jPanel5.add(pnlCentroPadre, java.awt.BorderLayout.CENTER);

        jPanel6.setPreferredSize(new java.awt.Dimension(150, 100));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, java.awt.BorderLayout.EAST);

        jPanel7.setPreferredSize(new java.awt.Dimension(150, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7, java.awt.BorderLayout.WEST);

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            this.dispose();
            new MenuPrincipal().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(frmJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblJugadorUnoUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJugadorUnoUnoMouseClicked
        this.mostrarCartilla();
    }//GEN-LAST:event_lblJugadorUnoUnoMouseClicked

    private void lblJugadorUnoDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJugadorUnoDosMouseClicked
        this.mostrarCartilla();
    }//GEN-LAST:event_lblJugadorUnoDosMouseClicked

    private void lblJugadorDosUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJugadorDosUnoMouseClicked
        this.mostrarCartilla();
    }//GEN-LAST:event_lblJugadorDosUnoMouseClicked

    private void lblJugadorDosDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJugadorDosDosMouseClicked
        this.mostrarCartilla();
    }//GEN-LAST:event_lblJugadorDosDosMouseClicked

    private void lblJugadorTresUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJugadorTresUnoMouseClicked
        this.mostrarCartilla();
    }//GEN-LAST:event_lblJugadorTresUnoMouseClicked

    private void lblJugadorTresDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJugadorTresDosMouseClicked
        this.mostrarCartilla();
    }//GEN-LAST:event_lblJugadorTresDosMouseClicked

    private void lblJugadorCuatroUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJugadorCuatroUnoMouseClicked
        this.mostrarCartilla();
    }//GEN-LAST:event_lblJugadorCuatroUnoMouseClicked

    private void lblJugadorCuatroDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJugadorCuatroDosMouseClicked
        this.mostrarCartilla();
    }//GEN-LAST:event_lblJugadorCuatroDosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.opcionesIniciales();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmJuego().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblColor1;
    private javax.swing.JLabel lblColor2;
    private javax.swing.JLabel lblColor3;
    private javax.swing.JLabel lblColor4;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblJugador3;
    private javax.swing.JLabel lblJugador4;
    private javax.swing.JLabel lblJugadorCuatroDos;
    private javax.swing.JLabel lblJugadorCuatroUno;
    private javax.swing.JLabel lblJugadorDosDos;
    private javax.swing.JLabel lblJugadorDosUno;
    private javax.swing.JLabel lblJugadorTresDos;
    private javax.swing.JLabel lblJugadorTresUno;
    private javax.swing.JLabel lblJugadorUnoDos;
    private javax.swing.JLabel lblJugadorUnoUno;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlCentroPadre;
    private javax.swing.JPanel pnlJuagadorAbajo;
    private javax.swing.JPanel pnlJuagadorIzq;
    private javax.swing.JPanel pnlJugadorArriba;
    private javax.swing.JPanel pnlSurPadre;
    // End of variables declaration//GEN-END:variables
}
