**Teste de Java Básico com Spring-Boot = Resolução primaria (Herança)**

- Desafio 1 ✅ - [CalculadoraIMC](https://github.com/DiogoMakotto/prova-Travelex/blob/master/src/main/java/br/com/confidencecambio/javabasico/controller/IMCController.java)

- Desafio 2 ✅ - *Herança* -  Essa implementação cria uma classe base chamada "CommonName" que contém as funções comuns a todas as classes que possuem um nome. 
As classes "Cliente", "Gerente" e "Robo" herdam de "CommonName" e definem apenas o construtor correspondente.
 As funções "getPrimeiroNome", "getUltimoNome", "getNomeCompleto" e "getNomeAbreviado" são definidas em "CommonName"e podem ser chamadas diretamente a partir das instâncias de qualquer uma das classes filhas. 

Prova de avaliação dos conhecimentos básicos de linguagem Java.

Para fazer a prova é necessário ter o java 11 e o maven 3.

O candidato deve ser implementar 2 desafios:


* Criar um serviço REST que recebe como parametros peso e altura, retornando o **IMC** que pode ser calculado pela formula abaixo:
  
    ` imc = Peso/Altura²` ´

* Dada uma classe Cliente, uma classe Gerente e uma classe Robo, todas devem ter um nome no qual deve atender aos seguintes requisitos:
`Não é necessário expor um serviço, queremos ver a lógica e organização`

    - [x] Nome não pode ser nulo
    - [x] Nome não pode ser vazio
    - [x] Nome não pode conter espaços extras no início e no fim
    - [x] Deve ser possível obter o primeiro nome. Exemplo: Se o nome for "João Soares Silva", deve retornar "João".
    - [x] Retornar o último nome. Exemplo: Se o nome for "João Soares Silva", deve retornar "Soares Silva".
    - [x] Retornar o nome todo em letras maiúsculas.
    - [x] Retornar o nome abreviado. Exemplo: Se o nome for "João Soares Silva", retornar "João S. Silva".
        

