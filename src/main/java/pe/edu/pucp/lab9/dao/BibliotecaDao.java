package pe.edu.pucp.lab9.dao;
import pe.edu.pucp.lab9.beans.Libro;
import pe.edu.pucp.lab9.dto.PrestamoDto;
import java.sql.*;
import java.util.ArrayList;

public class BibliotecaDao extends BaseDao{
    public ArrayList<Libro>
    listarLibros() throws SQLException {
        ArrayList<Libro> lista = new ArrayList<>();
        String sql = "SELECT CONCAT(u.nombres, ' ', u.apellidos) AS usuario, " + "l.titulo, " +
                "p.fecha_prestamo, p.fecha_limite" + "FROM prestamo p" + "JOIN usuario u ON" +
                "p.id_usuario = u.id_usuario " + "JOIN libro l ON p.id_libro = l.id_libro";
        if (idUsuario != null) {
            sql += "Where p.id_usuario = ?";
        }
    }
    prestamo = new PrestamoDTO();
    prestamo.setUsuario(rs.getString("usuario"));
    prestamo.setTitulo(rs.getString("titulo"));
    prestamo.setFechaPrestamo(rs.getDate("fecha_prestamo"));
    prestamo.setFechaLimite(rs.getDate("fecha_limite"));
}
