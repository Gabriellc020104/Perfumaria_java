import java.util.Scanner;

public class Perfumaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Cadastro do usuário
            System.out.print("Digite seu nome: ");
            scanner.nextLine(); // Limpar o buffer

            // Mostrar produtos e valores
            System.out.println("Produtos disponíveis:");
            System.out.println("1. Perfume A - R$50.00");
            System.out.println("2. Perfume B - R$80.00");
            System.out.println("3. Perfume C - R$100.00");

            // Saldo do usuário
            System.out.print("Digite o saldo em sua conta bancária: ");
            double saldo = scanner.nextDouble();

            // Escolha do produto
            System.out.print("Escolha o número do produto que deseja comprar: ");
            int escolhaProduto = scanner.nextInt();

            // Verificar se o saldo é suficiente para a compra
            switch (escolhaProduto) {
                case 1:
                    if (saldo >= 50.00) {
                        System.out.println("Produto adquirido com sucesso");
                    } else {
                        System.out.println("Saldo insuficiente para aquisição do produto");
                    }
                    break;
                case 2:
                    if (saldo >= 80.00) {
                        System.out.println("Produto adquirido com sucesso");
                    } else {
                        System.out.println("Saldo insuficiente para aquisição do produto");
                    }
                    break;
                case 3:
                    if (saldo >= 100.00) {
                        System.out.println("Produto adquirido com sucesso");
                    } else {
                        System.out.println("Saldo insuficiente para aquisição do produto");
                    }
                    break;
                default:
                    System.out.println("Escolha de produto inválida.");
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
