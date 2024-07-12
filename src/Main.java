//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Main a = new Main();
        Banco banco = new Banco("Bradesco");
        Agencia agencia = new Agencia(banco);
        Cliente cliente = new Cliente("Carlos");
        Conta corrente = new ContaCorrente(cliente, agencia);
        Conta poupanca = new ContaPoupanca(cliente, agencia);
        Cliente cliente2 = new Cliente("Roberto");
        Conta corrente2 = new ContaCorrente(cliente2, agencia);
        // Scanner scan = new Scanner(System.in);
        // boolean continuar = true;

        corrente2.depositar(900);
        corrente.depositar(1000);
        corrente.sacar(100);
        corrente.transferir(50, poupanca);
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
        
        System.out.println("Lista de clientes:");
        banco.listarClientesPorNome();

    //     while (continuar) {
    //         for(int i = 0; i < 50; i++){
    //             System.out.println();
    //         }
    //         System.out.println("==== Bem vindo ao banco digital ====");
    //         System.out.println("Por favor, selecione uma das opções");
    //         System.out.println("1. Cadastrar novo cliente");
    //         System.out.println("2. Cadastrar nova conta");
    //         System.out.println("3. Listar as agencias");
    //         System.out.println("4. Checar saldo da conta");
    //         System.out.println("5. Listar os clientes por nome");
    //         System.out.println("0. Encerrar");

    //         int resposta = scan.nextInt();

    //         switch (resposta) {
    //             case 1:
    //                 a.cadastrarCliente();
    //                 break;

    //             case 2:

    //                 break;

    //             case 3:
    //                 banco.listarAgencias();
    //                 break;

    //             case 4:
    //                 System.out.println("Por favor, insira o numero da conta");
    //                 int numConta = scan.nextInt();
    //                 agencia.pesquisarContaPorNumero(numConta);
    //                 break;

    //             case 5:
    //                 banco.listarClientesPorNome();
    //                 break;

    //             case 0:
    //                 continuar = false;
    //                 break;

    //             default:
    //                 System.out.println("Insira uma opcao valida");
    //                 break;
    //         }
    //     }
    //     scan.close();
    }

    // public void cadastrarCliente(){
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Insira o nome do cliente:");
    //     String nome = s.nextLine();
    //     new Cliente(nome);
    //     s.close();
    // }

}
