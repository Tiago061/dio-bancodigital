package entity;

import entity.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        Cliente tiago = new Cliente();
        tiago.setNome("Tiago Henrique");
        Conta cc = new ContaCorrente(tiago);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(tiago);
        cc.transferir(100, cp);

        Banco banco = new Banco();
        banco.adicionarCliente(tiago);
        banco.listarCliente();


        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}