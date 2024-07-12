public abstract class Conta implements IConta {

    //private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIALNUMCONTA = 1;

    //atributos
    protected Agencia agencia;//dado redundante?
    protected int numero;
    protected double saldo;
    protected Cliente titular;
 
    //getters
    public Agencia getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
     
    //construtor
    public Conta(Cliente cliente, Agencia agencia){
        //this.agencia = agencia;
        this.numero = SEQUENCIALNUMCONTA++;
        this.saldo = 0;
        this.titular = cliente;
        this.agencia = agencia;
        agencia.getListaContas().add(this);
        
        agencia.getBanco().adicionarCliente(cliente);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s", this.titular.getNome()));
        System.out.println(String.format("Banco: %s", this.agencia.getBanco().getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia.getCodigoAgencia()));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
