package pacote.projeto.escolar;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Execucao {
	public static void main(String[] args) {
		int escolha;
		Professor prof = new Professor();
		Aluno a = new Aluno();
		
		Scanner sc = new Scanner(System.in);
		
		try {
		
                    do {
                        System.out.println("Você é (1) aluno ou (2) professor? ");
                        escolha = sc.nextInt();
                        if(escolha == 1) {
                            System.out.println("Qual é o seu nome? ");
                            a.setNome(sc.next());
                            System.out.println("Qual é o seu código? ");
                            a.setCodigo(sc.nextInt());
                            if(a.getCodigo() < 0) {
                                    System.out.println("\n\tEntrada Inválida!\n");
                                    continue;
                            }
                            System.out.println("Qual é o seu e-mail? ");
                            a.setEmail(sc.next());
                            System.out.println("Digite a nota 1: ");
                            a.setNota1(sc.nextFloat());
                            if(a.getNota1() < 0 || a.getNota1() > 10) {
                                    System.out.println("\n\tEntrada Inválida!\n");
                                    continue;
                            }
                            System.out.println("Digite a nota 2: ");
                            a.setNota2(sc.nextFloat());
                            if(a.getNota2() < 0 || a.getNota2() > 10) {
                                    System.out.println("\n\tEntrada Inválida!\n");
                                    continue;
                            }
                            if(a.calcularMedia() >= 4 && a.calcularMedia() < 7) {
                                    System.out.println("Digite a nota do exame final: ");
                                    a.setExame_final(sc.nextFloat());
                            }

                            a.exibirHistorico();
                            break;
                            //Fim escolha 'aluno'
                        } else if(escolha == 2) {
                            System.out.println("Qual é o seu nome? ");
                            prof.setNome(sc.next());
                            System.out.println("Qual é o seu código? ");
                            prof.setCodigo(sc.nextInt());
                            if(prof.getCodigo() < 0) {
                                    System.out.println("\n\tEntrada Inválida!\n");
                                    continue;
                            }
                            System.out.println("Qual é o seu e-mail? ");
                            prof.setEmail(sc.next());
                            System.out.println("Qual é a sua área de atuação? ");
                            prof.setArea_atuacao(sc.next());
                            System.out.println("Quanto você ganha por hora trabalhada? $ ");
                            prof.setValor_hora_trabalhada(sc.nextFloat());
                            if(prof.getValor_hora_trabalhada() < 0) {
                                    System.out.println("\n\tEntrada Inválida!\n");
                                    continue;
                            }
                            System.out.println("Quantas horas você trabalhou neste mês? ");
                            prof.setQtde_horas_disciplina(sc.nextInt());
                            if(prof.getQtde_horas_disciplina() < 0) {
                                    System.out.println("\n\tEntrada Inválida!\n");
                                    continue;
                            }
                            System.out.println("Qual é o mês atual \n"
                                                             + "(1-jan/2-fev/3-mar/4-abr/5-mai/6-jun/7-jul/8-ago/9-set/10-out/11-nov/12-dez)? ");
                            prof.setMes_atual(sc.nextInt());
                            if(prof.getMes_atual() < 0 || prof.getMes_nascimento() > 12) {
                                    System.out.println("\n\tEntrada Inválida!\n");
                                    continue;
                            }
                            System.out.println("Qual é o mês de seu nascimento\n"
                                                             + "(1-jan/2-fev/3-mar/4-abr/5-mai/6-jun/7-jul/8-ago/9-set/10-out/11-nov/12-dez)? ");
                            prof.setMes_nascimento(sc.nextInt());
                            if(prof.getMes_nascimento() < 0 || prof.getMes_nascimento() > 12) {
                                    System.out.println("\n\tEntrada Inválida!\n");
                                    continue;
                            }
                            prof.exibirDadosProfessor();
                            break;
                            //Fim escolha 'professor'
                        } else {
                            System.out.println("\n\t***Escolha inválida!***\n");
                        }
                    }while(escolha != 1 || escolha != 2);
                    sc.close();
                
		} catch(InputMismatchException erro) {
			System.err.println("\nErro: " + erro);
		} finally {
			System.out.println("\nEncerrando o programa...");
		}
	}
}
