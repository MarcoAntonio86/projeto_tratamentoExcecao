# Sistema de Reservas de Quartos

Este projeto é uma aplicação simples em Java para gerenciar reservas de quartos em um hotel. Ele permite que o usuário cadastre uma reserva informando o número do quarto, a data de check-in e a data de check-out. Além disso, o sistema possibilita a atualização dessas datas, garantindo a consistência das regras de negócio.

Funcionalidades Principais

Criar uma nova reserva com número do quarto, data de check-in e data de check-out.

Exibir os detalhes da reserva, incluindo a duração da estadia.

Atualizar as datas de check-in e check-out de uma reserva existente.

Validação de regras de negócio, impedindo registros com datas inválidas.

Tratamento de exceções para garantir a robustez da aplicação.

Tecnologias Utilizadas

Java: Linguagem de programação principal do projeto.

API de Data e Hora (java.util.Date): Manipulação de datas.

SimpleDateFormat: Formatação de datas para entrada e saída de dados.

Scanner: Entrada de dados via terminal.

Tratamento de Exceções Personalizadas: Uso de DomainException para garantir regras de negócio.

Java Collections e Classes Utilitárias: Para manipulação eficiente de dados.

 Estrutura do Projeto
 📦 application
 ├── Program.java       # Classe principal que interage com o usuário
📦 model.entities
 ├── Reservation.java   # Classe que representa a reserva e suas regras
📦 model.exceptions
 ├── DomainException.java  # Classe para exceções personalizadas

 Explicação das Classes

Program.java (Ponto de Entrada)

Solicita ao usuário os dados da reserva (número do quarto, check-in e check-out).

Cria uma instância da classe Reservation.

Exibe os detalhes da reserva.

Permite a atualização das datas de check-in e check-out.

Trata erros como formato inválido de data e regras de negócio violadas.

Reservation.java (Entidade de Reserva)

Representa uma reserva com número do quarto, datas de check-in e check-out.

Implementa regras de validação:

O check-in e o check-out devem ser datas futuras.

O check-out deve ser posterior ao check-in.

Define um método duration() que calcula a duração da reserva em noites.

Contém um método updateDates() para modificar as datas, mantendo as validações.

Sobrescreve toString() para exibir os detalhes da reserva.

DomainException.java (Exceção Personalizada)

Classe que estende Exception para forçar o tratamento de erros relacionados às regras de negócio.

Lança mensagens de erro personalizadas quando as regras são violadas.

 Regras de Negócio Implementadas

Validação de Datas: O check-in e check-out devem ser datas futuras.

Ordem Cronológica: A data de check-out deve ser posterior ao check-in.

Tratamento de Erros:

Formato inválido de data (ParseException).

Tentativa de reserva com datas passadas (DomainException).

Tentativa de check-out antes do check-in (DomainException).

Erros inesperados são capturados com RuntimeException.

 Melhorias Futuras

Implementação de uma interface gráfica para melhor usabilidade.

Uso de API moderna de data e hora (java.time) em vez de java.util.Date.

Persistência de dados em banco de dados.

Testes unitários para garantir a integridade das regras de negócio.

 Esse projeto é um ótimo exemplo de manipulação de datas, tratamento de exceções e boas práticas de programação orientada a objetos em Java. Sinta-se à vontade para contribuir e sugerir melhorias!
