<div align="center">
  
  # Mobile PI
  
  <img width="500" height="609" alt="image" src="https://github.com/user-attachments/assets/f8a42aa6-e815-4060-8ce9-4dd9845c3300" />
</div>

---

## Dependências

* **Spring Boot DevTools**: A aplicação é reiniciada mais rapidamente e faz *reload* em tempo real;
* **Spring Web**: Habilita montagem de ambientes web, incluindo RESTful;
* **HTTP Client**: É a integração do Spring Boot para cliente e template REST para fazer requisições HTTP;
* **Spring Data JPA**: Permite armazenamento de dados em SQL usando sistema de dados Spring e Hibernate;
* **H2 Database**: Provê um banco de dados rápido inserido na memória (cache ou arquivo local). 

## Passos necessários

Adaptar o `application.properties` para que o Hibernate se conecte com o banco de dados correto. Por padrão ele tentará conexões com o JPA, mas deverá se comunicar com outros bancos, caso seja esse o desejo. No exemplo abaixo configuramos o JPA e o banco de dados H2, determinando como queremos que o Hibernate funcione.

``` properties
spring.application.name=projeto1

# Configuração do H2
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:dbapp
# ou spring.datasource.url=jdbc:file:./data para direcionar a um arquivo local.
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=nome
spring.datasource.password=senha

# Configuração do JPA
spring.jpa.defer-datasource-initialization=true
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.dll-auto=update
# ATENÇÃO: A apresentação de dados no SQL só é viável para ambiente de desenvolvimento e testes. Não é seguro disponibilizar a visualização para projetos reais.
spring.jpa.show-sql=true

```
