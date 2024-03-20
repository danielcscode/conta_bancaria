package projetos.java.ti;

public class Usuario {
    private String nome;
    private int conta;
    private int senha;
    private double saldo;
    private int contaValido = 00000;
    private int senhaValido = 1234567;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int s) {
        this.senha = s;
    }

    public boolean conferindo() {
        if(getConta() == contaValido && getSenha() == senhaValido) {
            return true;
        } else {
            return false;
        }
    }
}
