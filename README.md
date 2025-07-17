# 📚 Java List Exercises

Este repositório contém alguns exercícios em Java com foco em manipulação de listas, ordenação, pesquisa e boas práticas de programação orientada a objetos.

---

## 📌 Descrição

Os exercícios fazem parte de um conjunto prático voltado para reforçar conceitos de estruturas de dados em Java, especialmente `List`, `Comparable`, `Comparator` e uso de `Collections`.

---

## 🧠 Conteúdo

### 🔎 Pesquisa em Listas

**1. Catálogo de Livros**  
Classe `CatalogoLivros` que gerencia uma lista de objetos do tipo `Livro`.

**Funcionalidades:**
- `adicionarLivro(String titulo, String autor, int anoPublicacao)`
- `pesquisarPorAutor(String autor)`
- `pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)`
- `pesquisarPorTitulo(String titulo)`

---

### 🔃 Ordenação em Listas

**1. Ordenação de Pessoas**  
Classe `OrdenacaoPessoas` que trabalha com objetos do tipo `Pessoa`.

**Funcionalidades:**
- `adicionarPessoa(String nome, int idade, double altura)`
- `ordenarPorIdade()` – usando `Comparable`
- `ordenarPorAltura()` – usando `Comparator`

**2. Ordenação de Números**  
Classe `OrdenacaoNumeros` que ordena listas de inteiros.

**Funcionalidades:**
- `adicionarNumero(int numero)`
- `ordenarAscendente()` – usando `Comparable`
- `ordenarDescendente()` – com `Comparator` personalizado

---

## 🧪 Testes Automatizados

Os testes estão sendo desenvolvidos utilizando **JUnit 5**, e cobrem os principais métodos das classes.

### Exemplos de testes implementados:
- **CatalogoLivrosTest**
  - Testa a adição de livros
  - Testa a pesquisa por autor

Os testes estão localizados no seguinte pacote:

```
src/
└── test/
    └── java/
        └── org/
            └── example/
                └── pesquisa/
                    └── CatalogoLivrosTest.java
```

---

## 📂 Estrutura do Projeto

```
java-list-exercises/
├── README.md
├── .gitignore
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── pesquisa/
│   │       │   ├── CatalogoLivros.java
│   │       │   ├── Livro.java
│   │       ├── ordenacao/
│   │       │   ├── OrdenacaoPessoas.java
│   │       │   ├── Pessoa.java
│   │       │   ├── OrdenacaoNumeros.java
│   ├── test/
│       └── java/
│           └── org/
│               └── example/
│                   └── pesquisa/
│                       └── CatalogoLivrosTest.java
```

---

## 🛠️ Tecnologias Utilizadas

- Java 17+ (ou versão compatível)
- JUnit 5
- Maven
- IDE de sua preferência (IntelliJ, Eclipse, VS Code)

---

## ▶️ Como Executar

### Compilação

```bash
javac src/main/java/pesquisa/*.java src/main/java/ordenacao/*.java
```

### Execução

```bash
java pesquisa.CatalogoLivros
```

> 💡 **Nota:** Certifique-se de ter o JDK instalado e configurado no `PATH`.

### Rodar testes com Maven

```bash
mvn test
```

---

## 🧑‍💻 Autor

Feito por **Diego Gonçalves**
