package abb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;
        int cont = 0;
        int valor;
        ABBint abb = new ABBint();

        do {
            System.out.println("----------------------------");
            System.out.println("0 - Sair\n1 - Inserir um valor na ABB\n2 - Apresentar nós da ABB\n3 - Quantidade de nós\n4 - Consultar valor\n5 - Apresenta o número de comparações para pesquisar um valor na ABB\n6 - Remover valor da árvore\n7 - Verificar valor máximo\n8 - Verificar valor mínimo");
            System.out.println("----------------------------");
            System.out.print("Digite: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0 -> System.out.println("Programa encerrado");
                case 1 -> {
                    // Inserir na ABB
                    System.out.print("Informe o valor do dado: ");
                    valor = sc.nextInt();
                    cont++;
                    abb.root = abb.inserir(abb.root, valor);
                }
                case 2 -> {
                    System.out.print("Como deseja apresentar os dados?\n1 - Em ordem\n2 - Pré-Ordem\n3 - Pós-Ordem\nDigite: ");
                    int apresentarDados = sc.nextInt();

                    switch (apresentarDados) {
                        case 1:
                            System.out.println("Mostrar Em Ordem: ");
                            abb.mostraEmOrdem(abb.root);
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("Mostra Pré-Ordem: ");
                            abb.mostraPreOrdem(abb.root);
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("Mostra Pós-Ordem: ");
                            abb.mostraPosOrdem(abb.root);
                            System.out.println();
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            System.out.print("Como deseja apresentar os dados?\n1 - Em ordem\n2 - Pré-Ordem\n3 - Pós-Ordem\nDigite: ");
                            apresentarDados = sc.nextInt();
                    }
                }
                case 3 -> System.out.println("Quantidade de nós = " + abb.contaNOS(abb.root, 0));
                case 4 -> {
                    System.out.print("Informe o valor a ser procurado: ");
                    valor = sc.nextInt();
                    System.out.println(abb.isConsulta(abb.root, valor) ? "Valor esta na ABB" : "Valor não encontrado na ABB");
                }
                case 5 -> {
                    System.out.println("Informe o valor a ser procurado");
                    valor = sc.nextInt();
                    int comparacoes = abb.contaConsulta(abb.root, valor, 0);
                    System.out.println("Número de comparações realizadas na busca " + comparacoes);
                }
                case 6 -> {
                    System.out.print("Informe o valor a ser removido: ");
                    valor = sc.nextInt();
                    abb.root = abb.removeValor(abb.root, valor);
                }
                case 7 -> {
                    if (abb.root != null) {
                        System.out.println("Maior valor na ABB: " + abb.maximo(abb.root));
                    } else {
                        System.out.println("ABB vazia");
                    }
                }
                case 8 -> {
                    if (abb.root != null) {
                        System.out.println("Menor valor na ABB: " + abb.minimo(abb.root));
                    } else {
                        System.out.println("ABB vazia");
                    }
                }
                default -> System.out.println("Opção inválida");
            }

        } while (opcao != 0);

    }
}
