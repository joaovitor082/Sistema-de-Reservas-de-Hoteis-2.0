package Repositorios;

import Entidades.Quarto;
import java.util.ArrayList;
import Interfaces.InterfaceQuarto;
public class RepositorioQuarto implements InterfaceQuarto{
    private ArrayList<Quarto> quartos = new ArrayList<Quarto>();

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void removerQuarto(Quarto quarto) {
        quartos.remove(quarto);
    }

    public void listarQuartos() {
        for (Quarto quarto : quartos) {
            System.out.println("Número: " + quarto.getNumero() + " - Tipo: " + quarto.getTipo() + " - Preço: " + quarto.getPreco());
        }
    }

    public Quarto buscarQuartoPorNumero(int numero) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numero) {
                return quarto;
            }
        }
        return null;
    }
}
