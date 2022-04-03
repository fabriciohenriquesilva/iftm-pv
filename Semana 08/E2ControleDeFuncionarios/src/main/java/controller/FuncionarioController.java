package controller;

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
        String cpf = telaFuncionario.getTfdCpf();
        String nome = telaFuncionario.getTfdNome();
        String identidade = telaFuncionario.getTfdIdentidade();
        String salario = telaFuncionario.getTfdSalario();

        try {
            float salarioFloat = Float.parseFloat(salario);

            funcionario = new Funcionario(cpf, nome, salarioFloat, identidade);
            System.out.println(funcionario);
            
            if(repository.incluir(funcionario)){
                MensagemUtil.addInfo(telaFuncionario, "Funcionário cadastrado com sucesso!");
                return true;
            }
            else {
                MensagemUtil.addAviso(telaFuncionario, "Já existe um funcionário com o CPF informado!");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            MensagemUtil.addErro(telaFuncionario, "O campo de salário deve conter apenas números");
        }
        return false;
    }

}
