# Sistema de Cadastro de Clientes

Este projeto é uma aplicação web completa desenvolvida como requisito acadêmico. O sistema implementa um cadastro de clientes utilizando a arquitetura MVC, garantindo a separação de responsabilidades entre as camadas de visualização, controle, serviço e persistência de dados.

## Tecnologias Utilizadas

* **Java 17+**
* **Jakarta EE / JSF (Jakarta Server Faces)**: Para a interface do usuário.
* **JPA (Jakarta Persistence API) / Hibernate**: Para ORM e persistência de dados.
* **PostgreSQL**: Banco de dados relacional.
* **Maven**: Gerenciamento de dependências e build.

## Estrutura do Projeto

O projeto segue uma arquitetura em camadas bem definida:

* **Model**: Entidade `Cliente` mapeada com JPA.
* **Repository**: Camada de acesso a dados (DAO) responsável pelas operações no banco.
* **Service**: Camada de regras de negócio e validações.
* **Controller**: Managed Bean responsável por conectar a view às camadas de negócio.
* **View**: Páginas `.xhtml` para interação com o usuário.