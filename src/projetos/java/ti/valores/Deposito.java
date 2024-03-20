package projetos.java.ti.valores;

import projetos.java.ti.Usuario;

public class Deposito extends Usuario implements ValorFinal{

    private double valorAdicao;

    public double getValorAdicao() {
        return valorAdicao;
    }

    public void setValorAdicao(double valorAdicao) {
        this.valorAdicao = valorAdicao;
    }

    public double getValorDebito() {
        return getSaldo() + getValorAdicao();
    }

    @Override
    public double getValorFinal() {;
        return getSaldo() + getValorAdicao();
    }
}
