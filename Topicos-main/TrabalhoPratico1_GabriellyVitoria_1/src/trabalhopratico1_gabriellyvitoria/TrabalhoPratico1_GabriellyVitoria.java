/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        
package trabalhopratico1_gabriellyvitoria;

import java.time.LocalDate; 
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class TrabalhoPratico1_GabriellyVitoria {
    
    //função para calcular e retornar o conceito
    
    static String calculaConceito(int nota){
        String conceito = "";
        if(nota>=0 && nota<11){
            conceito = "F"; 
        }
        if(nota>=11 && nota<21){
            conceito = "E"; 
        }
        if(nota>=21 && nota<41){
            conceito = "D"; 
        }
        if(nota>=41 && nota<61){
            conceito = "C"; 
        }
        if(nota>=61 && nota<81){
            conceito = "B"; 
        }
        if(nota>=81 && nota<101){
            conceito = "A"; 
        }
        return conceito;
    }
    
    //função para calcular retornar se um aluno está ou não aprovado
    
    static String aprovadoReprovado(int nota){
        String status = "Aprovado(a)";
        if(nota<60){
            status = "Reprovado(a)";
        }
        return status;
    }
    
    public static void main(String[] args) {
        
        //instanciar e declarar objetos de Departamento
        
        ArrayList<Departamento> depart = new ArrayList();
        depart.add(new Departamento("Departamento de Informática", 1, 105, 111111111));
        depart.add(new Departamento("Departamento de Administração", 2, 106, 222222222));
        
        //instanciar e declarar objetos de Curso
        
        ArrayList<Curso> c = new ArrayList();
        c.add(new Curso("Técnico em Informática", " O técnico em Informática possibilita o desenvolvimento de competências para "
        + "conceber, projetar, implementar, avaliar e dar suporte\ne manutenção em sistemas e em tecnologias de processamento e "
        + "transmissão de dados.", 1, 1200, "Técnico", depart.get(0)));
        c.add(new Curso("Bacharelado em Administração", "O curso Bacharelado em Administração tem por objetivo formar profissionais "
        + "criativos e com visão estratégica, capazes de atuar como \nagentes de mudança no processo de desenvolvimento "
        + "socioeconômico. ", 2, 3000, "Superior", depart.get(1)));
        int numeroCurso;
        String nome_curso = "";
        
        //instanciar ArrayList de Disciplinas
        
        ArrayList<Disciplinas> d = new ArrayList();
        String nomeDisciplina, nomeProf, semestre;
        int numero, numero_disciplinas;
        
        //classe LocalDate para pegar a data atual do sistema 
        
        LocalDate semestreAno = LocalDate.now();    
        
        //valor da data é usado para calcular qual o semestre e armazenar na variável semestre
        
        if(semestreAno.getMonth().ordinal()>=1 && semestreAno.getMonth().ordinal()<6){
            semestre = "Semestre 1";
        }
        else{
            semestre = "Smertre 2";
        }
        
        //criar objetos de Disciplinas 
        
        d.add(new Disciplinas("Programacao 1", "Carlos Paulino", c.get(0).getNome(), semestre, semestreAno.getYear(), 1));
        d.add(new Disciplinas("Programacao OO", "Daniela Costa", c.get(0).getNome(),semestre, semestreAno.getYear(), 2));
        d.add(new Disciplinas("Topicos em Desenvolvimento", "Saulo Henrique", c.get(0).getNome(),semestre, semestreAno.getYear(), 3));
        d.add(new Disciplinas("Gestao Empresarial", "Pedro Xavier", c.get(1).getNome(), semestre, semestreAno.getYear(), 4));
        d.add(new Disciplinas("Gestao Ambiental", "Fernando Silva", c.get(1).getNome(),semestre, semestreAno.getYear(), 5));
        
        /*instanciar e criar objetos de Aluno 
        no teste utilizado não haverá um departamento secundário, por isso a variável está em branco*/
        
        ArrayList<Aluno> a = new ArrayList();
        a.add(new Aluno("Ana Maria", "11111111111", "Rua 1", 111111111, "Feminino", "12/09/2003", "Turma 1", "Segundo grau", 0, depart.get(0).toString(), ""));
        a.add(new Aluno("Pedro Augusto", "22222222222", "Rua 2", 222222222, "Masculino", "09/07/2001", "Turma 2", "Graduação", 0, depart.get(1).toString(), ""));
        a.add(new Aluno("Ricardo Dias", "33333333333", "Rua 3", 333333333, "Masculino", "19/12/2004", "Turma 3", "Segundo grau", 0, depart.get(0).toString(), ""));
        a.add(new Aluno("Leonardo Gomes", "44444444444", "Rua 4", 444444444, "Masculino", "28/02/2003", "Turma 4", "Graduação", 0, depart.get(1).toString(), ""));
        a.add(new Aluno("Josiana Santos", "55555555555", "Rua 5", 555555555, "Feminino", "12/07/2003", "Turma 5", "Graduação", 0, depart.get(1).toString(), ""));
        a.add(new Aluno("Igor Santana", "66666666666", "Rua 6", 666666666, "Masculino", "30/05/2002", "Turma 6", "Segundo grau", 0, depart.get(0).toString(), ""));
        a.add(new Aluno("Carla Rosa", "77777777777", "Rua 7", 777777777, "Feminino", "11/10/2004", "Turma 7", "Segundo grau", 0, depart.get(0).toString(), ""));
        a.add(new Aluno("Tassyana Martins", "88888888888", "Rua 8", 888888888, "Feminino", "07/03/2005", "Turma 8", "Graduação", 0, depart.get(1).toString(), ""));
        String nomeAluno;
        
        //instanciar e criar objetos de Histórico 
        
        ArrayList<Historico> h = new ArrayList();
        h.add(new Historico("", 0));
        h.add(new Historico("", 0));
        h.add(new Historico("", 0));
        h.add(new Historico("", 0));
        h.add(new Historico("", 0));
        h.add(new Historico("", 0));
        h.add(new Historico("", 0));
        h.add(new Historico("", 0));
        int notaNumerica; 
        
        //classe Scanner para ler variáveis
        
        Scanner in = new Scanner(System.in); 
        
        //varíavel para armazenar a opção escolhida
        
        int op; 
        
        //menu feito com do while onde está todas as funcionalidades
        
        do{
            
            /*menu de escolha inicial feito com JOptionPane
            opção digitada é convertida em inteiro para armazenar na variável op*/
            
            op = Integer.parseInt(JOptionPane.showInputDialog("1. Cadastrar Disciplina\n2. Matricular Aluno\n3. Registro de Notas do Aluno\n4. Listar Alunos Aprovados e reprovados\n5. Sair "));
            
            //switch vai entrar em um dos 5 casos baseado na variável op
            
            switch (op){
                
                //funcionalidade 1
                
                case 1: 
                    System.out.println("\n- 1. Cadastrar Disciplina -\n");
                    
                    //percorrer ArrayList de Curso para imprimir toString dos cursos existes
                    
                    System.out.println("Cursos existentes para cadastrar uma disciplina:");
                    for(int i=0; i<c.size(); i++){
                        System.out.println(c.get(i).toString());
                    }
                    
                    System.out.print("\nInforme o número do curso que será associado a disciplina a ser cadastrada: ");
                    numeroCurso = in.nextInt();
                    
                    //limpar o buffer após ler uma variável inteira
                    
                    in.nextLine(); 
                    
                    //variável nome_curso recebe o nome do curso associado à disciplina
                    
                    for(int i=0; i<c.size(); i++){
                        if(numeroCurso == c.get(i).getNumeroCurso()){
                            nome_curso = c.get(i).getNome();
                        }
                    }
                    
                    System.out.print("Informe quantas disciplinas quer cadastrar: ");
                    numero_disciplinas = in.nextInt();
                    
                    //limpar o buffer após ler uma variável inteira
                    
                    in.nextLine(); 
                    
                    for(int i=0; i<numero_disciplinas; i++){
                        
                        //ler dados da disciplina a ser cadastrada
                        
                        System.out.print("\nNome da disciplina: ");
                        nomeDisciplina = in.nextLine();
                        System.out.print("Nome do professor: ");
                        nomeProf = in.nextLine();
                        System.out.print("Número da disciplina: ");
                        numero = in.nextInt();
                        
                        //limpar o buffer após ler uma variável inteira
                        
                        in.nextLine();

                        //calcular qual é o semestre usando classe LocalDate
                        
                        if(semestreAno.getMonth().ordinal()>=1 && semestreAno.getMonth().ordinal()<6){
                            semestre = "Semestre 1";
                        }
                        else{
                            semestre = "Smertre 2";
                        }
                        
                        //adicionar a disciplina cadastrada no ArrayList de Disciplinas e imprimir seu toString
                        
                        d.add(new Disciplinas(nomeDisciplina, nomeProf, nome_curso, semestre, semestreAno.getYear(), numero));
                        System.out.println("\n- Disciplina cadastrada:\n" + d.get(i+5).toString());
                    }
                    
                    break;
                
                //funcionalidade 2   
                    
                case 2:
                    System.out.println("\n- 2. Matricular Aluno em Disciplina -\n");

                    System.out.print("Informe o nome do(a) aluno(a) que dejeja matricular: ");
                    nomeAluno = in.nextLine();

                    for(int i=0; i<a.size(); i++){
                        if(nomeAluno.equalsIgnoreCase(a.get(i).getNome())){
                            System.out.print("Aluno(a) encontrado(a).\nInforme o nome da disciplina à qual deseja efetivar a matrícula: ");
                            nomeDisciplina = in.nextLine();
                            for(int j=0; j<d.size(); j++){
                                if(nomeDisciplina.equalsIgnoreCase(d.get(j).getNomeDisciplina())){
                                    
                                    //matricula do aluno vai receber o número da disciplina em que se cadastrou
                                    
                                    a.get(i).setMatricula(d.get(j).getNumeroDisciplina());
                                    
                                    //imprimir dados do aluno matriculado
                                    
                                    System.out.println(a.get(i).getNome() + " matriculado(a) na disciplina com sucesso!\n");
                                    System.out.println("Dados do(a) aluno(a):\n" + a.get(i).toString());
                                }
                            }
                        }
                    }
                    
                    break;
                
                //funcionalidade 3    
                    
                case 3:
                    System.out.println("\n- 3. Registro de Notas do Aluno  -\n");
                    
                    System.out.print("Informe o número da disciplina: ");
                    numero = in.nextInt();
                    
                    //limpar o buffer após ler uma variável inteira
                    
                    in.nextLine(); 

                    for(int i=0; i<d.size(); i++){
                       if(numero == d.get(i).getNumeroDisciplina()){
                           System.out.println("\nAlunos matriculados nessa disciplina:");
                           
                           //programa imprime todos os alunos matriculados nessa disciplina
                           
                           for(int j=0; j<a.size(); j++){
                               if(a.get(j).getMatricula() == d.get(i).getNumeroDisciplina()){
                                   System.out.print(a.get(j).getNome() + "\n");
                               }
                           }
                       }
                    }
                    
                    System.out.print("\nSelecione um dos alunos para atribuir uma nota numérica: ");
                    nomeAluno = in.nextLine();

                    for(int k=0; k<a.size(); k++){
                        if(nomeAluno.equalsIgnoreCase(a.get(k).getNome())){
                            System.out.print("Informe a nota numérica do(a) aluno(a): ");
                            notaNumerica = in.nextInt();
                            
                            //limpar o buffer após ler uma variável inteira
                            
                            in.nextLine();
                            
                            //chamar a função calculaConceito passando a nota numérica para calcular o conceito do aluno e armazenar no ArrayList
                            
                            h.get(k).setNotaNumerica(notaNumerica);
                            h.get(k).setNotaConceito(calculaConceito(notaNumerica));

                            //imprimir toString do histórico do aluno
                            
                            System.out.println("\n- Histórico de notas de " + nomeAluno + ":\n" + h.get(k).toString());
                        }
                    }
                    
                    break;
                    
                //funcionalidade 4    
                
                case 4:
                    System.out.println("\n- 4. Listar Alunos Aprovados e Reprovados em uma Disciplina -\n");
                    
                    //leitura do número da disciplina escolhida
                    
                    System.out.print("Informe o número da disciplina: ");
                    numero = in.nextInt();
                    
                    //limpar o buffer após ler uma variável inteira
                    
                    in.nextLine(); 
                    
                    //mostrar uma lista com o nome dos alunos e seus status da discuplina escolhida 
                    
                    System.out.println("\nLista de alunos matriculados nessa disciplina:");
                    for(int i=0; i<d.size(); i++){
                        if(numero == d.get(i).getNumeroDisciplina()){
                            for(int j=0; j<d.size(); j++){
                                if(a.get(j).getMatricula() == d.get(i).getNumeroDisciplina()){
                                    
                                    //status do aluno calculado chamando a função aprovadoReprovado passando a nota numérica do aluno armazenada na classe Historico
                                    
                                   System.out.print(a.get(j).getNome() + " - " + aprovadoReprovado(h.get(j).getNotaNumerica()) + "\n");
                               }
                            }
                        }
                    }
                        
                    break;    
                
                //finalizar programa  
                    
                case 5:
                    System.out.println("\nPrograma finalizado.");
                    break;
                
                //estrar aqui se o número digitado for diferente dos apresentados    
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
                        
        //repetição continua enquando a opção escolhida for diferente de 5    
        
        }while(op != 5); 
        
        //fechar teclado in
        
        in.close(); 
    }
    
}
