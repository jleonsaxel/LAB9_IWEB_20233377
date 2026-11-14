package pe.edu.pucp.lab9.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
    protected Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontró el driver de MySQL", e);
        }

        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lab9_biblioteca",
                "root", "root"
        );
    }
}
