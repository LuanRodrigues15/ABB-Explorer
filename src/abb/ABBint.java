package abb;

public class ABBint {

    protected NO root = null; // Raiz da Árvore Binária de Busca

    // Definição do nó da ABB
    private class NO {
        int dado;
        NO esq, dir;
    }

    // Inserir um elemento na ABB de forma recursiva
    public NO inserir(NO p, int info) {
        if (p == null) { // Caso base: se a posição está vazia, cria um novo nó
            p = new NO();
            p.dado = info;
            p.esq = null;
            p.dir = null;
        } else if (info < p.dado) { // Se o valor for menor, insere na subárvore esquerda
            p.esq = inserir(p.esq, info);
        } else { // Se o valor for maior ou igual, insere na subárvore direita
            p.dir = inserir(p.dir, info);
        }
        return p; // Retorna o nó atualizado
    }

    // Remover um valor da ABB de forma recursiva
    public NO removeValor(NO p, int info) {
        if (p != null) {
            if (info == p.dado) { // Encontrou o nó a ser removido
                if (p.esq == null && p.dir == null) // Caso 1: Nó folha (sem filhos)
                    return null; // Apenas remove o nó
                if (p.esq == null) { // Caso 2: Nó tem apenas filho à direita
                    return p.dir; // O filho direito assume a posição
                } else if (p.dir == null) { // Caso 3: Nó tem apenas filho à esquerda
                    return p.esq; // O filho esquerdo assume a posição
                } else { // Caso 4: Nó tem dois filhos
                    // Encontra o menor valor na subárvore direita
                    NO aux, ref;
                    ref = p.dir; // Referência ao nó direito
                    aux = p.dir;
                    while (aux.esq != null) // Percorre até encontrar o menor valor
                        aux = aux.esq;
                    aux.esq = p.esq; // Conecta a subárvore esquerda do nó removido ao menor da direita
                    return ref; // Retorna a nova referência para manter a estrutura da árvore
                }
            } else { // Caso recursivo: continua procurando o valor na ABB
                if (info < p.dado)
                    p.esq = removeValor(p.esq, info); // Busca na esquerda
                else
                    p.dir = removeValor(p.dir, info); // Busca na direita
            }
        }
        return p; // Retorna o nó atualizado
    }

    // Percurso Em-Ordem: visita a esquerda, a raiz e a direita (crescente)
    public void mostraEmOrdem(NO p) {
        if (p != null) {
            mostraEmOrdem(p.esq); // Visita a subárvore esquerda
            System.out.print(p.dado + "\t"); // Processa o nó atual
            mostraEmOrdem(p.dir); // Visita a subárvore direita
        }
    }

    // Percurso Pré-Ordem: visita a raiz, esquerda e depois a direita
    public void mostraPreOrdem(NO p) {
        if (p != null) {
            System.out.print(p.dado + "\t"); // Acessa e imprime o dado do nó atual (raiz primeiro)
            if (p.esq != null)              // Se existe um filho esquerdo
                mostraPreOrdem(p.esq);            // Chama recursivamente para percorrer a subárvore esquerda
            if (p.dir != null)              // Se existe um filho direito
                mostraPreOrdem(p.dir);            // Chama recursivamente para percorrer a subárvore direita
        }                                   // Se p é null, retorna sem fazer nada (fim da recursão)
    }

    // Percurso: visita os filhos esquerdos e direito, depois o pai e por último a raiz
    public void mostraPosOrdem(NO p) {
        if (p != null) {                    // Verifica se o nó atual não é nulo (caso base implícito)
            if (p.esq != null)              // Se existe um filho esquerdo
                mostraPosOrdem(p.esq);            // Chama recursivamente para percorrer a subárvore esquerda
            if (p.dir != null)              // Se existe um filho direito
                mostraPosOrdem(p.dir);            // Chama recursivamente para percorrer a subárvore direita
            System.out.print(p.dado + "\t"); // Após percorrer esquerda e direita, acessa o dado do nó atual (raiz por último)
        }
    }


    // Recursivo para contar o número de nós na ABB
    public int contaNOS(NO p, int cont) {
        if (p != null) {
            cont++; // Conta o nó atual
            cont = contaNOS(p.esq, cont); // Conta na subárvore esquerda
            cont = contaNOS(p.dir, cont); // Conta na subárvore direita
        }
        return cont; // Retorna a contagem total
    }

    // Buscar um valor na ABB (retorna true se existir)
    public boolean isConsulta(NO p, int valor) {
        if (p == null) { // Caso base: valor não encontrado
            return false;
        } else if (valor == p.dado) { // Caso base: valor encontrado
            return true;
        } else if (valor < p.dado) { // Se o valor for menor, busca na subárvore esquerda
            return isConsulta(p.esq, valor);
        } else { // Se o valor for maior, busca na subárvore direita
            return isConsulta(p.dir, valor);
        }
    }

    // Conta quantas comparações foram feitas para encontrar um valor na ABB
    public int contaConsulta(NO p, int valor, int cont) {
        if (p != null) {
            cont++; // Conta a comparação feita
            if (valor == p.dado) {
                return cont; // Retorna o número de comparações ao encontrar o valor
            } else if (valor < p.dado) {
                cont = contaConsulta(p.esq, valor, cont); // Busca na esquerda
            } else {
                cont = contaConsulta(p.dir, valor, cont); // Busca na direita
            }
        }
        return cont; // Retorna o número total de comparações
    }

    // Retorna o maior valor armazenado na ABB
    public int maximo(NO p) {
        NO aux = p;
        while (aux.dir != null) {
            aux = aux.dir;
        }
        return aux.dado;
    }

    // Retorna o menor valor armazenado na ABB
    public int minimo(NO p) {
        NO aux = p;
        while (aux.esq != null) {
            aux = aux.esq;
        }
        return aux.dado;
    }
}
