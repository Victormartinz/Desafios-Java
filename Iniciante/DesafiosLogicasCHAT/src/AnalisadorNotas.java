import java.util.Scanner;

public class AnalisadorNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notaAlunos = new double[10];

        boolean notaValida = false;

        do {
            System.out.println("Digite a nota do 1° Aluno:  ");
            notaAlunos[1] = scanner.nextDouble();

            if(notaAlunos[1] >= 0 && notaAlunos[1] <= 10){
                notaValida = true;
            } else {
                System.out.println("Digite uma Nota válida");
            }
        }while (!notaValida);

//        int contador = 1;
//
//
//        while (contador <= 10){
//
//        }



//        for (int i = 1; i <= 10; i++) {
//            if (notaAlunos[i] >= 0 && notaAlunos[i] <= 10){
//                System.out.println("Digite a nota do " + i + "° a do Aluno: " );
//                notaAlunos[i] = scanner.nextInt();
//            }else {
//                System.out.println("nota invalida, tente novamente");
//            }


    }

}


