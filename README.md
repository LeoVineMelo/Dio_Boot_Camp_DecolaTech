# Customer Feedback API

Este é um sistema RESTful construído com Spring Boot para gerenciar **clientes**, **produtos**, **compras** e **feedbacks**, com foco em empresas que desejam acompanhar a experiência de seus clientes e enviar **lembretes automáticos de recompra**.

## 🔧 Tecnologias Utilizadas

- Java 21+
- Spring Boot 3
- Spring Data JPA
- Spring Security (em progresso)
- PostgreSQL
- H2 (para testes)
- Swagger/OpenAPI
- Maven

## 📋 Funcionalidades

- ✅ Cadastro, listagem, atualização e exclusão de:
  - Clientes (`Customer`)
  - Produtos (`Product`)
  - Compras (`Purchase`)
  - Feedbacks (`Feedback`)
- ✅ Relacionamentos entre entidades
- ✅ Registro de feedbacks com associação a clientes
- ✅ Registro de compras associando clientes e produtos
- ✅ Endpoint para buscar todas as compras de um cliente
- ✅ Diagrama de Classes em Mermaid
- 🔄 Em andamento: lógica para lembrete de recompra
- ✅ Documentação automática com Swagger

## 🚀 Como Rodar Localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/Dio_Boot_Camp_DecolaTech.git
   cd Dio_Boot_Camp_DecolaTech
