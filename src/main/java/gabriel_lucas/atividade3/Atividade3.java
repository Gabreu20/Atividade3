/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gabriel_lucas.atividade3;

import gabriel_lucas.atividade3.classes.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class Atividade3 {

    public static void main(String[] args) {
        List<Aluno> estudantes = new ArrayList();
        List<Professor> professores = new ArrayList();
        SecretarioPanel(estudantes, professores);
    }
    public static void SecretarioPanel(List<Aluno> estudantes, List<Professor> professores){
        Disciplina fis = new Disciplina();
        Disciplina mod = new Disciplina();
        Disciplina redes = new Disciplina();
        Disciplina est = new Disciplina();
        
        System.out.println("Logado como secretário \n Selecione o proximo passo: ");
        System.out.println("[1]Adicionar Novo Aluno \n[2]Adicionar Novo Professor"
                + "\n[3]Exibir Alunos Cadastrados\n[4]Exibir Professores Cadastrados ");
        Scanner ler = new Scanner(System.in);
        int opcao = ler.nextInt();
        while(opcao > 4 || opcao < 1){
            System.out.println("Opcao invalida, tente novamente:");
            System.out.println("[1]Adicionar Novo Aluno \n[2]Adicionar Novo Professor"
                + "\n[3]Exibir Alunos Cadastrados\n[4]Exibir Professores Cadastrados ");
            opcao = ler.nextInt();
        }
        String nome, sexo, dataNascimento, matricula, curso;
        int idade;
        switch(opcao){
            case 1:
                System.out.println("Digite o nome do Aluno: ");
                nome = ler.next();
                
                System.out.println("Digite a idade do Aluno: ");
                idade = ler.nextInt();
                
                System.out.println("Digite o sexo do Aluno: ");
                sexo = ler.next();
                
                System.out.println("Digite a data de nascimento do Aluno: ");
                dataNascimento = ler.next();
                
                System.out.println("Digite a matricula do Aluno: ");
                matricula = ler.next();
                
                System.out.println("Digite o curso do Aluno: ");
                curso = ler.next();              
                
                Aluno a = new Aluno(nome, idade, sexo, dataNascimento, matricula, curso);
                estudantes.add(a);
                System.out.println("");
                break;
            case 2:
                System.out.println("Digite o nome do Professor: ");
                nome = ler.next();
                
                System.out.println("Digite a idade do Professor: ");
                idade = ler.nextInt();
                
                System.out.println("Digite o sexo do Professor: ");
                sexo = ler.next();
                
                System.out.println("Digite a data de nascimento do Professor: ");
                dataNascimento = ler.next();
                
                int n;
                System.out.println("Digite o numero de disciplinas do Professor(até 4): ");   
                n = ler.nextInt();
                
                Disciplina[] dis = new Disciplina[4];
                for(int i = 0; i < n; i++){                    
                    int aux;
                    System.out.println("Escolha a disciplina: "
                            + "[1]Fisica 1"
                            + "[2]Modelagem de Sistemas"
                            + "[3]Rede de Computadores"
                            + "[4]Estatistica 1"); 
                    aux = ler.nextInt();
                    switch(aux){
                        case 1:
                            dis[i] = fis;
                            break;
                        case 2:
                            dis[i] = mod;
                            break;
                        case 3:
                            dis[i] = redes;
                            break;
                        case 4:
                            dis[i] = est;
                            break;
                    }
                }
                
                String horario;
                System.out.println("Digite o horario de atendimento do professor: ");   
                horario = ler.next();
                
                Professor p = new Professor(nome, idade, sexo, dataNascimento, dis, horario);
                professores.add(p);
                System.out.println("");
                break;
            case 3:
                System.out.println("Lista de Estudantes: ");
                System.out.println("");
                for(int i = 0; i < estudantes.size(); i++){
                    System.out.println("Nome: " + estudantes.get(i).nome + " |Idade: " + estudantes.get(i).idade + " |Sexo: " + estudantes.get(i).sexo + " |dN: " + estudantes.get(i).dataNascimento + " |Matricula: " + estudantes.get(i).matricula + " |Curso: " + estudantes.get(i).curso + " |Copias gratis restantes: " + (estudantes.get(i).copiasGratuitas - estudantes.get(i).copiasFeitas) );
                }
                System.out.println("");
                break;
            case 4:
                System.out.println("Lista de Professores: ");
                System.out.println("");
                for(int i = 0; i < professores.size(); i++){
                    String materias = "";
                    for(int j = 0; j < professores.get(i).materia.length; j--){
                        materias += professores.get(i).materia[j].nome;
                        materias += " ";
                    }
                    System.out.println("Nome: " + professores.get(i).nome + " |Idade: " + professores.get(i).idade + " |Sexo: " + professores.get(i).sexo + " |dN: " + professores.get(i).dataNascimento + " |Horario de Atendimento: " 
                            + materias
                            + professores.get(i).atendimento + " |Copias gratis restantes: " + (professores.get(i).copiasGratuitas - professores.get(i).copiasFeitas) );
                }
                System.out.println("");
                break;
        }
        SecretarioPanel(estudantes, professores);
    }
}
