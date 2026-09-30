import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de classificação de aventureiros");
        System.out.println("-----------------------------------------");

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println(nome + " Digite o seu nivel atual: ");
        int nivelAtual = scanner.nextInt();


        System.out.println(nome + " Digite a quantidade de monstros derrotados: ");
        int monstrosDerrotados = scanner.nextInt();


        System.out.println(nome + " Você possui a espada lendária? True ou false ?");
        boolean espadaLendaria = scanner.nextBoolean();

        System.out.println("---------------------------------------------");

        if (nivelAtual >= 15 && monstrosDerrotados >= 50 && espadaLendaria){
            System.out.println("Parabens! " + nome + " Você adquiriu a Recompensa Ouro");

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Nível: " + nivelAtual);
            System.out.println("Monstros derrotados: " + monstrosDerrotados);
            System.out.println("Espada lendária: " + espadaLendaria);
            System.out.println("Recompensa: Ouro");
        } else if (nivelAtual >= 10 && monstrosDerrotados >= 25 && espadaLendaria) {
            System.out.println("Parabens! " + nome + " Você adquiriu a Recompensa Prata!");

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Nível: " + nivelAtual);
            System.out.println("Monstros derrotados: " + monstrosDerrotados);
            System.out.println("Espada lendária: " + espadaLendaria);
            System.out.println("Recompensa: Prata");
        } else if (nivelAtual >= 5 && monstrosDerrotados >= 10) {
            System.out.println("Parabens! " + nome + " Você adquiriu a Recompensa Bronze!");

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Nível: " + nivelAtual);
            System.out.println("Monstros derrotados: " + monstrosDerrotados);
            System.out.println("Espada lendária: " + espadaLendaria);
            System.out.println("Recompensa: Bronze");
        }else {
            System.out.println(nome + " infelizmente nenhuma recompensa disponível");

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Nível: " + nivelAtual);
            System.out.println("Monstros derrotados: " + monstrosDerrotados);
            System.out.println("Espada lendária: " + espadaLendaria);
            System.out.println("Recompensa: Sem Recompensa disponível");
        }

    }
}