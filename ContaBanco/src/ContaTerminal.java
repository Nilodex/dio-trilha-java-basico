import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.00;
        Scanner scanner = new Scanner(System.in);        

        System.out.println("Olá!");
        System.out.println("Por favor digite seu nome!");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor digite o número da sua agência!");
        agencia = scanner.next();
        System.out.println("Por favor digite o número da conta!");
        numero = scanner.nextInt();
        System.out.println("Por favor digite o saldo da conta!");
        saldo = scanner.nextDouble();
        scanner.close();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, "+
        "sua agência é "+agencia
        +", conta "+numero
        +" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
