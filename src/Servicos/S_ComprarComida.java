package Servicos;

import Entidades.Ficha;
import Entidades.MaquinaComida;
public class S_ComprarComida {
    public void comprarSalgadinho(Ficha ficha) {
        ficha.setTotalPagar(MaquinaComida.getPrecoSalgadinho());
    }

    public void comprarRefrigerante(Ficha ficha) {
        ficha.setTotalPagar(MaquinaComida.getPrecoRefrigerante());
    }
}
