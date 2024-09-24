package Interfaces;

import Entidades.Quarto;

public interface InterfaceQuarto {
    public void adicionarQuarto(Quarto quarto);
    public void removerQuarto(Quarto quarto);
    public void listarQuartos();
    public Quarto buscarQuartoPorNumero(int numero);
}
