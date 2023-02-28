package br.com.confidencecambio.javabasico.model;

 //As classes "Cliente", "Gerente" e "Robo" herdam de "Pessoa" e definem apenas o construtor correspondente.
 // As funções "getPrimeiroNome", "getUltimoNome", "getNomeCompleto" e "getNomeAbreviado" são definidas em "Pessoa"
 // e podem ser chamadas diretamente a partir das instâncias de qualquer uma das classes filhas.
public class CommonName {
        protected String nome;

        public CommonName(String nome) {
            setNome(nome);
        }

        //Nome não pode ser nulo/vazio e não pode conter espaços extras no início e no fim
        public void setNome(String nome) {
            if (nome != null && !nome.trim().isEmpty()) {
                this.nome = nome.trim();
            } else {
                throw new IllegalArgumentException("Nome inválido");
            }
        }
        //Obter o primeiro nome
        public String getPrimeiroNome() {
            String[] partesNome = nome.split(" ");
            return partesNome[0];
        }

        //Retornar o último nome
        public String getUltimoNome() {
            String[] partesNome = nome.split(" ");
            return nome.substring(nome.indexOf(partesNome[partesNome.length - 1]));
        }

        //Retornar o nome todo em letras maiúsculas
        public String getNomeCompleto() {
            return nome.toUpperCase();
        }

        //Retornar o nome abreviado
        public String getNomeAbreviado() {
            String[] partesNome = nome.split(" ");
            StringBuilder abreviado = new StringBuilder(partesNome[0]);
            for (int i = 1; i < partesNome.length - 1; i++) {
                abreviado.append(" ").append(partesNome[i].charAt(0)).append(".");
            }
            abreviado.append(" ").append(partesNome[partesNome.length - 1]);
            return abreviado.toString();
        }
    }

