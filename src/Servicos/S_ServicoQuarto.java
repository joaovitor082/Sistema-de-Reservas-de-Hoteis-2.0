package Servicos;

import Entidades.ENUM.ServicosDeQuarto;
import Entidades.Ficha;
import Interfaces.InterfaceS_ServicoQuarto;
public class S_ServicoQuarto implements InterfaceS_ServicoQuarto {
    private ServicosDeQuarto servico;

    public S_ServicoQuarto(ServicosDeQuarto servico) {
        this.servico = servico;
    }

    public ServicosDeQuarto getServico() {
        return servico;
    }

    public void definirServico(ServicosDeQuarto servico, Ficha ficha){
        switch (servico){
            case LIMPEZA:
                System.out.println("Serviço de limpeza solicitado");
                break;
            case LAVANDERIA:
                System.out.println("Serviço de lavanderia solicitado");
                break;
        }
    }
}
