import java.util.Scanner;

public class AnalisadorDeNumeros {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º Número: ");
        int numero = scanner.nextInt();

        int maior = numero;
        int menor = numero;
        int somaNumeros = numero;
        double mediaNumeros = 0;
        int contadorPar = 0;
        int contadorImpar = 0;


        int contador = 2;

        if (numero % 2 == 0){
            contadorPar++;
        }else {
            contadorImpar++;
        }

        while (contador <= 5 ){
            System.out.println("Digite o " + contador + "° Número: ");
            numero = scanner.nextInt();

            if (numero > maior){
                maior = numero;
            } else if (numero <  menor) {
                menor = numero;
            }

            if (numero % 2 == 0){
                contadorPar += 1;

            } else {
                 contadorImpar += 1;
            }

            somaNumeros = somaNumeros +  numero;

            contador++;
        }

        double somaMedia = somaNumeros;
        mediaNumeros = somaMedia / 5;

        System.out.println("O Maior Número foi: " + maior);
        System.out.println("O Menor Número foi: " + menor);
        System.out.println("Quantidade de numeros pares: " + contadorPar);
        System.out.println("Quantidade de numeros impares: " + contadorImpar);
        System.out.println("A Soma de Todos os Números: " + somaNumeros);
        System.out.println("A Media de Todos os Números: " + mediaNumeros);
        scanner.close();


    }
}
