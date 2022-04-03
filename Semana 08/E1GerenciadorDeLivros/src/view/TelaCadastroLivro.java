/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GerenciaLivro;
import java.awt.Component;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Livro;

/**
 *
 * @author iftm
 */
public class TelaCadastroLivro extends javax.swing.JInternalFrame {

    private GerenciaLivro gl;

    public TelaCadastroLivro() {
        initComponents();
        gl = new GerenciaLivro();
    }

    private void limparCampos() {
        for (Component c : panel.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }
    }

    private boolean camposPreenchidos() {
        for (Component c : panel.getComponents()) {
            if (c instanceof JTextField) {
                if (((JTextField) c).getText().isBlank()) {
                    return false;
                }
            }
        }
        return true;
    }

    private Livro buscarLivro(String titulo) {
        Livro livro = null;
        try {
            livro = gl.consultarPorTitulo(titulo);

            tfdTitulo.setText(livro.getTitulo());
            tfdAutor.setText(livro.getAutor());
            tfdEditora.setText(livro.getEditora());
            tfdAno.setText(String.valueOf(livro.getAnoPublicacao()));
            tfdEdicao.setText(String.valueOf(livro.getEdicao()));
            tfdIsbn.setText(livro.getIsbn());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Nenhum livro foi encontrado com o título informado!",
                    "Livro não encontrado", JOptionPane.WARNING_MESSAGE);
        }
        return livro;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblAno = new javax.swing.JLabel();
        lblEdicao = new javax.swing.JLabel();
        lblIsbn = new javax.swing.JLabel();
        tfdAutor = new javax.swing.JTextField();
        tfdEditora = new javax.swing.JTextField();
        tfdAno = new javax.swing.JTextField();
        tfdEdicao = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        tfdTitulo = new javax.swing.JTextField();
        lblAutor = new javax.swing.JLabel();
        tfdIsbn = new javax.swing.JTextField();
        lblEditora = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(640, 480));

        panel.setPreferredSize(new java.awt.Dimension(640, 480));

        lblAno.setText("Ano da publicação");

        lblEdicao.setText("Edição");

        lblIsbn.setText("ISBN");

        lblTitulo.setText("Titulo do livro");

        lblAutor.setText("Autor do livro");

        lblEditora.setText("Editora");

        btnCadastrar.setText("Incluir");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblIsbn)
                                    .addComponent(lblEdicao)
                                    .addComponent(lblAno)
                                    .addComponent(lblEditora)
                                    .addComponent(lblTitulo)
                                    .addComponent(lblAutor))
                                .addGap(49, 49, 49)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdTitulo)
                                    .addComponent(tfdIsbn)
                                    .addComponent(tfdEdicao)
                                    .addComponent(tfdEditora)
                                    .addComponent(tfdAno, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCadastrar)
                                .addGap(45, 45, 45)
                                .addComponent(btnAlterar)
                                .addGap(44, 44, 44)
                                .addComponent(btnBuscar)
                                .addGap(41, 41, 41)
                                .addComponent(btnExcluir)))
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(btnLimparCampos)
                        .addGap(242, 242, 242))))
        );

        panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnBuscar, btnCadastrar, btnExcluir});

        panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfdAno, tfdAutor, tfdEdicao, tfdEditora, tfdIsbn, tfdTitulo});

        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(tfdTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(tfdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditora)
                    .addComponent(tfdEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAno)
                    .addComponent(tfdAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdicao)
                    .addComponent(tfdEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIsbn)
                    .addComponent(tfdIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnBuscar)
                    .addComponent(btnExcluir))
                .addGap(26, 26, 26)
                .addComponent(btnLimparCampos)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAno, lblAutor, lblEdicao, lblEditora, lblIsbn, lblTitulo});

        panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnBuscar, btnCadastrar, btnExcluir});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        panel.getAccessibleContext().setAccessibleName("");

        setBounds(0, 0, 640, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Livro li = new Livro();

        if (!camposPreenchidos()) {
            JOptionPane.showMessageDialog(this,
                    "Preencha todos os campos para continuar!",
                    "Capos não preenchidos", JOptionPane.INFORMATION_MESSAGE);
        } else {

            li.setTitulo(tfdTitulo.getText());
            li.setAutor(tfdAutor.getText());
            li.setEditora(tfdEditora.getText());
            li.setIsbn(tfdIsbn.getText());

            try {
                int ano = Integer.parseInt(tfdAno.getText());

                try {
                    int edicao = Integer.parseInt(tfdEdicao.getText());

                    li.setAnoPublicacao(ano);
                    li.setEdicao(edicao);

                    if (gl.incluir(li)) {
                        JOptionPane.showMessageDialog(this,
                                "O livro foi cadastrado com sucesso!",
                                "Livro cadastrado", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,
                                "O livro não foi cadastrado, pois já existe um livro registrado com o mesmo ISBN!",
                                "Livro já existe", JOptionPane.INFORMATION_MESSAGE);
                    }
                    limparCampos();
                        System.out.println(li);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this,
                            "O campo edição do livro aceita apenas números",
                            "Campo preenchido com dado inválido", JOptionPane.WARNING_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,
                        "O campo ano de publicação aceita apenas números",
                        "Campo preenchido com dado inválido", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String titulo = tfdTitulo.getText();
        Livro livro = buscarLivro(titulo);
        if(livro == null){
            limparCampos();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String titulo = tfdTitulo.getText();
        Livro livro = buscarLivro(titulo);
        if (gl.remover(livro)) {
            JOptionPane.showMessageDialog(this,
                    "Livro removido com sucesso!",
                    "Livro removido", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Livro livro = new Livro();

        if (!camposPreenchidos()) {
            JOptionPane.showMessageDialog(this,
                    "Preencha todos os campos para alterar o livro!",
                    "Preenchimento obrigatório", JOptionPane.INFORMATION_MESSAGE);
        } else {

            livro.setTitulo(tfdTitulo.getText());
            livro.setAutor(tfdAutor.getText());
            livro.setEditora(tfdEditora.getText());
            livro.setIsbn(tfdIsbn.getText());
            System.out.println(tfdEditora.getText());

            try {
                int ano = Integer.parseInt(tfdAno.getText());

                try {
                    int edicao = Integer.parseInt(tfdEdicao.getText());

                    livro.setAnoPublicacao(ano);
                    livro.setEdicao(edicao);

                    gl.alterar(livro);
                    JOptionPane.showMessageDialog(this,
                            "Suas alterações foram salvas com sucesso!",
                            "Alterado com sucesso", JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();

                    System.out.println(livro);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this,
                            "O campo edição aceita apenas números",
                            "Campo preenchido com dado inválido", JOptionPane.WARNING_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,
                        "O campo ano de publicação aceita apenas números",
                        "Campo preenchido com dado inválido", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblEdicao;
    private javax.swing.JLabel lblEditora;
    private javax.swing.JLabel lblIsbn;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField tfdAno;
    private javax.swing.JTextField tfdAutor;
    private javax.swing.JTextField tfdEdicao;
    private javax.swing.JTextField tfdEditora;
    private javax.swing.JTextField tfdIsbn;
    private javax.swing.JTextField tfdTitulo;
    // End of variables declaration//GEN-END:variables
}
