package projetos.java.ti;

import projetos.java.ti.valores.Deposito;
import projetos.java.ti.valores.Emprestimo;
import projetos.java.ti.valores.Transferencia;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void rodape() {
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("------ B A N C O  E X E M P L O -------");
        System.out.println("---------------------------------------");
        System.out.println();
    }

    public static void menu() {
        System.out.println("[1] - Consultar Saldo      [2] - Transferência");
        System.out.println("[3] - Deposito             [4] - Emprestimo");
        System.out.println("[5] - Sair ");
        System.out.println();
        System.out.print("Operação: ");
    }

    public static void menuNovo() {
        System.out.println("[1] - Consultar Saldo      [2] - Transferência");
        System.out.println("[3] - Deposito             [4] - Sair");
        System.out.println();
        System.out.print("Operação: ");
    }

    public static void main(String[] args) {
        int operacao, operacao1;
        var contaRandom = new Random();
        var dados = new Scanner(System.in);
        var usuario1 = new Usuario();
        var usuario2 = new UsuarioNovo();
        var valorT = new Transferencia();
        var valorD = new Deposito();
        var emprestimo = new Emprestimo();

        rodape();
        System.out.println("Cliente Novo?");
        System.out.println();
        System.out.println("[1] - Sim");
        System.out.println("[2] - Não");
        System.out.println();
        System.out.print("Operação: ");
        operacao1 = dados.nextInt();

        if (operacao1 == 1) {
            System.out.println("Digite seu nome:");
            usuario2.setNome(dados.next());
            System.out.println("Crie sua senha de 7 digitos:");
            usuario2.setSenhaValido2(dados.nextInt());
            System.out.println();
            usuario2.setContaValido2(contaRandom.nextInt(89999) + 10000);
            System.out.println("Sua conta foi criada com sucesso! Numero da conta é: " +usuario2.getContaValido2());
            System.out.println();
            rodape();
            System.out.println("Digite sua conta de 5 digitos:");
            usuario2.setConta(dados.nextInt());
            System.out.println("Digite sua senha de 7 digitos:");
            usuario2.setSenha(dados.nextInt());

            if (usuario2.conferindo() == true) {
                usuario2.setSaldo(0);
                valorT.setSaldo(usuario2.getSaldo());
                valorD.setSaldo(usuario2.getSaldo());
                do {
                    valorT.setSaldo(usuario2.getSaldo());
                    valorD.setSaldo(usuario2.getSaldo());
                    rodape();
                    System.out.println("Bem vindo Sr(a)." + usuario2.getNome());
                    System.out.println();
                    menuNovo();
                    operacao = dados.nextInt();
                    switch (operacao) {
                        case 1:
                            System.out.println("---------------------------------------");
                            System.out.println("Saldo: R$" + usuario2.getSaldo());
                            System.out.println("---------------------------------------");
                            break;
                        case 2:
                            System.out.println("Digite o  valor para transferência:");
                            System.out.print("R$ ");
                            valorT.setValorSubtraido(dados.nextDouble());

                            if (valorT.getValorSubtraido() <= usuario2.getSaldo()) {
                                System.out.println();
                                System.out.println("Transferência realizada com sucesso!");
                                System.out.println();
                                System.out.println("---------------------------------------");
                                System.out.println("Saldo: R$ " + valorT.getValorFinal());
                                System.out.println("---------------------------------------");
                                usuario2.setSaldo(valorT.getValorFinal());
                            } else {
                                System.out.println();
                                System.out.println("---------------------------------------");
                                System.out.println("Saldo Insuficiente");
                                System.out.println("---------------------------------------");
                            }
                            break;
                        case 3:
                            System.out.println("Digite o  valor para Deposito:");
                            System.out.print("R$ ");
                            valorD.setValorAdicao(dados.nextDouble());
                            System.out.println("Deposito realizada com sucesso!");
                            System.out.println("Saldo: R$" + valorD.getValorDebito());
                            usuario2.setSaldo(valorD.getValorFinal());
                        break;
                    }
                } while (operacao != 4);
                System.out.println("Operação Encerrada!");
            } else {
                System.out.println("Login Invalido!");
                System.out.println("Operação Encerrada!");
            }
        } else {
            System.out.println("Digite seu nome:");
            usuario1.setNome(dados.next());
            System.out.println("Digite sua conta de 5 digitos:");
            usuario1.setConta(dados.nextInt());
            System.out.println("Digite sua senha de 7 digitos:");
            usuario1.setSenha(dados.nextInt());

            if (usuario1.conferindo() == true) {
                usuario1.setSaldo(10000);
                valorT.setSaldo(usuario1.getSaldo());
                valorD.setSaldo(usuario1.getSaldo());
                do {
                    valorT.setSaldo(usuario1.getSaldo());
                    valorD.setSaldo(usuario1.getSaldo());
                    rodape();
                    System.out.println("Bem vindo Sr(a)." + usuario1.getNome());
                    System.out.println();
                    menu();
                    operacao = dados.nextInt();
                    switch (operacao) {
                        case 1:
                            System.out.println("---------------------------------------");
                            System.out.println("Saldo: R$" + usuario1.getSaldo());
                            System.out.println("---------------------------------------");
                            break;
                        case 2:
                            System.out.println("Digite o  valor para transferência:");
                            System.out.print("R$ ");
                            valorT.setValorSubtraido(dados.nextDouble());

                            if (valorT.getValorSubtraido() <= usuario1.getSaldo()) {
                                System.out.println();
                                System.out.println("Transferência realizada com sucesso!");
                                System.out.println();
                                System.out.println("---------------------------------------");
                                System.out.println("Saldo: R$ " + valorT.getValorFinal());
                                System.out.println("---------------------------------------");
                                usuario1.setSaldo(valorT.getValorFinal());
                            } else {
                                System.out.println();
                                System.out.println("---------------------------------------");
                                System.out.println("Saldo Insuficiente");
                                System.out.println("---------------------------------------");
                            }
                            break;
                        case 3:
                            System.out.println("Digite o  valor para Deposito:");
                            System.out.print("R$ ");
                            valorD.setValorAdicao(dados.nextDouble());
                            System.out.println("Deposito realizada com sucesso!");
                            System.out.println("Saldo: R$" + valorD.getValorDebito());
                            usuario1.setSaldo(valorD.getValorFinal());
                            break;
                        case 4:
                            System.out.println("Valor para emprestimo:");
                            System.out.print("R$: ");
                            emprestimo.setValorEmpretimo(dados.nextDouble());
                            System.out.println("Em quantas parcelas deseja pagar?");
                            emprestimo.setParcelas(dados.nextInt());
                            double porcentagemLimite = usuario1.getSaldo() * 0.30;
                            double reajusteParcela = emprestimo.getValorFinal() * 0.18;
                            double parcelaFinal = emprestimo.getValorFinal() + reajusteParcela;

                            if (porcentagemLimite >= parcelaFinal && emprestimo.getParcelas() < 34) {

                                rodape();
                                System.out.println("Seu emprestimo foi efetuado com sucesso!");
                                double valorEmprestino = usuario1.getSaldo() + emprestimo.getValorEmprestimo();
                                System.out.printf("Saldo: R$ %.2f %n", valorEmprestino);
                                System.out.println();
                                System.out.println("Valor da parcela: R$ " + parcelaFinal);
                                System.out.println("Em " + emprestimo.getParcelas() + " parcelas!");
                            } else {
                                System.out.println("Não foi possivel realizar o emprestimo.");
                            }
                            break;
                    }
                } while (operacao != 5);
                System.out.println("Operação Encerrada!");
            } else {
                System.out.println("Login Invalido!");
                System.out.println("Operação Encerrada!");
            }
        }
    }
}