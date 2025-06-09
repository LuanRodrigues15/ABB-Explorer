# ABB-Explorer

Aplicação em Java para gerenciamento de uma Árvore Binária de Busca (ABB) com valores inteiros. Através de um menu interativo no console, é possível inserir, remover, buscar e visualizar elementos da árvore utilizando diferentes tipos de percursos.

---

## Funcionalidades

- Inserção de valores na ABB
- Remoção de valores da ABB
- Exibição dos elementos:
    - Em ordem
    - Pré-ordem
    - Pós-ordem
- Contagem total de nós na ABB
- Consulta de existência de um valor
- Contagem de comparações realizadas durante uma busca
- Exibição do menor e maior valor da ABB

---

## Estrutura do Projeto

- **`ABBint.java`**: Classe principal da ABB, contendo todos os métodos recursivos para manipulação da árvore.
- **`Main.java`**: Classe com a interface de console para interação com o usuário.

### Detalhes sobre o Código

O código da classe **`ABBint.java`** está totalmente comentado para facilitar o entendimento, especialmente para quem está aprendendo sobre recursividade. A recursão pode ser um conceito desafiador, mas os comentários explicam detalhadamente como as operações funcionam e como os nós da árvore são manipulados de forma recursiva. Esses comentários visam ajudar a visualizar o processo passo a passo e esclarecer como a árvore é modificada a cada operação.

---

## Como Executar

1. Certifique-se de ter o JDK instalado (versão 11 ou superior recomendada).
2. Compile os arquivos:

    ```bash
    javac Main.java ABBint.java
    ```

3. Execute o programa:

    ```bash
    java Main
    ```

---

## Exemplo de Uso

```text
----------------------------
0 - Sair
1 - Inserir um valor na ABB
2 - Apresentar nós da ABB
3 - Quantidade de nós
4 - Consultar valor
5 - Apresenta o número de comparações para pesquisar um valor na ABB
6 - Remover valor da árvore
7 - Verificar valor máximo
8 - Verificar valor mínimo
----------------------------
Digite: 1
Informe o valor do dado: 50
