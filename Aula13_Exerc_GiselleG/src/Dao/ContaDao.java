package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import classes.ConexaoBD;
import classes.Conta;

public class ContaDao {

    // Método 1: Inserir Conta
    public void inserirConta(Conta conta) {
        String sql = "INSERT INTO conta (numero_conta, titular, saldo) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, conta.getNumeroConta());
            stmt.setString(2, conta.getTitular());
            stmt.setDouble(3, conta.getSaldo());
            stmt.executeUpdate();
            System.out.println("Conta inserida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir conta: " + e.getMessage());
        }
    }

    // Método 2: Saque e Depósito
    public void saqueDeposito(int numeroConta, double valor) {
        String sql = "UPDATE conta SET saldo = saldo + ? WHERE numero_conta = ?";
        try (Connection conn = ConexaoBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, valor);
            stmt.setInt(2, numeroConta);
            stmt.executeUpdate();
            System.out.println("Operação de saque/depósito realizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro na operação: " + e.getMessage());
        }
    }

    // Método 3: Apagar Conta
    public void apagarConta(int numeroConta) {
        String sql = "DELETE FROM conta WHERE numero_conta = ?";
        try (Connection conn = ConexaoBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, numeroConta);
            stmt.executeUpdate();
            System.out.println("Conta apagada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao apagar conta: " + e.getMessage());
        }
    }

    // Método 4: Listar Contas
    public List<Conta> listarContas() {
        List<Conta> contas = new ArrayList<>();
        String sql = "SELECT * FROM conta";
        try (Connection conn = ConexaoBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int numero = rs.getInt("numero_conta");
                String titular = rs.getString("titular");
                double saldo = rs.getDouble("saldo");
                contas.add(new Conta(numero, titular, saldo));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar contas: " + e.getMessage());
        }
        return contas;
    }

    // Método 5: Buscar Conta
    public Conta buscarConta(int numeroConta) {
        String sql = "SELECT * FROM conta WHERE numero_conta = ?";
        try (Connection conn = ConexaoBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, numeroConta);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int numero = rs.getInt("numero_conta");
                    String titular = rs.getString("titular");
                    double saldo = rs.getDouble("saldo");
                    return new Conta(numero, titular, saldo);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar conta: " + e.getMessage());
        }
        return null; // Retorna null se a conta não for encontrada
    }
}