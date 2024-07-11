package entity;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;


    public Banco() {
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }


    public void listarCliente(){
        System.out.println("Lista de clientes");
        for (Cliente cliente : clientes){
            clientes.toString();
        }
    }

}
