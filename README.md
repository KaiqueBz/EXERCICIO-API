# Sistema de Usuários em Java

Projeto desenvolvido em Java com o objetivo de praticar **boas práticas de arquitetura**, **orientação a objetos** e **separação de responsabilidades**, simulando a estrutura utilizada em aplicações backend reais.

---

## 📌 Objetivo do Projeto

Implementar um sistema simples de gerenciamento de usuários, aplicando conceitos fundamentais do desenvolvimento backend, como:
- Encapsulamento
- Camadas bem definidas
- Regras de negócio centralizadas
- Código limpo e organizado

Este projeto foi desenvolvido como exercício prático para estudos e preparação para entrevistas técnicas.

---

## 🏗️ Arquitetura Utilizada

O projeto segue uma arquitetura em camadas:

Controller → Service → Repository → Entidade


### 📂 Estrutura das Camadas

- **Entidade (`Usuario`)**
  - Representa o domínio da aplicação
  - Contém atributos e comportamentos do usuário
  - Não possui lógica de negócio nem acesso a dados

- **Repository (`UsuarioRepository`)**
  - Responsável por armazenar, buscar e listar usuários
  - Abstrai a forma de persistência dos dados
  - Não toma decisões de negócio

- **Service (`UsuarioService`)**
  - Camada onde ficam as regras de negócio
  - Realiza validações e decisões do sistema
  - Orquestra chamadas ao repository

- **Controller (`UsuarioController`)**
  - Camada de entrada da aplicação
  - Recebe solicitações e delega ao service
  - Simula o comportamento de um controller em uma API

- **Main**
  - Responsável por inicializar o sistema
  - Conecta as dependências e executa testes

---

## ⚙️ Funcionalidades Implementadas

- Criar usuário
- Listar usuários
- Buscar usuário por ID
- Desativar usuário
- Validação para evitar duplicidade de usuários

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Baixo acoplamento
- Alta coesão
- Separação de responsabilidades
- Organização em camadas
- Versionamento com Git e GitHub

---

## 🚀 Tecnologias Utilizadas

- Java
- Git
- GitHub
- IntelliJ IDEA

---

Projeto desenvolvido para fins de estudo e evolução técnica na área de desenvolvimento backend em Java.
