package repository;

import java.util.ArrayList;
import java.util.List;
import model.Funcionario;

public class FuncionarioRepository {
    
    private final List<Funcionario> funcionarios;

    public FuncionarioRepository() {
        funcionarios = new ArrayList<>();
    }
    
    public boolean incluir(Funcionario funcionario){
        if(funcionarios.contains(funcionario)){
            return false;
        }
        return funcionarios.add(funcionario);
    }
    
    public Funcionario consultar(String cpf){
        Funcionario func = funcionarios.stream()
                .filter(f -> cpf.equals(f.getCpf()))
                .findFirst()
                .orElseThrow();
        
        return func;
    }

    public Funcionario alterar(Funcionario funcionario){
        
        Funcionario funcAlterado = consultar(funcionario.getCpf());
        
        funcAlterado.setNome(funcionario.getNome());
        funcAlterado.setIdentidade(funcionario.getIdentidade());
        funcAlterado.setSalario(funcionario.getSalario());
//        funcionarios.add(funcionarios.indexOf(funcionario), funcAlterado);
        
        return funcAlterado;
    }
    
    public void excluir(){
        
    }
    
}
