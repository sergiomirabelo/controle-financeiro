# 💰 Controle Financeiro API

<p align="center">

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge&logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-8-blue?style=for-the-badge&logo=mysql)
![JWT](https://img.shields.io/badge/JWT-Authentication-black?style=for-the-badge&logo=jsonwebtokens)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-brown?style=for-the-badge&logo=hibernate)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)

</p>

---

## 📖 Sobre o projeto

O **Controle Financeiro API** é uma aplicação desenvolvida em **Java + Spring Boot** para gerenciamento financeiro pessoal.

A API permite que usuários realizem cadastro, autenticação segura via JWT, gerenciamento de categorias, transações financeiras e controle de orçamento mensal.

O objetivo deste projeto foi colocar em prática conceitos de desenvolvimento backend utilizados no mercado, como arquitetura em camadas, autenticação, banco de dados relacional e boas práticas com Spring.

---

# 🚀 Funcionalidades

✅ Cadastro de usuários

✅ Login com autenticação JWT

✅ Criptografia de senha com BCrypt

✅ CRUD de Categorias

✅ CRUD de Transações

✅ CRUD de Orçamentos

✅ Relacionamento entre entidades

✅ DTOs para requisição e resposta

✅ Persistência utilizando MySQL

✅ API REST seguindo boas práticas

---

# 🛠 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- JWT
- BCrypt
- MySQL
- Maven

---

# 📂 Estrutura do projeto

```
src
│
├── controller
├── dto
├── entity
├── repository
├── security
├── service
└── config
```

---

# 🔐 Autenticação

A autenticação é realizada utilizando **JWT (JSON Web Token)**.

Fluxo:

1. Cadastro do usuário
2. Login
3. Recebimento do Token JWT
4. Envio do Token no Header

```
Authorization: Bearer SEU_TOKEN
```

---

# 📌 Principais Endpoints

## Usuários

| Método | Endpoint |
|---------|----------|
| POST | /usuarios |
| GET | /usuarios |

---

## Login

| Método | Endpoint |
|---------|----------|
| POST | /login |

---

## Categorias

| Método | Endpoint |
|---------|----------|
| POST | /categorias |
| GET | /categorias |
| PUT | /categorias/{id} |
| DELETE | /categorias/{id} |

---

## Transações

| Método | Endpoint |
|---------|----------|
| POST | /transacoes |
| GET | /transacoes |
| PUT | /transacoes/{id} |
| DELETE | /transacoes/{id} |

---

## Orçamentos

| Método | Endpoint |
|---------|----------|
| POST | /orcamentos |
| GET | /orcamentos |
| PUT | /orcamentos/{id} |
| DELETE | /orcamentos/{id} |

---

# 🗄 Banco de Dados

O projeto utiliza **MySQL**.

Principais entidades:

- Usuário
- Categoria
- Transação
- Orçamento

Relacionadas através de chaves estrangeiras utilizando JPA/Hibernate.

---

# ▶ Como executar

### Clone o projeto

```bash
git clone https://github.com/SEU_USUARIO/controle-financeiro-api.git
```

### Entre na pasta

```bash
cd controle-financeiro-api
```

### Configure o banco de dados

Edite o arquivo:

```
application.properties
```

Configure:

```
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
```

---

### Execute

```bash
mvn spring-boot:run
```

---

# 📸 Demonstração

> Em breve serão adicionadas imagens do Postman demonstrando as funcionalidades da API.

---

# 🎯 Objetivo

Este projeto foi desenvolvido com foco em estudos e fortalecimento do meu portfólio Backend, aplicando conceitos utilizados no desenvolvimento de APIs profissionais.

---

# 👨‍💻 Autor

**Sergi**

LinkedIn:

*(adicione aqui seu perfil)*

GitHub:

*(adicione aqui seu GitHub)*

---

⭐ Caso tenha gostado do projeto, deixe uma estrela no repositório.
