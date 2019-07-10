/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import javax.swing.table.DefaultTableModel;
import modelo.Animal;
import modeloDAO.AnimalDAO;

/**
 *
 * @author ilzi
 */
public class TelaAnimal extends javax.swing.JFrame {

    /**
     * Creates new form TelaAnimal
     */
    String modo;

    TelaBuscaCliente tbc;

    public TelaAnimal() {
        initComponents();
        listarTabela();

        modo = "Navegar";

        ManipulaInterface();

    }

    public void listarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaAnimal.getModel();
        modelo.setNumRows(0);

        AnimalDAO dao = new AnimalDAO();

        dao.listar().forEach((a) -> {
            modelo.addRow(new Object[]{
                a.getIdAnimal(),
                a.getNome(),
                a.getCliente().getId(),
                a.getCliente().getNome(),
                a.getDataNasc(),
                a.getSexo(),
                a.getCor(),
                a.getRaca()

            });
        });

    }

    public void listarTabelaPorNome(String name) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaAnimal.getModel();
        modelo.setNumRows(0);

        AnimalDAO animDao = new AnimalDAO();

        animDao.listarPorNome(name).forEach((a) -> {
            modelo.addRow(new Object[]{
                a.getIdAnimal(),
                a.getNome(),
                a.getCliente().getId(),
                a.getCliente().getNome(),
                a.getDataNasc(),
                a.getSexo(),
                a.getCor(),
                a.getRaca()

            });
        });

    }

    public void ManipulaInterface() {
        switch (modo) {
            case "Navegar":
                txtIdAnimal.setEnabled(false);
                txtNomeAnimal.setEnabled(false);
                txtNascAnimal.setEnabled(false);
                txtCorAnimal.setEnabled(false);
                txtRaca.setEnabled(false);
                txtNomeDono.setEnabled(false);
                txtIdDono.setEnabled(false);
                comboBoxSexoAnimal.setEnabled(false);

                btncadastrarAnimal.setEnabled(true);
                btnSalvarAnimal1.setEnabled(false);
                btnAtualizarAnimal.setEnabled(false);
                btnExcluirAnimal.setEnabled(false);
                btnSelecionarAnimal.setEnabled(false);
                btnCancelar.setEnabled(false);

                break;

            case "Salvar":
                txtIdAnimal.setEnabled(true);
                txtNomeAnimal.setEnabled(true);
                txtNascAnimal.setEnabled(true);
                txtCorAnimal.setEnabled(true);
                txtRaca.setEnabled(true);
                txtNomeDono.setEnabled(true);
                txtIdDono.setEnabled(true);
                comboBoxSexoAnimal.setEnabled(true);

                btncadastrarAnimal.setEnabled(false);
                btnSalvarAnimal1.setEnabled(true);
                btnAtualizarAnimal.setEnabled(false);
                btnExcluirAnimal.setEnabled(false);
                btnCancelar.setEnabled(true);

                break;

            case "Atualizar":
                txtIdAnimal.setEnabled(true);
                txtNomeAnimal.setEnabled(true);
                txtNascAnimal.setEnabled(true);
                txtCorAnimal.setEnabled(true);
                txtRaca.setEnabled(true);
                txtNomeDono.setEnabled(true);
                txtIdDono.setEnabled(true);
                comboBoxSexoAnimal.setEnabled(true);

                btncadastrarAnimal.setEnabled(false);
                btnSalvarAnimal1.setEnabled(true);
                btnAtualizarAnimal.setEnabled(false);
                btnExcluirAnimal.setEnabled(false);

                break;

            case "Ativar":
                txtIdAnimal.setEnabled(true);
                txtNomeAnimal.setEnabled(true);
                txtNascAnimal.setEnabled(true);
                txtCorAnimal.setEnabled(true);
                txtRaca.setEnabled(true);
                txtNomeDono.setEnabled(true);
                txtIdDono.setEnabled(true);
                comboBoxSexoAnimal.setEnabled(true);

                btncadastrarAnimal.setEnabled(false);
                btnSalvarAnimal1.setEnabled(false);
                btnAtualizarAnimal.setEnabled(true);
                btnExcluirAnimal.setEnabled(false);

                break;

            case "Selecao":
                
                txtIdAnimal.setEnabled(false);
                txtNomeAnimal.setEnabled(false);
                txtNascAnimal.setEnabled(false);
                txtCorAnimal.setEnabled(false);
                txtRaca.setEnabled(false);
                txtNomeDono.setEnabled(false);
                txtIdDono.setEnabled(false);
                comboBoxSexoAnimal.setEnabled(false);

                btncadastrarAnimal.setEnabled(false);
                btnSalvarAnimal1.setEnabled(false);
                btnAtualizarAnimal.setEnabled(false);
                btnExcluirAnimal.setEnabled(true);
                btnSelecionarAnimal.setEnabled(true);
                btnCancelar.setEnabled(true);

                break;

            default:
                System.out.println("modo invalido");

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedCadastroAnimal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdAnimal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomeAnimal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboBoxSexoAnimal = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCorAnimal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNomeDono = new javax.swing.JTextField();
        txtIdDono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAtualizarAnimal = new javax.swing.JButton();
        btnSalvarAnimal1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtRaca = new javax.swing.JTextField();
        btncadastrarAnimal = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNascAnimal = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAnimal = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtBuscarNome = new javax.swing.JTextField();
        btnSelecionarAnimal = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnExcluirAnimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(153, 204, 255));

        jLabel1.setText("ID");

        txtIdAnimal.setEditable(false);
        txtIdAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtIdAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAnimalActionPerformed(evt);
            }
        });

        jLabel2.setText("NOME");

        txtNomeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAnimalActionPerformed(evt);
            }
        });

        jLabel3.setText("NASCIMENTO");

        jLabel4.setText("SEXO");

        comboBoxSexoAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "F", "M" }));
        comboBoxSexoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSexoAnimalActionPerformed(evt);
            }
        });

        jLabel5.setText("COR");

        jLabel6.setText("DONO");

        txtNomeDono.setEditable(false);
        txtNomeDono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDonoActionPerformed(evt);
            }
        });

        txtIdDono.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("CADASTRO DE ANIMAIS");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/pesq.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAtualizarAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAtualizarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/salvar.png"))); // NOI18N
        btnAtualizarAnimal.setText("Atualizar");
        btnAtualizarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarAnimalActionPerformed(evt);
            }
        });

        btnSalvarAnimal1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvarAnimal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/salvar.png"))); // NOI18N
        btnSalvarAnimal1.setText("Salvar");
        btnSalvarAnimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAnimal1ActionPerformed(evt);
            }
        });

        jLabel7.setText("RAÇA");

        btncadastrarAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncadastrarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/salvar.png"))); // NOI18N
        btncadastrarAnimal.setText("Novo");
        btncadastrarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarAnimalActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/salvar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        try {
            txtNascAnimal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdAnimal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNascAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNomeAnimal)
                                        .addGap(120, 120, 120))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(comboBoxSexoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtCorAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel5))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtNomeDono, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtIdDono, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jButton1))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(btncadastrarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSalvarAnimal1)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAtualizarAnimal)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCancelar)))
                                        .addContainerGap(50, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxSexoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCorAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNomeDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNascAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarAnimal1)
                    .addComponent(btnAtualizarAnimal)
                    .addComponent(btncadastrarAnimal)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        tabbedCadastroAnimal.addTab("Gerenciar Animal", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        tabelaAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabelaAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "ID DONO", "NOME DONO", "NASCIMENTO", "SEXO", "COR", "RAÇA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAnimalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAnimal);
        if (tabelaAnimal.getColumnModel().getColumnCount() > 0) {
            tabelaAnimal.getColumnModel().getColumn(0).setResizable(false);
            tabelaAnimal.getColumnModel().getColumn(1).setResizable(false);
            tabelaAnimal.getColumnModel().getColumn(2).setResizable(false);
            tabelaAnimal.getColumnModel().getColumn(3).setResizable(false);
            tabelaAnimal.getColumnModel().getColumn(4).setResizable(false);
            tabelaAnimal.getColumnModel().getColumn(5).setResizable(false);
            tabelaAnimal.getColumnModel().getColumn(6).setResizable(false);
            tabelaAnimal.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("PESQUISAR POR NOME");

        btnSelecionarAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSelecionarAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/salvar.png"))); // NOI18N
        btnSelecionarAnimal.setText("Selecionar");
        btnSelecionarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarAnimalActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/pesq.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnExcluirAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluirAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/salvar.png"))); // NOI18N
        btnExcluirAnimal.setText("Excluir");
        btnExcluirAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAnimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(btnSelecionarAnimal)
                        .addGap(117, 117, 117)
                        .addComponent(btnExcluirAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSelecionarAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedCadastroAnimal.addTab("Animais Cadastrados", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedCadastroAnimal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedCadastroAnimal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAnimalMouseClicked
        // TODO add your handling code here:
        modo = "Selecao";
        ManipulaInterface();


    }//GEN-LAST:event_tabelaAnimalMouseClicked

    private void btncadastrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarAnimalActionPerformed
        // TODO add your handling code here:
        modo = "Salvar";
        ManipulaInterface();
    }//GEN-LAST:event_btncadastrarAnimalActionPerformed

    private void btnExcluirAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAnimalActionPerformed
        // TODO add your handling code here:
        if (tabelaAnimal.getSelectedRow() != -1) {

            Animal a = new Animal();
            AnimalDAO dao = new AnimalDAO();

            a.setIdAnimal((int) tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 0));

            dao.excluir(a);

            txtCorAnimal.setText("");
            txtIdAnimal.setText("");
            txtNascAnimal.setText("");
            txtNomeAnimal.setText("");
            txtNomeDono.setText("");
            txtIdDono.setText("");
            txtRaca.setText("");
            comboBoxSexoAnimal.setSelectedIndex(0);

            listarTabela();

            modo = "Navegar";
            ManipulaInterface();

        }

    }//GEN-LAST:event_btnExcluirAnimalActionPerformed

    private void btnSalvarAnimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAnimal1ActionPerformed
        // TODO add your handling code here:

        Animal a = new Animal();
        AnimalDAO dao = new AnimalDAO();

        a.setNome(txtNomeAnimal.getText());
        a.setDataNasc(txtNascAnimal.getText());
        a.setCor(txtCorAnimal.getText());
        a.setRaca(txtRaca.getText());
        a.setSexo((String) comboBoxSexoAnimal.getSelectedItem());

        modelo.Cliente donoAnimal = new modelo.Cliente();
        donoAnimal.setId(Integer.parseInt(tbc.idCliente));
        //donoAnimal.setNome(tbc.nomeCliente);

        a.setCliente(donoAnimal);

        dao.inserir(a);

        txtCorAnimal.setText("");
        txtIdAnimal.setText("");
        txtNascAnimal.setText("");
        txtNomeAnimal.setText("");
        txtNomeDono.setText("");
        txtIdDono.setText("");
        txtRaca.setText("");
        comboBoxSexoAnimal.setSelectedIndex(0);

        listarTabela();

        modo = "Navegar";
        ManipulaInterface();

    }//GEN-LAST:event_btnSalvarAnimal1ActionPerformed

    private void btnAtualizarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarAnimalActionPerformed
        // TODO add your handling code here:
        if (tabelaAnimal.getSelectedRow() != -1) {

            Animal a = new Animal();
            AnimalDAO dao = new AnimalDAO();

            a.setIdAnimal(Integer.parseInt(txtIdAnimal.getText()));
            a.setNome(txtNomeAnimal.getText());
            a.setDataNasc(txtNascAnimal.getText());
            a.setCor(txtCorAnimal.getText());
            a.setRaca(txtRaca.getText());
            a.setSexo((String) comboBoxSexoAnimal.getSelectedItem());

            modelo.Cliente donoAnimal = new modelo.Cliente();

            donoAnimal.setId(Integer.parseInt(txtIdDono.getText()));
            donoAnimal.setNome(txtNomeDono.getText());

            a.setCliente(donoAnimal);

            dao.atualizar(a);

            txtCorAnimal.setText("");
            txtIdAnimal.setText("");
            txtNascAnimal.setText("");
            txtNomeAnimal.setText("");
            txtNomeDono.setText("");
            txtIdDono.setText("");
            txtRaca.setText("");
            comboBoxSexoAnimal.setSelectedIndex(0);

            listarTabela();

            modo = "Navegar";
            ManipulaInterface();

        }

    }//GEN-LAST:event_btnAtualizarAnimalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tbc = new TelaBuscaCliente(this, true);

        tbc.setVisible(true);

        txtNomeDono.setText(tbc.nomeCliente);
        txtIdDono.setText(tbc.idCliente);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNomeDonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDonoActionPerformed

    private void txtNomeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAnimalActionPerformed

    private void txtIdAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAnimalActionPerformed
        // TODO add your handling code here:
        txtIdAnimal.setEnabled(false);
    }//GEN-LAST:event_txtIdAnimalActionPerformed

    private void comboBoxSexoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSexoAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSexoAnimalActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        listarTabelaPorNome(txtBuscarNome.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSelecionarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarAnimalActionPerformed
        // TODO add your handling code here:
        if (tabelaAnimal.getSelectedRow() != -1) {

            txtIdAnimal.setText(tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 0).toString());
            txtNomeAnimal.setText(tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 1).toString());
            txtIdDono.setText(tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 2).toString());
            txtNomeDono.setText(tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 3).toString());
            txtNascAnimal.setText(tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 4).toString());
            comboBoxSexoAnimal.setSelectedItem(tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 5).toString());
            txtCorAnimal.setText(tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 6).toString());
            txtRaca.setText(tabelaAnimal.getValueAt(tabelaAnimal.getSelectedRow(), 7).toString());
            //txtEstadoCliente.getSelectedItem((tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0x4).toString());

            modo = "Ativar";
            ManipulaInterface();
            tabbedCadastroAnimal.setSelectedIndex(0);

        }
    }//GEN-LAST:event_btnSelecionarAnimalActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        
            txtCorAnimal.setText("");
            txtIdAnimal.setText("");
            txtNascAnimal.setText("");
            txtNomeAnimal.setText("");
            txtNomeDono.setText("");
            txtIdDono.setText("");
            txtRaca.setText("");
            comboBoxSexoAnimal.setSelectedIndex(0);
            
            modo = "Navegar";
            ManipulaInterface();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNascAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNascAnimalActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarAnimal;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluirAnimal;
    private javax.swing.JButton btnSalvarAnimal1;
    private javax.swing.JButton btnSelecionarAnimal;
    private javax.swing.JButton btncadastrarAnimal;
    private javax.swing.JComboBox<String> comboBoxSexoAnimal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabbedCadastroAnimal;
    private javax.swing.JTable tabelaAnimal;
    private javax.swing.JTextField txtBuscarNome;
    private javax.swing.JTextField txtCorAnimal;
    private javax.swing.JTextField txtIdAnimal;
    private javax.swing.JTextField txtIdDono;
    private javax.swing.JFormattedTextField txtNascAnimal;
    private javax.swing.JTextField txtNomeAnimal;
    private javax.swing.JTextField txtNomeDono;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables
}
