import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {

    //atributos
    private String nome;
    private Set<Cliente> listaClientes;
    private List<Agencia> listaAgencias;
    
    //construtor
    public Banco(String nome){
        this.nome = nome;
        this.listaClientes = new HashSet<>();
        this.listaAgencias = new ArrayList<>();
    }

    //getters
    public List<Agencia> getListaAgencias() {
        return listaAgencias;
    }
    public Set<Cliente> getListaClientes() {
        return listaClientes;
    }
    public String getNome() {
        return nome;
    }

    //Listar todos os clientes ordenados por nome
    public void listarClientesPorNome(){
        List<Cliente> clientesPorNome = new ArrayList<>(listaClientes); 
        Collections.sort(clientesPorNome);
        System.out.println(clientesPorNome);
    }

    public void adicionarCliente(Cliente c){
        this.listaClientes.add(c);
    }

    public void adicionarAgencia(Agencia a){
        this.listaAgencias.add(a);
        a.setBanco(this);
    }

    //listar todos as agencias ordenados pelo codigo
    public void listarAgencias(){
        List<Agencia> agenciasPorCodigo = new ArrayList<>(listaAgencias);
        Collections.sort(agenciasPorCodigo);
        System.out.println(agenciasPorCodigo);
    }
}
