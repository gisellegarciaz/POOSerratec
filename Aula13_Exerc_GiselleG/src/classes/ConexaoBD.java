package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	
    // URL de conexão com o banco de dados
    private static final String URL = "jdbc:postgresql://localhost:5432/banco_java";
    private static final String USUARIO = "postgres"; // seu usuário
    private static final String SENHA = "sua_senha"; // sua senha

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}