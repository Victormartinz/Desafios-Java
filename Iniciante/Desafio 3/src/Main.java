import java.util.Scanner;

public  class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de classificação de aventureiros");
        System.out.println("-----------------------------------------");

        System.out.println("Digite o nome do aventureiro: ");
        String nomeAventureiro = scanner.nextLine();

        System.out.println("Digite a idade do aventureiro: ");
        int idadeAventureiro = scanner.nextInt();

        System.out.println("Digite o nível do aventureiro: ");
        int nivelAventureiro = scanner.nextInt();

        System.out.println("Óla " + nomeAventureiro +" Digite a quantidade de monstros derrotados:  ");
        int monstrosDerrotados = scanner.nextInt();

        System.out.println(nomeAventureiro + " você possui a espada lendária? ");
        boolean espadaLendaria = scanner.nextBoolean();

        System.out.println("Nome: " + nomeAventureiro);
        System.out.println("Idade: " + idadeAventureiro);
        System.out.println("Nível: " + nivelAventureiro);
        System.out.println("Possui a espada lendária? " + espadaLendaria);

        System.out.println("-------------------------------------------");



    }
}