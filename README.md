# Sistema de Pedidos - Aluno B (Pedro Costa)

Este projeto é uma aplicação Spring Boot que implementa a parte do Aluno B no sistema de pedidos. Ele gerencia pedidos (pedidos) e utiliza comunicação via Feign Client para interagir com o serviço do Aluno A (UsuarioController) para cadastrar usuários.

## Descrição

O sistema permite:

- Criar um novo pedido, que automaticamente cadastra um usuário no serviço do Aluno A via Feign Client e salva o pedido no banco de dados.
- Visualizar pedidos de um usuário específico.

## Arquitetura

- **Controller**: `PedidoController` - Expõe endpoints REST para criar e visualizar pedidos.
- **Service**: `PedidoService` - Contém a lógica de negócio, incluindo a chamada ao Feign Client para cadastrar usuários.
- **Repository**: `PedidoRepository` e `UsuarioRepository` - Interfaces JPA para acesso aos dados.
- **Entity**: `Pedido` e `Usuario` - Representam as tabelas do banco de dados.
- **DTO**: `PedidoDTO` e `UsuarioDTO` - Objetos de transferência de dados.
- **Client**: `UsuarioClient` - Feign Client para consumir o serviço do Aluno A.

## Como Funciona

1. **Criar Pedido**:

   - O endpoint `POST /api/pedido/criar` recebe um `PedidoDTO` com `pedidoValorTotal`, `pedidoStatus` e `usuarioId`.
   - O serviço chama o Feign Client para cadastrar um usuário no serviço do Aluno A (endpoint `POST /api/usuario/cadastrar`).
   - Em seguida, cria e salva o pedido no banco de dados, associando ao usuário.
2. **Visualizar Pedidos**:

   - O endpoint `GET /api/pedido/usuario/{usuarioId}` retorna uma lista de pedidos para o usuário especificado.
3. **Integração com Aluno A**:

   - O Aluno A pode consultar pedidos dos usuários chamando o endpoint `GET /api/pedido/usuario/{usuarioId}` deste serviço.

## Como Executar

### Pré-requisitos

- Java 17
- Maven
- MySQL (configurado com o banco `20252_progweb1_manha_feign`)

### Configuração

1. Clone o repositório.
2. Configure o banco de dados em `src/main/resources/application.properties`:
   ```
   spring.datasource.url=jdbc:mysql://edumysql.acesso.rj.senac.br:3306/20252_progweb1_manha_feign
   spring.datasource.username=20252_progweb1_manha_feign
   spring.datasource.password=progweb1
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
   ```
3. Certifique-se de que o serviço do Aluno A esteja rodando em `http://localhost:8080`.

### Executar

1. Compile o projeto: `./mvnw clean compile`
2. Execute a aplicação: `./mvnw spring-boot:run`
3. A aplicação estará disponível em `http://localhost:8080`.

## Endpoints

- `POST /api/pedido/criar` - Cria um novo pedido.
  - Body: `{"pedidoValorTotal": 100.00, "pedidoStatus": 1, "usuarioId": 1}`
- `GET /api/pedido/usuario/{usuarioId}` - Lista pedidos de um usuário.

Todos os endpoints incluem `@CrossOrigin("*")` para permitir acesso de origens diferentes.

## Dependências

- Spring Boot Starter Web
- Spring Cloud Starter OpenFeign
- Spring Boot Starter Data JPA
- MySQL Workbench (Ou qualquer outro software que veja servidores Java)

## Observações

- Este projeto implementa apenas a parte do Aluno B. O Aluno A deve ter o UsuarioController com o endpoint `POST /api/usuario/cadastrar`.
- As entidades e DTOs foram ajustadas para corresponder ao esquema de banco fornecido.
- Em caso de erro na chamada Feign, o pedido pode não ser criado corretamente (depende da disponibilidade do serviço do Aluno A).
