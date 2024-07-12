import java.util.Random;

public class Cliente implements Comparable<Cliente>{
    
    //atributos
    private String nome;
    

    //getters
    public String getNome() {
        return nome;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    //construtor
    public Cliente(String nome){
        this.nome=nome;
        
    }

    public int compareTo(Cliente o) {
        return this.nome.compareTo(o.getNome());
    } 

    @Override
    public String toString() {
        return "Cliente{"+nome+"}";
    }

    //criar uma conta corrente para o cliente no banco solicitado em uma agencia aleatoria
    public void criarContaCorrente(Banco b){
        Random r = new Random();
        int index = r.nextInt(0, b.getListaAgencias().size()-1);
        Agencia a = b.getListaAgencias().get(index);
        Conta cc = new ContaCorrente(this, a);
        
    }

    public void criarContaPoupanca(Banco b){
        Random r = new Random();
        int index = r.nextInt(0, b.getListaAgencias().size()-1);
        Agencia a = b.getListaAgencias().get(index);
        Conta poup = new ContaPoupanca(this, a);
        
    }
}
