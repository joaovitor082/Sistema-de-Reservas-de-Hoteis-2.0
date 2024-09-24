package Entidades;

import java.util.Random;
public class Quarto {
    private int numero;
    private TipoDeQuarto tipoDeQuarto;

    public Quarto(int numero, TipoDeQuarto tipoDeQuarto) {
        this.numero = new Random().nextInt(100);
        this.tipoDeQuarto = tipoDeQuarto;
    }

    public TipoDeQuarto getTipoDeQuarto() {
        return tipoDeQuarto;
    }

    public void setTipoDeQuarto(TipoDeQuarto tipoDeQuarto) {
        this.tipoDeQuarto = tipoDeQuarto;
    }

    public int getNumero() {
        return numero;
    }

    public double getPreco() {
        return tipoDeQuarto.getPreco();
    }

    public TipoDeQuarto getTipo() {
        return tipoDeQuarto;
    }
}
