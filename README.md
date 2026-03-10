# 📚 Sistema de Gerenciamento de Biblioteca

Este projeto consiste no desenvolvimento de um **sistema de gerenciamento de biblioteca em Java**, capaz de controlar o cadastro de livros, empréstimos, devoluções e histórico de operações.

O sistema foi desenvolvido com o objetivo de aplicar **conceitos de estruturas de dados e programação orientada a objetos**, utilizando diferentes estruturas para resolver problemas reais de gerenciamento de informações.

---

## 🎯 Objetivo do Projeto

Simular o funcionamento básico de uma biblioteca digital, permitindo:

- cadastro de livros
- controle de empréstimos e devoluções
- gerenciamento de fila de espera
- registro de histórico de operações
- possibilidade de desfazer a última operação

O projeto foi desenvolvido como prática de **estruturas de dados aplicadas em Java**.

---

## 🧠 Estruturas de Dados Utilizadas

O sistema foi construído utilizando diferentes estruturas de dados, cada uma responsável por resolver um tipo específico de problema.

### 📋 Lista
Utilizada para armazenar os livros cadastrados no sistema.

Motivo da escolha:
- permite inserção e remoção flexível
- facilita a busca por títulos
- adequada para manipulação dinâmica de dados

---

### 📚 Pilha
Utilizada para armazenar o **histórico de operações do sistema**.

Motivo da escolha:
- segue o princípio **LIFO (Last In, First Out)**
- permite desfazer a última operação realizada

---

### 🔄 Fila Circular
Utilizada para gerenciar a **fila de espera para empréstimos de livros**.

Motivo da escolha:

- segue o princípio **FIFO (First In, First Out)**
- garante que o primeiro usuário da fila seja atendido primeiro
- otimiza o uso de memória em comparação com filas tradicionais

---
## 🏗 Arquitetura do Sistema

O sistema é organizado em diferentes classes responsáveis por representar as entidades e operações da biblioteca.

Exemplo de componentes do sistema:

- `Livro` → representa os livros cadastrados
- `Biblioteca` → gerencia os livros e operações
- `Lista` → armazena os livros
- `Pilha` → registra o histórico de operações
- `FilaCircular` → gerencia a fila de espera
- `Main` → executa o sistema

## ⚙️ Funcionalidades

### 📖 Cadastro de Livros
Permite registrar novos livros informando:

- título
- autor
- ano de publicação
- quantidade de exemplares

---

### ❌ Remoção de Livros
Remove livros do sistema a partir da busca pelo título.

---

### 🔍 Busca de Livros
Permite consultar informações de um livro armazenado no sistema.

---

### 📦 Empréstimo de Livros
Permite realizar empréstimos verificando a disponibilidade de exemplares.

Caso não haja exemplares disponíveis, o usuário é automaticamente colocado na **fila de espera**.

---

### 🔄 Devolução de Livros
Ao devolver um livro:

- o número de exemplares é atualizado
- o primeiro usuário da fila de espera é atendido automaticamente

---

### 📜 Histórico de Operações
Todas as operações realizadas no sistema são registradas em uma **pilha de histórico**, permitindo acompanhar as ações executadas.

---

### ↩️ Desfazer Última Operação
O sistema permite desfazer a última ação realizada utilizando o mecanismo de pilha.

---

### 📊 Consulta de Disponibilidade
Permite verificar quantos exemplares de um livro estão disponíveis.

---

## 🛠 Tecnologias Utilizadas

- **Java 8**
- **IntelliJ IDEA**
- Estruturas de dados implementadas em Java

---

## ▶️ Como Executar o Projeto

1️⃣ Abra o **Prompt de Comando (CMD)**

2️⃣ Navegue até o diretório do projeto

```bash
cd caminho/do/projeto
```
3️⃣ Execute o arquivo .jar
```bash
java -jar SistemaBiblioteca.jar
```
## 💡 Exemplos de Uso

Exemplos de operações realizadas pelo sistema:

- 📚 Cadastro de livros
- 📦 Empréstimo de livros
- 👥 Entrada de usuários na fila de espera
- 🔄 Devolução de livros
- 📜 Visualização do histórico de operações
- ↩️ Desfazer última operação

---

## 📖 Aprendizados

Durante o desenvolvimento deste projeto foram aplicados conceitos importantes como:

- Estruturas de dados
- Programação orientada a objetos (POO)
- Modelagem de sistemas simples
- Organização de código em Java
- Lógica de gerenciamento de operações

---

## 👨‍💻 Autor

**Pedro Vasconcelos de Pinho**

Estudante de Ciência da Computação
