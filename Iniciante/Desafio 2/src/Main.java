import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Controle de acesso à masmorra");
        System.out.println("----------------------------");

        System.out.println("Digite o Nome Do Jogador: ");
        String nomeJogador = scanner.nextLine();

        System.out.println("Digite a Idade do Jogador: ");
        int idadeJogador = scanner.nextInt();

        System.out.println("Digite o Nível do Jogador: ");
        int nivelJogador = scanner.nextInt();

        System.out.println("O jogador " + nomeJogador + " Possui a Chave de Acesso? ");
        boolean chaveAcesso = scanner.nextBoolean();

        System.out.println("Nome: " + nomeJogador);
        System.out.println("Idade: " + idadeJogador);
        System.out.println("Nível: " + nivelJogador);
        System.out.println("Possui a chave? " + chaveAcesso);

        System.out.println("----------------------------");

        if (idadeJogador >= 18 && nivelJogador >= 10 && chaveAcesso == true){
            System.out.println("Entrada Permitida, " + nomeJogador + "! A masmorra está Liberada");
        } else {
            System.out.println("Entrada negada, " + nomeJogador);
        }
    }
}
