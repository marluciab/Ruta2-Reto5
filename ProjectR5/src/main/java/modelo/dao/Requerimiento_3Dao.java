package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_3Vo;
import util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3Vo> requerimiento3() throws SQLException {
        // Su código
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_3Vo> listado_registros_rq1 = new ArrayList<Requerimiento_3Vo>();
        String sql = "SELECT p.ID_Proyecto, p.Ciudad, l.Nombre FROM Proyecto p INNER JOIN Lider l " +
        "ON p.ID_Lider =l.ID_Lider WHERE p.ID_Proyecto BETWEEN 1 AND 30;";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_3Vo requerimiento3 = new Requerimiento_3Vo();
                requerimiento3.setIdProyecto(rs.getInt("ID_Proyecto"));
                requerimiento3.setCiudad(rs.getString("Ciudad"));
                requerimiento3.setNombre(rs.getString("Nombre"));
                listado_registros_rq1.add(requerimiento3);
            }
        }
        return listado_registros_rq1;
    }
}