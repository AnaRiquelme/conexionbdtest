/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.anariquelme.operaciones;

import com.google.gson.Gson;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.anariquelme.dao.ClienteDao_Mysql;
import net.anariquelme.helper.Conexion;

/**
 *
 * @author ana
 */
public class ClienteGetcolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArrayList<String> alColumns = null;
        try {
            ClienteDao_Mysql oClienteDAO = new ClienteDao_Mysql(Conexion.getConection());
            alColumns = oClienteDAO.getColumnsNames();
            String data = new Gson().toJson(alColumns);
            data = "{\"data\":" + data + "}";
            return data;
        } catch (Exception e) {
            throw new ServletException("ClienteGetcolumnsJson: View Error: " + e.getMessage());
        }
    }

}
