import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Agencia implements Comparable<Agencia>{

    private static int SEQUENCIALAGENCIA = 1;
    //Atributos
    private int codigoAgencia;
    private List<Conta> listaContas;
    private Banco banco;

    //Construtor
    public Agencia(Banco b){
        this.codigoAgencia = SEQUENCIALAGENCIA++;
        this.listaContas = new ArrayList<>();
        b.adicionarAgencia(this);
    }
    //opcao de adicionar o banco de origem depois
    public Agencia(){
        this.codigoAgencia = SEQUENCIALAGENCIA++;
        this.listaContas = new ArrayList<>();
    }

    //getters
    public int getCodigoAgencia() {
        return codigoAgencia;
    }
    public List<Conta> getListaContas() {
        return listaContas;
    }
    public Banco getBanco() {
        return banco;
    }

    //setters
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    @Override
    public int compareTo(Agencia o) {
        return Integer.compare(codigoAgencia, o.getCodigoAgencia());
    }
    @Override
    public String toString() {
        return "Agencia{codigo:"+codigoAgencia+"}";
    }

    public List<Conta> pesquisarContaPorNumero(int n){
        Scanner s = new Scanner(System.in);
        List<Conta> conta = new ArrayList<>();
        if(!(listaContas.isEmpty())){
            for(Conta c: listaContas){
                if(c.getNumero() == n){
                    conta.add(c);
                }
            }
        }
        else{
            System.out.println("Sem contas cadastradas");
        }

        System.out.println("Aperte enter para prosseguir");
        String lixo = s.nextLine();
        s.close();
        return conta;
    }
}
