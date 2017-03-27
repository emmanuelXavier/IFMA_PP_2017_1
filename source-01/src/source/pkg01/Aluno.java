package source.pkg01;


public class Aluno {
     private int matricula;
     private String nome;
     private String curso;
    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return "Sr(a)" +  nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    private void conectar(){
        
        
    }
    
    private void desconectar(){
            
    }
     
    private void registrarLog(){
        
    }
    
    public boolean salvar(){
        conectar();
        //code de salvar
        registrarLog();
        desconectar();
        return true;
    }
    
    public boolean excluir(){
        conectar();
        //code excluir
        registrarLog();
        desconectar();
        return true;
    }
    

  
    
    
    
    
    
}
