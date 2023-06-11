import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        String agencia;
        int numero;
        String nomeCliente = "Carlos Augusto";
        double saldo = 237.48;

        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.next();
        System.out.println("Por favor, digite o número da Conta!");
        numero = sc.nextInt();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}
