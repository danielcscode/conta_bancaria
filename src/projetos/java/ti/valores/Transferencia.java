package projetos.java.ti.valores;

import projetos.java.ti.Usuario;

public class Transferencia extends Usuario implements ValorFinal{

    protected double valorSubtraido;

    public double getValorSubtraido() {
        return valorSubtraido;
    }

    public void setValorSubtraido(double valorSubtraido) {
        this.valorSubtraido = valorSubtraido;
    }

    @Override
    public double getValorFinal() {;
        return getSaldo() - getValorSubtraido();
    }
}
