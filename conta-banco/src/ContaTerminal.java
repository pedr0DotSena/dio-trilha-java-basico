
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // CRIANDO OBJETO SCANNER:
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome ");
        String nomeDoCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência ");
        String agencia = scanner.next();

        System.out.println("Agora digite o número da conta ");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Por fim declare o seu saldo ");
        double saldoDisponivel = scanner.nextDouble();

        // IMPRIMINDO OS DADOS DE ENTRADA DO USUÁRIO:
        System.out.println(
        "Olá, " + nomeDoCliente + 
        "! Obrigado por criar uma conta em nosso banco." +
        " A sua agência é " + agencia + ", o número da sua conta é " + numeroDaConta +
        ", e seu saldo de " + saldoDisponivel + " já está disponível para saque! :) "
        );
    }
}
