# 1-exercicio-reaquecimento-pswa
Exercícios de Reaquecimento

Vamos fazer alguns exercícios para relembrar alguns conceitos e aproveitar para "desenferrujar" nossas habilidades de desenvolvimento.

1. Escreva, compile e execute o programa abaixo. Em seguida, troque sua implementação para que a classe Incremental seja Singleton. Execute novamente e veja os resultados. Em caso de dúvida, consulte seu par e o material de apoio no moodle.

    ```
    class Incremental {
        private static int count = 0;
        private int numero;
        public Incremental() {
            numero = ++count;
        }
        public String toString() {
            return "Incremental " + numero;
        }
     }

    public class TesteIncremental {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
              Incremental inc = new Incremental();
              System.out.println(inc);
            }
        }
     }
    ```
1. Escreva um programa que conte até 10 e envie os números para uma ferramenta de log. Esta ferramenta de log deve ser construída por uma fábrica. Utilize Factory Method para permitir a escolha entre dois tipos de log: em arquivo (log.txt) ou diretamente no console. A escolha deve ser por um parâmetro passado ao programa (“arquivo” ou “console”)
1. Escreva um programa que exiba uma mensagem diferente para cada dia da semana usando o padrão Strategy.
