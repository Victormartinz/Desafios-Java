import java.util.Scanner;

public class AnalisadorNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notaAlunos = new double[10];

        double notaMenor = notaAlunos[0];
        double notaMaior = notaAlunos[0];
        double somaNotas = notaAlunos[0];
        double mediaNotas = 0;

        int contador = 0;

            while (contador < 10) {
                System.out.println("Digite a nota do " + (contador+1) + "° Aluno:  ");
                notaAlunos[contador] = scanner.nextDouble();

                if(notaAlunos[contador] >= 0 && notaAlunos[contador] <= 10){
                    if( contador == 0 ){
                        notaMenor = notaAlunos[contador];
                        notaMaior = notaAlunos[contador];
                    }else {
                        if (notaAlunos[contador] > notaMaior){
                            notaMaior = notaAlunos[contador];
                        }
                        if (notaAlunos[contador] < notaMenor){
                            notaMenor = notaAlunos[contador];
                        }
                    }
                    somaNotas = somaNotas + notaAlunos[contador];
                    contador++;
                } else {
                    System.out.println("Digite uma Nota válida");
                }
            }

            mediaNotas = somaNotas / 10;


        System.out.println("A Maior Nota é :" + notaMaior);
        System.out.println("A Menor Nota é : " + notaMenor);
        System.out.println("A Soma das Nota é : " + somaNotas);
        System.out.println("A Media das Nota é : " + mediaNotas);


    }

}


