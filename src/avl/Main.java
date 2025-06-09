package avl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao, valor;
        AVLint avl = new AVLint();

        do {
            System.out.println("\n0 - Encerrar");
            System.out.println("1 - Insere um valor na ABB");
            System.out.println("2 - Apresenta pós ordem os nós da ABB apresentando também o FB do nó");
            System.out.println("3 - Remover um valor na ABB");
            System.out.print("Digite: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0 -> {
                    System.out.println("Encerrado");
                    break;
                }
                case 1 -> {
                    System.out.print("Informe o valor: ");
                    valor = sc.nextInt();
                    avl.root = avl.inserirAVL(avl.root, valor);
                    avl.atualizaAlturas(avl.root);
                }
                case 2 -> {
                    System.out.println("\n--- Apresentação da AVL ---");
                    avl.mostraFB(avl.root);
                    System.out.println("-".repeat(27));
                }
                case 3 -> {
                    System.out.print("Informe o valor a ser removido: ");
                    valor = sc.nextInt();
                    avl.root = avl.removeValor(avl.root, valor);
                    avl.root = avl.atualizaAlturaBalanceamento(avl.root);
                    avl.atualizaAlturas(avl.root);
                }
                default -> System.out.println("Opção inválida");
            }

        } while (opcao != 0);
        sc.close();
    }
}