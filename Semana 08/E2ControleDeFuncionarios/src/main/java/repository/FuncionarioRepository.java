package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    public void alterar(){
        
    }
    
    public void excluir(){
        
    }
    
}
