package controller;

import java.awt.Component;
import java.util.NoSuchElementException;
import javax.swing.JTextField;
import model.Funcionario;
import repository.FuncionarioRepository;
import util.MensagemUtil;
import view.TelaFuncionario;

public class FuncionarioController {

    private Funcionario funcionario;
    private final TelaFuncionario telaFuncionario;
    private final FuncionarioRepository repository;

    public FuncionarioController(TelaFuncionario telaFuncionario) {
        this.telaFuncionario = telaFuncionario;
        repository = new FuncionarioRepository();
    }

    public boolean incluir() {
        
        if(camposEmBranco()){
            MensagemUtil.addAviso(telaFuncionario, "Preencha todos os campos para cadastrar um funcionario!");
            return false;
        }
        
        String cpf = telaFuncionario.getTfdCpf();
        String nome = telaFuncionario.getTfdNome();
        String identidade = telaFuncionario.getTfdIdentidade();
        String salario = telaFuncionario.getTfdSalario();

        try {
            float salarioFloat = Float.parseFloat(salario);

            funcionario = new Funcionario(cpf, nome, salarioFloat, identidade);
            System.out.println(funcionario);

            if (repository.incluir(funcionario)) {
                MensagemUtil.addInfo(telaFuncionario, "Funcionário cadastrado com sucesso!");
                return true;
            } else {
                MensagemUtil.addAviso(telaFuncionario, "Já existe um funcionário com o CPF informado!");
            }
            
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            MensagemUtil.addErro(telaFuncionario, "O campo de salário deve conter apenas números");
        }
        return false;
    }

    public boolean consultar() {

        String cpf = telaFuncionario.getTfdCpf();
        if("".equals(cpf)){
            MensagemUtil.addAviso(telaFuncionario, "Por favor, informe um CPF para realizar a busca!");
            return false;
        }

        try {
            funcionario = repository.consultar(cpf);

            telaFuncionario.setTfdCpf(cpf);
            telaFuncionario.setTfdNome(funcionario.getNome());
            telaFuncionario.setTfdIdentidade(funcionario.getIdentidade());
            float salario = funcionario.getSalario();
            telaFuncionario.setTfdSalario(String.valueOf(salario));
            
            System.out.println(funcionario);
        } catch (NoSuchElementException e) {
            MensagemUtil.addAviso(telaFuncionario, "Não foi encontrado funcionário com o CPF informado!");
            return false;
        }
        return true;
    }
    
    private boolean camposEmBranco(){
        for (Component c : telaFuncionario.getPanel().getComponents()) {
            if (c instanceof JTextField) {
                if (((JTextField) c).getText().isBlank()) {
                    return true;
                }
            }
        }
        return false;
    }

}
