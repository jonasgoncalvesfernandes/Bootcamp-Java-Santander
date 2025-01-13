import java.util.Scanner;
//main
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parametroUm;
        int parametroDois;

        System.out.println("Digite o parametro UM: ");
        parametroUm = scanner.nextInt();

        System.out.println("Digite o parametro DOIS: ");
        parametroDois = scanner.nextInt();

        // capturando os erros
        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException erros) {
            System.out.println(erros.getMessage());
        }

        fecharSCAN(scanner);

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            // Criando e lançando a exceção quando o primeiro parâmetro for maior que o segundo
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    static void fecharSCAN(Scanner scanner) {
        scanner.close();
    }
}