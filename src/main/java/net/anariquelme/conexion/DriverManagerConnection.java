/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.anariquelme.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.anariquelme.helper.Conexion;

public class DriverManagerConnection implements GenericConnection {

    @Override
    public Connection crearConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion oConexion = new Conexion();
            Connection connection = DriverManager.getConnection("jdbc:mysql://" + Conexion.getDatabaseHost() + ":" + Conexion.getDatabasePort() + "/" + Conexion.getDatabaseName(), Conexion.getDatabaseLogin(), Conexion.getDatabasePassword());
            return connection;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
