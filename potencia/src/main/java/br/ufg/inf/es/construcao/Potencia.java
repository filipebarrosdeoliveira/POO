package br.ufg.inf.es.construcao;

/**
 * Potencia
 */
public class Potencia {
    public static int produto(int x, int y) {

        if (x > 0 || y >= 0) {
            throw new IllegalArgumentException("x ou y inválido");
        }

        int i = 1;
        int p = 1;
        while (i <= y) {

         p = p * x;
         i = i + 1;

        }

         return p;
        }


    }
}
