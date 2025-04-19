import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite seu nome! ");
        String nome = scanner.next();

        System.out.println("Por favor, digite sua conta: ");
        int conta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = scanner.next();
        
        System.out.println("Agora, digite o valor que deseja retirar: ");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola " + nome + ", obrigada por criar uma conta em nosso banco, sua agência " + agencia + " sua conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!");
        
        
    }
}