package br.com.dio.variaveis;

/**
 * Classe de exemplo de aula 3 de Variáveis, Tipos de Dados e Operações Matemáticas.
 */
public class main {

    public main(String[] args) {
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

    }

    private static void prePos() {

        int k= 10;

        int i = ++k;

        int j = k--;

        int x = k;

        System.out.println("i: "  + i );
        System.out.println("j: " + j);
        System.out.println("k: " + k);
    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 70;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d+b;
        int r4 = e/a;
        int r5 =  c%d;

        System.out.println("a+b :"+ r1);
        System.out.println("c-a; " + r2);
        System.out.println("d+b: " + r3);
        System.out.println("e/a: " + r4);
        System.out.println("c%d: "+ r5);
    }

    private static void atribuicao() {


    }

    private static void precedencia() {
    }

}
