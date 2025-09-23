package main;

import java.util.List;

import Dao.ContaDao;
import classes.Conta;

public class TesteConta {
    public static void main(String[] args) {
        
        ContaDao dao = new ContaDao();

        // 1. Inserir uma nova conta
        System.out.println("Inserindo uma nova conta...");
        Conta novaConta = new Conta(101, "João", 500.0);
        dao.inserirConta(novaConta);
        
        // 2. Listar todas as contas
        System.out.println("\n--- Lista de Contas ---");
        List<Conta> contas = dao.listarContas();
        for (Conta c : contas) {
            System.out.println("Conta: " + c.getNumeroConta() + ", Titular: " + c.getTitular() + ", Saldo: " + c.getSaldo());
        }
        
        // 3. Realizar um depósito
        System.out.println("\nRealizando um depósito de R$ 200 na conta 101...");
        dao.saqueDeposito(101, 200.0);
        
        // 4. Buscar a conta para ver o saldo atualizado
        System.out.println("\nBuscando a conta 101...");
        Conta contaAtualizada = dao.buscarConta(101);
        if (contaAtualizada != null) {
            System.out.println("Conta encontrada. Saldo atualizado: " + contaAtualizada.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
        
        // 5. Realizar um saque
        System.out.println("\nRealizando um saque de R$ 50 na conta 101...");
        dao.saqueDeposito(101, -50.0);
        
        // 6. Buscar novamente para confirmar o saldo
        System.out.println("\nBuscando a conta 101...");
        Conta contaFinal = dao.buscarConta(101);
        if (contaFinal != null) {
            System.out.println("Conta encontrada. Saldo final: " + contaFinal.getSaldo());
        }
        
        // 7. Apagar a conta
        System.out.println("\nApagando a conta 101...");
        dao.apagarConta(101);
        
        // 8. Listar novamente para confirmar que foi apagada
        System.out.println("\n--- Lista de Contas após exclusão ---");
        List<Conta> contasAposExclusao = dao.listarContas();
        if (contasAposExclusao.isEmpty()) {
            System.out.println("Nenhuma conta encontrada.");
        }
    }
}