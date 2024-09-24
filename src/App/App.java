package App;

import java.util.InputMismatchException;
import java.util.Scanner;

import Entidades.ENUM.ReceptorQuarto;
import Entidades.Ficha;
import Entidades.Pessoa;
import Entidades.TipoDeQuarto;
import Entidades.TipoDeTurismo;
import Entidades.Quarto;
import Entidades.ENUM.LugaresTuristicos;
import Entidades.ENUM.ServicosDeQuarto;
import Servicos.S_ComprarComida;
import Servicos.S_GuiaTuristico;
import Servicos.S_ServicoQuarto;
import Repositorios.RepositorioFicha;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RepositorioFicha repositorioFicha = new RepositorioFicha();
        S_ComprarComida servicoComida = new S_ComprarComida();
        S_GuiaTuristico servicoGuia = new S_GuiaTuristico();
        S_ServicoQuarto servicoQuarto;

        int opcao = 1;
        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastro");
            System.out.println("2. Solicitar Serviço de Quarto");
            System.out.println("3. Listar Fichas");
            System.out.println("4. Ver Total a Pagar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o CPF: ");
                        String cpf = scanner.nextLine();
                        System.out.print("Digite o telefone: ");
                        String telefone = scanner.nextLine();
                        Pessoa pessoa = new Pessoa(nome, cpf, telefone);

                        boolean escolhaQuarto = false;
                        do {
                            System.out.println("Escolha um quarto:");
                            System.out.println("1. Quarto Simples R$ 1000");
                            System.out.println("2. Quarto Intermediário R$ 2000");
                            System.out.println("3. Quarto de Luxo R$ 3000");
                            int quartoEscolhido = scanner.nextInt();
                            scanner.nextLine();
                            if (quartoEscolhido == 1) {
                                ReceptorQuarto quartoSimples = ReceptorQuarto.QuartoSimples;
                                TipoDeQuarto tipoDeQuarto = new TipoDeQuarto(1000, quartoSimples);
                                Quarto quarto = new Quarto(1, tipoDeQuarto);
                                Ficha ficha = new Ficha(pessoa, quarto);
                                repositorioFicha.adicionarFicha(ficha);
                                escolhaQuarto = true;
                                System.out.println("Quarto Simples adicionado com sucesso!");
                                ficha.setTotalPagar(tipoDeQuarto.getPreco());
                            } else if (quartoEscolhido == 2) {
                                ReceptorQuarto quartoIntermediario = ReceptorQuarto.QuartoIntermediario;
                                TipoDeQuarto tipoDeQuartoIntermediario = new TipoDeQuarto(2000, quartoIntermediario);
                                Quarto quarto = new Quarto(2, tipoDeQuartoIntermediario);
                                Ficha ficha = new Ficha(pessoa, quarto);
                                repositorioFicha.adicionarFicha(ficha);
                                escolhaQuarto = true;
                                System.out.println("Quarto Intermediário adicionado com sucesso!");
                                ficha.setTotalPagar(tipoDeQuartoIntermediario.getPreco());
                            } else if (quartoEscolhido == 3) {
                                ReceptorQuarto quartoLuxo = ReceptorQuarto.QuartoLuxo;
                                TipoDeQuarto tipoDeQuartoLuxo = new TipoDeQuarto(3000, quartoLuxo);
                                Quarto quarto = new Quarto(3, tipoDeQuartoLuxo);
                                Ficha ficha = new Ficha(pessoa, quarto);
                                repositorioFicha.adicionarFicha(ficha);
                                escolhaQuarto = true;
                                System.out.println("Quarto de Luxo adicionado com sucesso!");
                                ficha.setTotalPagar(tipoDeQuartoLuxo.getPreco());
                            } else {
                                System.out.println("Quarto inválido.");
                            }

                        } while (!escolhaQuarto);

                        System.out.println("Ficha adicionada com sucesso!");
                        break;

                    case 2:
                        System.out.print("Digite o CPF da ficha: ");
                        String cpfServico = scanner.nextLine();
                        Ficha fichaServico = repositorioFicha.buscarFichaPorCpf(cpfServico);
                        if (fichaServico != null) {
                            System.out.println("Escolha um serviço:");
                            System.out.println("1. Comprar Salgadinho");
                            System.out.println("2. Comprar Refrigerante");
                            System.out.println("3. Reservar Guia Turístico");
                            System.out.println("4. Solicitar Limpeza");
                            System.out.println("5. Solicitar Lavanderia");
                            int servicoEscolhido = scanner.nextInt();
                            scanner.nextLine();

                            switch (servicoEscolhido) {
                                case 1:
                                    servicoComida.comprarSalgadinho(fichaServico);
                                    System.out.println("Salgadinho comprado! Total a pagar: " + fichaServico.getTotalPagar());
                                    break;

                                case 2:
                                    servicoComida.comprarRefrigerante(fichaServico);
                                    System.out.println("Refrigerante comprado! Total a pagar: " + fichaServico.getTotalPagar());
                                    break;

                                case 3:
                                    System.out.print("Escolha um lugar turístico:");
                                    System.out.println("1. Praia");
                                    System.out.println("2. Montanha");
                                    System.out.println("3. Cachoeira");
                                    int lugarEscolhido = scanner.nextInt();
                                    TipoDeTurismo tipoDeTurismo;

                                    switch (lugarEscolhido) {
                                        case 1:
                                            tipoDeTurismo = new TipoDeTurismo(100, LugaresTuristicos.PRAIA);
                                            break;
                                        case 2:
                                            tipoDeTurismo = new TipoDeTurismo(200, LugaresTuristicos.MONTANHA);
                                            break;
                                        case 3:
                                            tipoDeTurismo = new TipoDeTurismo(300, LugaresTuristicos.CAICHOREIRA);
                                            break;
                                        default:
                                            System.out.println("Lugar inválido.");
                                            continue;
                                    }
                                    servicoGuia.definirLugar(tipoDeTurismo, fichaServico);
                                    System.out.println("Lugar definido: " + tipoDeTurismo.getLugar() + " - Preço: " + tipoDeTurismo.getPreco());
                                    break;

                                case 4:
                                case 5:
                                    ServicosDeQuarto servicoQuartoEscolhido = (servicoEscolhido == 4) ? ServicosDeQuarto.LIMPEZA : ServicosDeQuarto.LAVANDERIA;
                                    servicoQuarto = new S_ServicoQuarto(servicoQuartoEscolhido);
                                    servicoQuarto.definirServico(servicoQuartoEscolhido, fichaServico);
                                    System.out.println("Serviço solicitado: " + servicoQuartoEscolhido);
                                    break;

                                default:
                                    System.out.println("Serviço inválido.");
                            }
                        } else {
                            System.out.println("Ficha não encontrada.");
                        }
                        break;

                    case 3:
                        repositorioFicha.ListarFichas();
                        break;

                    case 4:
                        System.out.print("Digite o CPF da ficha: ");
                        String cpfTotal = scanner.nextLine();
                        Ficha fichaTotal = repositorioFicha.buscarFichaPorCpf(cpfTotal);
                        if (fichaTotal != null) {
                            System.out.println("Total a pagar: " + fichaTotal.getTotalPagar());
                        } else {
                            System.out.println("Ficha não encontrada.");
                        }
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.nextLine();
            }
        } while (opcao != 0);

        scanner.close();
    }
}
