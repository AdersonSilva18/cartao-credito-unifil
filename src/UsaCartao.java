import model.CartaoCredito;

import java.util.Scanner;

public class UsaCartao {

    public static void iniciar() {
        Scanner sc = new Scanner(System.in);
        CartaoCredito cartao = new CartaoCredito(123456789, 1000.0, "Visa");

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Atualizar bandeira");
            System.out.println("2 - Atualizar limite");
            System.out.println("3 - Comprar");
            System.out.println("4 - Pagar");
            System.out.println("5 - Consulta cartão");
            System.out.println("9 - Encerrar o programa");
            System.out.printf("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Digite a nova bandeira: ");
                    String novaBandeira = sc.next();
                    cartao.setBandeira(novaBandeira);
                    break;
                case 2:
                    System.out.printf("Digite o novo limite: ");
                    double novoLimite = sc.nextDouble();
                    cartao.setLimite(novoLimite);
                    break;
                case 3:
                    System.out.print("Digite o valor da compra: ");
                    double valorCompra = sc.nextDouble();
                    cartao.addComprar(valorCompra);
                    break;
                case 4:
                    System.out.print("Digite o valor a ser pago: ");
                    double valorPago = sc.nextDouble();
                    cartao.addPagar(valorPago);
                    break;
                case 5:
                    System.out.println("Número do cartão: " + cartao.getNumero());
                    System.out.println("Bandeira: " + cartao.getBandeira());
                    System.out.println("Saldo: " + cartao.getSaldo());
                    System.out.println("Bônus: " + cartao.getBonus());
                    System.out.println("Limite: " + cartao.getLimite());
                    break;
                case 9:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 9);

        sc.close();
    }
}
