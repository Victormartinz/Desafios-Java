import java.util.Scanner;

public class AnalisadorNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notaAlunos = new double[10];

        boolean notaValida = false;

        int contador = 1;

        do {
            while (contador <= 10) {
                System.out.println("Digite a nota do " + contador + "° Aluno:  ");
                notaAlunos[1] = scanner.nextDouble();

                if(notaAlunos[1] >= 0 && notaAlunos[1] <= 10){
                    notaValida = true;
                    contador++;
                } else {
                    System.out.println("Digite uma Nota válida");
                }
            }

        }while (!notaValida);





    }

}


