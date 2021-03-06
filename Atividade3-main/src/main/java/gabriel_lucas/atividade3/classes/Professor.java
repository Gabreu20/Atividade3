/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabriel_lucas.atividade3.classes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class Professor extends Funcionario {
    public List<Disciplina> materias = new ArrayList();
    public String atendimento;
    public int copiasGratuitas = 200;
    public int copiasFeitas;
    
    public Professor(String n, int i, String s, String dN, String a){
        this.nome = n;
        this.idade = i;
        this.sexo = s;
        this.dataNascimento = dN;
        
        atendimento = a;
    }
    public void adicionaDisciplina(String disNome){
        Disciplina mat = new Disciplina(disNome);
        DisciplinaSemestre dS = new DisciplinaSemestre(2022, mat, this);
        materias.add(mat);
    }
    public String getNome(){
        return this.nome;
    }
}
