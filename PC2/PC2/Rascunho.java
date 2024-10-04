import java.util.Arrays;
import java.util.Scanner;


public class Rascunho{
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double[] parcela = {12,24,36,48,60};
        double[] percentual = {0.06,0.12,0.18,0.24,0.30};
        double[] valorParcela = new double[5];
        double[] valorFinal = new double[5];
        System.out.println("Digite o valor do carro: ");
        double carro = teclado.nextDouble();
        


        for (int i = 0; i < 5; i++) {
            valorParcela[i] = ((carro * percentual[i]) + carro) / parcela[i];
            valorFinal[i] = valorParcela[i] * parcela[i];
            
        }
        System.out.printf("Resultado: "+ Arrays.toString(valorFinal));

        
    }
}
