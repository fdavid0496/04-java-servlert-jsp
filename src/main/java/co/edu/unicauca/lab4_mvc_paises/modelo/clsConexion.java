package co.edu.unicauca.lab4_mvc_paises.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class clsConexion {

    private static final String URL =
            "jdbc:mysql://localhost:3306/lab_software_iii_paises_db"
          + "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    private static final String USER = "root";
    private static final String PASS = "DavLes0405@"; // ideal: no hardcodear en proyectos reales

    public static Connection getConexion() throws SQLException {

        // ✅ Fuerza la carga del driver (si el JAR está en el WAR, esto NO falla)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException(
                "MySQL Connector/J NO está en el classpath del Tomcat (WEB-INF/lib). "
              + "Aunque esté en el pom.xml, tu despliegue actual NO lo está incluyendo. "
              + "Solución: Clean & Build + redeploy (ver pasos).",
                e
            );
        }

        return DriverManager.getConnection(URL, USER, PASS);
    }
}
