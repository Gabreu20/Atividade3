/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabriel_lucas.atividade3.classes;

/**
 *
 * @author gabriel
 */
public class Secretario extends Funcionario {
    String horarioTrabalho;
    
    public Secretario(String n, String h, String m, String d, int u){
        this.nome = n;
        horarioTrabalho = h;
        this.matricula = m;
        this.departamento = d;
        this.unidade = u;
    }
}
