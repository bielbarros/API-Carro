# Carros API - Java Spring Boot CRUD

Este projeto é uma API RESTful desenvolvida com **Java 21**, **Spring Boot**, **Lombok** e **Jakarta Persistence API**, com o objetivo de praticar boas práticas de arquitetura, padronização de entidades e recursos REST. A aplicação implementa um CRUD completo para gerenciamento de carros utilizando **MySQL** como banco de dados.

---

## 🚗 Funcionalidades

- ✅ Criar (POST) um novo carro
- ✅ Listar (GET) todos os carros
- ✅ Buscar (GET) carro por ID
- ✅ Atualizar (PUT) um carro existente
- ✅ Deletar (DELETE) um carro

---

## 🛠️ Tecnologias e Dependências

- Java 21+
- Spring Boot 3.x
- Spring Data JPA
- Jakarta Persistence (`jakarta.persistence`)
- Lombok
- MySQL
- Maven

---

## 📁 Estrutura do Projeto

```bash
src
└── main
    └── java
        └── com
            └── seuusuario
                └── carrosapi
                    ├── controller
                    ├── entity
                    ├── repository
                    └── service
    └── resources
        ├── application.properties
```

---

## 🧩 Exemplo de Entidade com Jakarta Persistence e Lombok

```java
package com.seuusario.carrosapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String modelo;
    private Integer ano;
}
```

---

## 🔄 Endpoints

| Método | Endpoint                    | Descrição               |
|--------|-----------------------------|--------------------------|
| GET    | `/api/carros/findAll`       | Lista todos os carros    |
| GET    | `/api/carros/findById/{id}` | Busca carro por ID       |
| POST   | `/api/carros/save`          | Cria um novo carro       |
| PUT    | `/api/carros/update/{id}`   | Atualiza carro por ID    |
| DELETE | `/api/carros/delete/{id}`   | Remove carro por ID      |

---

## ⚙️ Configuração do MySQL

Edite seu arquivo `application.properties` com as credenciais do seu banco:

```properties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/carros
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql: true
```

> ⚠️ Certifique-se de que o banco `carros` já foi criado no MySQL antes de rodar a aplicação.

---

## 🧪 Teste Local

1. Clone o projeto:

```bash
git clone https://github.com/bielbarros/API-Carro.git
cd carros
```

2. Rode a aplicação com:

```bash
./mvnw spring-boot:run
```

3. Acesse a API via [http://localhost:8080/carros](http://localhost:8080/carros)

---

