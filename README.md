# Projeto MongoDB com Spring Boot

Projeto que consiste em posts e comentários de usuários.

# Índice

* [Objetivos](#objetivos)
* [Tecnologias Utilizadas](#tecnologias-utilizadas)
* [Objetivos](#objetivos)
* [Modelagem](#modelagem)
* [Autoria](#autoria)

## Objetivos

1. Implementar operações de CRUD
2. Refletir sobre decisões de design para um banco de dados orientado a documentos
3. Implementar associações entre objetos
4. Objetos aninhados
5. Referências
6. Realizar consultas com Spring Data e MongoRepository

## Tecnologias Utilizadas

* Linguagem Java (versão 11)
* Spring Boot 2.1
* Maven
* MongoDB
* Postman (A collection dos requests se encontra na pasta "resources/documentos/collection")

## Modelagem
![Diagramacao](https://github.com/JessiiPer/workshop-spring-boot-mongodb/blob/master/src/main/resources/documents/diagramacao.PNG)

Depois de entender a necessidade do sistema, foi discutido alternativas de designer até chegar no modelo de agregados, 
onde foi definido os dados não normalizados para que eles sejam acessados de forma otimizada.

![Diagramacao](https://github.com/JessiiPer/workshop-spring-boot-mongodb/blob/master/src/main/resources/documents/json.PNG)

## Autoria
* Jessica Pereira Rocha

Obs: Projeto do curso "Java Completo 2020 Programação Orientada a Objetos + Projetos", disponível na plataforma Udemy, ministrado pelo professor Nélio Alves.
