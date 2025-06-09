# AVL-Explorer

Aplicação em Java para gerenciamento de uma **Árvore AVL** com valores inteiros.  
A árvore AVL é uma variação da Árvore Binária de Busca (ABB) que se mantém **balanceada automaticamente** após inserções e remoções. Através de um menu interativo no console, é possível inserir, remover e visualizar os elementos da árvore, além de exibir o **Fator de Balanceamento (FB)** de cada nó.

---

## Funcionalidades

- Inserção de valores com balanceamento automático
- Remoção de valores da árvore
- Apresentação dos nós em **pós-ordem**, com o **FB (Fator de Balanceamento)** de cada nó
- Rotações simples e duplas para manter a árvore balanceada
- Atualização das alturas dos nós após cada operação

---

## Estrutura do Projeto

- `AVLint.java`: Classe principal da árvore AVL, contendo os métodos para inserção, remoção, balanceamento, rotações e visualização dos nós com seus fatores de balanceamento.
- `Main.java`: Classe com a interface de console para interação com o usuário.

---

## Detalhes sobre o Código

A classe `AVLint.java` foi desenvolvida com foco didático, especialmente para facilitar o entendimento de:
- **Recursividade** nas operações
- **Fatores de balanceamento**
- **Rotações** (simples e duplas) usadas para manter o equilíbrio da árvore

Os métodos de atualização de altura e balanceamento garantem que a árvore permaneça eficiente após cada modificação.

---

## Como Executar

Certifique-se de ter o **JDK instalado** (versão 11 ou superior recomendada).

1. Compile os arquivos:
```bash
javac Main.java AVLint.java
```
Execute o programa:
```bash
java Main
```
--- 
### Observações

O projeto foi desenvolvido com o objetivo de demonstrar o funcionamento de árvores AVL em Java.

Os fatores de balanceamento são úteis para entender o processo interno de manutenção do equilíbrio.

Ideal para estudantes de estrutura de dados que estão aprendendo sobre árvores balanceadas e recursividade.

---
## Exemplo de Uso
```text
0 - Encerrar
1 - Insere um valor na ABB
2 - Apresenta pós ordem os nós da ABB apresentando também o FB do nó
3 - Remover um valor na ABB
Digite: 1
Informe o valor: 50

0 - Encerrar
1 - Insere um valor na ABB
2 - Apresenta pós ordem os nós da ABB apresentando também o FB do nó
3 - Remover um valor na ABB
Digite: 1
Informe o valor: 30

0 - Encerrar
1 - Insere um valor na ABB
2 - Apresenta pós ordem os nós da ABB apresentando também o FB do nó
3 - Remover um valor na ABB
Digite: 1
Informe o valor: 70

0 - Encerrar
1 - Insere um valor na ABB
2 - Apresenta pós ordem os nós da ABB apresentando também o FB do nó
3 - Remover um valor na ABB
Digite: 1
Informe o valor: 10

0 - Encerrar
1 - Insere um valor na ABB
2 - Apresenta pós ordem os nós da ABB apresentando também o FB do nó
3 - Remover um valor na ABB
Digite: 1
Informe o valor: 90

0 - Encerrar
1 - Insere um valor na ABB
2 - Apresenta pós ordem os nós da ABB apresentando também o FB do nó
3 - Remover um valor na ABB
Digite: 2

--- Apresentação da AVL ---
Dado: 10 FB = 0
Dado: 30 FB = -1
Dado: 90 FB = 0
Dado: 70 FB = 1
Dado: 50 FB = 0
---------------------------

0 - Encerrar
1 - Insere um valor na ABB
2 - Apresenta pós ordem os nós da ABB apresentando também o FB do nó
3 - Remover um valor na ABB
Digite: 3
Informe o valor a ser removido: 30

0 - Encerrar
1 - Insere um valor na ABB
2 - Apresenta pós ordem os nós da ABB apresentando também o FB do nó
3 - Remover um valor na ABB
Digite: 2

--- Apresentação da AVL ---
Dado: 10 FB = 0
Dado: 90 FB = 0
Dado: 70 FB = 1
Dado: 50 FB = 0
---------------------------