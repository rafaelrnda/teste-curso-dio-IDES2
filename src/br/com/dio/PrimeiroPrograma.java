package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        String nome;
        Livro livro1 = new Livro(nome: "O problema dos 3 corpos", numPaginas: 300);
        System.out.println(livro1);
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }
}

    class Livro {
        private String nome;
        private Integer numPagigas;

        public Livro(String nome, Integer numPagigas) {
            this.nome = nome;
            this.numPagigas = numPagigas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPagigas() {
            return numPagigas;
        }

        public void setNumPagigas(Integer numPagigas) {
            this.numPagigas = numPagigas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPagigas=" + numPagigas +
                    '}';
        }
    }