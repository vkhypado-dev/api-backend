# 🚀 API Backend Básica em Java — Exemplo com `User`

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.0-brightgreen)
![MongoDB](https://img.shields.io/badge/MongoDB-Atlas-green)
![License](https://img.shields.io/badge/license-MIT-blue)

Este é um **projeto de exemplo** de uma **API REST** desenvolvida em **Java** com **Spring Boot**, contendo apenas um recurso (`User`) para demonstrar como implementar operações CRUD de forma simples.

---

## 📌 Funcionalidades

- ✅ Criar um usuário
- ✅ Listar todos os usuários
- ✅ Buscar um usuário por ID

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Data MongoDB**
- **Lombok**
- **Gradle**

---

## 📂 Estrutura de Pastas

```bash
src/
 ├── main/
 │   ├── java/br/com/backend/api/
 │   │   ├── controller/   # Endpoints do User
 │   │   ├── service/      # Regras de negócio
 │   │   ├── repository/   # Interface com banco de dados
 │   │   └── model/        # Classe User
 │   │   └── dto/          # Objetos de Transferência de Dados (DTOs) usados para receber e enviar informações na API
 │   └── resources/
 │       └── application.properties
