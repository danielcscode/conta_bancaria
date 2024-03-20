package projetos.java.ti;

public class UsuarioNovo extends Usuario{

    private double saldo;
    private int contaValido2;
    private int senhaValido2;

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getContaValido2() {
        return contaValido2;
    }

    public void setContaValido2(int contaValido2) {
        this.contaValido2 = contaValido2;
    }

    public int getSenhaValido2() {
        return senhaValido2;
    }

    public void setSenhaValido2(int senhaValido2) {
        this.senhaValido2 = senhaValido2;
    }

    public boolean conferindo() {
        if(getConta() == contaValido2 && getSenha() == senhaValido2) {
            return true;
        } else {
            return false;
        }
    }
}
