package projetos.java.ti.valores;

import projetos.java.ti.Usuario;

public class Emprestimo extends Usuario implements ValorFinal{
    private double valorEmpretimo;
    private int parcelas;

    public double getValorEmprestimo() {
        return valorEmpretimo;
    }

    public void setValorEmpretimo(double valorEmpretimo) {
        this.valorEmpretimo = valorEmpretimo;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public double getValorFinal() {
        return getValorEmprestimo() / getParcelas();
    }
}
