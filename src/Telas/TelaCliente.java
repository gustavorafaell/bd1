/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Cliente;
import modeloDAO.ClienteDAO;

/**
 *
 * @author gustavo
 */
public class TelaCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCliente
     */
    String modo;

    public TelaCliente() {
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) tabelaCliente.getModel();
        tabelaCliente.setRowSorter(new TableRowSorter(modelo));

        listarTabela();

        modo = "Navegar";
        ManipulaInterface();
    }

    String codCliente;

    public void listarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaCliente.getModel();
        modelo.setNumRows(0);

        ClienteDAO cdao = new ClienteDAO();

        cdao.listar().forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getCpf(),
                c.getNome(),
                c.getTelefone(),
                c.getEndereco(),
                c.getCidade(),
                c.getEstado()

            });
        });

    }

    public void listarTabelaPorNome(String name) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaCliente.getModel();
        modelo.setNumRows(0);

        ClienteDAO cdao = new ClienteDAO();

        cdao.listarPorNome(name).forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getCpf(),
                c.getNome(),
                c.getTelefone(),
                c.getEndereco(),
                c.getCidade(),
                c.getEstado()

            });
        });

    }

    public void ManipulaInterface() {
        switch (modo) {
            case "Navegar":
                txtIdCliente.setEnabled(false);
                txtNomeCliente.setEnabled(false);
                txtCpfcliente.setEnabled(false);
                txtTelefoneCliente.setEnabled(false);
                txtEnderecoCliente.setEnabled(false);
                txtCidadeCliente.setEnabled(false);
                txtEstadoCliente.setEnabled(false);

                btnNovoCliente.setEnabled(true);
                btn_salvarCliente.setEnabled(false);
                btnAtualizarCliente.setEnabled(false);
                btnCancelarCliente.setEnabled(false);
                btn_selecionar.setEnabled(false);
                btn_excluirSalvar.setEnabled(false);

                break;

            case "Salvar":
                txtIdCliente.setEnabled(true);
                txtNomeCliente.setEnabled(true);
                txtCpfcliente.setEnabled(true);
                txtTelefoneCliente.setEnabled(true);
                txtEnderecoCliente.setEnabled(true);
                txtCidadeCliente.setEnabled(true);
                txtEstadoCliente.setEnabled(true);

                btnNovoCliente.setEnabled(false);
                btn_salvarCliente.setEnabled(true);
                btnAtualizarCliente.setEnabled(false);
                btnCancelarCliente.setEnabled(true);
                btn_selecionar.setEnabled(false);
                btn_excluirSalvar.setEnabled(false);
                break;

            case "Atualizar":
                txtIdCliente.setEnabled(false);
                txtNomeCliente.setEnabled(false);
                txtCpfcliente.setEnabled(false);
                txtTelefoneCliente.setEnabled(false);
                txtEnderecoCliente.setEnabled(false);
                txtCidadeCliente.setEnabled(false);
                txtEstadoCliente.setEnabled(false);

                btnNovoCliente.setEnabled(true);
                btn_salvarCliente.setEnabled(false);
                btnAtualizarCliente.setEnabled(false);
                btnCancelarCliente.setEnabled(false);
                btn_selecionar.setEnabled(false);
                btn_excluirSalvar.setEnabled(false);
                break;

            case "Ativar":
                txtIdCliente.setEnabled(true);
                txtNomeCliente.setEnabled(true);
                txtCpfcliente.setEnabled(true);
                txtTelefoneCliente.setEnabled(true);
                txtEnderecoCliente.setEnabled(true);
                txtCidadeCliente.setEnabled(true);
                txtEstadoCliente.setEnabled(true);

                btnNovoCliente.setEnabled(false);
                btn_salvarCliente.setEnabled(false);
                btnAtualizarCliente.setEnabled(true);
                btnCancelarCliente.setEnabled(true);
                btn_selecionar.setEnabled(true);
                btn_excluirSalvar.setEnabled(true);
                break;

            case "Selecao":

                txtIdCliente.setEnabled(false);
                txtNomeCliente.setEnabled(false);
                txtCpfcliente.setEnabled(false);
                txtTelefoneCliente.setEnabled(false);
                txtEnderecoCliente.setEnabled(false);
                txtCidadeCliente.setEnabled(false);
                txtEstadoCliente.setEnabled(false);

                btnNovoCliente.setEnabled(false);
                btn_salvarCliente.setEnabled(false);
                btnAtualizarCliente.setEnabled(false);
                btnCancelarCliente.setEnabled(true);
                btn_selecionar.setEnabled(true);
                btn_excluirSalvar.setEnabled(true);

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

        jFrame1 = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCpfcliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEnderecoCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCidadeCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_salvarCliente = new javax.swing.JButton();
        txtEstadoCliente = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtTelefoneCliente = new javax.swing.JTextField();
        btnAtualizarCliente = new javax.swing.JButton();
        btnNovoCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btn_selecionar = new javax.swing.JButton();
        btn_excluirSalvar = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 427));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 43, 43));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO CLIENTE");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel2.setText("ID");

        txtNomeCliente.setToolTipText("");
        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel3.setText("NOME");

        txtCpfcliente.setToolTipText("");
        txtCpfcliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCpfcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfclienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel4.setText("CPF");

        txtIdCliente.setEditable(false);
        txtIdCliente.setToolTipText("");
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel5.setText("ENDEREÇO");

        txtEnderecoCliente.setToolTipText("");
        txtEnderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoClienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel6.setText("CIDADE");

        txtCidadeCliente.setToolTipText("");
        txtCidadeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeClienteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel7.setText("ESTADO");

        btn_salvarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/salvar.png"))); // NOI18N
        btn_salvarCliente.setText("Cadastrar");
        btn_salvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarClienteActionPerformed(evt);
            }
        });

        txtEstadoCliente.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        txtEstadoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Acre ", "Alagoas ", "Amapá ", "Amazonas ", "Bahia ", "Ceará ", "Distrito Federal ", "Espírito Santo ", "Goiás ", "Maranhão", "Mato Grosso", "Mato Grosso do Sul ", "Minas Gerais ", "Pará ", "Paraíba ", "Paraná ", "Pernambuco ", "Piauí", "Rio de Janeiro", "Rio Grande do Norte ", "Rio Grande do Sul ", "Rondônia ", "Roraima", "Santa Catarina ", "São Paulo ", "Sergipe", "Tocantins" }));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel8.setText("TELEFONE");

        txtTelefoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneClienteActionPerformed(evt);
            }
        });

        btnAtualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/salvar.png"))); // NOI18N
        btnAtualizarCliente.setText("Atualizar");
        btnAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarClienteActionPerformed(evt);
            }
        });

        btnNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/salvar.png"))); // NOI18N
        btnNovoCliente.setText("Novo");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        btnCancelarCliente.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addGap(6, 6, 6))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(txtEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(txtCpfcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(btnNovoCliente)
                .addGap(18, 18, 18)
                .addComponent(btn_salvarCliente)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarCliente)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarCliente)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCpfcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvarCliente)
                    .addComponent(btnAtualizarCliente)
                    .addComponent(btnNovoCliente)
                    .addComponent(btnCancelarCliente))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Gerenciar Cliente", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CPF", "NOME", "TELEFONE", "ENDERECO", "CIDADE", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        tabelaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaClienteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);
        if (tabelaCliente.getColumnModel().getColumnCount() > 0) {
            tabelaCliente.getColumnModel().getColumn(0).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(1).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(2).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(3).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(4).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(5).setResizable(false);
            tabelaCliente.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("PESQUISAR POR NOME");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/pesquisa.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("CLIENTES CADASTRADOS");

        btn_selecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/salvar.png"))); // NOI18N
        btn_selecionar.setText("Selecionar");
        btn_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarActionPerformed(evt);
            }
        });

        btn_excluirSalvar.setBackground(new java.awt.Color(215, 52, 52));
        btn_excluirSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaPrincipal/imagens/salvar.png"))); // NOI18N
        btn_excluirSalvar.setText("Excluir");
        btn_excluirSalvar.setToolTipText("");
        btn_excluirSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(324, 324, 324))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(btn_selecionar)
                .addGap(74, 74, 74)
                .addComponent(btn_excluirSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_selecionar)
                    .addComponent(btn_excluirSalvar))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Clientes Cadastrados", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void txtCpfclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfclienteActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void txtEnderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoClienteActionPerformed

    private void txtCidadeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeClienteActionPerformed

    private void btn_salvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarClienteActionPerformed
        // TODO add your handling code here:

        Cliente c = new Cliente();
        ClienteDAO dao = new ClienteDAO();

        c.setCpf(txtCpfcliente.getText());
        c.setNome(txtNomeCliente.getText());
        c.setTelefone(txtTelefoneCliente.getText());
        c.setEndereco(txtEnderecoCliente.getText());
        c.setCidade(txtCidadeCliente.getText());
        c.setEstado((String) txtEstadoCliente.getSelectedItem());

        dao.inserir(c);

        txtIdCliente.setText("");
        txtCpfcliente.setText("");
        txtNomeCliente.setText("");
        txtTelefoneCliente.setText("");
        txtEnderecoCliente.setText("");
        txtCidadeCliente.setText("");
        txtEstadoCliente.setSelectedItem("");

        listarTabela();

        modo = "Navegar";
        ManipulaInterface();


    }//GEN-LAST:event_btn_salvarClienteActionPerformed

    private void txtTelefoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneClienteActionPerformed

    private void btn_excluirSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirSalvarActionPerformed
        // TODO add your handling code here:

        if (tabelaCliente.getSelectedRow() != -1) {

            Cliente c = new Cliente();
            ClienteDAO dao = new ClienteDAO();

            c.setId((int) tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0));

            dao.excluir(c);

            txtCpfcliente.setText("");
            txtNomeCliente.setText("");
            txtTelefoneCliente.setText("");
            txtEnderecoCliente.setText("");
            txtCidadeCliente.setText("");

            listarTabela();

        }


    }//GEN-LAST:event_btn_excluirSalvarActionPerformed

    private void btnAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarClienteActionPerformed
        // TODO add your handling code here:

        if (tabelaCliente.getSelectedRow() != -1) {
            Cliente c = new Cliente();
            ClienteDAO dao = new ClienteDAO();

            c.setCpf(txtCpfcliente.getText());
            c.setNome(txtNomeCliente.getText());
            c.setTelefone(txtTelefoneCliente.getText());
            c.setEndereco(txtEnderecoCliente.getText());
            c.setCidade(txtCidadeCliente.getText());
            c.setEstado((String) txtEstadoCliente.getSelectedItem());
            c.setId((int) tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0));

            dao.atualizar(c);

            listarTabela();

        }


    }//GEN-LAST:event_btnAtualizarClienteActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        // TODO add your handling code here:

        if (tabelaCliente.getSelectedRow() != -1) {

            txtIdCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0).toString());
            txtCpfcliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 1).toString());
            txtNomeCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 2).toString());
            txtTelefoneCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 3).toString());
            txtEnderecoCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 4).toString());
            txtCidadeCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 5).toString());
            //txtEstadoCliente.getSelectedItem((tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0x4).toString());

            modo = "Selecao";
            ManipulaInterface();

        }

        //codCliente = ""+ tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0);

    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void tabelaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaClienteKeyReleased
        // TODO add your handling code here:

        if (tabelaCliente.getSelectedRow() != -1) {

            txtIdCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0).toString());
            txtCpfcliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 1).toString());
            txtNomeCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 2).toString());
            txtTelefoneCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 3).toString());
            txtEnderecoCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 4).toString());
            txtCidadeCliente.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 5).toString());
            //txtEstadoCliente.getSelectedItem((tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0x4).toString());

        }

    }//GEN-LAST:event_tabelaClienteKeyReleased

    private void btn_selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarActionPerformed
        // TODO add your handling code here:

        modo = "Ativar";
        ManipulaInterface();

//        TelaAnimais tela = new TelaAnimais(codCliente);
//        tela.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btn_selecionarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        listarTabelaPorNome(txtNomeCliente.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        // TODO add your handling code here:

        modo = "Salvar";
        ManipulaInterface();
    }//GEN-LAST:event_btnNovoClienteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarCliente;
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btn_excluirSalvar;
    private javax.swing.JButton btn_salvarCliente;
    private javax.swing.JButton btn_selecionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaCliente;
    public javax.swing.JTextField txtCidadeCliente;
    public javax.swing.JTextField txtCpfcliente;
    public javax.swing.JTextField txtEnderecoCliente;
    public javax.swing.JComboBox<String> txtEstadoCliente;
    public javax.swing.JTextField txtIdCliente;
    public javax.swing.JTextField txtNomeCliente;
    public javax.swing.JTextField txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables

    //private void listarTabela() {
    //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    // }
}
