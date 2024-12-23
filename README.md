
# SpringApiREST-DesignPatterns

## Introdução

Este projeto demonstra a implementação de uma API RESTful utilizando o framework Spring Boot. O objetivo principal é apresentar a aplicação de diversos padrões de projeto (Design Patterns) como Singleton, Factory, Builder, Strategy, entre outros. O projeto serve como um exemplo prático de como estruturar e desenvolver APIs RESTful de forma eficiente, modular e escalável.

## Sumário

- [Instalação](#instalação)
- [Uso](#uso)
- [Funcionalidades](#funcionalidades)
- [Dependências](#dependências)
- [Configuração](#configuração)
- [Documentação](#documentação)
- [Exemplos](#exemplos)
- [Contribuidores](#contribuidores)
- [Licença](#licença)

## Instalação

Para executar este projeto localmente, siga os passos abaixo:

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/jomatheux/SpringApiREST-DesignPatterns.git
   ```

2. **Acesse o diretório do projeto:**

   ```bash
   cd SpringApiREST-DesignPatterns
   ```

3. **Compile o projeto com Maven:**

   ```bash
   ./mvnw clean install
   ```

## Uso

Após a instalação, você pode executar a aplicação com o comando abaixo:

```bash
./mvnw spring-boot:run
```

A aplicação estará disponível no endereço padrão:

```
http://localhost:8080
```

Você pode interagir com a API utilizando ferramentas como [Postman](https://www.postman.com/) ou diretamente através de navegadores e terminais.

## Funcionalidades

O projeto inclui as seguintes funcionalidades:

- **Design Patterns:** Implementação de diversos padrões de projeto, como:
  - Singleton
  - Factory
  - Strategy entre outros.
- **Estrutura modular:** Facilitando a manutenção e a escalabilidade.
- **API RESTful:** Bem estruturada, seguindo as melhores práticas para desenvolvimento de APIs.

## Dependências

Este projeto utiliza as seguintes dependências principais:

- **Java 17** ou superior
- **Maven 3.6.3** ou superior
- **Spring Boot 3.3.3** ou superior

Para uma lista completa de dependências, consulte o arquivo `pom.xml`.

## Configuração

As configurações da aplicação podem ser ajustadas no arquivo `application.properties`, localizado em:

```
src/main/resources/application.properties
```

Neste arquivo, você pode configurar parâmetros como:

- Porta do servidor (padrão: `8080`)
- Credenciais e URL do banco de dados
- Outros detalhes específicos da aplicação.

## Documentação

Para entender melhor o funcionamento dos padrões de projeto utilizados e a estrutura da API, você pode consultar:

- [Documentação oficial do Spring Boot](https://spring.io/projects/spring-boot)
- [Guia de Design Patterns](https://refactoring.guru/design-patterns)

## Exemplos

Abaixo está um exemplo de requisição para a API utilizando o `curl`:

```bash
curl -X GET http://localhost:8080/api/exemplo
```

Este comando retorna um exemplo de resposta JSON fornecida pela API.

Se preferir, você pode utilizar o [Postman](https://www.postman.com/) para testar diferentes endpoints.

## Contribuidores

Este projeto foi desenvolvido por:

- [jomatheux](https://github.com/jomatheux)

Sinta-se à vontade para contribuir ou abrir issues no repositório.
