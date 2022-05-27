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
                + "\n[3]Secretario\n[4]Sair");
        Scanner ler = new Scanner(System.in);
        int opcao = ler.nextInt();
        while(opcao > 4 || opcao < 1){
            System.out.println("Opcao invalida, tente novamente:");
            System.out.println("[1]Aluno\n[2]Professor"
                + "\n[3]Secretario\n[4]Sair");
            opcao = ler.nextInt();
        }
        switch(opcao){
            case 1:
                if(estudantes.isEmpty()){
                    System.out.println("Nao ha alunos cadastrados");
                    Inicio(estudantes, professores, pedidos, secretarios);
                }
                else{
                    System.out.println("Escolha a Conta que deseja utilizar");
                    for(int i = 0; i < estudantes.size(); i++){
                        System.out.println("["+(i+1)+"]"+ estudantes.get(i).getNome());
                    }
                    int escolha;
                    escolha = ler.nextInt();
                    while(escolha < 1 || escolha > estudantes.size()){
                        System.out.println("Valor invalido, tente novamente!");
                        System.out.println("Escolha a Conta que deseja utilizar");
                        for(int i = 0; i < estudantes.size(); i++){
                            System.out.println("["+(i+1)+"]"+ estudantes.get(i).getNome());
                        }
                        escolha = ler.nextInt();
                    }  
                    AlunoPanel(estudantes, professores, pedidos, secretarios, estudantes.get(escolha - 1));   
                }
                break;
            case 2:
                if(professores.isEmpty()){
                    System.out.println("Nao ha professores cadastrados");
                    Inicio(estudantes, professores, pedidos, secretarios);
                }
                else{
                    System.out.println("Escolha a Conta que deseja utilizar");
                    for(int i = 0; i < professores.size(); i++){
                        System.out.println("["+(i+1)+"]"+ professores.get(i).getNome());
                    }
                    int escolha;
                    escolha = ler.nextInt();
                    while(escolha < 1 || escolha > professores.size()){
                        System.out.println("Valor invalido, tente novamente!");
                        System.out.println("Escolha a Conta que deseja utilizar");
                        for(int i = 0; i < professores.size(); i++){
                            System.out.println("["+(i+1)+"]"+ professores.get(i).getNome());
                        }
                        escolha = ler.nextInt();
                    }                  
                    ProfessorPanel(estudantes, professores, pedidos, secretarios, professores.get(escolha - 1));   
                }
                break;
            case 3:
                if(secretarios.isEmpty()){
                    Scanner secs = new Scanner(System.in);
                    String n, h, matricula, departamento;
                    int unidade;
                    System.out.println("Nao ha secretarios cadastrados, crie uma conta:");
                    System.out.println("Informe o nome do novo secretario:");
                    n = secs.nextLine();
                    
                    System.out.println("Informe o horario de trabalho:");
                    h = secs.nextLine();
                    
                    System.out.println("Informe a matricula do novo secretario");
                    matricula = secs.next();
                    
                    System.out.println("Informe a unidade do novo secretario");
                    unidade = secs.nextInt();
                    
                    secs.nextLine();
                    
                    System.out.println("Informe o departamento do novo secretario");
                    departamento = secs.nextLine();
                    
                    Secretario sec = new Secretario(n,h,matricula,departamento,unidade);
                    secretarios.add(sec);
                    
                    System.out.println("Sucesso!");
                    Inicio(estudantes, professores, pedidos, secretarios);
                }
                else{ 
                    System.out.println("Escolha a Conta que deseja utilizar");
                    for(int i = 0; i < secretarios.size(); i++){
                        System.out.println("["+(i+1)+"]"+ secretarios.get(i).getNome());
                    }
                    int escolha;
                    escolha = ler.nextInt();
                    while(escolha < 1 || escolha > secretarios.size()){
                        System.out.println("Valor invalido, tente novamente!");
                        System.out.println("Escolha a Conta que deseja utilizar");
                        for(int i = 0; i < secretarios.size(); i++){
                            System.out.println("["+(i+1)+"]"+ secretarios.get(i).getNome());
                        }
                        escolha = ler.nextInt();
                    }
                    
                    SecretarioPanel(estudantes, professores, pedidos, secretarios, secretarios.get(escolha - 1)); 
                }
                break;
            case 4:
                System.exit(0);
                break;
        }    
    }
    
    public static void SecretarioPanel(List<Aluno> estudantes, List<Professor> professores, List<PedidoImpressao> pedidos, List<Secretario> secretarios, Secretario atual)
    {
        System.out.println("Logado como " + atual.getNome() +"\nSelecione o proximo passo: ");
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
                Scanner al = new Scanner(System.in);
                System.out.println("Digite o nome do Aluno: ");
                nome = al.nextLine();
                
                System.out.println("Digite a idade do Aluno: ");
                idade = al.nextInt();
                
                System.out.println("Digite o sexo do Aluno: ");
                sexo = al.next();
                
                System.out.println("Digite a data de nascimento do Aluno: ");
                dataNascimento = al.nextLine();
                
                al.nextLine();
                
                System.out.println("Digite a matricula do Aluno: ");
                matricula = al.nextLine();
                
                System.out.println("Digite o curso do Aluno:(sem espacos) ");
                curso = al.nextLine();
                
                Aluno a = new Aluno(nome, idade, sexo, dataNascimento, matricula, curso);
                estudantes.add(a);
                System.out.println("");
                break;
            case 2:
                Scanner pro = new Scanner(System.in);
                System.out.println("Digite o nome do Professor: ");
                nome = pro.nextLine();
                
                System.out.println("Digite a idade do Professor: ");
                idade = pro.nextInt();
                
                System.out.println("Digite o sexo do Professor: ");
                sexo = pro.next();
                
                pro.nextLine();
                
                System.out.println("Digite a data de nascimento do Professor: ");
                dataNascimento = pro.next();               
                
                pro.nextLine();
                
                String horario;
                System.out.println("Digite o horario de atendimento do professor: ");   
                horario = pro.nextLine();
                
                Professor p = new Professor(nome, idade, sexo, dataNascimento, horario);
                int n;
                System.out.println("Digite o numero de disciplinas do Professor: ");   
                n = ler.nextInt();
                for(int i = 0; i < n; i++){
                    String disNome;
                    System.out.println("Digite o nome da disciplina: ");
                    disNome = pro.nextLine();
                    p.adicionaDisciplina(disNome);
                }
                professores.add(p);
                System.out.println("");
                break;
            case 3:
                if(estudantes.isEmpty()){
                    System.out.println("");
                    System.out.println("Nenhum aluno cadastrado");
                    System.out.println("");
                }
                else{
                    System.out.println("Lista de Estudantes: ");
                    System.out.println("");
                    for(int i = 0; i < estudantes.size(); i++){
                        System.out.println("Nome: " + estudantes.get(i).nome + " |Idade: " + estudantes.get(i).idade + " |Sexo: " + estudantes.get(i).sexo + " |dN: " + estudantes.get(i).dataNascimento + " |Matricula: " + estudantes.get(i).matricula + " |Curso: " + estudantes.get(i).curso + " |Copias gratis restantes: " + (estudantes.get(i).copiasGratuitas - estudantes.get(i).copiasFeitas) );
                    }
                    System.out.println("");
                }
                break;
            case 4:
                if(professores.isEmpty()){
                    System.out.println("");
                    System.out.println("Nenhum professor cadastrado");
                    System.out.println("");
                }
                else{
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
                }
                break;
            case 5:
                if(pedidos.isEmpty()){
                    System.out.println("");
                    System.out.println("Nenhum pedido Pendente");
                    System.out.println("");
                }
                else{
                    System.out.println("Lista de Pedidos:");
                    System.out.println("");
                    for(int i = 0; i < pedidos.size(); i++){  
                        System.out.println("[" + (i + 1) + "]Requerido por: " + pedidos.get(i).getNome() + " |Numero do Pedido: " + pedidos.get(i).getNumPedido() + " |Data: " + pedidos.get(i).getDataPedido() + " |Colorido: " + pedidos.get(i).getColorido() + " |Arquivo: " + pedidos.get(i).getItem().getArquivo() + " |Numero de Copias: " + pedidos.get(i).getItem().getCopias() + " Status: " + pedidos.get(i).getStatus());
                    }
                    System.out.println("["+ (pedidos.size() + 1) + "]Sair");
                    System.out.println("Digite o index do pedido a ser pago");  
                    int num;
                    num = ler.nextInt();
                    if(num == (pedidos.size() + 1))
                        SecretarioPanel(estudantes, professores, pedidos, secretarios, atual);
                    while(num < 1 || num > pedidos.size() + 1){
                        System.out.println("Valor invalido, tente novamente!");
                        System.out.println("");
                        for(int i = 0; i < pedidos.size(); i++){  
                            System.out.println("[" + (i + 1) + "]Requerido por: " + pedidos.get(i).getNome() + " |Numero do Pedido: " + pedidos.get(i).getNumPedido() + " |Data: " + pedidos.get(i).getDataPedido() + " |Colorido: " + pedidos.get(i).getColorido() + " |Arquivo: " + pedidos.get(i).getItem().getArquivo() + " |Numero de Copias: " + pedidos.get(i).getItem().getCopias() + " Status: " + pedidos.get(i).getStatus());
                        }
                        System.out.println("["+ (pedidos.size() + 1) + "]Sair");
                        System.out.println("Digite o index do pedido a ser pago");  
                        num = ler.nextInt();
                    }
                    
                    pedidos.get(num - 1).imprimePedido();
                }
                break; 
            case 6:
                Inicio(estudantes, professores, pedidos, secretarios);
                break;
        }
        SecretarioPanel(estudantes, professores, pedidos, secretarios, atual);
    }
    
    public static void AlunoPanel(List<Aluno> estudantes, List<Professor> professores, List<PedidoImpressao> pedidos, List<Secretario> secretarios, Aluno atual){
        System.out.println("Logado como " + atual.getNome() + "\nSelecione o proximo passo: ");
        System.out.println("[1]Emitir Pedido de Impressao\n[2]Pagar Pedido\n[3]Sair");
        Scanner ler = new Scanner(System.in);
        int opcao = ler.nextInt();
        while(opcao > 3 || opcao < 1){
            System.out.println("Opcao invalida, tente novamente:");
            System.out.println("[1]Emitir Pedido de Impressao\n[2]Pagar Pedido\n[3]Sair");
            opcao = ler.nextInt();
        }
        switch(opcao){
            case 1:
                Scanner ped = new Scanner(System.in);
                String arq, dataP, cor, impressora, formaPgmto;
                int copias;
                System.out.println("Digite o nome do arquivo:");
                arq = ped.nextLine();
                
                System.out.println("Digite o numero de copias:");
                copias = ped.nextInt();
                
                System.out.println("Colorido?(Sim/Nao)");
                cor = ped.next();
                
                System.out.println("Informe a data do dia de hoje:");
                dataP = ped.next();
                
                ped.nextLine();
                
                System.out.println("Informe a impressora de preferencia:");
                impressora = ped.nextLine();
                
                System.out.println("Informe a forma de pagamento:");
                formaPgmto = ped.nextLine();
                
                atual.copiasFeitas += copias;
                Boolean gratis = true;
                if((atual.copiasGratuitas - atual.copiasFeitas) < 0)
                    gratis = false;
                
                PedidoImpressao pedido = new PedidoImpressao();
                pedido.EmitirPedido(atual.getNome(),arq, copias, dataP, cor, impressora, formaPgmto, gratis);
                
                pedidos.add(pedido);   
                atual.pedidos.add(pedido);
                
                System.out.println("Pedido Emitido!");
                AlunoPanel(estudantes, professores, pedidos, secretarios, atual);
                break;
            case 2:
                if(atual.pedidos.isEmpty()){
                    System.out.println("");
                    System.out.println("Nenhum pedido pendente");
                    System.out.println("");
                    AlunoPanel(estudantes, professores, pedidos, secretarios, atual);
                }
                else{
                    System.out.println("Seus pedidos: (escolha qual deseja pagar) ");
                    for(int i = 0; i < atual.pedidos.size(); i++){
                        if(!atual.pedidos.get(i).getPg().getPago())
                            System.out.println("["+(i+1)+"]" + atual.pedidos.get(i).getArq() + " |Preco: "+ atual.pedidos.get(i).getPg().getValor() + "RS");
                    }
                    System.out.println("");
                    int aux;
                    aux = ler.nextInt();
                    while(aux < 1 || aux > atual.pedidos.size()){
                        System.out.println("Valor invalido, tente novamente!");
                        System.out.println("Seus pedidos: (escolha qual deseja pagar) ");
                        for(int i = 0; i < atual.pedidos.size(); i++){
                            if(!atual.pedidos.get(i).getPg().getPago())
                                System.out.println("["+(i+1)+"]" + atual.pedidos.get(i).getArq() + " |Preco: "+ atual.pedidos.get(i).getPg().getValor() + "RS");
                        }
                        System.out.println("");
                        aux = ler.nextInt();
                    }
                    atual.pedidos.get(aux - 1).pagar();  
                    atual.pedidos.remove(aux - 1);
                    AlunoPanel(estudantes, professores, pedidos, secretarios, atual);
                }
                break;
            case 3:
                Inicio(estudantes, professores, pedidos, secretarios);
                break;
        }
    }
    
    public static void ProfessorPanel(List<Aluno> estudantes, List<Professor> professores, List<PedidoImpressao> pedidos, List<Secretario> secretarios, Professor atual){
        System.out.println("Logado como " + atual.getNome() + "\nSelecione o proximo passo: ");
        System.out.println("[1]Emitir Pedido de Impressao\n[2]Pagar Pedido\n[3]Sair");
        Scanner ler = new Scanner(System.in);
        int opcao = ler.nextInt();
        while(opcao > 3 || opcao < 1){
            System.out.println("Opcao invalida, tente novamente:");
            System.out.println("[1]Emitir Pedido de Impressao\n[2]Pagar Pedido\n[3]Sair");
            opcao = ler.nextInt();
        }
        switch(opcao){
            case 1:
                Scanner ped = new Scanner(System.in);
                String arq, dataP, cor, impressora, formaPgmto;
                int copias;
                System.out.println("Digite o nome do arquivo:");
                arq = ped.nextLine();
                
                System.out.println("Digite o numero de copias:");
                copias = ped.nextInt();
                
                System.out.println("Colorido?(Sim/Nao)");
                cor = ped.next();
                
                System.out.println("Informe a data do dia de hoje:");
                dataP = ped.next();
                
                ped.nextLine();
                
                System.out.println("Informe a impressora de preferencia:");
                impressora = ped.nextLine();
                
                System.out.println("Informe a forma de pagamento:");
                formaPgmto = ped.nextLine();
                
                atual.copiasFeitas += copias;
                Boolean gratis = true;
                if((atual.copiasGratuitas - atual.copiasFeitas) < 0)
                    gratis = false;
                
                PedidoImpressao pedido = new PedidoImpressao();
                pedido.EmitirPedido(atual.getNome(),arq, copias, dataP, cor, impressora, formaPgmto, gratis);
                
                pedidos.add(pedido);
                atual.pedidos.add(pedido);
                
                System.out.println("Pedido Emitido!");
                ProfessorPanel(estudantes, professores, pedidos, secretarios, atual);
                break;
            case 2:
                if(atual.pedidos.isEmpty()){
                    System.out.println("");
                    System.out.println("Nenhum pedido pendente");
                    System.out.println("");
                    ProfessorPanel(estudantes, professores, pedidos, secretarios, atual);
                }
                else{
                    System.out.println("Seus pedidos: (escolha qual deseja pagar) ");
                    for(int i = 0; i < atual.pedidos.size(); i++){
                        if(!atual.pedidos.get(i).getPg().getPago())
                            System.out.println("["+(i+1)+"]" + atual.pedidos.get(i).getArq() + " |Preco: "+ atual.pedidos.get(i).getPg().getValor() + "RS");
                    }
                    System.out.println("");
                    int aux;
                    aux = ler.nextInt();
                    while(aux < 1 || aux > atual.pedidos.size()){
                        System.out.println("Valor invalido, tente novamente!");
                        System.out.println("Seus pedidos: (escolha qual deseja pagar) ");
                        for(int i = 0; i < atual.pedidos.size(); i++){
                            if(!atual.pedidos.get(i).getPg().getPago())
                                System.out.println("["+(i+1)+"]" + atual.pedidos.get(i).getArq() + " |Preco: "+ atual.pedidos.get(i).getPg().getValor() + "RS");
                        }
                        System.out.println("");
                        aux = ler.nextInt();
                    }
                    atual.pedidos.get(aux - 1).pagar();   
                    atual.pedidos.remove(aux - 1);
                    ProfessorPanel(estudantes, professores, pedidos, secretarios, atual);
                }
                break;
            case 3:
                Inicio(estudantes, professores, pedidos, secretarios);
                break;
        }
    }
}
