package co.edu.unicauca.lab4_mvc_paises.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fadav
 */
public class clsPaisDAO {
    
    private static final String SQL_LISTAR =
            "SELECT idpais, nombre, capital FROM pais ORDER BY idpais";

    public List<clsPais> listar() {
        List<clsPais> lista = new ArrayList<>();

        try (Connection cn = clsConexion.getConexion();
             PreparedStatement ps = cn.prepareStatement(SQL_LISTAR);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                clsPais p = new clsPais();
                p.setIdpais(rs.getInt("idpais"));
                p.setNombre(rs.getString("nombre"));
                p.setCapital(rs.getString("capital"));
                lista.add(p);
            }

        } catch (Exception e) {
            // 80/20: para el lab, imprimimos el error (luego puedes mejorar con logs)
            e.printStackTrace();
        }

        return lista;
    }
}
