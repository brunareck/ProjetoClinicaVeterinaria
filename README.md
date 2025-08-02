# 🐾 Sistema de Gerenciamento para Clínica Veterinária 

![Java](https://img.shields.io/badge/Java-11+-ED8B00?logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/Paradigma-OOP-blue)
![Clean Code](https://img.shields.io/badge/Prática-Clean%20Code-lightgrey)

### 📄 Sobre o Projeto

Este é um projeto **Java** que demonstra a implementação de um sistema de gerenciamento básico para uma clínica veterinária. O foco principal é a aplicação de conceitos de **Programação Orientada a Objetos (POO)**, como herança, polimorfismo e encapsulamento, para criar um código limpo, modular e de fácil manutenção.

---

### ✨ Destaques Técnicos

* **Herança e Polimorfismo**: Utilização de uma classe abstrata `Pessoa` para herança por `Tutor` e `Veterinario`, demonstrando a capacidade de modelar entidades de forma eficiente.
* **Encapsulamento e Organização**: O código está estruturado em pacotes (`modelo` e `teste`), garantindo a separação de responsabilidades e facilitando a organização do projeto.
* **Tratamento de Dados**: Uso da API `java.time` para manipulação segura e moderna de datas e horários de consultas.
* **Estrutura de Dados**: Implementação da interface `List` com `ArrayList` para gerenciar coleções de objetos, como a lista de animais de um tutor.
* **Código Limpo**: O projeto foi desenvolvido com foco em legibilidade e boas práticas de código, facilitando a compreensão e futuras expansões.

---

### 🚀 Como Executar

Para rodar o projeto, você precisa de um JDK instalado (versão 11 ou superior é recomendada).

1.  Clone o repositório:
    ```sh
    git clone [https://github.com/seu-usuario/seu-projeto.git](https://github.com/seu-usuario/seu-projeto.git)
    cd seu-projeto
    ```
2.  Compile as classes Java a partir do diretório raiz:
    ```sh
    javac -d . src/modelo/*.java src/teste/*.java
    ```
3.  Execute a classe principal:
    ```sh
    java teste.ClinicaVeterinaria
    ```

---

### 📂 Estrutura do Projeto

* `src/modelo/`: Contém as classes de modelo (`Animal`, `Consulta`, `Pessoa`, `Tutor`, `Veterinario`) que definem as entidades do sistema.
* `src/teste/`: Contém a classe principal `ClinicaVeterinaria.java` para execução e testes.

---
