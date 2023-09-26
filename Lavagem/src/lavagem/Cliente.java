/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavagem;

/**
 *
 * @author Aluno TDS
 */
public class Cliente {
 
   private String nome;
   private String sobrenome;
   private String sexo;
   private String telefone;
   private String dataDeNascimento;
   private String endereco;
   private Carro car;
   
  public Cliente (){
      this.nome = "";
      this.sobrenome = "";
      this.sexo = "";
      this.telefone = "";
      this.dataDeNascimento = "";
      this.endereco = "";
  }
   
   public Cliente(String nome, String sobrenome, String sexo, String telefone, String dtnasc, String end){
       this.nome = nome;
       this.sobrenome = sobrenome;
       this.sexo = sexo;
       this.telefone = telefone;
       this.dataDeNascimento = dtnasc;
       this.endereco = end;
       this.car = null;
   }
   
    public void setNome(String nome){
        this.nome = nome;
    }
   
    public String getNome(){
        return this.nome;    
    }
   
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
   
    public String getSobrenome(){
        return this.sobrenome;    
    }
   
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
   
    public String getSexo(){
        return this.sexo;
    }
   
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
   
    public String getTelefone(){
        return this.telefone;
    }
   
    public void setDataNascimento(String dataNascimento){
        this.dataDeNascimento = dataNascimento;
    }
   
    public String getDataNascimento(){
        return this.dataDeNascimento;
    }
   
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
   
    public String getEndereco(){
        return this.endereco;
    }
   
    public void setCarro(Carro car){
        this.car = car;
    }
   
    public Carro getCarro(Carro car){
        return this.car;
    }
 
    public String todoOsDados(){
        return "Nome e Sobrenome: "+getNome()+" "+getSobrenome()+" Sexo: "+getSexo()+"  Telefone: "+getTelefone();
    }
   
}

