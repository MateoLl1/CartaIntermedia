/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.Conexion;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class frmVistaJuego extends javax.swing.JFrame {

    int bucle = 0;
    public static int valor1, valor3;
    public int valor2;
    public int contador = 0, segInt = 0;
    static int[] saldojugador = new int[3];

    public frmVistaJuego() {
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/Cartainc.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/Cartainc.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/Cartainc.jpg");
        lblJug1.setText(frmRegistro.userReg);
        lblJug2.setText(frmJugadores.combo1);
        lblJug3.setText(frmJugadores.combo2);
        lblNumSala.setText(String.valueOf(frmJugadores.sala));
        lblValorMesa.setText(frmJugadores.saldoMesa);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblJug1 = new javax.swing.JLabel();
        lblJug2 = new javax.swing.JLabel();
        lblJug3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtValorAp = new javax.swing.JTextField();
        lblCarta1 = new javax.swing.JLabel();
        lblCarta2 = new javax.swing.JLabel();
        lblCarta3 = new javax.swing.JLabel();
        btnRepartir = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        lblValorJug2 = new javax.swing.JLabel();
        lblValorJug3 = new javax.swing.JLabel();
        lblValorJug1 = new javax.swing.JLabel();
        lblValorMesa = new javax.swing.JLabel();
        lblNumSala = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Valor total en mesa");

        lblJug1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblJug1.setText("JUGADOR 1");

        lblJug2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblJug2.setText("JUGADOR 2");

        lblJug3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblJug3.setText("JUGADOR 3");

        jPanel2.setBackground(new java.awt.Color(51, 102, 0));

        jLabel7.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel7.setText("Valor de apuesta:");

        txtValorAp.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N

        lblCarta1.setText("jLabel8");

        lblCarta2.setText("jLabel9");

        lblCarta3.setText("jLabel10");

        btnRepartir.setBackground(new java.awt.Color(0, 102, 102));
        btnRepartir.setForeground(new java.awt.Color(255, 255, 255));
        btnRepartir.setText("Repartir");
        btnRepartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepartirActionPerformed(evt);
            }
        });

        btnJugar.setBackground(new java.awt.Color(102, 0, 51));
        btnJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnJugar.setText("Apostar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(lblCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(lblCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorAp, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnRepartir)
                        .addGap(88, 88, 88)
                        .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRepartir)
                    .addComponent(btnJugar))
                .addGap(24, 24, 24))
        );

        lblValorJug2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblValorJug2.setForeground(new java.awt.Color(255, 255, 0));

        lblValorJug3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblValorJug3.setForeground(new java.awt.Color(255, 255, 0));

        lblValorJug1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblValorJug1.setForeground(new java.awt.Color(255, 255, 0));

        lblValorMesa.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        lblValorMesa.setForeground(new java.awt.Color(0, 204, 0));

        lblNumSala.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblNumSala.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValorMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblJug1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValorJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblJug2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblJug3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorJug3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNumSala, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValorMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNumSala, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblValorJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJug1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblJug2)
                                .addComponent(lblValorJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJug3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorJug3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRepartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepartirActionPerformed
        lblJug1.setForeground(Color.BLACK);
        lblJug2.setForeground(Color.BLACK);
        lblJug3.setForeground(Color.BLACK);
        bucle = 1;

        while (bucle <= 51) {
            Random num1 = new Random();
            valor1 = 1 + num1.nextInt(12);
            valor3 = 1 + num1.nextInt(12);
            bucle++;
        }

        //1ra Carta
        if (valor1 == 1) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/ases.jpg");
        }
        if (valor1 == 2) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/dos.jpg");
        }
        if (valor1 == 3) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/tres.jpg");
        }
        if (valor1 == 4) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/cuatro.jpg");
        }
        if (valor1 == 5) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/cinco.jpg");
        }
        if (valor1 == 6) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/seis.png");
        }
        if (valor1 == 7) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/siete.jpg");
        }
        if (valor1 == 8) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/ocho.png");
        }
        if (valor1 == 9) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/nueve.jpg");
        }
        if (valor1 == 10) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/diez.jpg");
        }
        if (valor1 == 11) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/jota.jpg");
        }
        if (valor1 == 12) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/Q.jpg");
        }
        if (valor1 == 13) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/Kpng.jpg");

        }

        //3ra Carta 
        if (valor3 == 1) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/ases.jpg");
        }
        if (valor3 == 2) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/dos.jpg");
        }
        if (valor3 == 3) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/tres.jpg");
        }
        if (valor3 == 4) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/cuatro.jpg");
        }
        if (valor3 == 5) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/cinco.jpg");
        }
        if (valor3 == 6) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/seis.png");
        }
        if (valor3 == 7) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/siete.jpg");
        }
        if (valor3 == 8) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/ocho.png");
        }
        if (valor3 == 9) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/nueve.jpg");
        }
        if (valor3 == 10) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/diez.jpg");
        }
        if (valor3 == 11) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/jota.jpg");
        }
        if (valor3 == 12) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/Q.jpg");
        }
        if (valor3 == 13) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/Kpng.jpg");
        }

        //TURNO JUGADOR
        contador++;
        if (segInt == 1) {
            contador--;
        }

        if (contador == 1) {
            lblJug1.setForeground(Color.red);
        } else if (contador == 2) {
            lblJug2.setForeground(Color.red);
        } else if (contador == 3) {
            lblJug3.setForeground(Color.red);
            contador = 0;
        }

        if (contador == 0) {
            lblJug3.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnRepartirActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        try {
            String apuesta = txtValorAp.getText();
            int apuestaIn, mesaIn;
            apuestaIn = Integer.parseInt(apuesta);
            mesaIn = Integer.parseInt(lblValorMesa.getText());
            segInt = 0;
            bucle = 1;
            while (bucle <= 51) {
                Random num1 = new Random();
                valor2 = 1 + num1.nextInt(12);
                bucle++;
            }
            //2da Carta
            if (valor2 == 1) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/ases.jpg");
            }
            if (valor2 == 2) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/dos.jpg");
            }
            if (valor2 == 3) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/tres.jpg");
            }
            if (valor2 == 4) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/cuatro.jpg");
            }
            if (valor2 == 5) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/cinco.jpg");
            }
            if (valor2 == 6) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/seis.png");
            }
            if (valor2 == 7) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/siete.jpg");
            }
            if (valor2 == 8) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/ocho.png");
            }
            if (valor2 == 9) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/nueve.jpg");
            }
            if (valor2 == 10) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/diez.jpg");
            }
            if (valor2 == 11) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/jota.jpg");
            }
            if (valor2 == 12) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/Q.jpg");
            }
            if (valor2 == 13) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/Kpng.jpg");
            }

            if (txtValorAp.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese una apuesta");
                segInt = 1;
            } else if (apuestaIn < 0) {
                JOptionPane.showMessageDialog(null, "Apueste valores positivos");
                segInt = 1;
            } else if (mesaIn <= 0) {
                JOptionPane.showMessageDialog(null, "Juego terminado");
                System.exit(0);
            } else {
                //APOSTAR
                if ((valor2 > valor1) && (valor2 < valor3)) {       // Cuando C2 es mayor a C1 Y C2 es menor a C3  GANO
                    JOptionPane.showMessageDialog(this, "¡Ha Ganado!");
                    mesaIn = mesaIn - apuestaIn;
                    lblValorMesa.setText(String.valueOf(mesaIn));

                    if (contador == 1) {
                        saldojugador[0] = saldojugador[0] + apuestaIn;
                        lblValorJug1.setText(String.valueOf(saldojugador[0]));
                        Conexion.infoJuego(lblJug1.getText(),lblValorJug1.getText(),lblValorMesa.getText());
                    }
                    if (contador == 2) {
                        saldojugador[1] = saldojugador[1] + apuestaIn;
                        lblValorJug2.setText(String.valueOf(saldojugador[1]));
                        Conexion.infoJuego(lblJug2.getText(),lblValorJug2.getText(),lblValorMesa.getText());
                    }
                    if (contador == 3 || contador == 0) {
                        saldojugador[2] = saldojugador[2] + apuestaIn;
                        lblValorJug3.setText(String.valueOf(saldojugador[2]));
                        Conexion.infoJuego(lblJug3.getText(),lblValorJug2.getText(),lblValorMesa.getText());
                    }
                }

                if ((valor2 < valor1) && (valor2 > valor3)) {       // Cuando C2 es menor a C1 Y C2 es mayor a C3  GANO
                    JOptionPane.showMessageDialog(this, "¡Ha Ganado!");
                    mesaIn = mesaIn - apuestaIn;
                    lblValorMesa.setText(String.valueOf(mesaIn));
                    if (contador == 1) {
                        saldojugador[0] = saldojugador[0] + apuestaIn;
                        lblValorJug1.setText(String.valueOf(saldojugador[0]));
                        Conexion.infoJuego(lblJug1.getText(),lblValorJug1.getText(),lblValorMesa.getText());
                    }
                    if (contador == 2) {
                        saldojugador[1] = saldojugador[1] + apuestaIn;
                        lblValorJug2.setText(String.valueOf(saldojugador[1]));
                        Conexion.infoJuego(lblJug2.getText(),lblValorJug2.getText(),lblValorMesa.getText());
                    }
                    if (contador == 3 || contador == 0) {
                        saldojugador[2] = saldojugador[2] + apuestaIn;
                        lblValorJug3.setText(String.valueOf(saldojugador[2]));
                        Conexion.infoJuego(lblJug3.getText(),lblValorJug3.getText(),lblValorMesa.getText());
                    }
                }

                if ((valor1 - valor3 == 1) || (valor3 - valor1 == 1)) {   //Cuando C1 y C3 son consecutivas O C3 y C1 son consecutivas
                    JOptionPane.showMessageDialog(this, "REPARTA DE NUEVO");
                    segInt = 1;

                } else if (valor1 == valor3) {      //Cuando C1 y C3 son iguales
                    JOptionPane.showMessageDialog(null, "Ha perdido");
                    mesaIn = mesaIn + apuestaIn;
                    lblValorMesa.setText(String.valueOf(mesaIn));
                    apuestaIn *= -1;
                    if (contador == 1) {
                        saldojugador[0] = saldojugador[0] + apuestaIn;
                        lblValorJug1.setText(String.valueOf(saldojugador[0]));
                        Conexion.infoJuego(lblJug1.getText(),lblValorJug1.getText(),lblValorMesa.getText());
                    }
                    if (contador == 2) {
                        saldojugador[1] = saldojugador[1] + apuestaIn;
                        lblValorJug2.setText(String.valueOf(saldojugador[1]));
                        Conexion.infoJuego(lblJug2.getText(),lblValorJug2.getText(),lblValorMesa.getText());
                    }
                    if (contador == 3 || contador == 0) {
                        saldojugador[2] = saldojugador[2] + apuestaIn;
                        lblValorJug3.setText(String.valueOf(saldojugador[2]));
                        Conexion.infoJuego(lblJug3.getText(),lblValorJug3.getText(),lblValorMesa.getText());
                    }

                    /*frmCartaIgual obj1 = new frmCartaIgual();
            obj1.setVisible(true);
            this.setVisible(false);*/
                } else if ((valor2 > valor1) && (valor2 > valor3)) {       // Cuando  C2 es mayor a C1 Y C2  es mayor a C3 PERDIO
                    JOptionPane.showMessageDialog(this, "¡Ha Perdido!");
                    mesaIn = mesaIn + apuestaIn;
                    lblValorMesa.setText(String.valueOf(mesaIn));
                    apuestaIn *= -1;
                    if (contador == 1) {
                        saldojugador[0] = saldojugador[0] + apuestaIn;
                        lblValorJug1.setText(String.valueOf(saldojugador[0]));
                        Conexion.infoJuego(lblJug1.getText(),lblValorJug1.getText(),lblValorMesa.getText());
                    }
                    if (contador == 2) {
                        saldojugador[1] = saldojugador[1] + apuestaIn;
                        lblValorJug2.setText(String.valueOf(saldojugador[1]));
                        Conexion.infoJuego(lblJug2.getText(),lblValorJug2.getText(),lblValorMesa.getText());
                    }
                    if (contador == 3 || contador == 0) {
                        saldojugador[2] = saldojugador[2] + apuestaIn;
                        lblValorJug3.setText(String.valueOf(saldojugador[2]));
                        Conexion.infoJuego(lblJug3.getText(),lblValorJug3.getText(),lblValorMesa.getText());
                    }

                } else if ((valor2 < valor1) && (valor2 < valor3)) {       // Cuando  C2 es menor a C1 Y C2 es menor a C3  PERDIO
                    JOptionPane.showMessageDialog(this, "¡Ha Perdido!");
                    mesaIn = mesaIn + apuestaIn;
                    lblValorMesa.setText(String.valueOf(mesaIn));
                    apuestaIn *= -1;
                    if (contador == 1) {
                        saldojugador[0] = saldojugador[0] + apuestaIn;
                        lblValorJug1.setText(String.valueOf(saldojugador[0]));
                        Conexion.infoJuego(lblJug1.getText(),lblValorJug1.getText(),lblValorMesa.getText());
                    }
                    if (contador == 2) {
                        saldojugador[1] = saldojugador[1] + apuestaIn;
                        lblValorJug2.setText(String.valueOf(saldojugador[1]));
                        Conexion.infoJuego(lblJug2.getText(),lblValorJug2.getText(),lblValorMesa.getText());
                    }
                    if (contador == 3 || contador == 0) {
                        saldojugador[2] = saldojugador[2] + apuestaIn;
                        lblValorJug3.setText(String.valueOf(saldojugador[2]));
                        Conexion.infoJuego(lblJug3.getText(),lblValorJug3.getText(),lblValorMesa.getText());
                    }

                } else if ((valor1 == valor2) || (valor3 == valor2)) {       //Cuando C1 es igual a C2 O C3 es igual a C2
                    JOptionPane.showMessageDialog(this, "||Ha Perdido el doble||");
                    apuestaIn *= 2;
                    mesaIn = mesaIn + apuestaIn;
                    lblValorMesa.setText(String.valueOf(mesaIn));
                    apuestaIn *= -1;
                    if (contador == 1) {
                        saldojugador[0] = saldojugador[0] + apuestaIn;
                        lblValorJug1.setText(String.valueOf(saldojugador[0]));
                        Conexion.infoJuego(lblJug1.getText(),lblValorJug1.getText(),lblValorMesa.getText());
                    }
                    if (contador == 2) {
                        saldojugador[1] = saldojugador[1] + apuestaIn;
                        lblValorJug2.setText(String.valueOf(saldojugador[1]));
                        Conexion.infoJuego(lblJug2.getText(),lblValorJug2.getText(),lblValorMesa.getText());
                    }
                    if (contador == 3 || contador == 0) {
                        saldojugador[2] = saldojugador[2] + apuestaIn;
                        lblValorJug3.setText(String.valueOf(saldojugador[2]));
                        Conexion.infoJuego(lblJug3.getText(),lblValorJug3.getText(),lblValorMesa.getText());
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Apuesta no valida");
        }

        rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta1, "src/imagenes/Cartainc.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta2, "src/imagenes/Cartainc.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblCarta3, "src/imagenes/Cartainc.jpg");
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmVistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVistaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnRepartir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCarta1;
    private javax.swing.JLabel lblCarta2;
    private javax.swing.JLabel lblCarta3;
    private javax.swing.JLabel lblJug1;
    private javax.swing.JLabel lblJug2;
    private javax.swing.JLabel lblJug3;
    private javax.swing.JLabel lblNumSala;
    private javax.swing.JLabel lblValorJug1;
    private javax.swing.JLabel lblValorJug2;
    private javax.swing.JLabel lblValorJug3;
    private javax.swing.JLabel lblValorMesa;
    private javax.swing.JTextField txtValorAp;
    // End of variables declaration//GEN-END:variables

}
