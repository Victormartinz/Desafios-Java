import java.util.Scanner;

public class AnalisadorDeNumeros {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1° Número: ");
        int numero = scanner.nextInt();

        int maior = numero;

        int contador = 2;

        while (contador <= 5 ){
            System.out.println("Digite o " + contador + "° Número: ");
            numero = scanner.nextInt();

            if (numero > maior){
                maior = numero;
            }

            contador++;
        }

        System.out.println("O Maior Número foi: " + maior);
        scanner.close();

        System.out.println("teste");
    }
}
