# API_REST_ESPORTE

## Descrição: 
Esta API permite a gestão de atividades esportivas. Os endpoints disponíveis permitem listar todos os itens, obter detalhes de um item específico pelo seu ID, adicionar novos itens e excluir itens existentes.

## Tecnologia utilizada:

- Linguagem: Java

- Framework: Spring Boot

- Banco de dodos: MySQL

- Teste da API: Postman

## Metodologia:
A metodologia REST (Representational State Transfer) é um estilo arquitetônico para criar serviços web que utilizam os métodos HTTP para realizar operações. Os recursos são representados por URLs, e as operações são realizadas usando métodos como GET, POST, PUT, e DELETE.

## Vantagens:

- Simplicidade: Usa métodos HTTP padrão, facilitando a implementação e uso.
  
- Escalabilidade: Pode lidar com um grande número de chamadas simultâneas.
  
- Flexibilidade: Pode ser usado com diferentes formatos de dados (JSON, XML).
  
- Independência: O cliente e o servidor são independentes, permitindo atualizações sem afetar a outra parte.

## Utilização: 

1 - Crie uma database MySql: 
```sql
create database dbesporte;
```
2 - Configure o caminho do banco de dados MySql em src> main> java> resources> application.properties
```properties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/dbesporte
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```
3 - Instale o Postman: https://www.postman.com/downloads/

4 - Mais informação sobre a API e os endpoints: https://documenter.getpostman.com/view/36752700/2sA3e1A9Vw




