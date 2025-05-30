import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o 1º parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o 2º parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O 2º parâmetro deve ser maior que o 1º");
        } else {
            int contagem = parametroDois - parametroUm;

            for(int i = 1; i <= contagem; ++i) {
                System.out.println("Imprimindo o número " + i);
            }

        }
    }
}