package Entidades;

import Entidades.ENUM.ReceptorQuarto;
public class TipoDeQuarto {
    private double valorDiaria;
    private ReceptorQuarto tipoDeQuarto;

    public TipoDeQuarto() {
    }

    public TipoDeQuarto(double valorDiaria, ReceptorQuarto tipoDeQuarto) {
        this.valorDiaria = valorDiaria;
        this.tipoDeQuarto = tipoDeQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double getPreco(){
         return getValorDiaria();
    }

    public ReceptorQuarto getTipoDeQuarto() {
        return tipoDeQuarto;
    }

    public void setTipoDeQuarto(ReceptorQuarto tipoDeQuarto) {
        this.tipoDeQuarto = tipoDeQuarto;
    }
}
