package pe.edu.pucp.lab9.servlets;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import pe.edu.pucp.lab9.beans.Usuario;
import pe.edu.pucp.lab9.dao.UsuarioDao;
import pe.edu.pucp.lab9.dao.BibliotecaDao;

import java.io.IOException;
import java.sql.SQLException;
@WebServlet("/biblioteca")
public class BibliotecaServlet extends HttpServlet {
    private final UsuarioDao usuarioDao = new UsuarioDao();
    private final BibliotecaDao bibliotecaDao = new BibliotecaDao();

    private Usuario usuarioActual(HttpServletRequest request){
    }
}
