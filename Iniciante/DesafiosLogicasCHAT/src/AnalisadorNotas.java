import java.util.Scanner;

public class AnalisadorNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notaAlunos = new double[10];

        double notaMenor = notaAlunos[0];
        double notaMaior = notaAlunos[0];

        boolean notaValida = false;

        int contador = 0;

        do {
            while (contador < 9) {
                System.out.println("Digite a nota do " + contador + "° Aluno:  ");
                notaAlunos[contador] = scanner.nextDouble();

                if(notaAlunos[contador] >= 0 && notaAlunos[contador] <= 10){
                    notaValida = true;

                    contador++;
                } else {
                    System.out.println("Digite uma Nota válida");
                }

            }

        }while (!notaValida);

        System.out.println("A Maior Nota é :" + notaMaior);
        System.out.println("A Menor Nota é : " + notaMenor);

    }

}


