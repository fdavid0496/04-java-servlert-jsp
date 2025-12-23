package co.edu.unicauca.lab4_mvc_paises.controlador;

import co.edu.unicauca.lab4_mvc_paises.modelo.clsPaisDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author fadav
 */
@WebServlet(name = "clsControlador", urlPatterns = {"/Controlador"})
public class clsControlador extends HttpServlet {

    private final clsPaisDAO dao = new clsPaisDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1) Obtener datos (modelo)
        var lista = dao.listar();

        // 2) Enviar a la vista
        request.setAttribute("paises", lista);

        // 3) Forward al JSP
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    // Opcional: si entran por GET, los mandamos al mismo flujo
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}