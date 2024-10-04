import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Sorteio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("*** Geração de Números Aleatórios ***");
        System.out.print("Quantos números aleatórios você quer gerar? ");
        int n = teclado.nextInt();
        
        int[] numeros = new int[n];
        numeros = SortearNumeros(n);
        System.out.println("Números sorteados: " + Arrays.toString(numeros));
        
        double media = calcularMedia(numeros);
        System.out.println("Média dos valores: " + media);
        
        Arrays.sort(numeros);
        System.out.println("Números ordenados: " + Arrays.toString(numeros));
        
        exibirNumerosRepetidos(numeros);
    }
//teste 

    public static int[] SortearNumeros(int quantidade) {
        Random rand = new Random();
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = rand.nextInt(70) + 30;
        }
        return numeros;
    }

    public static double calcularMedia(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return (double) soma / numeros.length;
    }

    public static void exibirNumerosRepetidos(int[] numeros) {
        boolean repetido = false;
        System.out.print("Números repetidos: ");
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] == numeros[i + 1]) {
                System.out.print(numeros[i] + " ");
                repetido = true;
                while (i < numeros.length - 1 && numeros[i] == numeros[i + 1]) {
                    i++;
                }
            }
        }
        if (!repetido) {
            System.out.println("Nenhum número repetido encontrado.");
        } else {
            System.out.println();
        }
    }
}

