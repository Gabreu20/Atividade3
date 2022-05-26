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
        List<Secretario> secretarios = new ArrayList();
        
        List<PedidoImpressao> pedidos = new ArrayList();
             
        Inicio(estudantes, professores, pedidos, secretarios);
    }
    
    public static void Inicio(List<Aluno> estudantes, List<Professor> professores, List<PedidoImpressao> pedidos, List<Secretario> secretarios){
        System.out.println("Bem vindo \nSelecione como deseja entrar: ");
        System.out.println("[1]Aluno\n[2]Professor"
                + "\n[3]Secretario");
        Scanner ler = new Scanner(System.in);
        int opcao = ler.nextInt();
        while(opcao > 3 || opcao < 1){
            System.out.println("Opcao invalida, tente novamente:");
            System.out.println("[1]Aluno\n[2]Professor"
                + "\n[3]Secretario");
            opcao = ler.nextInt();
        }
        switch(opcao){
            case 1:
                if(estudantes.size() == 0){
                    System.out.println("Nao ha alunos cadastrados");
                    Inicio(estudantes, professores, pedidos, secretarios);
                }
                else
                    AlunoPanel(estudantes, professores, pedidos, secretarios);
                break;
            case 2:
                if(professores.size() == 0){
                    System.out.println("Nao ha professores cadastrados");
                    Inicio(estudantes, professores, pedidos, secretarios);
                }
                else
                    ProfessorPanel(estudantes, professores, pedidos, secretarios);
                break;
            case 3:
                if(secretarios.size() == 0){
                    String n, h, matricula, departamento;
                    int unidade;
                    System.out.println("Nao ha secretarios cadastrados, crie uma conta:");
                    System.out.println("Informe o nome do novo secretario:");
                    n = ler.next();
                    
                    System.out.println("Informe o horario de trabalho:");
                    h = ler.next();
                    
                    System.out.println("Informe a matricula do novo secretario");
                    matricula = ler.next();
                    
                    System.out.println("Informe a unidade do novo secretario");
                    unidade = ler.nextInt();
                    
                    System.out.println("Informe o departamento do novo secretario");
                    departamento = ler.next();
                    
                    Secretario sec = new Secretario(n,h,matricula,departamento,unidade);
                    secretarios.add(sec);
                    
                    System.out.println("Sucesso!");
                    Inicio(estudantes, professores, pedidos, secretarios);
                }
                else
                    SecretarioPanel(estudantes, professores, pedidos, secretarios);
                break;
        }    
    }
    
    public static void SecretarioPanel(List<Aluno> estudantes, List<Professor> professores, List<PedidoImpressao> pedidos, List<Secretario> secretarios)
    {
        System.out.println("Logado como\nSelecione o proximo passo: ");
        System.out.println("[1]Adicionar Novo Aluno \n[2]Adicionar Novo Professor"
                + "\n[3]Exibir Alunos Cadastrados\n[4]Exibir Professores Cadastrados "
                + "\n[5]Exibir Pedidos Efetuados \n[6]Sair");
        Scanner ler = new Scanner(System.in);
        int opcao = ler.nextInt();
        while(opcao > 6 || opcao < 1){
            System.out.println("Opcao invalida, tente novamente:");
            System.out.println("[1]Adicionar Novo Aluno \n[2]Adicionar Novo Professor"
                + "\n[3]Exibir Alunos Cadastrados\n[4]Exibir Professores Cadastrados "
                + "\n[5]Exibir Pedidos Efetuados \n[6]Sair");
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
                
                String horario;
                System.out.println("Digite o horario de atendimento do professor: ");   
                horario = ler.next();
                
                Professor p = new Professor(nome, idade, sexo, dataNascimento, horario);
                int n;
                System.out.println("Digite o numero de disciplinas do Professor: ");   
                n = ler.nextInt();
                for(int i = 0; i < n; i++){
                    String disNome;
                    System.out.println("Digite o nome da disciplina: ");
                    disNome = ler.next();
                    Disciplina mat = new Disciplina(disNome);
                    DisciplinaSemestre dS = new DisciplinaSemestre(2022, mat, p);
                    p.materias.add(mat);
                }
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
                    for(int j = 0; j < professores.get(i).materias.size(); j++){
                        materias += professores.get(i).materias.get(j).nome;
                        materias += " ";
                    }
                    System.out.println("Nome: " + professores.get(i).nome + " |Idade: " + professores.get(i).idade + " |Sexo: " + professores.get(i).sexo + " |dN: " + professores.get(i).dataNascimento
                            + " |Disciplinas: "+ materias +  " |Horario de Atendimento: " 
                            + professores.get(i).atendimento + " |Copias gratis restantes: " + (professores.get(i).copiasGratuitas - professores.get(i).copiasFeitas) );
                }
                System.out.println("");
                break;
            case 5:
                System.out.println("Lista de Pedidos:");
                System.out.println("");
                for(int i = 0; i < pedidos.size(); i++){
                    System.out.println("Numero do Pedido: " + pedidos.get(i).getNumPedido() + " Data: " + pedidos.get(i).getDataPedido() + " Colorido: " + pedidos.get(i).getColorido() + " Status: " + pedidos.get(i).getStatus());
                }
                System.out.println("");
                break;
            case 6:
                Inicio(estudantes, professores, pedidos, secretarios);
                break;
        }
        SecretarioPanel(estudantes, professores, pedidos, secretarios);
    }
    
    public static void AlunoPanel(List<Aluno> estudantes, List<Professor> professores, List<PedidoImpressao> pedidos, List<Secretario> secretarios){
        System.out.println("Logado como Aluno \nSelecione o proximo passo: ");
        System.out.println("[1]Emitir Pedido de Impressao\n[2]Sair");
        Scanner ler = new Scanner(System.in);
        int opcao = ler.nextInt();
        while(opcao > 2 || opcao < 1){
            System.out.println("Opcao invalida, tente novamente:");
            System.out.println("[1]Emitir Pedido de Impressao\n[2]Sair");
            opcao = ler.nextInt();
        }
        switch(opcao){
            case 1:
                String arq, dataP, cor, impressora;
                int copias;
                System.out.println("Digite o nome do arquivo:");
                arq = ler.next();
                
                System.out.println("Digite o numero de copias:");
                copias = ler.nextInt();
                
                System.out.println("Colorido?(Sim/Nao)");
                cor = ler.next();
                
                System.out.println("Informe a data do dia de hoje:");
                dataP = ler.next();
                
                System.out.println("Informe a impressora de preferencia:");
                impressora = ler.next();
                
                PedidoImpressao pedido = new PedidoImpressao();
                pedido.EmitirPedido(arq, copias, dataP, cor, impressora);
                
                pedidos.add(pedido);
                
                System.out.println("Pedido Emitido!");
                AlunoPanel(estudantes, professores, pedidos, secretarios);
                break;
            case 2:
                Inicio(estudantes, professores, pedidos, secretarios);
                break;
        }
    }
    
    public static void ProfessorPanel(List<Aluno> estudantes, List<Professor> professores, List<PedidoImpressao> pedidos, List<Secretario> secretarios){
        System.out.println("Logado como Professor \nSelecione o proximo passo: ");
        System.out.println("[1]Emitir Pedido de Impressao\n[2]Sair");
        Scanner ler = new Scanner(System.in);
        int opcao = ler.nextInt();
        while(opcao > 2 || opcao < 1){
            System.out.println("Opcao invalida, tente novamente:");
            System.out.println("[1]Emitir Pedido de Impressao\n[2]Sair");
            opcao = ler.nextInt();
        }
        switch(opcao){
            case 1:
                String arq, dataP, cor, impressora;
                int copias;
                System.out.println("Digite o nome do arquivo:");
                arq = ler.next();
                
                System.out.println("Digite o numero de copias:");
                copias = ler.nextInt();
                
                System.out.println("Colorido?(Sim/Nao)");
                cor = ler.next();
                
                System.out.println("Informe a data do dia de hoje:");
                dataP = ler.next();
                
                System.out.println("Informe a impressora de preferencia:");
                impressora = ler.next();
                
                PedidoImpressao pedido = new PedidoImpressao();
                pedido.EmitirPedido(arq, copias, dataP, cor, impressora);
                
                pedidos.add(pedido);
                
                System.out.println("Pedido Emitido!");
                ProfessorPanel(estudantes, professores, pedidos, secretarios);
                break;
            case 2:
                Inicio(estudantes, professores, pedidos, secretarios);
                break;
        }
    }
}
