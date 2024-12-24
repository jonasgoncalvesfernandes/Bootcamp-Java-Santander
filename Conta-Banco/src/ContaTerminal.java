import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Chamando o método Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedindo para o usuário digitar as informações
        System.out.println("Por favor, digite o número da agência: ");
        int numero = scanner.nextInt();

        // Limpando o buffer pra remover o "\n"
        scanner.nextLine();

        System.out.println("Digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        // Exibindo as informações de forma concatenada
        String mensagem = "Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, ")
                .concat("sua agência é ").concat(agencia).concat(", conta ").concat(Integer.toString(numero))
                .concat(" e seu saldo de R$").concat(Double.toString(saldo)).concat(" já está disponível para saque.");

        // Exibindo a mensagem final
        System.out.println(mensagem);

        //fechando scanner
        scanner.close();
    }
}
