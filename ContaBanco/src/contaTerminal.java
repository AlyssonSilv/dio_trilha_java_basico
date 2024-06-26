import java.util.Scanner;

public class contaTerminal {

    public static void main(String[] args) {
        //Objeto Scanner para leitura dos dados via terminal
        Scanner scanner = new Scanner(System.in);

        //leitura dos dados
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        
        // Consome a nova linha
        scanner.nextLine();
        
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final
        String mensagem = String.format("Olá %s, obrigado por criar uma conta conosco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);

        // Fechamento do objeto Scanner
        scanner.close();
    }
}
