<div align="center">

# 💰 Controle Financeiro API

### API REST desenvolvida com Spring Boot para gerenciamento financeiro pessoal.

![Java](https://img.shields.io/badge/Java-17-red?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3.2-6DB33F?style=for-the-badge&logo=springboot)
![Spring Security](https://img.shields.io/badge/Spring_Security-6-6DB33F?style=for-the-badge&logo=springsecurity)
![JWT](https://img.shields.io/badge/JWT-Authentication-black?style=for-the-badge)
![Hibernate](https://img.shields.io/badge/Hibernate-JPA-brown?style=for-the-badge&logo=hibernate)
![MySQL](https://img.shields.io/badge/MySQL-Database-4479A1?style=for-the-badge&logo=mysql)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-85EA2D?style=for-the-badge&logo=swagger)

</div>

---

# 📖 Sobre o projeto

O **Controle Financeiro API** é uma API REST desenvolvida para gerenciamento financeiro pessoal.

O sistema permite cadastrar usuários, autenticar utilizando JWT, gerenciar categorias, registrar receitas e despesas, controlar orçamentos mensais e gerar relatórios financeiros.

Todo o projeto foi desenvolvido utilizando boas práticas de arquitetura em camadas, DTOs e autenticação baseada em tokens.

---

# 🚀 Funcionalidades

✅ Cadastro de usuários

✅ Login com JWT

✅ Autenticação com Spring Security

✅ CRUD de Categorias

✅ CRUD de Transações

✅ Controle de Orçamentos

✅ Relatórios Financeiros

✅ DTOs para requisições e respostas

✅ Tratamento global de exceções

✅ Documentação automática com Swagger

---

# 🛠 Tecnologias

- Java 17
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Swagger / OpenAPI

---

# 📂 Estrutura do Projeto


src
├── controller
├── dto
├── entity
├── repository
├── security
├── service
├── exception
└── config


---

# 🔒 Autenticação

A API utiliza autenticação baseada em **JWT (JSON Web Token)**.

Fluxo:

1. Cadastro do usuário

2. Login

3. Recebimento do Token JWT

4. Utilização do Token nas requisições protegidas

---

# 📑 Documentação

Após iniciar a aplicação:


http://localhost:8080/swagger-ui/index.html


Toda a documentação da API pode ser acessada diretamente pelo Swagger.

---

# 📸 Demonstração

## Swagger

<img width="1193" height="962" alt="image" src="https://github.com/user-attachments/assets/181bfe7a-02a0-4b0f-a671-ba51883e42dc" />


---

## Login

<img width="1171" height="891" alt="image" src="https://github.com/user-attachments/assets/28c75725-fe8d-40c5-b1a5-1a3dff7d5ced" />


---

## Listagem de Transações

<img width="1188" height="961" alt="image" src="https://github.com/user-attachments/assets/70730f29-5b20-4754-8335-5d4dc7e8fb33" />


---

## Controle de Orçamentos

<img width="1197" height="888" alt="image" src="https://github.com/user-attachments/assets/060ba5f4-23a2-4d88-86fd-09dbbc21ee18" />


---

# ▶️ Como executar

Clone o projeto


git clone https://github.com/SEU_USUARIO/controle-financeiro.git


Entre na pasta


cd controle-financeiro


Configure o banco MySQL e altere o arquivo:


application.properties


Execute:


mvn spring-boot:run


---

# 👨‍💻 Autor

LinkedIn: www.linkedin.com/in/sergio-mirabelo

GitHub: https://github.com/sergiomirabelo
