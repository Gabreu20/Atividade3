/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabriel_lucas.atividade3.classes;

/**
 *
 * @author gabriel
 */
public class Aluno extends Usuario{
    public String matricula;
    public String curso; 
    public int copiasGratuitas = 50;
    public int copiasFeitas = 0;
    
    public Aluno(String n, int i, String s, String dN,String m, String c){
        this.nome = n;
        this.idade = i;
        this.sexo = s;
        this.dataNascimento = dN;
        
        matricula = m;
        curso = c;
    }
    public String getNome(){
        return this.nome;
    }
}

