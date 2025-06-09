# Estrutura de Dados: ABB e AVL em Java

Este projeto contém duas implementações em Java de estruturas fundamentais de árvores binárias:

- **ABB (Árvore Binária de Busca)**
- **AVL (Árvore Binária Balanceada)**

Ambas permitem o gerenciamento de valores inteiros com inserção, remoção, busca e visualização através de uma interface de console interativa.

---

## 📚 Objetivo

Este projeto tem fins **educacionais**, com foco em ensinar:
- Conceitos de árvores binárias
- Implementação recursiva
- Balanceamento de árvores (AVL)
- Rotações e fatores de balanceamento

---

## 🧠 Funcionalidades

| Funcionalidade                     | ABB         | AVL         |
|------------------------------------|-------------|-------------|
| Inserção de valores                | ✅           | ✅           |
| Remoção de valores                 | ✅           | ✅           |
| Visualização (em ordem, pré, pós) | ✅           | Pós-ordem   |
| Busca de valor                     | ✅           | ❌           |
| Contagem de nós                    | ✅           | ❌           |
| Exibição de menor/maior valor     | ✅           | ❌           |
| Comparações em busca              | ✅           | ❌           |
| Fator de Balanceamento (FB)       | ❌           | ✅           |
| Rotações automáticas              | ❌           | ✅           |

---

## 🗂 Estrutura dos Arquivos

- `ABBint.java`: Implementação da Árvore Binária de Busca
- `AVLint.java`: Implementação da Árvore AVL
- `Main.java`: Interface de console para interação com o usuário

⚠️ O projeto pode ser dividido em dois `Main.java` separados ou unificados, conforme preferência.

---

## ▶️ Como Executar

1. Certifique-se de ter o **JDK 11 ou superior** instalado.
2. Compile os arquivos:

```bash
javac Main.java ABBint.java AVLint.java
