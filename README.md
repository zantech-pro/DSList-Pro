# Projeto Spring Boot - API REST de Games (DSList PRO)

## Descrição do Projeto

Este projeto tem como objetivo criar uma **API REST** em Spring Boot para acessar e consumir uma lista de jogos (`Games`).  
Nesta **primeira etapa**, o foco foi preparar o ambiente, explorar o Spring Boot, construir a primeira entidade e implementar as camadas básicas do projeto seguindo boas práticas de **orientação a domínio**, além de testar os endpoints via **Postman**.

---

## Tecnologias e Ferramentas Utilizadas

- **Java 21** (versão estável escolhida)  
- **Spring Boot** (inicializado via [https://start.spring.io](https://start.spring.io))  
- **Spring Web** (para criar endpoints REST)  
- **Spring Data JPA** (para mapeamento ORM e persistência)  
- **H2 Database** (banco de dados em memória para testes)  
- **PostgreSQL Driver** (preparação para integração futura com PostgreSQL)  
- **Postman** (para consumir e testar a API)

---

## Estrutura do Projeto

O projeto foi organizado por pacotes seguindo **Domain-Driven Design (DDD)**:

- **Domain**: contém as entidades do projeto (ex.: `Game`).  
- **Repository**: interfaces JPA para comunicação com a base de dados.  
- **Service**: camada de negócio, consumindo o Repository.  
- **Controller**: endpoints REST, recebendo requisições HTTP (`GET`) e retornando dados da camada de serviço.
- <img width="271" height="241" alt="image" src="https://github.com/user-attachments/assets/22307bb5-f9ed-4a0e-ad95-96c911766bf6" />


---

## Etapas Realizadas

1. **Configuração Inicial do Spring Boot**  
   - Seleção das dependências necessárias para o projeto.
   - <img width="1498" height="722" alt="image" src="https://github.com/user-attachments/assets/d4463c0b-43ec-45d6-985a-aa011d42bac1" />

   - Ajustes no arquivo `application.properties` para configurar o banco H2 em memória.
   - <img width="199" height="86" alt="image" src="https://github.com/user-attachments/assets/8590358f-3f30-492b-b624-033a0ee7fc8f" />
   <img width="563" height="92" alt="image" src="https://github.com/user-attachments/assets/70804e42-ac41-4c2b-b877-5074ee38bf5d" />
   <img width="399" height="216" alt="image" src="https://github.com/user-attachments/assets/b296e2d1-178f-40e7-a04e-22b8f66cc4a4" />




2. **Implementação da Entidade `Game`**  
   - Criação da classe `Game` com as anotações JPA (`@Entity`, `@Table`, `@Id`, `@Column`).  
   - Estruturação dos campos da tabela, mapeando atributos Java para colunas do banco.  
   - Observação: o Hibernate subiu automaticamente o banco H2 em memória, criando a tabela `TB_GAME`.
   - <img width="813" height="425" alt="image" src="https://github.com/user-attachments/assets/93bbd67e-b2f5-46c0-b457-2d461778522b" />

  

3. **População da Base de Dados**  
   - Criação do arquivo `import.sql` com comandos `INSERT` para popular a tabela `TB_GAME` com dados de teste.
   - <img width="232" height="116" alt="image" src="https://github.com/user-attachments/assets/795abffd-04ac-4703-9b23-f3e9a2804d20" />

   - Validação do funcionamento via **H2 Console**.  

4. **Criação de Camadas Repository, Service e Controller**  
   - **Repository**: interface que conversa com o JPA para persistência.  
   - **Service**: camada que recebe dados do Repository e encapsula lógica de negócio.  
   - **Controller**: endpoints REST (`@RestController` + `@GetMapping`) para disponibilizar dados via HTTP.  

5. **Consumo da API via Postman**  
   - Teste dos endpoints REST usando o Postman, verificando que os dados da entidade `Game` eram retornados corretamente.  
   - Aprendizado sobre como consumir APIs REST, testar rotas e analisar respostas JSON.
   - <img width="1493" height="806" alt="image" src="https://github.com/user-attachments/assets/7f28cfb2-3e26-488c-8fbd-6d02ade6a4cc" />


---

## Aprendizados e Conquistas

- Configuração de um projeto Spring Boot do zero via [start.spring.io](https://start.spring.io).  
- Uso de **Spring Data JPA** e **Hibernate** para criação automática de tabelas e persistência de dados.  
- Estruturação de projeto orientado a domínio, separando camadas de **Domain, Repository, Service e Controller**.  
- Criação e execução de scripts `import.sql` para popular a base H2.  
- Implementação de **endpoints REST** e consumo de dados via Postman.  
- Experiência prática com anotações Spring Boot e mapeamento ORM.  

---

## Próximos Passos

- Criar endpoints adicionais (POST, PUT, DELETE).  
- Migrar a base H2 para PostgreSQL para persistência real.  
- Implementar validações e tratamento de exceções na API.  
- Criar testes unitários e de integração para a API.  
- Documentar endpoints usando Swagger ou outra ferramenta similar.  

---

## Como Rodar

1. Clone o repositório:  
```bash
git clone https://github.com/zantech-pro/DSList-Pro.git
