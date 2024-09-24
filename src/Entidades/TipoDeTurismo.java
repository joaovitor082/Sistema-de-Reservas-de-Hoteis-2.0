package Entidades;

import Entidades.ENUM.LugaresTuristicos;
public class TipoDeTurismo {
    private double preco;
    private LugaresTuristicos lugar;

    public TipoDeTurismo() {
    }

    public TipoDeTurismo(double preco, LugaresTuristicos lugar) {
        this.preco = preco;
        this.lugar = lugar;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LugaresTuristicos getLugar() {
        return lugar;
    }

    public void setLugar(LugaresTuristicos lugar) {
        this.lugar = lugar;
        definirLugar(lugar);
    }


    public void definirLugar(LugaresTuristicos lugaresTuristicos){
        switch (lugaresTuristicos){
            case PRAIA:
                setPreco(100);
                break;
            case MONTANHA:
                setPreco(200);
                break;
            case CAICHOREIRA:
                setPreco(300);
                break;
        }
    }

}
