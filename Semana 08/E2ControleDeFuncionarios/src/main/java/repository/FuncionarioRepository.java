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
    
    public void alterar(){
        
    }
    
    public void consultar(){
        
    }
    
    public void excluir(){
        
    }
    
}
