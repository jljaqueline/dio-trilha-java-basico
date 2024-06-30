    import java.util.Locale;
    import java.util.Scanner;
    public class ContaTerminal {


        
    public static void main(String[] args) throws Exception{
        int numeroAgencia;
        int numeroConta;
        String nome;
        double saldo;
        Scanner scanner = new Scanner(System.in);

       
    System.out.println("Digite o número da agência: ");
        numeroAgencia = scanner.nextInt();
    System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();
    System.out.println ("Digite seu nome completo: ");
        nome = scanner.next();
        saldo = 5000.00;

    System.out.println("Olá "+ nome+ ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia+ ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
       
    
    }
}


