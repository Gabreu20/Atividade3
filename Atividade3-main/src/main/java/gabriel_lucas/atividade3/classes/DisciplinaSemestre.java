/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabriel_lucas.atividade3.classes;

/**
 *
 * @author ice
 */
public class DisciplinaSemestre {
    int anoSemestre;
    Disciplina disciplina;
    Professor professor;
    
    public DisciplinaSemestre(int ano, Disciplina dis, Professor prof){
        anoSemestre = ano;
        disciplina = dis;
        professor = prof;
    }
}
