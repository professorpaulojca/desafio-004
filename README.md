# Projeto iPhone - POO em Java

Este projeto é uma simulação orientada a objetos das principais funcionalidades de um iPhone, seguindo boas práticas de programação em Java. Ele faz parte de um desafio de modelagem de componentes utilizando interfaces e implementação concreta de múltiplas responsabilidades.

## 🎯 Objetivo

Demonstrar a aplicação de conceitos de Programação Orientada a Objetos como:
- Interfaces
- Encapsulamento
- Polimorfismo
- Responsabilidade única

## 📚 Funcionalidades

O sistema simula três principais componentes de um smartphone:

### 1. Reprodutor Musical
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### 2. Aparelho Telefônico
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### 3. Navegador na Internet
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

## 🧩 Estrutura de Arquivos

```
iphone-poo/
├── AparelhoTelefonico.java
├── Iphone.java
├── Main.java
├── NavegadorInternet.java
├── ReprodutorMusical.java
```

## ▶️ Como executar

1. Compile todos os arquivos:
   ```bash
   javac *.java
   ```

2. Execute a aplicação:
   ```bash
   java Main
   ```

## 🛠️ Requisitos

- Java 8 ou superior
- Terminal ou IDE (IntelliJ, Eclipse, VSCode)

## 🧑‍💻 Autor

Este projeto foi gerado com base em um desafio de orientação a objetos para fins educacionais.
